package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Capture: ImageVector
    get() {
        if (_capture != null) return _capture!!
        _capture = tablerFilledIcon(
            name = "Capture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L8 5h-2c-.507 0-.934 .38-.993 .883L5 6v2c-.001 .529-.413 .966-.941 .997C3.53 9.028 3.069 8.642 3.007 8.117L3 8v-2C3 4.411 4.238 3.098 5.824 3.005L6 3h2Z")
            addPathData("M4 15c.507 0 .934 .38 .993 .883L5 16v2c0 .507 .38 .934 .883 .993L6 19h2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L8 21h-2C4.411 21 3.098 19.762 3.005 18.176L3 18v-2c0-.552 .448-1 1-1Z")
            addPathData("M18 3c1.589-0 2.902 1.238 2.995 2.824L21 6v2c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 8v-2c-0-.507-.38-.934-.883-.993L18 5h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L16 3h2Z")
            addPathData("M20 15c.507 0 .934 .38 .993 .883L21 16v2c0 1.589-1.238 2.902-2.824 2.995L18 21h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L16 19h2c.507-0 .934-.38 .993-.883L19 18v-2c0-.552 .448-1 1-1Z")
            addPathData("M12 8c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C9.951 16.071 8.114 14.38 8.005 12.2L8 12l.005-.2C8.112 9.671 9.869 8 12 8Z")
        }
        return _capture!!
    }

private var _capture: ImageVector? = null
