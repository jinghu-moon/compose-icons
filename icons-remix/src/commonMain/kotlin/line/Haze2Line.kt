package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Haze2Line: ImageVector
    get() {
        if (_haze2Line != null) return _haze2Line!!
        _haze2Line = remixIcon(
            name = "Haze2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 19.000 C 12.828 19.000 13.500 19.672 13.500 20.500 C 13.500 21.328 12.828 22.000 12.000 22.000 C 11.172 22.000 10.500 21.328 10.500 20.500 C 10.500 19.672 11.172 19.000 12.000 19.000 ZM 19.500 19.000 C 20.328 19.000 21.000 19.672 21.000 20.500 C 21.000 21.328 20.328 22.000 19.500 22.000 C 18.672 22.000 18.000 21.328 18.000 20.500 C 18.000 19.672 18.672 19.000 19.500 19.000 ZM 4.500 19.000 C 5.328 19.000 6.000 19.672 6.000 20.500 C 6.000 21.328 5.328 22.000 4.500 22.000 C 3.672 22.000 3.000 21.328 3.000 20.500 C 3.000 19.672 3.672 19.000 4.500 19.000 ZM 17.000 7.000 C 19.761 7.000 22.000 9.239 22.000 12.000 C 22.000 14.761 19.761 17.000 17.000 17.000 C 15.156 17.000 13.490 15.960 12.000 13.878 C 10.510 15.960 8.844 17.000 7.000 17.000 C 4.239 17.000 2.000 14.761 2.000 12.000 C 2.000 9.239 4.239 7.000 7.000 7.000 C 8.844 7.000 10.510 8.041 12.000 10.122 C 13.490 8.041 15.156 7.000 17.000 7.000 ZM 7.000 9.000 C 5.343 9.000 4.000 10.343 4.000 12.000 C 4.000 13.657 5.343 15.000 7.000 15.000 C 8.254 15.000 9.509 14.125 10.759 12.146 L 10.848 11.999 L 10.759 11.854 C 9.561 9.958 8.358 9.075 7.157 9.005 L 7.000 9.000 ZM 17.000 9.000 C 15.746 9.000 14.491 9.875 13.241 11.854 L 13.151 12.000 L 13.241 12.146 C 14.439 14.042 15.642 14.925 16.843 14.995 L 17.000 15.000 C 18.657 15.000 20.000 13.657 20.000 12.000 C 20.000 10.343 18.657 9.000 17.000 9.000 ZM 12.000 2.000 C 12.828 2.000 13.500 2.672 13.500 3.500 C 13.500 4.328 12.828 5.000 12.000 5.000 C 11.172 5.000 10.500 4.328 10.500 3.500 C 10.500 2.672 11.172 2.000 12.000 2.000 ZM 4.500 2.000 C 5.328 2.000 6.000 2.672 6.000 3.500 C 6.000 4.328 5.328 5.000 4.500 5.000 C 3.672 5.000 3.000 4.328 3.000 3.500 C 3.000 2.672 3.672 2.000 4.500 2.000 ZM 19.500 2.000 C 20.328 2.000 21.000 2.672 21.000 3.500 C 21.000 4.328 20.328 5.000 19.500 5.000 C 18.672 5.000 18.000 4.328 18.000 3.500 C 18.000 2.672 18.672 2.000 19.500 2.000 Z"),
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
        return _haze2Line!!
    }

private var _haze2Line: ImageVector? = null
