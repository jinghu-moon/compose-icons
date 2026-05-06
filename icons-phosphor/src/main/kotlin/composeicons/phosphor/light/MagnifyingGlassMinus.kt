package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorLightIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 112c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM228.24 228.24c-2.343 2.34-6.137 2.34-8.48 0L168.38 176.86C133.357 207.314 80.504 204.55 48.849 170.61 17.194 136.669 18.115 83.751 50.933 50.933 83.751 18.115 136.669 17.194 170.61 48.849c33.941 31.655 36.705 84.508 6.25 119.531l51.38 51.38c2.34 2.343 2.34 6.137 0 8.48ZM112 186c40.869 0 74-33.131 74-74C186 71.131 152.869 38 112 38 71.131 38 38 71.131 38 112c.05 40.849 33.151 73.95 74 74Z"),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
