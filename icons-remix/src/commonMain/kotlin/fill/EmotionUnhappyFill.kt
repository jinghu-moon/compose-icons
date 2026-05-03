package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionUnhappyFill: ImageVector
    get() {
        if (_emotionUnhappyFill != null) return _emotionUnhappyFill!!
        _emotionUnhappyFill = remixIcon(
            name = "EmotionUnhappyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 7.000 17.000 L 9.000 17.000 C 9.000 15.343 10.343 14.000 12.000 14.000 C 13.657 14.000 15.000 15.343 15.000 17.000 L 17.000 17.000 C 17.000 14.239 14.761 12.000 12.000 12.000 C 9.239 12.000 7.000 14.239 7.000 17.000 ZM 8.000 11.000 C 8.828 11.000 9.500 10.328 9.500 9.500 C 9.500 8.672 8.828 8.000 8.000 8.000 C 7.172 8.000 6.500 8.672 6.500 9.500 C 6.500 10.328 7.172 11.000 8.000 11.000 ZM 16.000 11.000 C 16.828 11.000 17.500 10.328 17.500 9.500 C 17.500 8.672 16.828 8.000 16.000 8.000 C 15.172 8.000 14.500 8.672 14.500 9.500 C 14.500 10.328 15.172 11.000 16.000 11.000 Z"),
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
        return _emotionUnhappyFill!!
    }

private var _emotionUnhappyFill: ImageVector? = null
