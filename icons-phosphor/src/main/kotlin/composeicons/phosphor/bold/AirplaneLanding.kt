package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorBoldIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 216c0 6.627-5.373 12-12 12h-140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h140c6.627 0 12 5.373 12 12ZM228.76 191.55 52.14 142.09C33.164 136.733 20.045 119.438 20 99.72v-51.72c-.008-6.432 3.078-12.476 8.294-16.241C33.509 27.994 40.217 26.967 46.32 29l5.48 1.83c3.482 1.16 6.241 3.849 7.49 7.3l9.91 27.46L92 72.09v-24.09c-.008-6.432 3.078-12.476 8.294-16.241 5.215-3.765 11.923-4.792 18.026-2.759l5.48 1.83c3.281 1.094 5.931 3.551 7.27 6.74l21.75 51.85 59 16.49c19.008 5.343 32.152 22.665 32.18 42.41v31.68c-.001 3.754-1.76 7.292-4.752 9.559-2.992 2.268-6.873 3.004-10.488 1.991ZM220 148.32c-.018-8.979-6.003-16.852-14.65-19.27L140.77 111c-3.532-.985-6.42-3.53-7.84-6.91L116 63.71v24.29c-0 3.764-1.766 7.31-4.771 9.578-3.005 2.268-6.899 2.994-10.519 1.962L56.71 87c-3.711-1.056-6.688-3.832-8-7.46L44 66.48v33.24c.015 8.969 5.979 16.84 14.61 19.28L220 164.18Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
