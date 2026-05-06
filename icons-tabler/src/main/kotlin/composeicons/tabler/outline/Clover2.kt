package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clover2: ImageVector
    get() {
        if (_clover2 != null) return _clover2!!
        _clover2 = tablerOutlineIcon(
            name = "Clover2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 11 7.603 7.56c-.805-.819-.805-2.131 0-2.95 .384-.391 .908-.611 1.456-.611 .548 0 1.072 .22 1.456 .611L11 5l.485-.39c.384-.391 .908-.611 1.456-.611 .548 0 1.072 .22 1.456 .611 .805 .819 .805 2.131 0 2.95L11 11")
            addPathData("M11 11 7.603 14.44c-.805 .819-.805 2.131 0 2.95 .384 .391 .908 .611 1.456 .611 .548 0 1.072-.22 1.456-.611L11 17l.485 .39c.384 .391 .908 .611 1.456 .611 .548 0 1.072-.22 1.456-.611 .805-.819 .805-2.131 0-2.95L11 11")
            addPathData("M14.44 7.603c.819-.805 2.131-.805 2.95 0 .391 .384 .611 .908 .611 1.456 0 .548-.22 1.072-.611 1.456L17 11l.39 .485c.391 .384 .611 .908 .611 1.456 0 .548-.22 1.072-.611 1.456-.819 .805-2.131 .805-2.95 0")
            addPathData("M7.56 7.603c-.819-.805-2.131-.805-2.95 0-.391 .384-.611 .908-.611 1.456 0 .548 .22 1.072 .611 1.456L5 11l-.39 .485c-.391 .384-.611 .908-.611 1.456 0 .548 .22 1.072 .611 1.456 .819 .805 2.131 .805 2.95 0")
            addPathData("M15 15l6 6")
        }
        return _clover2!!
    }

private var _clover2: ImageVector? = null
