package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Apps: ImageVector
    get() {
        if (_apps != null) return _apps!!
        _apps = tablerFilledIcon(
            name = "Apps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h-4C3.895 3 3 3.895 3 5v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4C11 3.895 10.105 3 9 3Z")
            addPathData("M9 13h-4c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2Z")
            addPathData("M19 13h-4c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2Z")
            addPathData("M17 3c.507 0 .934 .38 .993 .883L18 4v2h2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 8h-2v2c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L16 10v-2h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L14 6h2v-2c0-.552 .448-1 1-1Z")
        }
        return _apps!!
    }

private var _apps: ImageVector? = null
