package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorDuotoneIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 112.000 L 200.000 145.370 C 200.001 149.616 198.313 153.688 195.310 156.690 L 162.310 189.690 C 150.942 175.249 148.818 155.584 156.840 139.049 C 164.862 122.513 181.621 112.010 200.000 112.000 ZM 192.000 24.000 L 104.000 24.000 C 99.582 24.000 96.000 27.582 96.000 32.000 L 96.000 56.000 L 200.000 56.000 L 200.000 32.000 C 200.000 27.582 196.418 24.000 192.000 24.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 192.000 16.000 L 104.000 16.000 C 95.163 16.000 88.000 23.163 88.000 32.000 L 88.000 108.690 L 49.250 147.430 C 26.689 170.513 26.901 207.452 49.724 230.276 C 72.548 253.099 109.487 253.311 132.570 230.750 L 201.000 162.340 C 205.511 157.837 208.032 151.714 208.000 145.340 L 208.000 32.000 C 208.000 23.163 200.837 16.000 192.000 16.000 ZM 192.000 32.000 L 192.000 32.000 L 192.000 48.000 L 104.000 48.000 L 104.000 32.000 ZM 121.250 219.430 C 110.452 230.475 94.552 234.865 79.617 230.924 C 64.682 226.982 53.018 215.318 49.076 200.383 C 45.135 185.448 49.525 169.548 60.570 158.750 L 101.660 117.660 C 103.160 116.158 104.002 114.122 104.000 112.000 L 104.000 64.000 L 192.000 64.000 L 192.000 104.580 C 164.470 108.593 144.041 132.179 144.000 160.000 C 143.964 170.131 146.707 180.079 151.930 188.760 ZM 189.660 151.000 L 163.750 176.910 C 161.267 171.619 159.987 165.844 160.000 160.000 C 160.020 141.000 173.388 124.629 192.000 120.810 L 192.000 145.370 C 191.994 147.482 191.153 149.506 189.660 151.000 Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
