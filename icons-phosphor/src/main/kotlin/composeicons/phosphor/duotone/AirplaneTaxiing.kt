package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorDuotoneIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 136v24h-178.94c-14.13 0-26.588-9.267-30.65-22.8L16.34 90.3c-.727-2.422-.266-5.045 1.243-7.074C19.092 81.197 21.471 80.001 24 80h8l24 24h36.91L80.42 66.53c-.813-2.438-.405-5.118 1.097-7.204C83.018 57.24 85.43 56.003 88 56h8l48 48h64c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M208 96h-60.68L101.66 50.34C100.158 48.84 98.122 47.998 96 48h-8c-5.142 .003-9.969 2.476-12.974 6.648-3.005 4.172-3.822 9.534-2.196 14.412l9 26.94h-22.51L37.66 74.34C36.158 72.84 34.122 71.998 32 72h-8c-5.056 .005-9.812 2.398-12.827 6.456C8.157 82.514 7.237 87.758 8.69 92.6l14.07 46.89c5.002 16.97 20.618 28.591 38.31 28.51h178.93c4.418 0 8-3.582 8-8v-24C248 113.909 230.091 96 208 96ZM232 152h-170.93c-10.618 .056-19.995-6.915-23-17.1L24 88h4.68l21.66 21.66c1.502 1.5 3.538 2.342 5.66 2.34h36.9c2.572 0 4.987-1.236 6.49-3.322 1.504-2.086 1.913-4.768 1.1-7.208L88 64h4.68l45.66 45.66c1.502 1.5 3.538 2.342 5.66 2.34h64c13.255 0 24 10.745 24 24ZM224 200c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM128 200c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
