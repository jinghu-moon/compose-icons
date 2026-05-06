package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderDotted: ImageVector
    get() {
        if (_borderDotted != null) return _borderDotted!!
        _borderDotted = radixIcon(
            name = "BorderDotted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 6.625c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875ZM5.5 6.625c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875ZM9.5 6.625c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875ZM13.5 6.625c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875Z"),
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
        return _borderDotted!!
    }

private var _borderDotted: ImageVector? = null
