package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorRegularIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 232c0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8ZM216 104c.07 27.026-12.346 52.569-33.64 69.21-3.982 3.052-6.329 7.773-6.36 12.79v6c0 8.837-7.163 16-16 16h-64c-8.837 0-16-7.163-16-16v-6c-.003-4.957-2.304-9.633-6.23-12.66C52.531 156.799 40.078 131.41 40 104.49 39.74 56.83 78.26 17.14 125.88 16c23.704-.571 46.636 8.447 63.6 25.013C206.445 57.578 216.007 80.289 216 104ZM200 104c.006-19.401-7.818-37.983-21.7-51.537C164.419 38.909 145.655 31.531 126.26 32 87.26 32.92 55.79 65.39 56 104.39c.074 22.017 10.266 42.777 27.64 56.3C91.451 166.762 96.014 176.106 96 186v6h64v-6c.022-9.921 4.624-19.277 12.47-25.35C189.9 147.029 200.06 126.121 200 104ZM183.89 94.66C179.641 70.928 161.063 52.354 137.33 48.11c-4.358-.735-8.485 2.202-9.22 6.56-.735 4.358 2.202 8.485 6.56 9.22 16.57 2.79 30.63 16.85 33.44 33.45 .654 3.847 3.988 6.661 7.89 6.66 .452-.003 .903-.039 1.35-.11 4.354-.743 7.282-4.875 6.54-9.23Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
