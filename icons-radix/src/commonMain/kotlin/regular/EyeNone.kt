package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeNone: ImageVector
    get() {
        if (_eyeNone != null) return _eyeNone!!
        _eyeNone = radixIcon(
            name = "EyeNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.646 1.647 C 12.842 1.451 13.158 1.451 13.354 1.647 C 13.549 1.842 13.549 2.158 13.354 2.354 L 11.638 4.068 C 12.976 4.815 14.097 5.912 14.924 7.235 C 15.012 7.377 15.024 7.552 14.957 7.702 L 14.924 7.765 C 13.344 10.293 10.692 12.000 7.500 12.000 C 6.362 12.000 5.294 11.782 4.317 11.389 L 2.354 13.354 C 2.158 13.549 1.842 13.549 1.647 13.354 C 1.451 13.158 1.451 12.842 1.647 12.646 L 3.361 10.931 C 2.024 10.184 0.903 9.088 0.076 7.765 C -0.025 7.603 -0.025 7.397 0.076 7.235 L 0.228 7.000 C 1.823 4.601 4.408 3.000 7.500 3.000 C 8.637 3.000 9.706 3.217 10.682 3.610 L 12.646 1.647 ZM 5.096 10.610 C 5.847 10.863 6.652 11.000 7.500 11.000 C 10.196 11.000 12.466 9.621 13.899 7.500 C 13.123 6.351 12.099 5.422 10.896 4.810 L 5.096 10.610 ZM 7.500 4.000 C 4.804 4.000 2.533 5.379 1.100 7.500 C 1.876 8.649 2.900 9.577 4.103 10.189 L 9.903 4.389 C 9.153 4.136 8.347 4.000 7.500 4.000 Z"),
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
        return _eyeNone!!
    }

private var _eyeNone: ImageVector? = null
