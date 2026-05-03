package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderSolid: ImageVector
    get() {
        if (_borderSolid != null) return _borderSolid!!
        _borderSolid = radixIcon(
            name = "BorderSolid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.351 7.010 C 13.579 7.056 13.750 7.258 13.750 7.500 C 13.750 7.742 13.579 7.944 13.351 7.990 L 13.250 8.000 L 1.750 8.000 C 1.474 8.000 1.250 7.776 1.250 7.500 C 1.250 7.224 1.474 7.000 1.750 7.000 L 13.250 7.000 L 13.351 7.010 Z"),
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
        return _borderSolid!!
    }

private var _borderSolid: ImageVector? = null
