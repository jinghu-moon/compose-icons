package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SectionSign: ImageVector
    get() {
        if (_sectionSign != null) return _sectionSign!!
        _sectionSign = tablerOutlineIcon(
            name = "SectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.172 19c.509 1.438 2.016 2.266 3.502 1.923 1.487-.343 2.479-1.747 2.307-3.263C14.809 16.145 13.526 15 12 15")
            addPathData("M14.83 5C14.322 3.562 12.815 2.734 11.328 3.077 9.842 3.419 8.849 4.822 9.021 6.338 9.193 7.854 10.475 8.999 12 9")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
        }
        return _sectionSign!!
    }

private var _sectionSign: ImageVector? = null
