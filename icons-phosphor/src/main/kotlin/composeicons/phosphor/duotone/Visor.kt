package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorDuotoneIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 127.15c.227 17.121-6.415 33.619-18.442 45.805C217.531 185.142 201.122 192.002 184 192c-15.48 0-29.68-9.35-40.75-18.5-8.826-7.313-21.6-7.334-30.45-.05-11.81 9.79-27.19 19.26-43.89 18.48C34.165 190.305 7.08 161.227 7.92 126.455 8.759 91.682 37.217 63.946 72 64h111.05c35.17 0 64.49 28 64.95 63.15Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M183.05 56h-111.05C52.314 56 33.487 64.06 19.9 78.305 6.313 92.55-.85 111.736 .08 131.4c1.69 36.69 31.76 66.79 68.45 68.52 15.85 .74 32-5.9 49.38-20.3 5.873-4.856 14.367-4.856 20.24 0C148.72 188.39 165 200 184 200c19.261 .002 37.72-7.714 51.251-21.423C248.781 164.868 256.254 146.31 256 127.05 255.49 87.87 222.76 56 183.05 56ZM223.86 167.34C213.36 178.036 198.988 184.043 184 184c-13.88 0-27-9.51-35.65-16.67-11.797-9.747-28.853-9.747-40.65 0C93.52 179 81 184.49 69.28 183.94 40.537 182.377 17.591 159.405 16.06 130.66c-.727-15.297 4.842-30.225 15.41-41.307C42.039 78.27 56.686 71.999 72 72h111.05c31 0 56.55 24.79 56.95 55.25 .239 14.992-5.58 29.446-16.14 40.09ZM184 96c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8Z"),
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
