package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorThinIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 161.760 28.410 C 160.387 27.734 158.749 27.901 157.540 28.840 L 86.630 84.000 L 40.000 84.000 C 33.373 84.000 28.000 89.373 28.000 96.000 L 28.000 160.000 C 28.000 166.627 33.373 172.000 40.000 172.000 L 86.630 172.000 L 157.540 227.160 C 158.246 227.701 159.110 227.996 160.000 228.000 C 160.611 228.002 161.213 227.862 161.760 227.590 C 163.130 226.919 163.999 225.526 164.000 224.000 L 164.000 32.000 C 163.999 30.474 163.130 29.081 161.760 28.410 ZM 156.000 215.820 L 90.460 164.820 C 89.752 164.285 88.888 163.997 88.000 164.000 L 40.000 164.000 C 37.791 164.000 36.000 162.209 36.000 160.000 L 36.000 96.000 C 36.000 93.791 37.791 92.000 40.000 92.000 L 88.000 92.000 C 88.890 91.997 89.754 91.702 90.460 91.160 L 156.000 40.160 ZM 250.830 149.170 C 252.393 150.733 252.393 153.267 250.830 154.830 C 249.267 156.393 246.733 156.393 245.170 154.830 L 224.000 133.660 L 202.830 154.830 C 201.267 156.393 198.733 156.393 197.170 154.830 C 195.607 153.267 195.607 150.733 197.170 149.170 L 218.340 128.000 L 197.170 106.830 C 195.607 105.267 195.607 102.733 197.170 101.170 C 198.733 99.607 201.267 99.607 202.830 101.170 L 224.000 122.340 L 245.170 101.170 C 246.733 99.607 249.267 99.607 250.830 101.170 C 252.393 102.733 252.393 105.267 250.830 106.830 L 229.660 128.000 Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
