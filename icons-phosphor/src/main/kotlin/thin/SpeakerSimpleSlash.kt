package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorThinIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 152.000 L 196.000 104.000 C 196.000 101.791 197.791 100.000 200.000 100.000 C 202.209 100.000 204.000 101.791 204.000 104.000 L 204.000 152.000 C 204.000 154.209 202.209 156.000 200.000 156.000 C 197.791 156.000 196.000 154.209 196.000 152.000 ZM 232.000 84.000 C 229.791 84.000 228.000 85.791 228.000 88.000 L 228.000 168.000 C 228.000 170.209 229.791 172.000 232.000 172.000 C 234.209 172.000 236.000 170.209 236.000 168.000 L 236.000 88.000 C 236.000 85.791 234.209 84.000 232.000 84.000 ZM 219.000 213.310 C 219.982 214.364 220.320 215.865 219.887 217.239 C 219.454 218.613 218.315 219.647 216.906 219.948 C 215.497 220.248 214.036 219.768 213.080 218.690 L 164.080 164.750 L 164.080 224.000 C 164.079 225.526 163.210 226.919 161.840 227.590 C 161.269 227.874 160.638 228.015 160.000 228.000 C 159.110 227.996 158.246 227.701 157.540 227.160 L 86.630 172.000 L 40.000 172.000 C 33.373 172.000 28.000 166.627 28.000 160.000 L 28.000 96.000 C 28.000 89.373 33.373 84.000 40.000 84.000 L 90.590 84.000 L 53.000 42.690 C 51.514 41.033 51.653 38.486 53.310 37.000 C 54.967 35.514 57.514 35.653 59.000 37.310 ZM 156.000 156.000 L 97.870 92.000 L 40.000 92.000 C 37.791 92.000 36.000 93.791 36.000 96.000 L 36.000 160.000 C 36.000 162.209 37.791 164.000 40.000 164.000 L 88.000 164.000 C 88.890 164.003 89.754 164.298 90.460 164.840 L 156.000 215.840 ZM 122.610 66.200 L 156.000 40.200 L 156.000 106.850 C 156.000 109.059 157.791 110.850 160.000 110.850 C 162.209 110.850 164.000 109.059 164.000 106.850 L 164.000 32.000 C 164.002 30.470 163.132 29.073 161.758 28.401 C 160.383 27.729 158.746 27.899 157.540 28.840 L 117.690 59.840 C 115.948 61.199 115.636 63.713 116.995 65.455 C 118.354 67.197 120.868 67.509 122.610 66.150 Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
