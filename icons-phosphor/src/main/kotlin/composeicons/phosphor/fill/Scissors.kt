package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorFillIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.52 187.09 93.52 89.22C100.029 72.776 93.63 54.039 78.421 45.012 63.212 35.986 43.699 39.343 32.382 52.935 21.065 66.526 21.297 86.324 32.928 99.647c11.632 13.323 31.218 16.223 46.212 6.843l21.39 21.69L79.15 149.54h0c-14.959-9.341-34.487-6.437-46.081 6.853-11.593 13.29-11.82 33.031-.536 46.584 11.285 13.553 30.741 16.905 45.911 7.91 15.17-8.995 21.563-27.674 15.085-44.077l26.91-18.41L170 198.64c6.035 5.994 14.194 9.361 22.7 9.37 1.374-0 2.747-.09 4.11-.27h.28l36.27-6.11c3.222-.538 5.794-2.981 6.496-6.172 .702-3.191-.607-6.487-3.306-8.328ZM74.14 90.09c-6.751 6.749-17.331 7.786-25.265 2.476C40.942 87.256 37.868 77.08 41.533 68.265 45.199 59.451 54.584 54.456 63.943 56.338 73.302 58.22 80.026 66.454 80 76c-.004 5.3-2.111 10.383-5.86 14.13ZM74.14 194.09c-6.751 6.749-17.331 7.786-25.265 2.476C40.942 191.256 37.868 181.08 41.533 172.265c3.666-8.814 13.05-13.809 22.409-11.927C73.302 162.22 80.026 170.454 80 180c.002 5.307-2.107 10.398-5.86 14.15ZM135.14 92.59 169.94 57.4c7.051-7.035 16.961-10.41 26.84-9.14h.28l36 6.07c2.625 .402 4.894 2.048 6.09 4.42 1.746 3.568 .609 7.878-2.67 10.12l-69.93 47.85c-1.36 .928-3.15 .928-4.51 0l-26.31-18c-.959-.676-1.572-1.739-1.678-2.908-.106-1.169 .307-2.325 1.128-3.162Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
