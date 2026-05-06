package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) return _pickaxe!!
        _pickaxe = lucideOutlineIcon(
            name = "Pickaxe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13 5.619 21.38c-.828 .829-2.172 .829-3 .001-.829-.828-.829-2.172-0-3.001L11 9.999")
            addPathData("M15.973 4.027C12.982 2.126 9.344 1.528 5.902 2.373 4.504 2.715 4.81 4.531 6.179 4.974c2.095 .679 4.062 1.701 5.822 3.024")
            addPathData("M16.001 11.999c1.323 1.761 2.345 3.729 3.024 5.824 .444 1.369 2.26 1.676 2.603 .278C22.469 14.675 21.881 11.054 20 8.069")
            addPathData("M18.352 3.352c-.471-.47-1.233-.47-1.704 0L11.352 8.648c-.47 .471-.47 1.233 0 1.704l2.296 2.296c.471 .47 1.233 .47 1.704 0L20.648 7.352c.47-.471 .47-1.233 0-1.704Z")
        }
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
