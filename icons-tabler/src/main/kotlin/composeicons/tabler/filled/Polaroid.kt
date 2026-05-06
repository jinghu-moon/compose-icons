package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Polaroid: ImageVector
    get() {
        if (_polaroid != null) return _polaroid!!
        _polaroid = tablerFilledIcon(
            name = "Polaroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.199 9.623l.108 .098 3.986 3.986 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094L14.415 12l1.292-1.293 .106-.095c.457-.38 .918-.38 1.386 .011l.108 .098 4.502 4.503c-.509 1.579-1.939 2.681-3.596 2.77L18 18h-12C4.263 18 2.724 16.879 2.191 15.225L7.707 9.707l.106-.095c.457-.38 .918-.38 1.386 .011ZM18 2c2.131-0 3.888 1.671 3.995 3.8L22 6v6.585L18.707 9.293l-.15-.137C17.301 8.061 15.707 8.059 14.461 9.139l-.154 .14L13 10.585 10.707 8.293l-.15-.137C9.301 7.061 7.707 7.059 6.461 8.139l-.154 .14L2 12.585v-6.585C2 3.869 3.671 2.112 5.8 2.005L6 2h12ZM15.01 5l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L15 7l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L15.01 5Z")
            addPathData("M8.01 20c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L8 22c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L8.01 20Z")
            addPathData("M12.01 20c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L12 22c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L12.01 20Z")
            addPathData("M16.01 20c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 22c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L16.01 20Z")
        }
        return _polaroid!!
    }

private var _polaroid: ImageVector? = null
