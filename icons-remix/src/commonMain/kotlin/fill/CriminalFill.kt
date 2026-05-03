package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CriminalFill: ImageVector
    get() {
        if (_criminalFill != null) return _criminalFill!!
        _criminalFill = remixIcon(
            name = "CriminalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 C 21.000 13.203 20.208 15.221 18.894 16.786 C 20.149 17.616 20.927 18.675 20.995 19.835 L 21.000 20.000 L 12.000 22.000 L 3.000 20.000 L 3.005 19.835 C 3.072 18.676 3.851 17.616 5.106 16.786 C 3.792 15.222 3.000 13.204 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 12.000 13.000 C 10.619 13.000 9.500 13.672 9.500 14.500 C 9.500 15.328 10.619 16.000 12.000 16.000 C 13.381 16.000 14.500 15.328 14.500 14.500 C 14.500 13.672 13.381 13.000 12.000 13.000 ZM 9.000 8.000 C 7.895 8.000 7.000 8.672 7.000 9.500 C 7.000 10.328 7.895 11.000 9.000 11.000 C 10.105 11.000 11.000 10.328 11.000 9.500 C 11.000 8.672 10.105 8.000 9.000 8.000 ZM 15.000 8.000 C 13.895 8.000 13.000 8.672 13.000 9.500 C 13.000 10.328 13.895 11.000 15.000 11.000 C 16.105 11.000 17.000 10.328 17.000 9.500 C 17.000 8.672 16.105 8.000 15.000 8.000 Z"),
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
        return _criminalFill!!
    }

private var _criminalFill: ImageVector? = null
