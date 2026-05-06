package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorRegularIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 232c0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8ZM216 104c.07 27.026-12.346 52.569-33.64 69.21-3.982 3.052-6.329 7.773-6.36 12.79v6c0 8.837-7.163 16-16 16h-64c-8.837 0-16-7.163-16-16v-6c-.003-4.957-2.304-9.633-6.23-12.66C52.534 156.801 40.081 131.417 40 104.5 39.74 56.83 78.26 17.15 125.88 16c23.704-.571 46.636 8.447 63.6 25.013C206.445 57.578 216.007 80.289 216 104ZM200 104c.006-19.401-7.818-37.983-21.7-51.537C164.419 38.909 145.655 31.531 126.26 32 87.26 32.92 55.79 65.39 56 104.39c.073 22.017 10.265 42.778 27.64 56.3h0C91.451 166.762 96.014 176.106 96 186v6h24v-44.69L90.34 117.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L128 132.69l26.34-26.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L136 147.31v44.69h24v-6c.018-9.923 4.621-19.28 12.47-25.35C189.9 147.029 200.06 126.121 200 104Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
