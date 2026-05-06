package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorFillIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 32h0c-4.418 0-8 3.582-8 8-.197 5.957-1.404 11.837-3.57 17.39C232.38 67.22 225.7 72 216 72 204.94 72 197.15 62.24 186.51 47.35 176 32.66 164.12 16 144 16c-16.39 0-29 8.89-35.43 25-1.884 4.83-3.193 9.864-3.9 15h-16.67C79.163 56 72 63.163 72 72v9.59C35.737 100.065 16.874 140.996 26.385 180.567 35.897 220.138 71.302 248.024 112 248h1.59c40.405-.695 75.144-28.82 84.233-68.196C206.911 140.428 188.013 99.923 152 81.59v-9.59c0-8.837-7.163-16-16-16h-15.12c.568-3.209 1.469-6.349 2.69-9.37C127.62 36.78 134.3 32 144 32c11.06 0 18.85 9.76 29.49 24.65C184 71.34 195.88 88 216 88c16.39 0 29-8.89 35.43-25 2.83-7.348 4.376-15.128 4.57-23 0-4.418-3.582-8-8-8ZM111.89 209.32c-.645 3.855-3.981 6.68-7.89 6.68-.446-.002-.89-.039-1.33-.11C78.913 211.675 60.315 193.077 56.1 169.32c-.501-2.832 .557-5.715 2.77-7.551 2.213-1.836 5.242-2.343 7.933-1.327 2.691 1.016 4.629 3.397 5.077 6.238 3.03 17.051 16.379 30.4 33.43 33.43 2.094 .348 3.965 1.514 5.199 3.241 1.234 1.727 1.731 3.875 1.381 5.969Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
