package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorFillIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 72.000 40.000 C 63.163 40.000 56.000 47.163 56.000 56.000 L 56.000 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 184.000 216.000 C 192.837 216.000 200.000 208.837 200.000 200.000 L 200.000 184.000 L 216.000 184.000 C 224.837 184.000 232.000 176.837 232.000 168.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 172.000 72.000 C 178.627 72.000 184.000 77.373 184.000 84.000 C 184.000 90.627 178.627 96.000 172.000 96.000 C 165.373 96.000 160.000 90.627 160.000 84.000 C 160.000 77.373 165.373 72.000 172.000 72.000 ZM 184.000 200.000 L 40.000 200.000 L 40.000 88.000 L 56.000 88.000 L 56.000 168.000 C 56.000 176.837 63.163 184.000 72.000 184.000 L 184.000 184.000 ZM 216.000 168.000 L 72.000 168.000 L 72.000 120.690 L 102.340 90.340 C 103.841 88.838 105.877 87.994 108.000 87.994 C 110.123 87.994 112.159 88.838 113.660 90.340 L 163.310 140.000 L 189.000 114.340 C 192.124 111.218 197.186 111.218 200.310 114.340 L 216.000 130.070 L 216.000 168.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
