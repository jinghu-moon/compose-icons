package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorBoldIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.59 58.67c-6.31-10.87-23-21.06-66.16-9.71C153.07 28.7 114.894 26.402 83.315 42.994 51.737 59.586 31.972 92.328 32 128q0 3.6 .26 7.14C.56 166.86 1.1 186.4 7.44 197.33 13.4 207.61 25.3 212 40.68 212c9.79 0 21-1.78 32.95-4.91 29.366 20.231 67.53 22.506 99.091 5.906C204.282 196.396 224.031 163.66 224 128c0-2.41-.09-4.79-.27-7.16 14.31-14.38 23.86-28.21 27-40C253.55 70.42 251.12 63 248.59 58.67ZM128 56c33.582 .045 62.687 23.267 70.19 56C184 124.73 165 138.59 141.92 151.86c-21.74 12.49-43.55 22.36-63.09 28.65C57.299 160.311 50.28 129.014 61.124 101.554 71.968 74.094 98.477 56.038 128 56ZM28.19 185.29c-.61-1.07-.17-8.22 10.67-21.71 3.367 8.405 7.909 16.29 13.49 23.42-17.23 2.61-23.5-.59-24.16-1.71ZM128 200c-7.666 .001-15.283-1.228-22.56-3.64 16.662-6.782 32.84-14.697 48.42-23.69 15.522-8.852 30.414-18.766 44.57-29.67-7.122 33.216-36.459 56.959-70.43 57ZM227.57 74.65c-1.28 4.78-4.81 10.87-10.39 17.8C213.813 84.034 209.267 76.138 203.68 69c15.83-2.37 23.17 0 24.15 1.71 .17 .29 .38 1.57-.26 3.94Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
