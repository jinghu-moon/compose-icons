package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DividerHorizontal: ImageVector
    get() {
        if (_dividerHorizontal != null) return _dividerHorizontal!!
        _dividerHorizontal = radixIcon(
            name = "DividerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 7c.276 0 .5 .224 .5 .5C13 7.776 12.776 8 12.5 8h-10C2.224 8 2 7.776 2 7.5 2 7.224 2.224 7 2.5 7h10Z"),
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
        return _dividerHorizontal!!
    }

private var _dividerHorizontal: ImageVector? = null
