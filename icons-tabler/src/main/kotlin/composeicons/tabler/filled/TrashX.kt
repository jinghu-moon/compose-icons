package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TrashX: ImageVector
    get() {
        if (_trashX != null) return _trashX!!
        _trashX = tablerFilledIcon(
            name = "TrashX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 8h-.081L19 19c0 1.589-1.238 2.902-2.824 2.995L16 22h-8C6.402 22 5.096 20.751 5.008 19.25l-.005-.167L4.08 8h-.08C3.471 7.999 3.034 7.587 3.003 7.059c-.031-.528 .355-.989 .88-1.052L4 6h16ZM10.511 11.14c-.434-.258-.991-.153-1.301 .246-.31 .398-.274 .965 .083 1.321L10.585 14 9.293 15.293l-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L12 15.415l1.293 1.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L13.415 14l1.292-1.293 .083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L12 12.585 10.707 11.293l-.094-.083Z")
            addPathData("M14 2c1.105 0 2 .895 2 2-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L14 4h-4l-.007 .117c-.062 .525-.523 .911-1.052 .88C8.413 4.966 8.001 4.529 8 4 8 2.953 8.806 2.083 9.85 2.005L10 2h4Z")
        }
        return _trashX!!
    }

private var _trashX: ImageVector? = null
