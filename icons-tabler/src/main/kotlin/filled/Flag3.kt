package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag3: ImageVector
    get() {
        if (_flag3 != null) return _flag3!!
        _flag3 = tablerFilledIcon(
            name = "Flag3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 19.852 4.000 20.297 4.986 19.783 5.623 L 19.707 5.707 L 15.915 9.500 L 19.707 13.293 C 20.310 13.895 19.927 14.907 19.114 14.994 L 19.000 15.000 L 6.000 15.000 L 6.000 21.000 C 6.000 21.507 5.620 21.934 5.117 21.993 L 5.000 22.000 C 4.493 22.000 4.066 21.620 4.007 21.117 L 4.000 21.000 L 4.000 5.000 C 4.000 4.493 4.380 4.066 4.883 4.007 L 5.000 4.000 L 19.000 4.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _flag3!!
    }

private var _flag3: ImageVector? = null
