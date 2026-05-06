package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = tablerFilledIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c2.733-0 4.96 2.194 5 4.927 .04 2.733-2.123 4.991-4.855 5.07C8.413 14.077 6.124 11.948 6.005 9.217L6 9l.005-.217C6.121 6.109 8.323 4 11 4Z")
            addPathData("M14.133 1.502c.275-.479 .886-.644 1.365-.369 2.973 1.709 4.72 4.957 4.505 8.38-.214 3.423-2.352 6.427-5.516 7.752-3.163 1.324-6.804 .739-9.393-1.51-.417-.362-.461-.994-.099-1.411 .362-.417 .994-.461 1.411-.099 2.015 1.75 4.848 2.205 7.309 1.175 2.462-1.031 4.125-3.369 4.292-6.032C18.174 6.724 16.816 4.197 14.502 2.867c-.479-.275-.644-.886-.369-1.365Z")
            addPathData("M11 16c.507 0 .934 .38 .993 .883L12 17v4c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L10 21v-4c0-.552 .448-1 1-1Z")
            addPathData("M15 20c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L15 22h-8c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L7 20h8Z")
        }
        return _globe!!
    }

private var _globe: ImageVector? = null
