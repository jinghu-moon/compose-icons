package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DrawingPin: ImageVector
    get() {
        if (_drawingPin != null) return _drawingPin!!
        _drawingPin = radixIcon(
            name = "DrawingPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.621 1.136 C 9.816 0.941 10.133 0.941 10.328 1.136 L 13.864 4.671 C 14.059 4.866 14.059 5.183 13.864 5.378 C 13.669 5.573 13.352 5.573 13.157 5.378 L 12.504 4.726 L 8.867 9.574 L 9.975 10.682 C 10.170 10.877 10.170 11.194 9.975 11.389 C 9.779 11.584 9.463 11.584 9.268 11.389 L 6.793 8.913 L 6.793 8.914 L 3.522 12.185 C 3.327 12.380 3.011 12.380 2.815 12.185 C 2.620 11.990 2.620 11.673 2.815 11.478 L 6.086 8.207 L 6.086 8.206 L 3.611 5.732 C 3.416 5.536 3.416 5.220 3.611 5.025 C 3.807 4.830 4.123 4.830 4.318 5.025 L 5.426 6.133 L 10.274 2.496 L 9.621 1.843 C 9.426 1.648 9.426 1.331 9.621 1.136 ZM 6.140 6.847 L 8.153 8.861 L 11.790 4.011 L 10.988 3.210 L 6.140 6.847 Z"),
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
        return _drawingPin!!
    }

private var _drawingPin: ImageVector? = null
