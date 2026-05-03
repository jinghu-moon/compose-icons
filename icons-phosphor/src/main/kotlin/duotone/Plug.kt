package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorDuotoneIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 212.000 132.000 L 153.370 190.630 C 140.874 203.124 120.616 203.124 108.120 190.630 L 65.370 147.880 C 52.876 135.384 52.876 115.126 65.370 102.630 L 124.000 44.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 237.660 66.340 C 236.159 64.838 234.123 63.994 232.000 63.994 C 229.877 63.994 227.841 64.838 226.340 66.340 L 192.000 100.690 L 155.310 64.000 L 189.660 29.660 C 192.786 26.534 192.786 21.466 189.660 18.340 C 186.534 15.214 181.466 15.214 178.340 18.340 L 144.000 52.690 L 117.660 26.340 C 114.534 23.214 109.466 23.214 106.340 26.340 C 103.214 29.466 103.214 34.534 106.340 37.660 L 112.690 44.000 L 59.690 97.000 C 52.188 104.502 47.974 114.676 47.974 125.285 C 47.974 135.894 52.188 146.068 59.690 153.570 L 75.400 169.280 L 26.340 218.340 C 23.214 221.466 23.214 226.534 26.340 229.660 C 29.466 232.786 34.534 232.786 37.660 229.660 L 86.750 180.570 L 102.460 196.280 C 109.962 203.782 120.136 207.996 130.745 207.996 C 141.354 207.996 151.528 203.782 159.030 196.280 L 212.030 143.280 L 218.370 149.630 C 221.496 152.756 226.564 152.756 229.690 149.630 C 232.816 146.504 232.816 141.436 229.690 138.310 L 203.310 112.000 L 237.660 77.660 C 239.162 76.159 240.006 74.123 240.006 72.000 C 240.006 69.877 239.162 67.841 237.660 66.340 ZM 147.720 185.000 C 143.219 189.504 137.112 192.034 130.745 192.034 C 124.378 192.034 118.271 189.504 113.770 185.000 L 71.000 142.230 C 66.496 137.729 63.966 131.622 63.966 125.255 C 63.966 118.888 66.496 112.781 71.000 108.280 L 124.000 55.280 L 200.690 132.000 Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
