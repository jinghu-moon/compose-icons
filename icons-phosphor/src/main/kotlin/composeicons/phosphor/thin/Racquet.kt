package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorThinIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.1 28.9C200.74 2.53 152.79 7.58 120.22 40.15c-31.39 31.39-37.2 77.07-14 103.94L71.33 179l-3.52-3.52c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L23.52 202.82c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l12.69 12.69c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529h0L80.5 205.17c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L77 184.68l34.93-34.94c11 9.53 25.18 14.19 40.24 14.19 21.67 0 45.17-9.62 63.7-28.15C248.42 103.21 253.47 55.26 227.1 28.9ZM74.84 199.51 47.52 226.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L29.17 214.14c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L56.5 181.16c1.561-1.558 4.089-1.558 5.65 0l6.35 6.34h0l6.34 6.34c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM234.83 60h-38.78v-38.83c19.704 3.695 35.11 19.122 38.78 38.83ZM183.9 20c1.39 0 2.77 .06 4.14 .15v39.85h-40.04v-30.63C159.029 23.379 171.35 20.163 183.9 20ZM188 68v40h-40v-40ZM125.88 45.8c4.323-4.324 9.051-8.222 14.12-11.64v25.84h-25.8c3.422-5.102 7.334-9.858 11.68-14.2ZM109.44 68h30.56v40h-39.83c-.84-13 2.32-26.93 9.27-40ZM101.25 116h38.75v38.78C120.313 151.099 104.916 135.69 101.25 116ZM148 155.83v-39.83h40v30.59c-13.07 6.92-27 10.09-40 9.24ZM210.17 130.12c-4.329 4.331-9.068 8.233-14.15 11.65v-25.77h25.8c-3.404 5.074-7.296 9.803-11.62 14.12ZM226.63 108h-30.58v-40h39.85c.85 12.89-2.32 26.86-9.27 40Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
