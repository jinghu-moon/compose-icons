package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderHermaphrodite: ImageVector
    get() {
        if (_genderHermaphrodite != null) return _genderHermaphrodite!!
        _genderHermaphrodite = tablerOutlineIcon(
            name = "GenderHermaphrodite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14v7")
            addPathData("M9 18h6")
            addPathData("M12 6c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 14 8 12.209 8 10 8 7.791 9.791 6 12 6")
            addPathData("M15 3c0 1.657-1.343 3-3 3C10.343 6 9 4.657 9 3")
        }
        return _genderHermaphrodite!!
    }

private var _genderHermaphrodite: ImageVector? = null
