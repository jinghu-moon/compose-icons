package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorThinIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 176c0 2.209-1.791 4-4 4h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28c2.209 0 4 1.791 4 4ZM176 172h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM236 216c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-124c0-1.515 .856-2.9 2.211-3.578 1.355-.678 2.977-.531 4.189 .378L100 128v-40c0-1.515 .856-2.9 2.211-3.578 1.355-.678 2.977-.531 4.189 .378l44.14 33.11L163.06 30.3c.87-5.898 5.919-10.275 11.88-10.3h18.12c5.961 .025 11.01 4.402 11.88 10.3l15 105.13c.015 .19 .015 .38 0 .57v76h12c1.071-.016 2.104 .398 2.867 1.15 .763 .752 1.193 1.779 1.193 2.85ZM157.84 123.38 169.33 132h42.06L197 31.43c-.286-1.984-1.996-3.45-4-3.43h-18.06c-2.004-.02-3.714 1.446-4 3.43ZM44 212h168v-72h-44c-.865 0-1.708-.281-2.4-.8L108 96v40c0 1.515-.856 2.9-2.211 3.578-1.355 .678-2.977 .531-4.189-.378L44 96Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
