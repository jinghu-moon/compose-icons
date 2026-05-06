package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = radixIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.16 .119c.256-.092 .541-.076 .787 .047l6.5 3.25 .121 .071c.267 .185 .431 .491 .432 .822v7.691c-0 .552-.448 1-1 1h-13c-.552 0-1-.448-1-1v-7.691C0 3.931 .214 3.585 .553 3.415L7.053 .165 7.16 .119ZM7.71 8.199c-.131 .069-.289 .069-.42 0L1 4.884v7.116h13v-7.116L7.71 8.199ZM1.431 4.093 7.5 7.291 13.568 4.093 7.5 1.059 1.431 4.093Z"),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
