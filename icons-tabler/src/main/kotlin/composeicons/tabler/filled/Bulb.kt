package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bulb: ImageVector
    get() {
        if (_bulb != null) return _bulb!!
        _bulb = tablerFilledIcon(
            name = "Bulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L4 13h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L3 11h1Z")
            addPathData("M12 2c.507 0 .934 .38 .993 .883L13 3v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 4v-1c0-.552 .448-1 1-1Z")
            addPathData("M21 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 13h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 11h1Z")
            addPathData("M4.893 4.893c.356-.356 .922-.392 1.32-.083l.094 .083 .7 .7c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13L5.593 7.007 4.893 6.307c-.39-.391-.39-1.024 0-1.414Z")
            addPathData("M17.693 4.893c.373-.372 .972-.39 1.367-.042 .395 .349 .452 .945 .13 1.362l-.083 .094-.7 .7c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094 .7-.7Z")
            addPathData("M14 18c.552 0 1 .448 1 1 0 1.657-1.343 3-3 3C10.343 22 9 20.657 9 19c0-.507 .38-.934 .883-.993L10 18h4Z")
            addPathData("M12 6c2.583 0 4.875 1.653 5.692 4.103 .817 2.45-.026 5.148-2.092 6.697-.138 .104-.3 .17-.471 .192L15 17h-6c-.216 0-.427-.07-.6-.2C6.334 15.25 5.491 12.553 6.308 10.103 7.125 7.653 9.417 6 12 6Z")
        }
        return _bulb!!
    }

private var _bulb: ImageVector? = null
