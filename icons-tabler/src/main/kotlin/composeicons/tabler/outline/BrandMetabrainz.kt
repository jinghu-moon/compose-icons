package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMetabrainz: ImageVector
    get() {
        if (_brandMetabrainz != null) return _brandMetabrainz!!
        _brandMetabrainz = tablerOutlineIcon(
            name = "BrandMetabrainz",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v10l7 4v-18L3 7")
            addPathData("M21 7v10l-7 4v-18l7 4")
        }
        return _brandMetabrainz!!
    }

private var _brandMetabrainz: ImageVector? = null
