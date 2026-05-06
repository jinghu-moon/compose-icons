package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorLightIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.62 218.6C211.35 207.29 198 183 198 152v-17.3c-.003-5.73-3.497-10.88-8.82-13l-24.89-9.83c-2.466-.981-4.441-2.903-5.49-5.341-1.049-2.438-1.085-5.194-.1-7.659L180 45.9c2.704-6.53 2.632-13.879-.198-20.356C176.973 19.068 171.628 14.023 165 11.57c-12.95-4.83-27.88 1.84-33.31 15l-21 53.11c-.977 2.47-2.897 4.449-5.336 5.502-2.439 1.052-5.196 1.091-7.664 .108L72.37 75C67.126 72.87 61.115 74.131 57.17 78.19 36.49 99.42 26 124.26 26 152c-.052 28.396 10.927 55.702 30.62 76.16 1.145 1.19 2.729 1.855 4.38 1.84h171c2.798 .002 5.226-1.929 5.852-4.656 .627-2.727-.714-5.524-3.232-6.744ZM65.77 86.52c.562-.546 1.39-.714 2.12-.43L93.29 96.38c5.429 2.174 11.501 2.096 16.873-.216 5.372-2.312 9.603-6.667 11.757-12.104l21-53c3-7.13 11-10.81 18-8.21 3.569 1.335 6.44 4.067 7.949 7.566 1.51 3.499 1.528 7.462 .051 10.974L147.56 94.49c-4.42 11.268 1.07 23.994 12.3 28.51l24.88 9.83c.765 .305 1.265 1.047 1.26 1.87v17.3c0 1.34 0 2.65 .08 4L52.74 102.61C56.568 96.849 60.931 91.462 65.77 86.52ZM114.33 218C101.841 206.24 92.991 191.142 88.83 174.5c-.828-3.209-4.101-5.138-7.31-4.31-3.209 .828-5.138 4.101-4.31 7.31 3.762 14.867 10.8 28.704 20.6 40.5h-34.25C47.079 199.975 37.958 176.424 38 152c-.125-13.451 2.856-26.749 8.71-38.86l140.64 56.26c3.15 19.92 11.77 36.66 25 48.6Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
