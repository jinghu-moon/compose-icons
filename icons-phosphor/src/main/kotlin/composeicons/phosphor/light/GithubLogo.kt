package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorLightIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.13 75.92C211.236 60.291 209.443 43.227 201.2 29 200.128 27.142 198.145 25.999 196 26c-18.619-.041-36.116 8.894-47 24h-26C112.116 34.894 94.619 25.959 76 26c-2.145-.001-4.128 1.142-5.2 3C62.557 43.227 60.764 60.291 65.87 75.92 60.808 84.418 58.092 94.108 58 104v8c.036 28.429 22.085 51.972 50.45 53.87C101.738 172.913 97.995 182.271 98 192v10h-26C57.641 202 46 190.359 46 176 46 155.013 28.987 138 8 138c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 14.359 0 26 11.641 26 26 0 20.987 17.013 38 38 38h26v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26v40c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c.005-9.729-3.738-19.087-10.45-26.13C191.915 163.972 213.964 140.429 214 112v-8c-.092-9.892-2.808-19.582-7.87-28.08ZM202 112c0 23.196-18.804 42-42 42h-48C88.804 154 70 135.196 70 112v-8c.105-8.434 2.639-16.66 7.3-23.69 1.245-1.652 1.551-3.829 .81-5.76C73.534 62.734 74.051 49.551 79.54 38.13c14.413 1.087 27.469 8.907 35.23 21.1 1.103 1.727 3.011 2.771 5.06 2.77h32.34c2.047 .003 3.955-1.037 5.06-2.76 7.757-12.199 20.815-20.024 35.23-21.11 5.489 11.421 6.006 24.604 1.43 36.42-.739 1.922-.441 4.089 .79 5.74 4.676 7.032 7.218 15.266 7.32 23.71Z"),
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
