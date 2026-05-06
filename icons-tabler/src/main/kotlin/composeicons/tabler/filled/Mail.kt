package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) return _mail!!
        _mail = tablerFilledIcon(
            name = "Mail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 7.535v9.465c0 1.589-1.238 2.902-2.824 2.995L19 20h-14C3.411 20 2.098 18.762 2.005 17.176L2 17v-9.465l9.445 6.297 .116 .066c.277 .135 .601 .135 .878 0l.116-.066L22 7.535Z")
            addPathData("M19 4c1.08 0 2.027 .57 2.555 1.427L12 11.797 2.445 5.427C2.954 4.601 3.831 4.072 4.799 4.007L5 4h14Z")
        }
        return _mail!!
    }

private var _mail: ImageVector? = null
