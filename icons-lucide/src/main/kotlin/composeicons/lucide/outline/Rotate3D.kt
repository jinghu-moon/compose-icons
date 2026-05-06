package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rotate3D: ImageVector
    get() {
        if (_rotate3D != null) return _rotate3D!!
        _rotate3D = lucideOutlineIcon(
            name = "Rotate3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.194 13.707l3.814 1.86-1.86 3.814")
            addPathData("M16.472 7.528C15.313 2.891 12.574 .795 10.163 2.699 7.752 4.604 6.469 9.878 7.207 14.848c.738 4.97 3.253 7.987 5.793 6.95")
            addPathData("M21.798 11C20.883 8.76 17.046 7.115 12.478 7.006 7.91 6.896 3.776 8.35 2.438 10.537c-1.338 2.186 .46 4.548 4.368 5.736 3.908 1.188 8.929 .899 12.195-.702")
        }
        return _rotate3D!!
    }

private var _rotate3D: ImageVector? = null
