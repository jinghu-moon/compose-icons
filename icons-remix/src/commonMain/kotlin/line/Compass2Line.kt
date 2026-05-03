package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Compass2Line: ImageVector
    get() {
        if (_compass2Line != null) return _compass2Line!!
        _compass2Line = remixIcon(
            name = "Compass2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.625 3.133 L 15.125 4.633 C 14.165 4.225 13.109 4.000 12.000 4.000 C 7.580 4.000 4.000 7.580 4.000 12.000 C 4.000 16.420 7.580 20.000 12.000 20.000 C 16.420 20.000 20.000 16.420 20.000 12.000 C 20.000 10.891 19.775 9.835 19.367 8.875 L 20.867 7.375 C 21.591 8.759 22.000 10.332 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 C 13.668 2.000 15.241 2.409 16.625 3.133 ZM 18.364 4.222 L 19.778 5.636 L 12.000 13.414 L 10.586 12.000 L 18.364 4.222 Z"),
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
        return _compass2Line!!
    }

private var _compass2Line: ImageVector? = null
