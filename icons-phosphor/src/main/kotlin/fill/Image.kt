package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorFillIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 156.000 88.000 C 162.627 88.000 168.000 93.373 168.000 100.000 C 168.000 106.627 162.627 112.000 156.000 112.000 C 149.373 112.000 144.000 106.627 144.000 100.000 C 144.000 93.373 149.373 88.000 156.000 88.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 160.690 L 86.340 114.340 C 87.841 112.838 89.877 111.994 92.000 111.994 C 94.123 111.994 96.159 112.838 97.660 114.340 L 97.660 114.340 L 165.000 181.660 C 168.126 184.786 173.194 184.786 176.320 181.660 C 179.446 178.534 179.446 173.466 176.320 170.340 L 158.660 152.690 L 173.000 138.340 C 176.124 135.218 181.186 135.218 184.310 138.340 L 216.000 170.070 L 216.000 200.000 Z"),
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
