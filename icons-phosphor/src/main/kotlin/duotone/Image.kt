package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorDuotoneIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 178.060 L 184.280 138.340 C 181.156 135.218 176.094 135.218 172.970 138.340 L 147.310 164.000 L 97.660 114.340 C 96.159 112.838 94.123 111.994 92.000 111.994 C 89.877 111.994 87.841 112.838 86.340 114.340 L 32.000 168.690 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 56.000 L 216.000 158.750 L 189.930 132.690 C 186.929 129.689 182.859 128.002 178.615 128.002 C 174.371 128.002 170.301 129.689 167.300 132.690 L 147.300 152.690 L 103.300 108.690 C 97.052 102.447 86.928 102.447 80.680 108.690 L 40.000 149.370 L 40.000 56.000 ZM 40.000 172.000 L 92.000 120.000 L 172.000 200.000 L 40.000 200.000 ZM 216.000 200.000 L 194.630 200.000 L 158.630 164.000 L 178.630 144.000 L 216.000 181.380 L 216.000 200.000 ZM 144.000 100.000 C 144.000 93.373 149.373 88.000 156.000 88.000 C 162.627 88.000 168.000 93.373 168.000 100.000 C 168.000 106.627 162.627 112.000 156.000 112.000 C 149.373 112.000 144.000 106.627 144.000 100.000 Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
