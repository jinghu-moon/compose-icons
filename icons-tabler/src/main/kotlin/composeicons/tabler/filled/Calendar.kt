package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = tablerFilledIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2c.507 0 .934 .38 .993 .883L17 3v1h1c1.589-0 2.902 1.238 2.995 2.824L21 7v12c0 1.589-1.238 2.902-2.824 2.995L18 22h-12C4.411 22 3.098 20.762 3.005 19.176L3 19v-12C3 5.411 4.238 4.098 5.824 4.005L6 4h1v-1c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L9 3v1h6v-1c0-.552 .448-1 1-1ZM19 9h-14v9.625c0 .705 .386 1.286 .883 1.366L6 20h12c.513 0 .936-.53 .993-1.215L19 18.625v-9.625Z")
            addPathData("M12 12c.507 0 .934 .38 .993 .883L13 13v3c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 16v-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L11 12h1Z")
        }
        return _calendar!!
    }

private var _calendar: ImageVector? = null
