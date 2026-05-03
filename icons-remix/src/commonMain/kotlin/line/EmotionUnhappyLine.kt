package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionUnhappyLine: ImageVector
    get() {
        if (_emotionUnhappyLine != null) return _emotionUnhappyLine!!
        _emotionUnhappyLine = remixIcon(
            name = "EmotionUnhappyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 ZM 7.000 17.000 C 7.000 14.239 9.239 12.000 12.000 12.000 C 14.761 12.000 17.000 14.239 17.000 17.000 L 15.000 17.000 C 15.000 15.343 13.657 14.000 12.000 14.000 C 10.343 14.000 9.000 15.343 9.000 17.000 L 7.000 17.000 ZM 8.000 11.000 C 7.172 11.000 6.500 10.328 6.500 9.500 C 6.500 8.672 7.172 8.000 8.000 8.000 C 8.828 8.000 9.500 8.672 9.500 9.500 C 9.500 10.328 8.828 11.000 8.000 11.000 ZM 16.000 11.000 C 15.172 11.000 14.500 10.328 14.500 9.500 C 14.500 8.672 15.172 8.000 16.000 8.000 C 16.828 8.000 17.500 8.672 17.500 9.500 C 17.500 10.328 16.828 11.000 16.000 11.000 Z"),
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
        return _emotionUnhappyLine!!
    }

private var _emotionUnhappyLine: ImageVector? = null
