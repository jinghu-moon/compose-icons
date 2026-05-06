package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorDuotoneIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 176h40v24c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8ZM32 200c0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8v-24h-40ZM194.3 60c-1.431-2.479-4.078-4.004-6.94-4h-118.72c-2.862-.004-5.509 1.521-6.94 4L32 112h192Z"),
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
                pathData = parseSvgPathData("M240 104h-11.36L201.25 56.06C198.401 51.076 193.101 48 187.36 48h-118.72c-5.741 0-11.041 3.076-13.89 8.06L27.36 104h-11.36c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v80c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h96v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-80h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM68.64 64h118.72l22.85 40h-164.42ZM64 200h-24v-16h24ZM192 200v-16h24v16ZM216 168h-176v-48h176ZM56 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM168 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM96 24c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8Z"),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
