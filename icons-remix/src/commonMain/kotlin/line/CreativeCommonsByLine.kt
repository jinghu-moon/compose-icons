package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsByLine: ImageVector
    get() {
        if (_creativeCommonsByLine != null) return _creativeCommonsByLine!!
        _creativeCommonsByLine = remixIcon(
            name = "CreativeCommonsByLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 7.000 C 14.000 8.105 13.105 9.000 12.000 9.000 C 10.895 9.000 10.000 8.105 10.000 7.000 C 10.000 5.895 10.895 5.000 12.000 5.000 C 13.105 5.000 14.000 5.895 14.000 7.000 ZM 15.000 11.000 C 15.000 10.448 14.552 10.000 14.000 10.000 L 10.000 10.000 C 9.448 10.000 9.000 10.448 9.000 11.000 L 9.000 15.000 L 10.500 15.000 L 10.500 19.000 L 13.500 19.000 L 13.500 15.000 L 15.000 15.000 L 15.000 11.000 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 ZM 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 Z"),
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
        return _creativeCommonsByLine!!
    }

private var _creativeCommonsByLine: ImageVector? = null
