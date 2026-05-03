package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionLaughLine: ImageVector
    get() {
        if (_emotionLaughLine != null) return _emotionLaughLine!!
        _emotionLaughLine = remixIcon(
            name = "EmotionLaughLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.000 11.000 C 14.000 11.000 15.667 11.333 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 C 8.333 11.333 10.000 11.000 12.000 11.000 ZM 8.500 7.000 C 9.710 7.000 10.719 7.859 10.950 9.001 L 6.050 9.001 C 6.281 7.859 7.290 7.000 8.500 7.000 ZM 15.500 7.000 C 16.710 7.000 17.719 7.859 17.950 9.001 L 13.050 9.001 C 13.281 7.859 14.290 7.000 15.500 7.000 Z"),
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
        return _emotionLaughLine!!
    }

private var _emotionLaughLine: ImageVector? = null
