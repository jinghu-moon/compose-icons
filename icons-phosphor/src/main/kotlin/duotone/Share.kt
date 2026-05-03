package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorDuotoneIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 104.000 L 176.000 152.000 L 176.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 229.660 98.340 L 181.660 50.340 C 179.372 48.049 175.929 47.364 172.938 48.603 C 169.947 49.842 167.997 52.762 168.000 56.000 L 168.000 96.000 L 165.000 96.000 C 117.549 95.955 76.092 128.051 64.250 174.000 C 63.145 178.280 65.720 182.645 70.000 183.750 C 74.280 184.855 78.645 182.280 79.750 178.000 C 89.786 139.130 124.856 111.980 165.000 112.000 L 168.000 112.000 L 168.000 152.000 C 167.997 155.238 169.947 158.158 172.938 159.397 C 175.929 160.636 179.372 159.951 181.660 157.660 L 229.660 109.660 C 231.162 108.159 232.006 106.123 232.006 104.000 C 232.006 101.877 231.162 99.841 229.660 98.340 ZM 184.000 132.690 L 184.000 75.310 L 212.690 104.000 ZM 200.000 216.000 C 200.000 220.418 196.418 224.000 192.000 224.000 L 32.000 224.000 C 27.582 224.000 24.000 220.418 24.000 216.000 L 24.000 88.000 C 24.000 83.582 27.582 80.000 32.000 80.000 C 36.418 80.000 40.000 83.582 40.000 88.000 L 40.000 208.000 L 192.000 208.000 C 196.418 208.000 200.000 211.582 200.000 216.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
