package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorThinIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.830 77.170 L 210.830 45.170 C 209.267 43.607 206.733 43.607 205.170 45.170 C 203.607 46.733 203.607 49.267 205.170 50.830 L 230.340 76.000 L 208.000 76.000 C 161.330 76.000 150.160 102.810 140.310 126.460 C 130.850 149.150 121.910 170.620 83.760 171.940 C 81.637 152.954 65.054 138.933 45.980 139.996 C 26.905 141.059 11.983 156.836 11.983 175.940 C 11.983 195.044 26.905 210.821 45.980 211.884 C 65.054 212.947 81.637 198.926 83.760 179.940 C 127.250 178.520 138.090 152.550 147.670 129.550 C 157.450 106.120 166.670 84.000 208.000 84.000 L 230.340 84.000 L 205.170 109.170 C 203.607 110.733 203.607 113.267 205.170 114.830 C 206.733 116.393 209.267 116.393 210.830 114.830 L 242.830 82.830 C 243.581 82.080 244.003 81.062 244.003 80.000 C 244.003 78.938 243.581 77.920 242.830 77.170 ZM 48.000 204.000 C 32.536 204.000 20.000 191.464 20.000 176.000 C 20.000 160.536 32.536 148.000 48.000 148.000 C 63.464 148.000 76.000 160.536 76.000 176.000 C 76.000 191.464 63.464 204.000 48.000 204.000 Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
