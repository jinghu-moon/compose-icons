package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorLightIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.88 111.94c-.387-1.89-1.66-3.479-3.42-4.27L119 84.56 133 25.39c.635-2.654-.601-5.402-3.008-6.688-2.407-1.286-5.379-.785-7.232 1.218L27.6 122.78c-1.313 1.417-1.863 3.379-1.479 5.272 .385 1.893 1.657 3.485 3.419 4.278L81 155.44 67 214.61c-.632 2.65 .6 5.392 3 6.68 2.405 1.279 5.369 .778 7.22-1.22L172.42 117.22c1.309-1.422 1.852-3.388 1.46-5.28ZM83.88 195.15l9.92-41.76c.665-2.801-.753-5.681-3.38-6.86L42.08 124.8l74-80-9.92 41.77c-.665 2.801 .753 5.681 3.38 6.86l48.38 21.73ZM237.32 213.31l-36-72c-1.015-2.036-3.095-3.324-5.37-3.324-2.275 0-4.355 1.287-5.37 3.324l-36 72c-1.483 2.966-.281 6.572 2.685 8.055 2.966 1.483 6.572 .281 8.055-2.685L175.71 198h40.58l10.34 20.68c1.016 2.035 3.095 3.321 5.37 3.32 .931 .002 1.85-.217 2.68-.64 2.963-1.483 4.163-5.087 2.68-8.05ZM181.71 186 196 157.42 210.29 186Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
