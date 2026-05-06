package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorDuotoneIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v56c0 96-88 120-88 120 0 0-88-24-88-120v-56c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C51.445 31.905 47.438 31.226 44.206 32.972 40.974 34.718 39.346 38.442 40.26 42 35.165 44.816 32.001 50.178 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.27 47 25.53 1.375 .374 2.825 .374 4.2 0 1.36-.37 31.27-8.78 57.09-34.72l14.89 16.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM127.99 223.62C113.844 218.675 100.672 211.294 89.07 201.81 61.82 179.51 48 149.3 48 112v-56h3.71L176.41 193.15C162.751 206.794 146.21 217.206 128 223.62ZM224 56v56c0 20.58-3.89 39.61-11.56 56.59-1.82 4.026-6.559 5.815-10.585 3.995-4.026-1.82-5.815-6.559-3.995-10.585C204.59 147.11 208 130.29 208 112v-56h-109.48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h109.48c8.837 0 16 7.163 16 16Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
