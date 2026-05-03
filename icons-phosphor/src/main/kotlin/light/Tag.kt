package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorLightIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.910 137.420 L 142.590 38.100 C 139.968 35.469 136.404 33.993 132.690 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 L 34.000 132.690 C 33.993 136.404 35.469 139.968 38.100 142.590 L 137.420 241.910 C 140.046 244.536 143.607 246.011 147.320 246.011 C 151.033 246.011 154.594 244.536 157.220 241.910 L 241.910 157.220 C 244.536 154.594 246.011 151.033 246.011 147.320 C 246.011 143.607 244.536 140.046 241.910 137.420 ZM 233.420 148.730 L 148.730 233.420 C 148.355 233.796 147.846 234.007 147.315 234.007 C 146.784 234.007 146.275 233.796 145.900 233.420 L 46.590 134.100 C 46.214 133.727 46.002 133.220 46.000 132.690 L 46.000 46.000 L 132.690 46.000 C 133.220 46.002 133.727 46.214 134.100 46.590 L 233.420 145.900 C 233.796 146.275 234.007 146.784 234.007 147.315 C 234.007 147.846 233.796 148.355 233.420 148.730 ZM 94.000 84.000 C 94.000 89.523 89.523 94.000 84.000 94.000 C 78.477 94.000 74.000 89.523 74.000 84.000 C 74.000 78.477 78.477 74.000 84.000 74.000 C 89.523 74.000 94.000 78.477 94.000 84.000 Z"),
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
