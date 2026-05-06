package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = lucideOutlineIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.25 16.25h1.5L12 17Z")
            addPathData("M16 14v.5")
            addPathData("M4.42 11.247C4.14 12.328 3.999 13.44 4 14.556 4 18.728 7.582 21 12 21c4.418 0 8-2.272 8-6.444-.005-1.121-.171-2.235-.493-3.309")
            addPathData("M8 14v.5")
            addPathData("M8.5 8.5C8.116 9.55 7.417 10.528 6.156 11 4.225 11.722 2.58 10.703 2.5 10c-.113-.994 1.177-6.53 4-7 1.923-.321 3.651 .845 3.651 2.235 1.265-.321 2.592-.307 3.849 .042C14 3.887 15.844 2.679 17.767 3c2.823 .47 4.113 6.006 4 7-.08 .703-1.725 1.722-3.656 1C16.85 10.528 16.256 9.55 15.872 8.5")
        }
        return _dog!!
    }

private var _dog: ImageVector? = null
