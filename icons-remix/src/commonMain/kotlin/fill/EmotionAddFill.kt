package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionAddFill: ImageVector
    get() {
        if (_emotionAddFill != null) return _emotionAddFill!!
        _emotionAddFill = remixIcon(
            name = "EmotionAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.586 2.000 13.160 2.053 13.719 2.149 C 13.260 2.997 13.000 3.968 13.000 5.000 C 13.000 8.314 15.686 11.000 19.000 11.000 C 20.031 11.000 21.002 10.739 21.850 10.280 C 21.947 10.839 22.000 11.413 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.000 13.000 C 8.000 15.209 9.791 17.000 12.000 17.000 C 14.209 17.000 16.000 15.209 16.000 13.000 L 8.000 13.000 ZM 20.000 4.000 L 23.000 4.000 L 23.000 6.000 L 20.000 6.000 L 20.000 9.000 L 18.000 9.000 L 18.000 6.000 L 15.000 6.000 L 15.000 4.000 L 18.000 4.000 L 18.000 1.000 L 20.000 1.000 L 20.000 4.000 Z"),
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
        return _emotionAddFill!!
    }

private var _emotionAddFill: ImageVector? = null
