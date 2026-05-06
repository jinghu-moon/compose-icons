package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorRegularIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.05 56h-111.05C52.314 56 33.487 64.06 19.9 78.305 6.313 92.55-.85 111.736 .08 131.4c1.69 36.69 31.76 66.79 68.45 68.52 15.85 .74 32-5.9 49.38-20.3 5.873-4.856 14.367-4.856 20.24 0C148.72 188.39 165 200 184 200c19.261 .002 37.72-7.714 51.251-21.423C248.781 164.868 256.254 146.31 256 127.05 255.49 87.87 222.76 56 183.05 56ZM223.86 167.34C213.36 178.036 198.988 184.043 184 184c-13.88 0-27-9.51-35.65-16.67-11.797-9.747-28.853-9.747-40.65 0C93.52 179 80.94 184.49 69.28 183.94 40.537 182.377 17.591 159.405 16.06 130.66c-.727-15.297 4.842-30.225 15.41-41.307C42.039 78.27 56.686 71.999 72 72h111.05c31 0 56.55 24.79 56.95 55.25 .239 14.992-5.58 29.446-16.14 40.09ZM184 96c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
