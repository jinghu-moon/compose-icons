package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorDuotoneIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 128c0 30.928-25.072 56-56 56C97.072 184 72 158.928 72 128 72 97.072 97.072 72 128 72c30.928 0 56 25.072 56 56Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM215.63 120h-24.15C187.787 91.026 164.974 68.213 136 64.52v-24.15c42.252 3.912 75.718 37.378 79.63 79.63ZM120 120h-39.32C84.112 99.876 99.876 84.112 120 80.68ZM120 136v39.32C99.876 171.888 84.112 156.124 80.68 136ZM136 136h39.32c-3.432 20.124-19.196 35.888-39.32 39.32ZM136 120v-39.32c20.124 3.432 35.888 19.196 39.32 39.32ZM120 40.37v24.15C91.026 68.213 68.213 91.026 64.52 120h-24.15C44.282 77.748 77.748 44.282 120 40.37ZM40.37 136h24.15c3.693 28.974 26.506 51.787 55.48 55.48v24.15C77.748 211.718 44.282 178.252 40.37 136ZM136 215.63v-24.15c28.974-3.693 51.787-26.506 55.48-55.48h24.15c-3.912 42.252-37.378 75.718-79.63 79.63Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
