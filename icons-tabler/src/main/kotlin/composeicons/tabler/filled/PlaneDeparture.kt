package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerFilledIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.674 3.827l5.267 5.315L19.191 8.003c1.039-.295 2.156-.009 2.925 .75 .769 .758 1.071 1.871 .791 2.914-.28 1.043-1.099 1.855-2.145 2.126L6.273 17.676c-.366 .097-.755-.02-1.006-.303L.817 12.353C.587 12.094 .508 11.734 .608 11.402c.1-.332 .364-.588 .699-.678L4.203 9.948c.256-.069 .529-.033 .759 .1l2.091 1.207 1.217-.326L5.208 5.822C5.047 5.553 5.021 5.224 5.139 4.933c.118-.291 .365-.51 .668-.591L8.705 3.565c.347-.093 .717 .007 .97 .262")
            addPathData("M22 21c0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1")
        }
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
