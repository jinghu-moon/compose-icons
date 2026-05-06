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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 72C182.003 42.956 159.032 19.111 130.007 18.032 100.983 16.952 76.304 39.024 74.149 67.988 71.994 96.952 93.135 122.433 122 125.66v106.34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-106.34C161.314 122.574 181.965 99.487 182 72ZM128 114C104.804 114 86 95.196 86 72 86 48.804 104.804 30 128 30c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
