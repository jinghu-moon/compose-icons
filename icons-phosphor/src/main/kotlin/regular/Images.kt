package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorRegularIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 72.000 40.000 C 63.163 40.000 56.000 47.163 56.000 56.000 L 56.000 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 184.000 216.000 C 192.837 216.000 200.000 208.837 200.000 200.000 L 200.000 184.000 L 216.000 184.000 C 224.837 184.000 232.000 176.837 232.000 168.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 72.000 56.000 L 216.000 56.000 L 216.000 118.750 L 205.930 108.690 C 202.929 105.689 198.859 104.002 194.615 104.002 C 190.371 104.002 186.301 105.689 183.300 108.690 L 163.300 128.690 L 119.300 84.690 C 113.052 78.447 102.928 78.447 96.680 84.690 L 72.000 109.370 ZM 184.000 200.000 L 40.000 200.000 L 40.000 88.000 L 56.000 88.000 L 56.000 168.000 C 56.000 176.837 63.163 184.000 72.000 184.000 L 184.000 184.000 ZM 216.000 168.000 L 72.000 168.000 L 72.000 132.000 L 108.000 96.000 L 157.660 145.660 C 160.784 148.782 165.846 148.782 168.970 145.660 L 194.630 120.000 L 216.000 141.380 L 216.000 168.000 ZM 160.000 84.000 C 160.000 77.373 165.373 72.000 172.000 72.000 C 178.627 72.000 184.000 77.373 184.000 84.000 C 184.000 90.627 178.627 96.000 172.000 96.000 C 165.373 96.000 160.000 90.627 160.000 84.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
