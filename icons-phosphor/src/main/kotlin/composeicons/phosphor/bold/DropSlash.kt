package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorBoldIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L59.68 70.69C44 95.22 36 119.84 36 144c-.012 36.205 21.212 69.051 54.224 83.917 33.012 14.866 71.674 8.988 98.776-15.017l10.16 11.17c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 212C90.461 211.961 60.039 181.539 60 144c0-17.74 5.54-36.12 16.49-54.82l96.32 106C160.413 206.045 144.484 212.024 128 212ZM92.61 47.44C90.366 45.172 89.118 42.105 89.14 38.915c.023-3.19 1.314-6.239 3.59-8.475 8.827-8.815 18.319-16.939 28.39-24.3 4.131-2.891 9.629-2.891 13.76 0C138.36 8.6 220 66.64 220 144c-.012 4.465-.346 8.923-1 13.34-.854 5.895-5.903 10.272-11.86 10.28-.582-.004-1.164-.047-1.74-.13-6.558-.953-11.102-7.042-10.15-13.6 .486-3.275 .736-6.58 .75-9.89C196 91.07 146.51 46.09 128 31.12c-4.64 3.73-11.2 9.33-18.41 16.44-2.267 2.237-5.33 3.482-8.515 3.46-3.185-.023-6.23-1.31-8.465-3.58Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
