package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorFillIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 104v8c-.035 27.99-20.71 51.665-48.44 55.47 5.474 7.005 8.445 15.64 8.44 24.53v40c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-16h-24C49.909 216 32 198.091 32 176 32 162.745 21.255 152 8 152 3.582 152 0 148.418 0 144 0 139.582 3.582 136 8 136c22.091 0 40 17.909 40 40 0 13.255 10.745 24 24 24h24v-8c-.005-8.89 2.966-17.525 8.44-24.53C76.71 163.665 56.035 139.99 56 112v-8c.1-9.942 2.747-19.693 7.69-28.32C58.746 59.733 60.697 42.445 69.07 28 70.499 25.524 73.141 23.999 76 24c18.895-.04 36.695 8.86 48 24h24C159.305 32.86 177.105 23.96 196 24c2.859-.001 5.501 1.524 6.93 4 8.374 14.445 10.322 31.735 5.37 47.68 4.952 8.624 7.604 18.376 7.7 28.32Z"),
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
