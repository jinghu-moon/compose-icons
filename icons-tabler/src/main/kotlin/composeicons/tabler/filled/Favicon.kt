package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Favicon: ImageVector
    get() {
        if (_favicon != null) return _favicon!!
        _favicon = tablerFilledIcon(
            name = "Favicon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-14C2.791 20 1 18.209 1 16v-8C1 5.791 2.791 4 5 4ZM6 9C5.448 9 5 9.448 5 10v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C7 9.448 6.552 9 6 9M11 9C9.343 9 8 10.343 8 12c0 1.657 1.343 3 3 3 .529-.001 .966-.413 .997-.941 .031-.528-.355-.989-.88-1.052L11 13c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L11 11c.552 0 1-.448 1-1C12 9.448 11.552 9 11 9M16 9c-1.589-0-2.902 1.238-2.995 2.824L13 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C19 10.343 17.657 9 16 9")
            addPathData("M16 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1")
        }
        return _favicon!!
    }

private var _favicon: ImageVector? = null
