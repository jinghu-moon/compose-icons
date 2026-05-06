package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileHeadphone: ImageVector
    get() {
        if (_fileHeadphone != null) return _fileHeadphone!!
        _fileHeadphone = lucideOutlineIcon(
            name = "FileHeadphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6.835v-2.835C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2h-.343")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M2 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2C2.895 22 2 21.105 2 20v-4C2 12.686 4.686 10 8 10c3.314 0 6 2.686 6 6v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
        }
        return _fileHeadphone!!
    }

private var _fileHeadphone: ImageVector? = null
