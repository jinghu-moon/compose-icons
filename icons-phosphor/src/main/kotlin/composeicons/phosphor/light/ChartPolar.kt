package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorLightIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM217.8 122h-28.1C186.802 92.521 163.479 69.198 134 66.3v-28.1c44.949 3.069 80.731 38.851 83.8 83.8ZM122 122h-43.63C81.167 99.162 99.162 81.167 122 78.37ZM122 134v43.63C99.162 174.833 81.167 156.838 78.37 134ZM134 134h43.63c-2.797 22.838-20.792 40.833-43.63 43.63ZM134 122v-43.63c22.838 2.797 40.833 20.792 43.63 43.63ZM122 38.2v28.1C92.521 69.198 69.198 92.521 66.3 122h-28.1C41.269 77.051 77.051 41.269 122 38.2ZM38.2 134h28.1c2.898 29.479 26.221 52.802 55.7 55.7v28.1C77.051 214.731 41.269 178.949 38.2 134ZM134 217.8v-28.1c29.479-2.898 52.802-26.221 55.7-55.7h28.1c-3.069 44.949-38.851 80.731-83.8 83.8Z"),
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
