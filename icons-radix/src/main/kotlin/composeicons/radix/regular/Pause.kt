package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = radixIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 2.2c.304 0 .55 .246 .55 .55v9.5c0 .304-.246 .55-.55 .55-.304-0-.55-.246-.55-.55v-9.5c0-.304 .246-.55 .55-.55ZM9.5 2.2c.304 0 .55 .246 .55 .55v9.5c0 .304-.246 .55-.55 .55-.304-0-.55-.246-.55-.55v-9.5c0-.304 .246-.55 .55-.55Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
