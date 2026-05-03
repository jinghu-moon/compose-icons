package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Equalizer2Fill: ImageVector
    get() {
        if (_equalizer2Fill != null) return _equalizer2Fill!!
        _equalizer2Fill = remixIcon(
            name = "Equalizer2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 7.000 C 3.000 5.067 4.567 3.500 6.500 3.500 C 8.433 3.500 10.000 5.067 10.000 7.000 C 10.000 8.933 8.433 10.500 6.500 10.500 C 4.567 10.500 3.000 8.933 3.000 7.000 ZM 20.000 8.000 L 12.000 8.000 L 12.000 6.000 L 20.000 6.000 L 20.000 8.000 ZM 14.000 17.000 C 14.000 15.067 15.567 13.500 17.500 13.500 C 19.433 13.500 21.000 15.067 21.000 17.000 C 21.000 18.933 19.433 20.500 17.500 20.500 C 15.567 20.500 14.000 18.933 14.000 17.000 ZM 12.000 16.000 L 12.000 18.000 L 4.000 18.000 L 4.000 16.000 L 12.000 16.000 Z"),
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
        return _equalizer2Fill!!
    }

private var _equalizer2Fill: ImageVector? = null
