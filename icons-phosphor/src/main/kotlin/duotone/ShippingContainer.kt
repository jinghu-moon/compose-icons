package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorDuotoneIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 86.000 L 240.000 170.000 C 239.999 173.570 237.633 176.708 234.200 177.690 L 128.000 208.000 L 128.000 48.000 L 234.200 78.340 C 237.622 79.319 239.986 82.441 240.000 86.000 Z"),
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
                pathData = parseSvgPathData("M 236.400 70.650 L 130.200 40.310 C 129.119 40.000 127.984 39.922 126.870 40.080 L 21.740 55.100 C 13.874 56.257 8.034 62.989 8.000 70.940 L 8.000 185.060 C 8.034 193.011 13.874 199.743 21.740 200.900 L 126.870 215.900 C 127.244 215.959 127.622 215.992 128.000 216.000 C 128.744 216.001 129.485 215.897 130.200 215.690 L 236.400 185.350 C 243.241 183.369 247.962 177.122 248.000 170.000 L 248.000 86.000 C 247.962 78.878 243.241 72.631 236.400 70.650 ZM 96.000 120.000 L 80.000 120.000 L 80.000 62.940 L 120.000 57.220 L 120.000 198.780 L 80.000 193.060 L 80.000 136.000 L 96.000 136.000 C 100.418 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 100.418 120.000 96.000 120.000 ZM 24.000 70.940 L 64.000 65.220 L 64.000 120.000 L 48.000 120.000 C 43.582 120.000 40.000 123.582 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 L 64.000 136.000 L 64.000 190.780 L 24.000 185.060 ZM 136.000 197.390 L 136.000 58.610 L 232.000 86.000 L 232.000 170.000 Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
