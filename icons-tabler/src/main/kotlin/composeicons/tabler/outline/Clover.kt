package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = tablerOutlineIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10 8.603 6.56c-.805-.819-.805-2.131 0-2.95 .384-.391 .908-.611 1.456-.611 .548 0 1.072 .22 1.456 .611L12 4l.485-.39c.384-.391 .908-.611 1.456-.611 .548 0 1.072 .22 1.456 .611 .805 .819 .805 2.131 0 2.95L12 10")
            addPathData("M12 14 8.603 17.44c-.805 .819-.805 2.131 0 2.95 .384 .391 .908 .611 1.456 .611 .548 0 1.072-.22 1.456-.611L12 20l.485 .39c.384 .391 .908 .611 1.456 .611 .548 0 1.072-.22 1.456-.611 .805-.819 .805-2.131 0-2.95L12 14")
            addPathData("M14 12 17.44 8.603c.819-.805 2.131-.805 2.95 0 .391 .384 .611 .908 .611 1.456 0 .548-.22 1.072-.611 1.456L20 12l.39 .485c.391 .384 .611 .908 .611 1.456 0 .548-.22 1.072-.611 1.456-.819 .805-2.131 .805-2.95 0L14 12")
            addPathData("M10 12 6.56 8.603c-.819-.805-2.131-.805-2.95 0-.391 .384-.611 .908-.611 1.456 0 .548 .22 1.072 .611 1.456L4 12l-.39 .485c-.391 .384-.611 .908-.611 1.456 0 .548 .22 1.072 .611 1.456 .819 .805 2.131 .805 2.95 0L10 12")
        }
        return _clover!!
    }

private var _clover: ImageVector? = null
