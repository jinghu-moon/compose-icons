package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorFillIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM124 192c-13.294 .022-25.88-5.988-34.22-16.34-2.709-3.439-2.15-8.417 1.255-11.17 3.404-2.753 8.389-2.258 11.185 1.11 8.041 9.947 21.8 13.181 33.431 7.857 11.63-5.324 18.174-17.853 15.898-30.44C149.274 130.431 138.758 120.986 126 120.07c-2.994-.213-5.617-2.083-6.793-4.845-1.176-2.761-.708-5.949 1.213-8.255l22.48-27h-46.9c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c3.104-.001 5.929 1.794 7.247 4.605 1.318 2.811 .89 6.13-1.097 8.515l-25.23 30.27c19.393 8.047 30.398 28.676 26.283 49.265C163.087 177.214 144.997 192.027 124 192Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
