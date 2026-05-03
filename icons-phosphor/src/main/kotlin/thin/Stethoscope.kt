package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorThinIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 160.000 C 216.000 164.418 212.418 168.000 208.000 168.000 C 203.582 168.000 200.000 164.418 200.000 160.000 C 200.000 155.582 203.582 152.000 208.000 152.000 C 212.418 152.000 216.000 155.582 216.000 160.000 ZM 211.830 195.790 C 209.836 218.521 190.818 235.968 168.000 236.000 L 144.000 236.000 C 119.711 235.972 100.028 216.289 100.000 192.000 L 100.000 147.850 C 68.492 145.745 44.009 119.578 44.000 88.000 L 44.000 40.000 C 44.000 37.791 45.791 36.000 48.000 36.000 L 72.000 36.000 C 74.209 36.000 76.000 37.791 76.000 40.000 C 76.000 42.209 74.209 44.000 72.000 44.000 L 52.000 44.000 L 52.000 88.000 C 51.999 101.912 57.572 115.244 67.474 125.016 C 77.375 134.788 90.780 140.185 104.690 140.000 C 133.000 139.630 156.000 115.930 156.000 87.170 L 156.000 44.000 L 136.000 44.000 C 133.791 44.000 132.000 42.209 132.000 40.000 C 132.000 37.791 133.791 36.000 136.000 36.000 L 160.000 36.000 C 162.209 36.000 164.000 37.791 164.000 40.000 L 164.000 87.170 C 164.000 119.170 139.160 145.760 108.000 147.860 L 108.000 192.000 C 108.000 211.882 124.118 228.000 144.000 228.000 L 168.000 228.000 C 186.420 227.975 201.858 214.067 203.800 195.750 C 184.814 193.627 170.793 177.044 171.856 157.970 C 172.919 138.895 188.696 123.973 207.800 123.973 C 226.904 123.973 242.681 138.895 243.744 157.970 C 244.807 177.044 230.786 193.627 211.800 195.750 ZM 236.000 160.000 C 236.000 144.536 223.464 132.000 208.000 132.000 C 192.536 132.000 180.000 144.536 180.000 160.000 C 180.000 175.464 192.536 188.000 208.000 188.000 C 223.464 188.000 236.000 175.464 236.000 160.000 Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
