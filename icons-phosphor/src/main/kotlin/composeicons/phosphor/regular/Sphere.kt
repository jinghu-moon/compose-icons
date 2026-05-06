package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorRegularIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM216 128c0 6-17 16.23-48.77 21.17 .51-7 .77-14.08 .77-21.17C168 95.76 162.65 63.28 152.26 43.4 189.966 54.273 215.948 88.758 216 128ZM128 40c8.15 0 24 31.06 24 88 0 8.24-.34 15.92-.93 23.07-7.15 .59-14.83 .93-23.07 .93C71.06 152 40 136.15 40 128 40.055 79.422 79.422 40.055 128 40ZM43.4 152.26C63.28 162.65 95.76 168 128 168c7.09 0 14.19-.26 21.17-.77C144.23 199 134 216 128 216 88.758 215.948 54.273 189.966 43.4 152.26ZM152.26 212.6c6.29-12 10.73-28.67 13.26-47.08 18.41-2.53 35-7 47.08-13.26-8.431 29.132-31.208 51.909-60.34 60.34Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
