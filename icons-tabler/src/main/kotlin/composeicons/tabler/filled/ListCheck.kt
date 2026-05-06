package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ListCheck: ImageVector
    get() {
        if (_listCheck != null) return _listCheck!!
        _listCheck = tablerFilledIcon(
            name = "ListCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.207 3.793c.39 .39 .39 1.024 0 1.414L5.707 7.707c-.39 .39-1.023 .39-1.414 0L2.793 6.207C2.414 5.815 2.419 5.191 2.805 4.805c.386-.386 1.009-.391 1.402-.012L5 5.586 6.793 3.793c.39-.39 1.023-.39 1.414 0")
            addPathData("M8.207 9.793c.39 .391 .39 1.023 0 1.414L5.707 13.707c-.39 .39-1.023 .39-1.414 0L2.793 12.207c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L5 11.586 6.793 9.793c.39-.39 1.023-.39 1.414 0")
            addPathData("M8.207 15.793c.39 .391 .39 1.023 0 1.414L5.707 19.707c-.39 .39-1.023 .39-1.414 0L2.793 18.207c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L5 17.586 6.793 15.793c.39-.39 1.023-.39 1.414 0")
            addPathData("M21 6c0 .552-.448 1-1 1h-9C10.448 7 10 6.552 10 6c0-.552 .448-1 1-1h9c.552 0 1 .448 1 1")
            addPathData("M21 12c0 .552-.448 1-1 1h-9c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h9c.552 0 1 .448 1 1")
            addPathData("M21 18c0 .552-.448 1-1 1h-9c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h9c.552 0 1 .448 1 1")
        }
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
