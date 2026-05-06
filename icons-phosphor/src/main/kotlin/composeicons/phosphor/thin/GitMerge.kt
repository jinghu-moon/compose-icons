package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorThinIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 116c-13.702 .003-25.389 9.921-27.62 23.44l-45.85-6.55c-2.882-.413-5.516-1.859-7.41-4.07L87.75 82.9c13.757-3.967 22.306-17.673 19.816-31.773C105.076 37.028 92.351 27.078 78.067 28.062 63.783 29.047 52.543 40.649 52.012 54.957 51.48 69.265 61.829 81.668 76 83.71v88.58c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C108.98 187.36 98.535 174.388 84 172.29v-81.48L121 134c3.161 3.685 7.554 6.095 12.36 6.78l46.83 6.69c1.86 14.894 15.134 25.672 30.092 24.435 14.959-1.237 26.281-14.05 25.669-29.047C235.339 127.861 223.01 116.014 208 116ZM60 56C60 44.954 68.954 36 80 36c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C68.954 76 60 67.046 60 56ZM100 200c0 11.046-8.954 20-20 20C68.954 220 60 211.046 60 200c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM208 164c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
