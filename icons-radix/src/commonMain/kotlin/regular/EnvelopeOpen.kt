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
                pathData = parseSvgPathData("M 7.160 0.119 C 7.416 0.026 7.701 0.042 7.947 0.165 L 14.447 3.415 L 14.568 3.487 C 14.836 3.672 15.000 3.978 15.000 4.309 L 15.000 12.000 C 15.000 12.552 14.552 13.000 14.000 13.000 L 1.000 13.000 C 0.448 13.000 0.000 12.552 0.000 12.000 L 0.000 4.309 C 0.000 3.931 0.214 3.585 0.553 3.415 L 7.053 0.165 L 7.160 0.119 ZM 7.710 8.199 C 7.579 8.268 7.421 8.268 7.290 8.199 L 1.000 4.884 L 1.000 12.000 L 14.000 12.000 L 14.000 4.884 L 7.710 8.199 ZM 1.431 4.093 L 7.500 7.291 L 13.568 4.093 L 7.500 1.059 L 1.431 4.093 Z"),
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
