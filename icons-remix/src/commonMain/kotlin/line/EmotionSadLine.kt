package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmotionSadLine: ImageVector
    get() {
        if (_emotionSadLine != null) return _emotionSadLine!!
        _emotionSadLine = remixIcon(
            name = "EmotionSadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 12.727 21.923 13.435 21.775 14.118 L 19.993 12.335 C 19.998 12.224 20.000 12.112 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 13.302 20.000 14.532 19.689 15.619 19.137 C 15.774 19.383 15.958 19.615 16.172 19.828 C 16.474 20.131 16.812 20.375 17.173 20.560 C 15.664 21.474 13.894 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 19.000 14.172 L 20.414 15.586 C 21.195 16.367 21.195 17.633 20.414 18.414 C 19.633 19.195 18.367 19.195 17.586 18.414 C 16.840 17.669 16.806 16.481 17.484 15.695 L 17.586 15.586 L 19.000 14.172 ZM 12.000 15.000 C 13.466 15.000 14.785 15.631 15.700 16.637 L 14.755 17.496 C 13.965 17.183 13.018 17.000 12.000 17.000 C 10.982 17.000 10.035 17.183 9.245 17.496 L 8.300 16.637 C 9.215 15.631 10.534 15.000 12.000 15.000 ZM 8.500 10.000 C 9.328 10.000 10.000 10.672 10.000 11.500 C 10.000 12.328 9.328 13.000 8.500 13.000 C 7.672 13.000 7.000 12.328 7.000 11.500 C 7.000 10.672 7.672 10.000 8.500 10.000 ZM 15.500 10.000 C 16.328 10.000 17.000 10.672 17.000 11.500 C 17.000 12.328 16.328 13.000 15.500 13.000 C 14.672 13.000 14.000 12.328 14.000 11.500 C 14.000 10.672 14.672 10.000 15.500 10.000 Z"),
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
        return _emotionSadLine!!
    }

private var _emotionSadLine: ImageVector? = null
