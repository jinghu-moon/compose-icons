package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorRegularIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 136c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM184.62 103.25 118.91 72.59C83.965 77.021 57.366 106.1 56.06 141.3l68.18-36.36c2.479-1.32 5.469-1.243 7.878 .202 2.408 1.446 3.882 4.049 3.882 6.858v103.55c28.394-3.075 52.249-22.722 60.71-50 1.339-4.222 5.848-6.559 10.07-5.22 4.222 1.339 6.559 5.848 5.22 10.07-10.173 32.112-37.783 55.599-71.111 60.491-33.327 4.892-66.523-9.67-85.495-37.503C36.422 165.554 35.003 129.332 51.74 100.1 36.896 92.564 29.155 75.832 33.021 59.639 36.887 43.447 51.352 32.017 68 32c1.168 .002 2.321 .258 3.38 .75L189.63 87.93c10.675-.895 18.749-10.042 18.312-20.746C207.505 56.481 198.712 48.022 188 48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36-1.168-.002-2.321-.258-3.38-.75ZM88 203.83v-61.43L57.51 158.66c3.867 18.464 14.812 34.678 30.49 45.17ZM120 125.33l-16 8.54v78c5.174 1.838 10.543 3.069 16 3.67ZM96.13 62 66.37 48.07c-9.35 .787-16.896 7.968-18.145 17.267-1.249 9.299 4.134 18.217 12.945 21.443 .6-.71 1.2-1.42 1.84-2.11C72.156 74.663 83.491 66.905 96.13 62Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
