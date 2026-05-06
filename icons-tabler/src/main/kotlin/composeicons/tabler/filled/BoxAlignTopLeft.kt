package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxAlignTopLeft: ImageVector
    get() {
        if (_boxAlignTopLeft != null) return _boxAlignTopLeft!!
        _boxAlignTopLeft = tablerFilledIcon(
            name = "BoxAlignTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3h-5C3.895 3 3 3.895 3 5v5c0 1.105 .895 2 2 2h5c1.105 0 2-.895 2-2v-5C12 3.895 11.105 3 10 3Z")
            addPathData("M15 3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L14.99 5c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L15 3Z")
            addPathData("M20 3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L19.99 5c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 3Z")
            addPathData("M20 8c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L19.99 10c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 8Z")
            addPathData("M20 14c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L19.99 16c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 14Z")
            addPathData("M4 14c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L3.99 16c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L4 14Z")
            addPathData("M20 19c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L19.99 21c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 19Z")
            addPathData("M15 19c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L14.99 21c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L15 19Z")
            addPathData("M9 19c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L8.99 21c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L9 19Z")
            addPathData("M4 19c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L3.99 21c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L4 19Z")
        }
        return _boxAlignTopLeft!!
    }

private var _boxAlignTopLeft: ImageVector? = null
