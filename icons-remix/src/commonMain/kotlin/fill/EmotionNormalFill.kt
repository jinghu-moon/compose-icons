package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionNormalFill: ImageVector
    get() {
        if (_emotionNormalFill != null) return _emotionNormalFill!!
        _emotionNormalFill = remixIcon(
            name = "EmotionNormalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 8.000 14.000 L 8.000 16.000 L 16.000 16.000 L 16.000 14.000 L 8.000 14.000 ZM 8.000 11.000 C 8.828 11.000 9.500 10.328 9.500 9.500 C 9.500 8.672 8.828 8.000 8.000 8.000 C 7.172 8.000 6.500 8.672 6.500 9.500 C 6.500 10.328 7.172 11.000 8.000 11.000 ZM 16.000 11.000 C 16.828 11.000 17.500 10.328 17.500 9.500 C 17.500 8.672 16.828 8.000 16.000 8.000 C 15.172 8.000 14.500 8.672 14.500 9.500 C 14.500 10.328 15.172 11.000 16.000 11.000 Z"),
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
        return _emotionNormalFill!!
    }

private var _emotionNormalFill: ImageVector? = null
