package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = tablerOutlineIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17v2c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-2")
            addPathData("M7 9 12 4l5 5")
            addPathData("M12 4v12")
        }
        return _upload!!
    }

private var _upload: ImageVector? = null
