package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = tablerFilledIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6c.507 0 .934 .38 .993 .883L4 7v6h6v-5c0-.507 .38-.934 .883-.993L11 7h8c1.589-0 2.902 1.238 2.995 2.824L22 10v8c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 18v-3h-16v3c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2 18v-11C2 6.448 2.448 6 3 6Z")
            addPathData("M7 8c1.085 0 1.972 .866 1.999 1.95 .027 1.085-.816 1.993-1.9 2.047C6.016 12.052 5.086 11.232 5.005 10.15L5 10l.005-.15C5.083 8.806 5.953 8 7 8Z")
        }
        return _bed!!
    }

private var _bed: ImageVector? = null
