package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = lucideOutlineIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16h.01")
            addPathData("M2.212 11.577c-.139 .278-.212 .585-.212 .896v5.527c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-5.527c-0-.311-.073-.618-.212-.896L18.55 5.11C18.212 4.43 17.519 4 16.76 4h-9.52C6.481 4 5.788 4.43 5.45 5.11Z")
            addPathData("M21.946 12.013h-19.892")
            addPathData("M6 16h.01")
        }
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
