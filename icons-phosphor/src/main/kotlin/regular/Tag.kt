package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorRegularIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.310 136.000 L 144.000 36.690 C 141.010 33.676 136.936 31.986 132.690 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 132.690 C 31.986 136.936 33.676 141.010 36.690 144.000 L 136.000 243.310 C 139.001 246.311 143.071 247.998 147.315 247.998 C 151.559 247.998 155.629 246.311 158.630 243.310 L 243.310 158.630 C 246.311 155.629 247.998 151.559 247.998 147.315 C 247.998 143.071 246.311 139.001 243.310 136.000 ZM 147.310 232.000 L 48.000 132.690 L 48.000 48.000 L 132.690 48.000 L 232.000 147.310 ZM 96.000 84.000 C 96.000 90.627 90.627 96.000 84.000 96.000 C 77.373 96.000 72.000 90.627 72.000 84.000 C 72.000 77.373 77.373 72.000 84.000 72.000 C 90.627 72.000 96.000 77.373 96.000 84.000 Z"),
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
