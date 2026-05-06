package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Artboard: ImageVector
    get() {
        if (_artboard != null) return _artboard!!
        _artboard = tablerFilledIcon(
            name = "Artboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 7h-6C7.895 7 7 7.895 7 9v6c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-6C17 7.895 16.105 7 15 7Z")
            addPathData("M4 7c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L4 9h-1C2.471 8.999 2.034 8.587 2.003 8.059c-.031-.528 .355-.989 .88-1.052L3 7h1Z")
            addPathData("M4 15c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L4 17h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L3 15h1Z")
            addPathData("M8 2c.507 0 .934 .38 .993 .883L9 3v1c-.001 .529-.413 .966-.941 .997C7.53 5.028 7.069 4.642 7.007 4.117L7 4v-1C7 2.448 7.448 2 8 2Z")
            addPathData("M16 2c.507 0 .934 .38 .993 .883L17 3v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L15 4v-1c0-.552 .448-1 1-1Z")
            addPathData("M21 7c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 9h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 7h1Z")
            addPathData("M21 15c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 17h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 15h1Z")
            addPathData("M8 19c.507 0 .934 .38 .993 .883L9 20v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L7 21v-1c0-.552 .448-1 1-1Z")
            addPathData("M16 19c.507 0 .934 .38 .993 .883L17 20v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L15 21v-1c0-.552 .448-1 1-1Z")
        }
        return _artboard!!
    }

private var _artboard: ImageVector? = null
