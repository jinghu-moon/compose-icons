package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SwitchCamera: ImageVector
    get() {
        if (_switchCamera != null) return _switchCamera!!
        _switchCamera = lucideOutlineIcon(
            name = "SwitchCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-7C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5h5")
            addPathData("M13 5h7c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-5")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
            addPathData("M18 22 15 19l3-3")
            addPathData("M6 2 9 5 6 8")
        }
        return _switchCamera!!
    }

private var _switchCamera: ImageVector? = null
