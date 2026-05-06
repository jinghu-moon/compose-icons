package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorThinIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 64C100.002 49.056 88.267 36.744 73.339 36.029 58.412 35.314 45.554 46.448 44.128 61.325 42.701 76.201 53.209 89.575 68 91.71v72.58c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C100.98 179.36 90.535 166.388 76 164.29v-72.58C89.775 89.722 99.999 77.918 100 64ZM52 64C52 52.954 60.954 44 72 44c11.046 0 20 8.954 20 20C92 75.046 83.046 84 72 84 60.954 84 52 75.046 52 64ZM92 192c0 11.046-8.954 20-20 20C60.954 212 52 203.046 52 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM204 164.29v-53.66c.014-5.31-2.096-10.405-5.86-14.15L153.66 52h38.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-38.34l44.49 44.48c2.25 2.252 3.512 5.306 3.51 8.49v53.66c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C228.98 179.36 218.535 166.388 204 164.29ZM200 212c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
