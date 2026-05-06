package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileChartPie: ImageVector
    get() {
        if (_fileChartPie != null) return _fileChartPie!!
        _fileChartPie = lucideOutlineIcon(
            name = "FileChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.941 22h2.059c1.105 0 2-.895 2-2v-12c.001-.639-.253-1.253-.706-1.704L15.706 2.708C15.255 2.254 14.64 1.999 14 2h-8C4.895 2 4 2.895 4 4v3.512")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M4.017 11.512C2.35 12.991 1.641 15.272 2.174 17.435c.533 2.163 2.221 3.853 4.384 4.389 2.163 .535 4.444-.172 5.925-1.837")
            addPathData("M9 16C8.448 16 8 15.552 8 15v-4c0-.552 .45-1.008 .995-.917 2.522 .424 4.498 2.4 4.922 4.922 .091 .544-.365 .995-.917 .995Z")
        }
        return _fileChartPie!!
    }

private var _fileChartPie: ImageVector? = null
