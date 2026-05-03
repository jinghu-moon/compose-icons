package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeadphoneFill: ImageVector
    get() {
        if (_headphoneFill != null) return _headphoneFill!!
        _headphoneFill = remixIcon(
            name = "HeadphoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 12.000 L 7.000 12.000 C 8.105 12.000 9.000 12.895 9.000 14.000 L 9.000 19.000 C 9.000 20.105 8.105 21.000 7.000 21.000 L 4.000 21.000 C 2.895 21.000 2.000 20.105 2.000 19.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 22.000 19.000 C 22.000 20.105 21.105 21.000 20.000 21.000 L 17.000 21.000 C 15.895 21.000 15.000 20.105 15.000 19.000 L 15.000 14.000 C 15.000 12.895 15.895 12.000 17.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 Z"),
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
        return _headphoneFill!!
    }

private var _headphoneFill: ImageVector? = null
