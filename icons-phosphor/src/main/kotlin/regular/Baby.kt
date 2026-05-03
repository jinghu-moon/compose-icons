package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorRegularIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 140.000 C 85.373 140.000 80.000 134.627 80.000 128.000 C 80.000 121.373 85.373 116.000 92.000 116.000 C 98.627 116.000 104.000 121.373 104.000 128.000 C 104.000 134.627 98.627 140.000 92.000 140.000 ZM 164.000 116.000 C 157.373 116.000 152.000 121.373 152.000 128.000 C 152.000 134.627 157.373 140.000 164.000 140.000 C 170.627 140.000 176.000 134.627 176.000 128.000 C 176.000 121.373 170.627 116.000 164.000 116.000 ZM 151.730 161.230 C 137.196 170.250 118.804 170.250 104.270 161.230 C 100.531 158.872 95.588 159.991 93.230 163.730 C 90.872 167.469 91.991 172.412 95.730 174.770 C 115.482 187.083 140.518 187.083 160.270 174.770 C 164.009 172.412 165.128 167.469 162.770 163.730 C 160.412 159.991 155.469 158.872 151.730 161.230 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 215.942 80.943 178.918 42.237 131.910 40.090 C 120.320 56.380 120.000 71.880 120.000 72.000 C 120.000 76.418 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 76.418 136.000 72.000 C 136.000 67.582 139.582 64.000 144.000 64.000 C 148.418 64.000 152.000 67.582 152.000 72.000 C 152.000 85.255 141.255 96.000 128.000 96.000 C 114.745 96.000 104.000 85.255 104.000 72.000 C 104.000 71.270 104.130 57.700 112.460 41.370 C 66.614 49.595 35.118 92.121 40.615 138.373 C 46.112 184.626 86.699 218.584 133.196 215.834 C 179.692 213.083 215.993 174.578 216.000 128.000 Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
