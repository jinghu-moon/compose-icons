package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorBoldIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.73 122.63l-40-80C208.697 38.567 204.543 36.001 200 36h-144c-4.543 .001-8.697 2.567-10.73 6.63L5.27 122.63C4.435 124.297 4 126.136 4 128v56c0 11.046 8.954 20 20 20h208c11.046 0 20-8.954 20-20v-56c-0-1.864-.435-3.703-1.27-5.37ZM96.58 60l8 16h-21.16l-8-16ZM144.58 60l8 16h-21.16l-8-16ZM103.42 116l-8-16h21.16l8 16ZM151.42 116l-8-16h21.16l8 16ZM199.42 116l-8-16h21.16l8 16ZM200.58 76h-21.16l-8-16h21.16ZM28 130.83l28-56 28 56v49.17h-56ZM108 180v-40h120v40Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
