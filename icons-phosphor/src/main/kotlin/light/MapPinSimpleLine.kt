package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorLightIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 210.000 L 134.000 210.000 L 134.000 133.660 C 162.479 130.476 183.511 105.601 181.916 76.990 C 180.322 48.378 156.656 25.994 128.000 25.994 C 99.344 25.994 75.678 48.378 74.084 76.990 C 72.489 105.601 93.521 130.476 122.000 133.660 L 122.000 210.000 L 40.000 210.000 C 36.686 210.000 34.000 212.686 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 C 222.000 212.686 219.314 210.000 216.000 210.000 ZM 86.000 80.000 C 86.000 56.804 104.804 38.000 128.000 38.000 C 151.196 38.000 170.000 56.804 170.000 80.000 C 170.000 103.196 151.196 122.000 128.000 122.000 C 104.804 122.000 86.000 103.196 86.000 80.000 Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
