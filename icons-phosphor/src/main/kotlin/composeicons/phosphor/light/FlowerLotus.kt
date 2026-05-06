package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) return _flowerLotus!!
        _flowerLotus = phosphorLightIcon(
            name = "FlowerLotus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.1 122.63c-1.797-3.16-4.787-5.465-8.3-6.4-7.888-2.017-16.058-2.693-24.17-2 4.67-20.63 1.62-36.91-1.45-46.4-2.22-6.946-9.352-11.071-16.48-9.53-10.678 2.395-20.786 6.848-29.76 13.11C157.695 57.824 148.252 45.952 136.42 36.81c-4.988-3.758-11.862-3.758-16.85 0C107.744 45.956 98.306 57.827 92.06 71.41 83.084 65.146 72.971 60.692 62.29 58.3 55.162 56.761 48.032 60.891 45.82 67.84c-3.07 9.49-6.12 25.77-1.45 46.4-8.112-.693-16.282-.017-24.17 2-3.513 .935-6.503 3.24-8.3 6.4-1.889 3.247-2.393 7.117-1.4 10.74C13.81 145.66 24 169 54.92 187.51 85.84 206.02 113.29 206 128 206c14.71 0 42.12 0 73.06-18.49C232 169.02 242.17 145.66 245.48 133.37c.999-3.62 .502-7.49-1.38-10.74ZM168.48 82.9C176.713 76.692 186.167 72.295 196.22 70c1.106-.226 2.204 .422 2.54 1.5C202.7 83.72 206.57 109 188.17 141c-7.386 12.622-16.853 23.904-28 33.37C167.85 161 174 142.93 174 119.17c.093-12.306-1.77-24.549-5.52-36.27ZM57.24 71.53c.324-1.09 1.425-1.753 2.54-1.53 10.053 2.295 19.507 6.692 27.74 12.9C83.77 94.621 81.907 106.864 82 119.17c0 23.76 6.15 41.85 13.81 55.17-11.15-9.464-20.617-20.746-28-33.37C49.43 109 53.3 83.72 57.24 71.53ZM61.08 177.2C33.78 160.89 24.93 140.78 22.08 130.2c-.151-.543-.075-1.124 .21-1.61 .217-.386 .576-.673 1-.8 8.082-2.008 16.485-2.372 24.71-1.07 2.537 7.026 5.693 13.812 9.43 20.28 10.26 17.705 24.25 32.965 41 44.72C85.225 189.107 72.583 184.192 61.08 177.2ZM128 192.86C119.32 186.66 94 164.66 94 119.17 94 75.81 116.94 53.83 126.8 46.39c.711-.533 1.689-.533 2.4 0C139.06 53.83 162 75.81 162 119.17c0 45.77-25.19 67.5-34 73.69ZM233.9 130.24c-2.85 10.54-11.7 30.65-39 47-11.515 6.978-24.168 11.875-37.38 14.47 16.75-11.755 30.74-27.015 41-44.72 3.754-6.463 6.926-13.246 9.48-20.27 8.234-1.292 16.644-.914 24.73 1.11 .424 .127 .783 .414 1 .8 .278 .489 .347 1.07 .19 1.61Z"),
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
        return _flowerLotus!!
    }

private var _flowerLotus: ImageVector? = null
