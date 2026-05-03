package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorBoldIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.150 133.180 L 146.830 33.860 C 143.090 30.095 137.997 27.985 132.690 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 132.690 C 27.985 137.997 30.095 143.090 33.860 146.830 L 133.180 246.150 C 140.990 253.958 153.650 253.958 161.460 246.150 L 246.150 161.460 C 253.958 153.650 253.958 140.990 246.150 133.180 ZM 147.320 226.350 L 52.000 131.000 L 52.000 52.000 L 131.000 52.000 L 226.320 147.320 ZM 104.000 88.000 C 104.000 96.837 96.837 104.000 88.000 104.000 C 79.163 104.000 72.000 96.837 72.000 88.000 C 72.000 79.163 79.163 72.000 88.000 72.000 C 96.837 72.000 104.000 79.163 104.000 88.000 Z"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
