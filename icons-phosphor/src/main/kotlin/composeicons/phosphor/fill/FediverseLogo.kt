package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FediverseLogo: ImageVector
    get() {
        if (_fediverseLogo != null) return _fediverseLogo!!
        _fediverseLogo = phosphorFillIcon(
            name = "FediverseLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 96c-3.6-.019-7.169 .66-10.51 2L171 59.94c6.878-9.907 6.64-23.104-.591-32.756C163.178 17.532 150.58 13.594 139.139 17.41 127.699 21.227 119.988 31.94 120 44c-0 .982 .05 1.963 .15 2.94L73.68 66.3C65.994 56.873 53.101 53.486 41.775 57.919 30.448 62.351 23.278 73.589 24.032 85.729c.754 12.14 9.259 22.404 21.048 25.401l1.85 46.38c-11.647 3.977-19.332 15.093-18.938 27.394 .394 12.301 8.774 22.903 20.651 26.126 11.878 3.224 24.468-1.686 31.027-12.1L128 212.47c.187 12.378 8.479 23.164 20.392 26.526 11.914 3.362 24.621-1.498 31.251-11.952 6.63-10.454 5.608-24.021-2.513-33.364l27.21-42.75c10.517 2.994 21.815-.408 28.929-8.712 7.115-8.304 8.744-19.99 4.173-29.923C232.871 102.361 222.935 95.997 212 96ZM71.19 104.36 113.72 129 72.26 161.22c-2.817-2.015-5.984-3.49-9.34-4.35L61.07 110.49c3.771-1.299 7.222-3.389 10.12-6.13ZM149.57 72c3.07-.168 6.091-.844 8.94-2L189 108.06c-1.945 2.792-3.361 5.917-4.18 9.22l-46.57 2.22ZM82.09 173.85 124 141.26l15.94 47.83c-3.035 2.14-5.618 4.859-7.6 8L84 183.53c-.059-3.314-.705-6.592-1.91-9.68ZM156 184h-.89L138.93 135.47l46.65-2.22c1.179 3.305 2.97 6.358 5.28 9L163.65 185c-2.492-.685-5.066-1.021-7.65-1ZM126.32 61.7c2.15 2.62 4.751 4.835 7.68 6.54l-11.3 47.45L79.23 90.52C79.741 88.384 80 86.196 80 84c0-.982-.05-1.963-.15-2.94Z"),
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
