package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorThinIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.94 76.16C209.224 60.853 207.589 44.005 199.46 30c-.714-1.236-2.032-1.999-3.46-2-18.347-.052-35.547 8.922-46 24h-28C111.547 36.922 94.347 27.948 76 28c-1.428 .001-2.746 .764-3.46 2C64.411 44.005 62.776 60.853 68.06 76.16 62.876 84.528 60.088 94.157 60 104v8c.033 28.705 23.295 51.967 52 52h1.41c-8.472 6.827-13.401 17.12-13.41 28v12h-28C56.536 204 44 191.464 44 176 44 156.118 27.882 140 8 140c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 15.464 0 28 12.536 28 28 0 19.882 16.118 36 36 36h28v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v40c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c-.009-10.88-4.938-21.173-13.41-28h1.41c28.705-.033 51.967-23.295 52-52v-8c-.088-9.843-2.876-19.472-8.06-27.84ZM204 112c-.028 24.289-19.711 43.972-44 44h-48C87.711 155.972 68.028 136.289 68 112v-8c.104-8.869 2.782-17.516 7.71-24.89 .827-1.103 1.027-2.554 .53-3.84C71.294 62.502 72.059 48.227 78.34 36.06c15.547 .722 29.769 8.967 38.12 22.1 .736 1.148 2.006 1.841 3.37 1.84h32.34c1.364 .001 2.634-.692 3.37-1.84 8.351-13.133 22.573-21.378 38.12-22.1 6.281 12.167 7.046 26.442 2.1 39.21-.493 1.283-.293 2.729 .53 3.83 4.925 7.379 7.603 16.029 7.71 24.9Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
