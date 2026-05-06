package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorThinIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 156c-2.209 0-4 1.791-4 4v38.34L63.51 153.86C61.26 151.608 59.997 148.554 60 145.37v-53.66C74.535 89.612 84.98 76.64 83.928 61.992 82.876 47.344 70.686 35.997 56 35.997c-14.686 0-26.876 11.347-27.928 25.995C27.02 76.64 37.465 89.612 52 91.71v53.66c-.015 5.307 2.095 10.4 5.86 14.14L102.34 204h-38.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM36 64C36 52.954 44.954 44 56 44c11.046 0 20 8.954 20 20C76 75.046 67.046 84 56 84 44.954 84 36 75.046 36 64ZM204 164.29v-53.66c.015-5.307-2.095-10.4-5.86-14.14L153.66 52h38.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-38.34l44.49 44.48c2.25 2.252 3.512 5.306 3.51 8.49v53.66c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C228.98 179.36 218.535 166.388 204 164.29ZM200 212c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
