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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 217.800 122.000 L 189.700 122.000 C 186.802 92.521 163.479 69.198 134.000 66.300 L 134.000 38.200 C 178.949 41.269 214.731 77.051 217.800 122.000 ZM 122.000 122.000 L 78.370 122.000 C 81.167 99.162 99.162 81.167 122.000 78.370 ZM 122.000 134.000 L 122.000 177.630 C 99.162 174.833 81.167 156.838 78.370 134.000 ZM 134.000 134.000 L 177.630 134.000 C 174.833 156.838 156.838 174.833 134.000 177.630 ZM 134.000 122.000 L 134.000 78.370 C 156.838 81.167 174.833 99.162 177.630 122.000 ZM 122.000 38.200 L 122.000 66.300 C 92.521 69.198 69.198 92.521 66.300 122.000 L 38.200 122.000 C 41.269 77.051 77.051 41.269 122.000 38.200 ZM 38.200 134.000 L 66.300 134.000 C 69.198 163.479 92.521 186.802 122.000 189.700 L 122.000 217.800 C 77.051 214.731 41.269 178.949 38.200 134.000 ZM 134.000 217.800 L 134.000 189.700 C 163.479 186.802 186.802 163.479 189.700 134.000 L 217.800 134.000 C 214.731 178.949 178.949 214.731 134.000 217.800 Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
