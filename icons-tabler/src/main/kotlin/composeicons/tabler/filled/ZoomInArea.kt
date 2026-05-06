package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomInArea: ImageVector
    get() {
        if (_zoomInArea != null) return _zoomInArea!!
        _zoomInArea = tablerFilledIcon(
            name = "ZoomInArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9c2.245-0 4.302 1.253 5.332 3.248 1.03 1.995 .86 4.398-.441 6.228l2.816 2.817c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083L18.476 19.891c-1.797 1.277-4.15 1.466-6.128 .492C10.371 19.409 9.086 17.428 9.004 15.225L9 15l.004-.225C9.125 11.551 11.774 9 15 9ZM15 12c-.507 0-.934 .38-.993 .883L14 13v1h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L13 16h1v1l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L16 17v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L17 14h-1v-1l-.007-.117C15.934 12.38 15.507 12 15 12Z")
            addPathData("M3 14c.507 0 .934 .38 .993 .883L4 15v1c0 .507 .38 .934 .883 .993L5 17h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L6 19h-1C3.411 19 2.098 17.762 2.005 16.176L2 16v-1c0-.552 .448-1 1-1Z")
            addPathData("M3 9c.507 0 .934 .38 .993 .883L4 10v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2 11v-1C2 9.448 2.448 9 3 9Z")
            addPathData("M6 2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L6 4h-1c-.507 0-.934 .38-.993 .883L4 5v1c-.001 .529-.413 .966-.941 .997C2.53 7.028 2.069 6.642 2.007 6.117L2 6v-1C2 3.411 3.238 2.098 4.824 2.005L5 2h1Z")
            addPathData("M11 2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L11 4h-1C9.471 3.999 9.034 3.587 9.003 3.059c-.031-.528 .355-.989 .88-1.052L10 2h1Z")
            addPathData("M16 2c1.589-0 2.902 1.238 2.995 2.824L19 5v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 6v-1c-0-.507-.38-.934-.883-.993L16 4h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L15 2h1Z")
        }
        return _zoomInArea!!
    }

private var _zoomInArea: ImageVector? = null
