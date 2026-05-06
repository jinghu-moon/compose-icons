package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCouchdb: ImageVector
    get() {
        if (_brandCouchdb != null) return _brandCouchdb!!
        _brandCouchdb = tablerOutlineIcon(
            name = "BrandCouchdb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12h12v-2c0-1.105 .895-2 2-2C20 6.895 19.105 6 18 6h-12C4.895 6 4 6.895 4 8c1.105 0 2 .895 2 2v2")
            addPathData("M6 15h12")
            addPathData("M6 18h12")
            addPathData("M21 11v7")
            addPathData("M3 11v7")
        }
        return _brandCouchdb!!
    }

private var _brandCouchdb: ImageVector? = null
