package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxAlignLeft: ImageVector
    get() {
        if (_boxAlignLeft != null) return _boxAlignLeft!!
        _boxAlignLeft = tablerFilledIcon(
            name = "BoxAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.002 3.003h-5c-1.105 0-2 .895-2 2v14c0 1.105 .895 2 2 2h5c.552 0 1-.448 1-1v-16c0-.552-.448-1-1-1Z")
            addPathData("M15.002 19.003c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.127-.007Z")
            addPathData("M20.003 19.003c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M20.003 14.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M20.003 8.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M20.003 3.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.128 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.128-.007Z")
            addPathData("M15.002 3.002c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052l.127-.007Z")
        }
        return _boxAlignLeft!!
    }

private var _boxAlignLeft: ImageVector? = null
