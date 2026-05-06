package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorLightIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M54 136c0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-68h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16 0c2.066-.005 3.988 1.053 5.09 2.8L80 108.68 114.91 52.82C116.007 51.065 117.931 49.999 120 50h0 16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-10v68h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h2v-53.08L85.09 123.18c-1.096 1.756-3.02 2.823-5.09 2.823-2.07 0-3.994-1.067-5.09-2.823L46 76.92v53.08h2c3.314 0 6 2.686 6 6ZM168 110h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM232 130h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM232 162h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM232 194h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
