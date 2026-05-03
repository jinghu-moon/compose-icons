package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) return _speakerSimpleNone!!
        _speakerSimpleNone = phosphorThinIcon(
            name = "SpeakerSimpleNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.760 28.410 C 160.387 27.734 158.749 27.901 157.540 28.840 L 86.630 84.000 L 40.000 84.000 C 33.373 84.000 28.000 89.373 28.000 96.000 L 28.000 160.000 C 28.000 166.627 33.373 172.000 40.000 172.000 L 86.630 172.000 L 157.540 227.160 C 158.246 227.701 159.110 227.996 160.000 228.000 C 160.611 228.002 161.213 227.862 161.760 227.590 C 163.130 226.919 163.999 225.526 164.000 224.000 L 164.000 32.000 C 163.999 30.474 163.130 29.081 161.760 28.410 ZM 156.000 215.820 L 90.460 164.820 C 89.752 164.285 88.888 163.997 88.000 164.000 L 40.000 164.000 C 37.791 164.000 36.000 162.209 36.000 160.000 L 36.000 96.000 C 36.000 93.791 37.791 92.000 40.000 92.000 L 88.000 92.000 C 88.890 91.997 89.754 91.702 90.460 91.160 L 156.000 40.160 Z"),
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
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
