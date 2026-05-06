package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorLightIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 42c-21 0-39.26 9.47-50 25.34C117.26 51.47 99 42 78 42 44.879 42.039 18.039 68.879 18 102c0 29.2 18.2 59.59 54.1 90.31 16.45 14.018 34.22 26.409 53.06 37 1.773 .953 3.907 .953 5.68 0 18.84-10.591 36.61-22.982 53.06-37C219.8 161.59 238 131.2 238 102 237.961 68.879 211.121 42.039 178 42ZM128 217.11C111.59 207.64 30 157.72 30 102 30.028 75.502 51.502 54.028 78 54c20.28 0 37.31 10.83 44.45 28.27 .925 2.251 3.117 3.72 5.55 3.72 2.433 0 4.625-1.469 5.55-3.72C140.69 64.83 157.72 54 178 54c26.498 .028 47.972 21.502 48 48 0 55.72-81.59 105.64-98 115.11Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
