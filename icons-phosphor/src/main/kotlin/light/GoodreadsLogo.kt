package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorLightIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 26.000 C 180.686 26.000 178.000 28.686 178.000 32.000 L 178.000 51.400 C 162.154 29.788 134.215 20.803 108.741 29.127 C 83.268 37.452 66.026 61.201 66.000 88.000 L 66.000 112.000 C 66.026 138.799 83.268 162.548 108.741 170.873 C 134.215 179.197 162.154 170.212 178.000 148.600 L 178.000 168.000 C 177.967 195.601 155.601 217.967 128.000 218.000 C 110.910 218.000 94.000 209.590 84.920 196.570 C 83.722 194.744 81.626 193.713 79.449 193.878 C 77.271 194.044 75.355 195.379 74.447 197.365 C 73.538 199.352 73.781 201.674 75.080 203.430 C 86.340 219.570 107.110 230.000 128.000 230.000 C 162.226 229.961 189.961 202.226 190.000 168.000 L 190.000 32.000 C 190.000 28.686 187.314 26.000 184.000 26.000 ZM 128.000 162.000 C 100.399 161.967 78.033 139.601 78.000 112.000 L 78.000 88.000 C 78.000 60.386 100.386 38.000 128.000 38.000 C 155.614 38.000 178.000 60.386 178.000 88.000 L 178.000 112.000 C 177.967 139.601 155.601 161.967 128.000 162.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
