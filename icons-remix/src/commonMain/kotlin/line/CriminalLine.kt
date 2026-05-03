package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CriminalLine: ImageVector
    get() {
        if (_criminalLine != null) return _criminalLine!!
        _criminalLine = remixIcon(
            name = "CriminalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 C 21.000 13.203 20.208 15.221 18.894 16.786 C 20.149 17.616 20.927 18.675 20.995 19.835 L 21.000 20.000 L 12.000 22.000 L 3.000 20.000 L 3.005 19.835 C 3.072 18.676 3.851 17.616 5.106 16.786 C 3.792 15.222 3.000 13.204 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 12.000 4.000 C 8.134 4.000 5.000 7.134 5.000 11.000 C 5.000 12.567 5.514 14.050 6.445 15.261 L 6.637 15.500 L 8.080 17.217 L 6.118 18.516 L 5.981 18.613 L 12.000 19.951 L 18.018 18.613 L 17.969 18.577 L 17.791 18.454 L 15.920 17.217 L 17.363 15.499 C 18.415 14.247 19.000 12.671 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 ZM 12.000 13.000 C 13.381 13.000 14.500 13.672 14.500 14.500 C 14.500 15.328 13.381 16.000 12.000 16.000 C 10.619 16.000 9.500 15.328 9.500 14.500 C 9.500 13.672 10.619 13.000 12.000 13.000 ZM 9.000 8.000 C 10.105 8.000 11.000 8.672 11.000 9.500 C 11.000 10.328 10.105 11.000 9.000 11.000 C 7.895 11.000 7.000 10.328 7.000 9.500 C 7.000 8.672 7.895 8.000 9.000 8.000 ZM 15.000 8.000 C 16.105 8.000 17.000 8.672 17.000 9.500 C 17.000 10.328 16.105 11.000 15.000 11.000 C 13.895 11.000 13.000 10.328 13.000 9.500 C 13.000 8.672 13.895 8.000 15.000 8.000 Z"),
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
        return _criminalLine!!
    }

private var _criminalLine: ImageVector? = null
