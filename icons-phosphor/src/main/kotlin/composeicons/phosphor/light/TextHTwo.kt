package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorLightIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 56v120c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-54h-92v54c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-120c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v54h92v-54c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM240 202h-36l36-47.95c7.049-9.448 7.912-22.147 2.206-32.462-5.706-10.314-16.923-16.332-28.672-15.38-11.749 .951-21.852 8.694-25.824 19.792-.872 2.054-.532 4.421 .881 6.147 1.414 1.726 3.669 2.525 5.854 2.074 2.185-.451 3.94-2.077 4.555-4.221 2.241-6.331 7.819-10.888 14.47-11.82 7.209-1.009 14.315 2.423 18.008 8.695 3.692 6.273 3.243 14.152-1.138 19.965l-43.14 57.56c-1.364 1.818-1.583 4.251-.567 6.283 1.016 2.033 3.094 3.317 5.367 3.317h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
