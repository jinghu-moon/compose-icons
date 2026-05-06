package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerOutlineIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 3l-5 9h5l-6.891 7.086c-1.68 1.684-4.146 2.315-6.429 1.646C5.397 20.063 3.662 18.201 3.157 15.876 2.651 13.552 3.455 11.137 5.254 9.58L13 3 12 8 21 3")
            addPathData("M7 14.5C7 15.881 8.119 17 9.5 17 10.881 17 12 15.881 12 14.5 12 13.119 10.881 12 9.5 12 8.119 12 7 13.119 7 14.5")
        }
        return _meteor!!
    }

private var _meteor: ImageVector? = null
