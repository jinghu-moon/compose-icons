package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionSadFill: ImageVector
    get() {
        if (_emotionSadFill != null) return _emotionSadFill!!
        _emotionSadFill = remixIcon(
            name = "EmotionSadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 13.617 21.616 15.144 20.935 16.496 C 20.863 16.218 20.731 15.952 20.537 15.721 L 20.414 15.586 L 19.000 14.172 L 17.586 15.586 L 17.469 15.713 C 16.807 16.499 16.846 17.674 17.586 18.414 C 18.014 18.842 18.588 19.036 19.148 18.995 C 17.332 20.849 14.801 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 15.000 C 10.620 15.000 9.370 15.559 8.466 16.463 L 8.300 16.637 L 9.245 17.496 C 10.035 17.183 10.982 17.000 12.000 17.000 C 12.905 17.000 13.754 17.144 14.486 17.396 L 14.755 17.496 L 15.700 16.637 C 14.785 15.631 13.466 15.000 12.000 15.000 ZM 8.500 10.000 C 7.672 10.000 7.000 10.672 7.000 11.500 C 7.000 12.328 7.672 13.000 8.500 13.000 C 9.328 13.000 10.000 12.328 10.000 11.500 C 10.000 10.672 9.328 10.000 8.500 10.000 ZM 15.500 10.000 C 14.672 10.000 14.000 10.672 14.000 11.500 C 14.000 12.328 14.672 13.000 15.500 13.000 C 16.328 13.000 17.000 12.328 17.000 11.500 C 17.000 10.672 16.328 10.000 15.500 10.000 Z"),
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
        return _emotionSadFill!!
    }

private var _emotionSadFill: ImageVector? = null
