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
                pathData = parseSvgPathData("M 9.000 3.000 C 9.220 3.000 9.433 3.072 9.608 3.206 L 9.708 3.293 L 12.414 6.000 L 19.000 6.000 C 20.589 6.000 21.902 7.238 21.995 8.824 L 22.000 9.000 L 22.000 17.000 C 22.000 18.589 20.762 19.902 19.176 19.995 L 19.000 20.000 L 5.000 20.000 C 3.411 20.000 2.098 18.762 2.005 17.176 L 2.000 17.000 L 2.000 6.000 C 2.000 4.411 3.238 3.098 4.824 3.005 L 5.000 3.000 L 9.000 3.000 Z"),
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
