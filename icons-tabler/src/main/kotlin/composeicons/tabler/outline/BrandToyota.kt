package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandToyota: ImageVector
    get() {
        if (_brandToyota != null) return _brandToyota!!
        _brandToyota = tablerOutlineIcon(
            name = "BrandToyota",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c0 3.866 4.477 7 10 7 5.523 0 10-3.134 10-7C22 8.134 17.523 5 12 5 6.477 5 2 8.134 2 12")
            addPathData("M9 12c0 3.866 1.343 7 3 7 1.657 0 3-3.134 3-7C15 8.134 13.657 5 12 5 10.343 5 9 8.134 9 12")
            addPathData("M6.415 6.191C5.527 6.694 5 7.321 5 8c0 1.657 3.134 3 7 3 3.866 0 7-1.343 7-3C19 7.322 18.475 6.696 17.59 6.194")
        }
        return _brandToyota!!
    }

private var _brandToyota: ImageVector? = null
