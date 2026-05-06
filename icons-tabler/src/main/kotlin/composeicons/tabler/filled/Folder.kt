package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = tablerFilledIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3c.22-0 .433 .072 .608 .206l.1 .087L12.414 6h6.586c1.589-0 2.902 1.238 2.995 2.824L22 9v8c0 1.589-1.238 2.902-2.824 2.995L19 20h-14C3.411 20 2.098 18.762 2.005 17.176L2 17v-11C2 4.411 3.238 3.098 4.824 3.005L5 3h4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _folder!!
    }

private var _folder: ImageVector? = null
