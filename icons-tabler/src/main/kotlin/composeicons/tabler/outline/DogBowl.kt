package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DogBowl: ImageVector
    get() {
        if (_dogBowl != null) return _dogBowl!!
        _dogBowl = tablerOutlineIcon(
            name = "DogBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15 15.586 9.415c-.64-.64-.771-1.63-.318-2.414 .452-.784 1.375-1.166 2.249-.932C18.392 6.303 19 7.095 19 8c.905-.001 1.698 .607 1.933 1.482 .235 .874-.147 1.798-.931 2.25-.784 .453-1.775 .322-2.415-.318L14 15")
            addPathData("M12 13 8.414 9.415c.64-.64 .771-1.63 .318-2.414C8.28 6.217 7.357 5.835 6.483 6.069 5.608 6.303 5 7.095 5 8 4.095 7.999 3.302 8.607 3.067 9.482c-.235 .874 .147 1.798 .931 2.25 .784 .453 1.775 .322 2.415-.318L10 15")
            addPathData("M3 20h18c-.175-1.671-.046-3.345-2-5h-14C3.667 16 3 17.667 3 20")
        }
        return _dogBowl!!
    }

private var _dogBowl: ImageVector? = null
