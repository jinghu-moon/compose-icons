package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishOff: ImageVector
    get() {
        if (_fishOff != null) return _fishOff!!
        _fishOff = lucideOutlineIcon(
            name = "FishOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 12.47v.03M18 12v.47M17.525 17.526c-.804 .318-1.661 .479-2.525 .474C11.44 18 7.44 15.47 6.5 12 6.848 10.72 7.614 9.567 8.621 8.62M12.065 6.532C13.006 6.189 13.999 6.009 15 6c3.56 0 6.06 2.54 7 6-.309 1.14-.786 2.177-1.413 3.058")
            addPathData("M7 10.67C7 8 5.58 5.97 2.73 5.5c-1 1.5-1 5 .23 6.5-1.24 1.5-1.24 5-.23 6.5C5.58 18.03 7 16 7 13.33M14.48 8.958C14.821 7.917 15.335 6.941 16 6.07M16 17.93c-.82-1.074-1.408-2.306-1.728-3.618")
            addPathData("M16.01 17.93l-.23 1.4c-.162 .967-1 1.674-1.98 1.67h-4.3c.969-1.099 1.499-2.515 1.49-3.98M8.53 3h5.27c.98-.004 1.818 .703 1.98 1.67l.23 1.4M2 2 22 22")
        }
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
