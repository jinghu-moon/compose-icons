package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxAlignRight: ImageVector
    get() {
        if (_boxAlignRight != null) return _boxAlignRight!!
        _boxAlignRight = tablerFilledIcon(
            name = "BoxAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.998 3.003h-5c-.552 0-1 .448-1 1v16c0 .552 .448 1 1 1h5c1.105 0 2-.895 2-2v-14c0-1.105-.895-2-2-2Z")
            addPathData("M9.008 19.003c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.127-.007Z")
            addPathData("M4.008 19.003c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M4.008 14.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M4.008 8.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M4.008 3.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007C3.468 5.001 3.031 4.589 3 4.061c-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M9.008 3.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007C8.469 5.001 8.032 4.589 8.001 4.061c-.031-.528 .355-.989 .88-1.052l.127-.007Z")
        }
        return _boxAlignRight!!
    }

private var _boxAlignRight: ImageVector? = null
