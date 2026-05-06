package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorThinIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M45.39 53.06c-.874 .753-1.381 1.846-1.39 3v167.94c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-46.13c29.41-24.39 55.08-11.69 82.23 1.73 16.5 8.17 33.33 16.5 51.13 16.5 13.14 0 26.81-4.55 41.26-17.06 .871-.755 1.374-1.848 1.38-3v-120c-.009-1.562-.926-2.976-2.349-3.621-1.423-.645-3.091-.402-4.271 .621-30 26-56 13.07-83.61-.57C109.07 38.28 79.4 23.62 45.39 53.06ZM220 174.17c-29.41 24.4-55.08 11.7-82.23-1.73C110.95 159.17 83.27 145.44 52 167.78v-109.86c29.41-24.4 55.08-11.7 82.23 1.73 26.82 13.27 54.5 27 85.77 4.66Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
