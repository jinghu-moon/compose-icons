package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorLightIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 76c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM208.38 153.9c-14.79 20.44-36.84 34.22-65.53 41-20.5 4.81-44.58 6-72 3.68q2.43 19 7.07 40.15c.342 1.556 .051 3.183-.808 4.524-.859 1.341-2.216 2.286-3.772 2.626-.424 .091-.856 .138-1.29 .14-2.816-.006-5.249-1.969-5.85-4.72q-5.07-23.13-7.57-44Q37.83 194.79 14.69 189.73c-3.239-.718-5.283-3.926-4.565-7.165 .718-3.239 3.926-5.283 7.165-4.565q21.14 4.63 40.12 7.07c-2.35-27.36-1.13-51.41 3.69-71.9C67.84 84.49 81.61 62.44 102 47.64c47.55-34.44 116.31-18 120-15.81 .872 .512 1.598 1.238 2.11 2.11 2.23 3.69 18.7 72.39-15.74 119.97ZM190.44 156.59c-46.755-7.591-83.409-44.245-91-91C74.31 90.29 64.32 130.83 69.57 186.48c55.62 5.23 96.15-4.75 120.86-29.88ZM214.06 41.93C201.28 39.09 148.64 29.76 110.37 56.45c4.08 47.451 41.71 85.084 89.16 89.17C226.21 107.37 216.89 54.72 214.06 41.93Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
