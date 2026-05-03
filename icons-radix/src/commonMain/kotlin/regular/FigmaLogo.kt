package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = radixIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.728 1.063 C 10.976 1.189 11.950 2.243 11.950 3.525 L 11.938 3.779 C 11.866 4.481 11.499 5.095 10.964 5.499 C 11.562 5.951 11.950 6.667 11.950 7.475 L 11.938 7.729 C 11.811 8.976 10.756 9.950 9.475 9.950 L 9.222 9.938 C 8.766 9.891 8.349 9.719 8.000 9.460 L 8.000 11.425 L 7.988 11.679 C 7.860 12.927 6.806 13.901 5.525 13.901 L 5.272 13.888 C 4.107 13.769 3.181 12.843 3.063 11.679 L 3.050 11.425 C 3.050 10.618 3.436 9.900 4.034 9.448 C 3.501 9.044 3.134 8.431 3.063 7.729 L 3.050 7.475 C 3.050 6.668 3.437 5.951 4.035 5.499 C 3.501 5.095 3.134 4.481 3.063 3.779 L 3.050 3.525 C 3.050 2.243 4.024 1.190 5.272 1.063 L 5.525 1.050 L 9.475 1.050 L 9.728 1.063 ZM 5.525 9.950 C 4.710 9.951 4.050 10.611 4.050 11.425 C 4.050 12.239 4.710 12.900 5.525 12.901 C 6.339 12.901 7.000 12.239 7.000 11.425 L 7.000 9.950 L 5.525 9.950 ZM 5.525 6.000 C 4.710 6.000 4.050 6.661 4.050 7.475 C 4.050 8.289 4.710 8.950 5.525 8.950 L 7.000 8.950 L 7.000 6.000 L 5.525 6.000 ZM 9.475 6.000 C 8.661 6.000 8.000 6.661 8.000 7.475 C 8.000 8.289 8.660 8.950 9.475 8.950 C 10.289 8.950 10.950 8.289 10.950 7.475 C 10.950 6.660 10.289 6.000 9.475 6.000 ZM 8.000 5.000 L 9.475 5.000 C 10.290 5.000 10.950 4.339 10.950 3.525 C 10.950 2.710 10.289 2.050 9.475 2.050 L 8.000 2.050 L 8.000 5.000 ZM 5.525 2.050 C 4.710 2.050 4.050 2.710 4.050 3.525 C 4.050 4.339 4.710 5.000 5.525 5.000 L 7.000 5.000 L 7.000 2.050 L 5.525 2.050 Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
