package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorLightIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M123.76 108.24c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48l-40-40c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-2.34 2.343-2.34 6.137 0 8.48ZM128 32.49 159.51 64 128 95.51 96.49 64ZM132.24 147.76c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-2.34 2.343-2.34 6.137 0 8.48l40 40c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48ZM128 223.51 96.49 192 128 160.49 159.51 192ZM236.24 123.76l-40-40c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-2.34 2.343-2.34 6.137 0 8.48l40 40c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48ZM192 159.51 160.49 128 192 96.49 223.51 128ZM108.24 123.76l-40-40c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-2.34 2.343-2.34 6.137 0 8.48l40 40c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48ZM64 159.51 32.49 128 64 96.49 95.51 128Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
