package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brain2Fill: ImageVector
    get() {
        if (_brain2Fill != null) return _brain2Fill!!
        _brain2Fill = remixIcon(
            name = "Brain2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.500 2.000 C 6.567 2.000 5.000 3.567 5.000 5.500 C 5.000 5.680 5.014 5.857 5.040 6.030 C 3.324 6.255 2.000 7.723 2.000 9.500 C 2.000 10.479 2.402 11.365 3.051 12.000 C 2.402 12.635 2.000 13.521 2.000 14.500 C 2.000 15.902 2.824 17.110 4.014 17.669 C 4.005 17.778 4.000 17.889 4.000 18.000 C 4.000 20.209 5.791 22.000 8.000 22.000 C 9.195 22.000 10.267 21.476 11.000 20.646 L 11.000 3.051 C 10.365 2.402 9.479 2.000 8.500 2.000 ZM 13.000 3.051 L 13.000 20.646 C 13.733 21.476 14.805 22.000 16.000 22.000 C 18.209 22.000 20.000 20.209 20.000 18.000 C 20.000 17.889 19.995 17.778 19.986 17.669 C 21.176 17.110 22.000 15.902 22.000 14.500 C 22.000 13.521 21.598 12.635 20.949 12.000 C 21.598 11.365 22.000 10.479 22.000 9.500 C 22.000 7.723 20.676 6.255 18.960 6.030 C 18.986 5.857 19.000 5.680 19.000 5.500 C 19.000 3.567 17.433 2.000 15.500 2.000 C 14.521 2.000 13.635 2.402 13.000 3.051 Z"),
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
        return _brain2Fill!!
    }

private var _brain2Fill: ImageVector? = null
