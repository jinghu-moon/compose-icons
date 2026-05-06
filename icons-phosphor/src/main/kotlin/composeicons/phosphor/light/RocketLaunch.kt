package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorLightIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.86 47.24c-.441-7.048-6.061-12.665-13.11-13.1-12.31-.73-43.77 .39-69.88 26.5L133.52 66h-59.17c-3.712-.009-7.273 1.468-9.89 4.1L30.11 104.44c-3.751 3.752-5.059 9.303-3.377 14.335 1.682 5.032 6.064 8.682 11.317 9.425l39.13 5.46 45.16 45.16L127.8 218c.749 5.25 4.401 9.626 9.432 11.303 5.031 1.677 10.578 .367 14.328-3.383l34.35-34.35c2.631-2.618 4.108-6.178 4.1-9.89v-59.2l5.35-5.35h0C221.46 91 222.59 59.56 221.86 47.24ZM38.11 115c-.219-.706-.03-1.475 .49-2L72.94 78.58c.375-.372 .882-.58 1.41-.58h47.17L77.87 121.64 39.73 116.32c-.752-.084-1.386-.6-1.62-1.32ZM178 181.65c-.002 .53-.214 1.037-.59 1.41l-34.33 34.34c-.532 .538-1.323 .73-2.043 .495-.72-.235-1.245-.856-1.357-1.605l-5.32-38.16L178 134.48ZM186.87 108.65h0L128 167.51 88.49 128 147.36 69.12C163.323 53.055 185.449 44.669 208.05 46.12c.993 .083 1.774 .885 1.83 1.88 1.436 22.584-6.948 44.689-23 60.64ZM100 190.31C95.68 199.84 81.13 222 40 222c-3.314 0-6-2.686-6-6 0-41.13 22.16-55.68 31.69-60 3.015-1.381 6.579-.055 7.96 2.96 1.381 3.015 .055 6.579-2.96 7.96-7 3.17-22.53 13.52-24.47 42.91 29.39-1.94 39.74-17.52 42.91-24.47 1.381-3.015 4.945-4.341 7.96-2.96 3.015 1.381 4.341 4.945 2.96 7.96Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
