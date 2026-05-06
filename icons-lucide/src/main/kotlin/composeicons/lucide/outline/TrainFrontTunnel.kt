package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrainFrontTunnel: ImageVector
    get() {
        if (_trainFrontTunnel != null) return _trainFrontTunnel!!
        _trainFrontTunnel = lucideOutlineIcon(
            name = "TrainFrontTunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22v-10C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v10")
            addPathData("M15 6.8v1.4C15 9.746 13.657 11 12 11 10.343 11 9 9.746 9 8.2v-1.4")
            addPathData("M10 15h.01")
            addPathData("M14 15h.01")
            addPathData("M10 19C7.791 19 6 17.209 6 15v-3C6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6v3c0 2.209-1.791 4-4 4Z")
            addPathData("M9 19 7 22")
            addPathData("M15 19l2 3")
        }
        return _trainFrontTunnel!!
    }

private var _trainFrontTunnel: ImageVector? = null
