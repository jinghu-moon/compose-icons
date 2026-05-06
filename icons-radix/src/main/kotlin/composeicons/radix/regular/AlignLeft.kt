package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = radixIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M-0 1.5C0 1.224 .224 1 .5 1c.276 0 .5 .224 .5 .5L1 6h11c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-11v4.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5L-0 1.5Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
