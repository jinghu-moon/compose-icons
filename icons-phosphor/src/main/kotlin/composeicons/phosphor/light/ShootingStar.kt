package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorLightIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.45 70.69c-1.417-4.421-5.371-7.544-10-7.9l-38.16-3L174.59 25C172.782 20.755 168.614 17.999 164 17.999c-4.614 0-8.782 2.756-10.59 7.001L138.73 59.78l-38.15 3c-4.619 .334-8.575 3.431-10.009 7.835-1.433 4.403-.058 9.236 3.479 12.225l29 24.48-8.86 36.59c-1.076 4.458 .636 9.126 4.34 11.83 3.75 2.761 8.795 2.99 12.78 .58L164 136.66l32.69 19.67c3.982 2.408 9.023 2.179 12.77-.58 3.708-2.701 5.422-7.372 4.34-11.83L205 107.33 234 82.85c3.517-2.974 4.881-7.782 3.45-12.16ZM194.37 100.56c-1.752 1.458-2.527 3.782-2 6l9.41 38.86L167.1 124.52c-1.904-1.146-4.286-1.146-6.19 0l-34.72 20.89 9.41-38.86c.527-2.218-.248-4.542-2-6L102.94 74.65l40.37-3.19c2.236-.175 4.188-1.583 5.06-3.65L164 30.81l15.63 37c.872 2.067 2.824 3.475 5.06 3.65l40.37 3.19ZM86.69 121.79 28.24 180.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L78.21 113.31c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM97.51 174.49c1.127 1.125 1.76 2.653 1.76 4.245 0 1.592-.633 3.12-1.76 4.245L44.24 236.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L89 174.49c1.126-1.133 2.658-1.77 4.255-1.77 1.597 0 3.129 .637 4.255 1.77ZM170.51 173.49c2.34 2.343 2.34 6.137 0 8.48l-54.29 54.28c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L162 173.48c1.127-1.139 2.663-1.78 4.265-1.78 1.602 0 3.138 .641 4.265 1.78Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
