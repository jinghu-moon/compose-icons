package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Timer2Line: ImageVector
    get() {
        if (_timer2Line != null) return _timer2Line!!
        _timer2Line = remixIcon(
            name = "Timer2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 ZM 12.000 20.000 C 16.420 20.000 20.000 16.420 20.000 12.000 C 20.000 7.580 16.420 4.000 12.000 4.000 C 7.580 4.000 4.000 7.580 4.000 12.000 C 4.000 16.420 7.580 20.000 12.000 20.000 ZM 15.535 7.050 L 16.950 8.464 L 12.000 13.414 L 10.586 12.000 L 15.535 7.050 Z"),
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
        return _timer2Line!!
    }

private var _timer2Line: ImageVector? = null
