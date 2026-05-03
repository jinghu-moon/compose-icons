package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SeedlingLine: ImageVector
    get() {
        if (_seedlingLine != null) return _seedlingLine!!
        _seedlingLine = remixIcon(
            name = "SeedlingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.998 3.000 C 9.488 3.000 12.381 5.554 12.911 8.894 C 14.086 7.724 15.708 7.000 17.498 7.000 L 21.998 7.000 L 21.998 9.500 C 21.998 13.090 19.088 16.000 15.498 16.000 L 12.998 16.000 L 12.998 21.000 L 10.998 21.000 L 10.998 13.000 L 8.998 13.000 C 5.132 13.000 1.998 9.866 1.998 6.000 L 1.998 3.000 L 5.998 3.000 ZM 19.998 9.000 L 17.498 9.000 C 15.013 9.000 12.998 11.015 12.998 13.500 L 12.998 14.000 L 15.498 14.000 C 17.983 14.000 19.998 11.985 19.998 9.500 L 19.998 9.000 ZM 5.998 5.000 L 3.998 5.000 L 3.998 6.000 C 3.998 8.761 6.237 11.000 8.998 11.000 L 10.998 11.000 L 10.998 10.000 C 10.998 7.239 8.759 5.000 5.998 5.000 Z"),
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
        return _seedlingLine!!
    }

private var _seedlingLine: ImageVector? = null
