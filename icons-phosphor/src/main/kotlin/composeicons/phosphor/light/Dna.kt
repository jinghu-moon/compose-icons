package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorLightIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 204.5v27.5c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-27.5c.073-25.011-14.073-47.889-36.48-59L101.12 121.3C74.612 108.161 57.886 81.086 58 51.5v-27.5c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v27.5c-.073 25.011 14.073 47.889 36.48 59l48.4 24.2c26.508 13.139 43.234 40.214 43.12 69.8ZM160 202h-89.95c.273-6.831 1.605-13.578 3.95-20h74.13c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-68.36c4.453-7.287 10.282-13.638 17.16-18.7 2.58-1.99 3.1-5.675 1.172-8.302-1.928-2.626-5.6-3.234-8.272-1.368C69.853 156.355 58.043 179.682 58 204.5v27.5c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h90c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM192 18c-3.314 0-6 2.686-6 6v18h-90c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h90c-.289 6.834-1.638 13.581-4 20h-74.11c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h68.34c-4.453 7.287-10.282 13.638-17.16 18.7-2.58 1.99-3.1 5.675-1.172 8.302 1.928 2.626 5.6 3.234 8.272 1.368C186.147 99.645 197.957 76.318 198 51.5v-27.5c0-3.314-2.686-6-6-6Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
