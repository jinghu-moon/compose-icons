package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) return _edit!!
        _edit = tablerFilledIcon(
            name = "Edit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7C8 7.552 7.552 8 7 8h-1C5.448 8 5 8.448 5 9v9c0 .552 .448 1 1 1h9c.552 0 1-.448 1-1v-1c0-.552 .448-1 1-1 .552 0 1 .448 1 1v1c0 1.657-1.343 3-3 3h-9C4.343 21 3 19.657 3 18v-9C3 7.343 4.343 6 6 6h1c.552 0 1 .448 1 1")
            addPathData("M14.596 5.011l4.392 4.392-6.28 6.303c-.188 .188-.442 .294-.708 .294h-3C8.448 16 8 15.552 8 15v-3c0-.266 .106-.52 .294-.708ZM21.092 2.908c1.144 1.143 1.216 2.974 .165 4.203l-.164 .18-.693 .694L16.013 3.598l.695-.69c1.211-1.211 3.173-1.211 4.384 0")
        }
        return _edit!!
    }

private var _edit: ImageVector? = null
