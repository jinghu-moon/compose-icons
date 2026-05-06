package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorLightIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.79 118.42 199.4 36.32C197.74 30.227 192.206 25.999 185.89 26h-115.78C63.794 25.999 58.26 30.227 56.6 36.32L34.21 118.42c-.282 1.034-.282 2.126 0 3.16l22.39 82.1c1.66 6.093 7.194 10.321 13.51 10.32h13.89L67.2 236.4c-1.988 2.651-1.451 6.412 1.2 8.4 2.651 1.988 6.412 1.451 8.4-1.2L99 214h58l22.2 29.6c1.988 2.651 5.749 3.188 8.4 1.2 2.651-1.988 3.188-5.749 1.2-8.4L172 214h13.89c6.316 .001 11.85-4.227 13.51-10.32l22.39-82.1c.282-1.034 .282-2.126 0-3.16ZM68.18 39.47c.239-.869 1.029-1.471 1.93-1.47h115.78c.901-.001 1.691 .601 1.93 1.47l20.67 75.8L128 129.9 47.51 115.27ZM68.18 200.53 48.29 127.61 122 141v61h-51.89c-.901 .001-1.691-.601-1.93-1.47ZM187.82 200.53c-.239 .869-1.029 1.471-1.93 1.47h-51.89v-61l73.71-13.4ZM90 88c0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
