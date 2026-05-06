package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wood: ImageVector
    get() {
        if (_wood != null) return _wood!!
        _wood = tablerOutlineIcon(
            name = "Wood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5.5C6 6.881 8.686 8 12 8c3.314 0 6-1.119 6-2.5C18 4.119 15.314 3 12 3 8.686 3 6 4.119 6 5.5")
            addPathData("M18 5.5v4.626c.598-.271 1.303-.095 1.704 .424 .401 .519 .392 1.246-.021 1.756l-.097 .108L18 14v4c0 1.61-2.54 2.925-5.725 3h-.275C8.686 21 6 19.657 6 18v-2L4.414 14.414c-.484-.483-.553-1.244-.163-1.806 .39-.562 1.126-.765 1.749-.481v-6.627")
            addPathData("M10 12.5v1.5")
            addPathData("M14 16v1")
        }
        return _wood!!
    }

private var _wood: ImageVector? = null
