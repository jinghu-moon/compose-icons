package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Equalizer2Line: ImageVector
    get() {
        if (_equalizer2Line != null) return _equalizer2Line!!
        _equalizer2Line = remixIcon(
            name = "Equalizer2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 7.000 C 5.000 6.172 5.672 5.500 6.500 5.500 C 7.328 5.500 8.000 6.172 8.000 7.000 C 8.000 7.828 7.328 8.500 6.500 8.500 C 5.672 8.500 5.000 7.828 5.000 7.000 ZM 6.500 3.500 C 4.567 3.500 3.000 5.067 3.000 7.000 C 3.000 8.933 4.567 10.500 6.500 10.500 C 8.433 10.500 10.000 8.933 10.000 7.000 C 10.000 5.067 8.433 3.500 6.500 3.500 ZM 12.000 8.000 L 20.000 8.000 L 20.000 6.000 L 12.000 6.000 L 12.000 8.000 ZM 16.000 17.000 C 16.000 16.172 16.672 15.500 17.500 15.500 C 18.328 15.500 19.000 16.172 19.000 17.000 C 19.000 17.828 18.328 18.500 17.500 18.500 C 16.672 18.500 16.000 17.828 16.000 17.000 ZM 17.500 13.500 C 15.567 13.500 14.000 15.067 14.000 17.000 C 14.000 18.933 15.567 20.500 17.500 20.500 C 19.433 20.500 21.000 18.933 21.000 17.000 C 21.000 15.067 19.433 13.500 17.500 13.500 ZM 4.000 16.000 L 4.000 18.000 L 12.000 18.000 L 12.000 16.000 L 4.000 16.000 Z"),
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
        return _equalizer2Line!!
    }

private var _equalizer2Line: ImageVector? = null
