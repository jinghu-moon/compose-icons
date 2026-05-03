package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorLightIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 182.000 72.000 C 182.003 42.956 159.032 19.111 130.007 18.032 C 100.983 16.952 76.304 39.024 74.149 67.988 C 71.994 96.952 93.135 122.433 122.000 125.660 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 125.660 C 161.314 122.574 181.965 99.487 182.000 72.000 ZM 128.000 114.000 C 104.804 114.000 86.000 95.196 86.000 72.000 C 86.000 48.804 104.804 30.000 128.000 30.000 C 151.196 30.000 170.000 48.804 170.000 72.000 C 170.000 95.196 151.196 114.000 128.000 114.000 Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
