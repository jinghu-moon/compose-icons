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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.351 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L13.25 8h-11.5C1.474 8 1.25 7.776 1.25 7.5 1.25 7.224 1.474 7 1.75 7h11.5l.101 .01Z"),
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
        return _borderSolid!!
    }

private var _borderSolid: ImageVector? = null
