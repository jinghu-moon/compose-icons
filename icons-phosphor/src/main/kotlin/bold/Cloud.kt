package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = phosphorBoldIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 36.000 C 126.166 36.016 95.066 54.584 79.000 84.360 C 54.005 81.778 29.623 93.190 15.595 114.038 C 1.567 134.886 0.179 161.771 11.987 183.952 C 23.794 206.134 46.872 219.996 72.000 220.000 L 160.000 220.000 C 210.810 220.000 252.000 178.810 252.000 128.000 C 252.000 77.190 210.810 36.000 160.000 36.000 ZM 160.000 196.000 L 72.000 196.000 C 47.699 196.503 27.593 177.211 27.090 152.910 C 26.587 128.609 45.879 108.503 70.180 108.000 C 68.723 114.567 67.992 121.274 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.000 90.445 122.445 60.000 160.000 60.000 C 197.555 60.000 228.000 90.445 228.000 128.000 C 228.000 165.555 197.555 196.000 160.000 196.000 Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
