/*
 * This file holds functions specific to the workflow/sra_download.nf in the nf-core/viralrecon pipeline
 */

class WorkflowSraDownload {

    /*
     * Print a warning after SRA download has completed
     */
    public static void sraDownloadWarn(log) {
        log.warn "=============================================================================\n" +
                 "  Please double-check the samplesheet that has been auto-created using the\n" +
                 "  public database ids provided via the '--public_data_ids' parameter.\n\n" +
                 "  All of the sample metadata obtained from the ENA has been appended\n" +
                 "  as additional columns to help you manually curate the samplesheet before\n" +
                 "  you run the main workflow(s) in the pipeline.\n" +
                 "==================================================================================="
    }
}

    
