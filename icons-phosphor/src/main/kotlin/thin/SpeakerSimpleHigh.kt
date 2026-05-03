package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorThinIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.760 28.410 C 160.387 27.734 158.749 27.901 157.540 28.840 L 86.630 84.000 L 40.000 84.000 C 33.373 84.000 28.000 89.373 28.000 96.000 L 28.000 160.000 C 28.000 166.627 33.373 172.000 40.000 172.000 L 86.630 172.000 L 157.540 227.160 C 158.246 227.701 159.110 227.996 160.000 228.000 C 160.611 228.002 161.213 227.862 161.760 227.590 C 163.130 226.919 163.999 225.526 164.000 224.000 L 164.000 32.000 C 163.999 30.474 163.130 29.081 161.760 28.410 ZM 156.000 215.820 L 90.460 164.820 C 89.752 164.285 88.888 163.997 88.000 164.000 L 40.000 164.000 C 37.791 164.000 36.000 162.209 36.000 160.000 L 36.000 96.000 C 36.000 93.791 37.791 92.000 40.000 92.000 L 88.000 92.000 C 88.890 91.997 89.754 91.702 90.460 91.160 L 156.000 40.160 ZM 204.000 104.000 L 204.000 152.000 C 204.000 154.209 202.209 156.000 200.000 156.000 C 197.791 156.000 196.000 154.209 196.000 152.000 L 196.000 104.000 C 196.000 101.791 197.791 100.000 200.000 100.000 C 202.209 100.000 204.000 101.791 204.000 104.000 ZM 236.000 88.000 L 236.000 168.000 C 236.000 170.209 234.209 172.000 232.000 172.000 C 229.791 172.000 228.000 170.209 228.000 168.000 L 228.000 88.000 C 228.000 85.791 229.791 84.000 232.000 84.000 C 234.209 84.000 236.000 85.791 236.000 88.000 Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
