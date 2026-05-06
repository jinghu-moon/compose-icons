package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = radixIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 1c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-11C1.448 14 1 13.552 1 13v-11C1 1.448 1.448 1 2 1h11ZM9.675 5.851c-.379-.019-.757 .061-1.096 .23-.257 .129-.527 .424-.734 .938h-.053v-1.019h-1.792v6.005h1.906v-3.193c-.028-.327 .077-.75 .291-1.002 .214-.251 .521-.311 .753-.342h.072c.606 0 1.056 .376 1.056 1.321v3.216h1.906L12 8.357C12 6.553 10.834 5.851 9.675 5.851ZM3.05 12h1.9v-6h-1.9v6ZM4 2.93c-.594 0-1.075 .482-1.075 1.075 0 .594 .482 1.075 1.075 1.075 .594 0 1.075-.481 1.075-1.075C5.075 3.411 4.594 2.93 4 2.93Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
