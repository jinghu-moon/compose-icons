package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FediverseLogo: ImageVector
    get() {
        if (_fediverseLogo != null) return _fediverseLogo!!
        _fediverseLogo = phosphorBoldIcon(
            name = "FediverseLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 92c-3.102-.002-6.188 .45-9.16 1.34l-27-33.68c6.624-11.689 5.241-26.272-3.462-36.507C163.674 12.918 149.503 9.209 136.901 13.869 124.3 18.529 115.951 30.564 116 44c0 .11 0 .22 0 .33L74.75 61.52C65.509 52.144 51.469 49.384 39.366 54.565 27.264 59.746 19.569 71.81 19.975 84.968c.405 13.158 8.827 24.726 21.225 29.152l1.62 40.73c-12.155 5.47-19.646 17.901-18.804 31.204 .842 13.302 9.842 24.689 22.59 28.582 12.748 3.893 26.574-.524 34.704-11.086l42.89 12c1.445 13.342 11.062 24.365 24.084 27.607 13.023 3.242 26.684-1.987 34.216-13.094 7.531-11.108 7.332-25.734-.5-36.632l24.16-38c1.913 .358 3.854 .539 5.8 .54 17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM71.64 109.24l34.93 20.22L72 156.33c-1.668-.975-3.422-1.795-5.24-2.45L65.14 113.15c2.313-1.044 4.494-2.356 6.5-3.91ZM152.8 75.64c1.474-.235 2.931-.569 4.36-1l27 33.68c-.913 1.625-1.686 3.324-2.31 5.08l-38.43 1.83ZM86.8 175.26 122 147.89l13.26 39.79c-1.674 1.432-3.198 3.03-4.55 4.77l-42.89-12c-.207-1.755-.555-3.491-1.04-5.19ZM158 180.07 144.38 139.23 183 137.4c.835 1.814 1.839 3.545 3 5.17l-24.16 38c-1.269-.245-2.551-.412-3.84-.5ZM148 36c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM125.25 66.48c1.302 1.307 2.71 2.505 4.21 3.58l-9.4 39.48L83.68 88.48C83.893 86.996 84 85.499 84 84c0-.11 0-.22 0-.33ZM52 76c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM56 192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM156 220c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM212 132c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _fediverseLogo!!
    }

private var _fediverseLogo: ImageVector? = null
