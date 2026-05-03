package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorRegularIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 178.534 160.786 173.466 160.786 170.340 157.660 C 167.214 154.534 167.214 149.466 170.340 146.340 L 204.690 112.000 L 165.000 112.000 C 124.863 111.989 89.804 139.138 79.770 178.000 C 78.665 182.280 74.300 184.855 70.020 183.750 C 65.740 182.645 63.165 178.280 64.270 174.000 C 76.110 128.058 117.557 95.964 165.000 96.000 L 204.710 96.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 ZM 192.000 208.000 L 40.000 208.000 L 40.000 88.000 C 40.000 83.582 36.418 80.000 32.000 80.000 C 27.582 80.000 24.000 83.582 24.000 88.000 L 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 192.000 224.000 C 196.418 224.000 200.000 220.418 200.000 216.000 C 200.000 211.582 196.418 208.000 192.000 208.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
