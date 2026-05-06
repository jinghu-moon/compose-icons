package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Versions: ImageVector
    get() {
        if (_versions != null) return _versions!!
        _versions = tablerFilledIcon(
            name = "Versions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4h-6C10.343 4 9 5.343 9 7v10c0 1.657 1.343 3 3 3h6c1.657 0 3-1.343 3-3v-10C21 5.343 19.657 4 18 4Z")
            addPathData("M7 6c.507 0 .934 .38 .993 .883L8 7v10c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L6 17v-10C6 6.448 6.448 6 7 6Z")
            addPathData("M4 7c.507 0 .934 .38 .993 .883L5 8v8c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 16v-8C3 7.448 3.448 7 4 7Z")
        }
        return _versions!!
    }

private var _versions: ImageVector? = null
