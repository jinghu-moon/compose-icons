package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionLaughFill: ImageVector
    get() {
        if (_emotionLaughFill != null) return _emotionLaughFill!!
        _emotionLaughFill = remixIcon(
            name = "EmotionLaughFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 11.000 C 10.000 11.000 8.333 11.333 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 C 15.667 11.333 14.000 11.000 12.000 11.000 ZM 8.500 7.000 C 7.348 7.000 6.378 7.779 6.088 8.840 L 6.050 9.001 L 10.950 9.001 C 10.719 7.859 9.710 7.000 8.500 7.000 ZM 15.500 7.000 C 14.348 7.000 13.378 7.779 13.088 8.840 L 13.050 9.001 L 17.950 9.001 C 17.719 7.859 16.710 7.000 15.500 7.000 Z"),
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
        return _emotionLaughFill!!
    }

private var _emotionLaughFill: ImageVector? = null
