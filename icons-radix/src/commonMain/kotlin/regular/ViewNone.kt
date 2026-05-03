package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ViewNone: ImageVector
    get() {
        if (_viewNone != null) return _viewNone!!
        _viewNone = radixIcon(
            name = "ViewNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.653 1.008 C 13.827 1.025 13.992 1.074 14.144 1.146 L 14.175 1.120 L 14.240 1.197 C 14.693 1.455 15.000 1.941 15.000 2.500 L 15.000 12.500 L 14.992 12.653 C 14.920 13.359 14.359 13.920 13.653 13.992 L 13.500 14.000 L 1.500 14.000 L 1.347 13.992 C 1.172 13.974 1.006 13.926 0.854 13.854 L 0.825 13.880 L 0.760 13.804 C 0.348 13.570 0.058 13.147 0.008 12.653 L 0.000 12.500 L 0.000 2.500 C 0.000 1.723 0.590 1.085 1.347 1.008 L 1.500 1.000 L 13.500 1.000 L 13.653 1.008 ZM 1.852 13.000 L 13.500 13.000 C 13.776 13.000 14.000 12.776 14.000 12.500 L 14.000 2.587 L 1.852 13.000 ZM 1.500 2.000 C 1.224 2.000 1.000 2.224 1.000 2.500 L 1.000 12.412 L 13.148 2.000 L 1.500 2.000 Z"),
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
        return _viewNone!!
    }

private var _viewNone: ImageVector? = null
