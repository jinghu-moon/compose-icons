package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorDuotoneIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104v8c0 26.51-21.49 48-48 48h-24c17.673 0 32 14.327 32 32v40h-64v-40c0-17.673 14.327-32 32-32h-24C85.49 160 64 138.51 64 112v-8c.076-9.741 3.037-19.241 8.51-27.3C66.848 62.04 68.132 45.604 76 32c17.748-.004 34.273 9.044 43.83 24h32.34C161.727 41.044 178.252 31.996 196 32c7.868 13.604 9.152 30.04 3.49 44.7 5.473 8.059 8.434 17.559 8.51 27.3Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208.3 75.68C213.252 59.735 211.304 42.445 202.93 28 201.501 25.524 198.859 23.999 196 24c-18.895-.04-36.695 8.86-48 24h-24C112.695 32.86 94.895 23.96 76 24c-2.859-.001-5.501 1.524-6.93 4C60.697 42.445 58.746 59.733 63.69 75.68 58.747 84.307 56.1 94.058 56 104v8c.035 27.99 20.71 51.665 48.44 55.47C98.966 174.475 95.995 183.11 96 192v8h-24C58.745 200 48 189.255 48 176 48 153.909 30.091 136 8 136 3.582 136 0 139.582 0 144c0 4.418 3.582 8 8 8 13.255 0 24 10.745 24 24 0 22.091 17.909 40 40 40h24v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c.005-8.89-2.966-17.525-8.44-24.53C195.29 163.665 215.965 139.99 216 112v-8c-.096-9.944-2.748-19.696-7.7-28.32ZM200 112c0 22.091-17.909 40-40 40h-48C89.909 152 72 134.091 72 112v-8c.098-8 2.493-15.803 6.9-22.48C80.57 79.319 80.986 76.411 80 73.83 75.791 62.976 76.076 50.894 80.79 40.25c13.262 1.427 25.156 8.809 32.32 20.06 1.464 2.29 3.992 3.68 6.71 3.69h32.35c2.729 0 5.27-1.391 6.74-3.69 7.163-11.253 19.057-18.635 32.32-20.06 4.708 10.646 4.985 22.729 .77 33.58-.982 2.555-.606 5.433 1 7.65 4.448 6.678 6.879 14.497 7 22.52Z"),
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
