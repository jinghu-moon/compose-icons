package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Poo: ImageVector
    get() {
        if (_poo != null) return _poo!!
        _poo = tablerOutlineIcon(
            name = "Poo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h.01")
            addPathData("M14 12h.01")
            addPathData("M10 16c1.202 .837 2.798 .837 4 0")
            addPathData("M11 4c2 0 3.5 1.5 3.5 4h.164c.78 .051 1.49 .464 1.921 1.115 .431 .652 .533 1.467 .275 2.205 1.133 .576 1.78 1.803 1.615 3.063 1.158 .654 1.748 1.993 1.447 3.289-.3 1.296-1.418 2.24-2.746 2.318h-.176-10C5.637 19.99 4.445 19.071 4.098 17.752c-.346-1.319 .24-2.705 1.428-3.375-.164-1.26 .483-2.486 1.615-3.062C6.883 10.578 6.985 9.762 7.415 9.111 7.846 8.459 8.557 8.046 9.336 7.995h.164c1.5 0 2.5-2 1.5-4v.005")
        }
        return _poo!!
    }

private var _poo: ImageVector? = null
