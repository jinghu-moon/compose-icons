package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorLightIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.53 52.9c-3.438-2.66-7.924-3.556-12.12-2.42l-3.48 .94C206 56.51 170.87 66 128 66 85.13 66 50 56.51 31.07 51.42l-3.48-.94c-4.199-1.114-8.677-.216-12.122 2.432C12.024 55.559 10.004 59.656 10 64v128c-.018 4.356 1.999 8.471 5.455 11.124 3.455 2.653 7.952 3.539 12.155 2.396l3.18-.85C49.7 199.53 84.91 190 128 190c43.09 0 78.3 9.53 97.21 14.66l3.18 .85c4.2 1.121 8.683 .227 12.132-2.419 3.449-2.646 5.473-6.744 5.478-11.091v-128c.01-4.351-2.013-8.457-5.47-11.1ZM22.78 62.42c.349-.271 .778-.419 1.22-.42 .176 .004 .351 .031 .52 .08L27.96 63C47.37 68.24 83.54 78 128 78c44.46 0 80.63-9.76 100.06-15l3.44-.92c.596-.154 1.23-.025 1.718 .35 .488 .375 .777 .954 .782 1.57v123.57L172.53 126.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101l-21.42 21.41L85.9 102.1C83.274 99.474 79.713 97.999 76 97.999c-3.713 0-7.274 1.475-9.9 4.101L22 146.2v-82.2c.001-.619 .29-1.202 .78-1.58ZM220.41 191c-18.555-4.971-37.444-8.601-56.52-10.86L139.8 156l21.41-21.41c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587ZM27.65 193.07l-3.15 .86c-.598 .154-1.233 .024-1.722-.353-.489-.377-.776-.959-.778-1.577v-28.83L74.58 110.59c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592l67.91 67.91C139.7 178.18 133.91 178 128 178 83.31 178 45.72 188.18 27.65 193.07ZM194 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
