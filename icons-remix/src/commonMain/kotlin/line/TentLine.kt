package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TentLine: ImageVector
    get() {
        if (_tentLine != null) return _tentLine!!
        _tentLine = remixIcon(
            name = "TentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.103 19.000 L 12.866 3.000 C 12.778 2.848 12.652 2.722 12.500 2.634 C 12.022 2.358 11.410 2.522 11.134 3.000 L 1.896 19.000 L 1.000 19.000 L 1.000 21.000 C 8.333 21.000 15.667 21.000 23.000 21.000 L 23.000 19.000 L 22.103 19.000 ZM 7.600 19.000 L 4.206 19.000 L 12.000 5.500 L 19.794 19.000 L 16.400 19.000 L 12.000 11.000 L 7.600 19.000 ZM 12.000 15.150 L 14.118 19.000 L 9.883 19.000 L 12.000 15.150 Z"),
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
        return _tentLine!!
    }

private var _tentLine: ImageVector? = null
