package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAirtable: ImageVector
    get() {
        if (_brandAirtable != null) return _brandAirtable!!
        _brandAirtable = tablerOutlineIcon(
            name = "BrandAirtable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10v8l7-3v-2.6L3 10")
            addPathData("M3 6l9 3L21 6 12 3 3 6")
            addPathData("M14 12.3v8.7l7-3v-8l-7 2.3")
        }
        return _brandAirtable!!
    }

private var _brandAirtable: ImageVector? = null
