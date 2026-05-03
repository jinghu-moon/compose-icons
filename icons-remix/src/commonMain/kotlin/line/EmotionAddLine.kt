package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionAddLine: ImageVector
    get() {
        if (_emotionAddLine != null) return _emotionAddLine!!
        _emotionAddLine = remixIcon(
            name = "EmotionAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.375 2.000 12.746 2.020 13.110 2.061 L 12.890 4.049 C 12.598 4.017 12.301 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 11.699 19.983 11.402 19.951 11.110 L 21.940 10.890 C 21.980 11.254 22.000 11.625 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 16.000 13.000 C 16.000 15.209 14.209 17.000 12.000 17.000 C 9.791 17.000 8.000 15.209 8.000 13.000 L 16.000 13.000 ZM 20.000 4.000 L 23.000 4.000 L 23.000 6.000 L 20.000 6.000 L 20.000 9.000 L 18.000 9.000 L 18.000 6.000 L 15.000 6.000 L 15.000 4.000 L 18.000 4.000 L 18.000 1.000 L 20.000 1.000 L 20.000 4.000 Z"),
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
        return _emotionAddLine!!
    }

private var _emotionAddLine: ImageVector? = null
