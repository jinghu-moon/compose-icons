package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorLightIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.87 69.66l-24-23.56c-5.464-5.448-14.306-5.448-19.77 0L104 139 65.9 102.1C63.274 99.474 59.713 97.999 56 97.999c-3.713 0-7.274 1.475-9.9 4.101l-24 24c-5.461 5.466-5.461 14.324 0 19.79l71.62 72c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101L241.91 89.5c2.633-2.632 4.109-6.205 4.101-9.928-.008-3.723-1.498-7.29-4.141-9.912ZM233.42 81 105 209.41c-.779 .769-2.031 .769-2.81 0l-71.62-72c-.775-.78-.775-2.04 0-2.82l24-24c.378-.381 .893-.593 1.43-.59 .565 .005 1.105 .235 1.5 .64l42.35 41.08c2.332 2.28 6.058 2.28 8.39 0L206.61 54.61c.377-.388 .894-.607 1.435-.607 .541 0 1.058 .219 1.435 .607l24 23.56c.368 .383 .568 .897 .557 1.427-.011 .531-.233 1.035-.617 1.403Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
