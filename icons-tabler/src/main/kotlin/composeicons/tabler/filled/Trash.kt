package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = tablerFilledIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 8h-.081L19 19c0 1.589-1.238 2.902-2.824 2.995L16 22h-8C6.402 22 5.096 20.751 5.008 19.25l-.005-.167L4.08 8h-.08C3.471 7.999 3.034 7.587 3.003 7.059c-.031-.528 .355-.989 .88-1.052L4 6ZM10 10c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-6c0-.552-.448-1-1-1M14 10c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-6c0-.552-.448-1-1-1")
            addPathData("M14 2c1.105 0 2 .895 2 2-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L14 4h-4l-.007 .117c-.062 .525-.523 .911-1.052 .88C8.413 4.966 8.001 4.529 8 4 8 2.953 8.806 2.083 9.85 2.005L10 2Z")
        }
        return _trash!!
    }

private var _trash: ImageVector? = null
