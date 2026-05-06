package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorBoldIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.46 83.15 160.31 88l12.15 4.85c6.155 2.463 9.148 9.45 6.685 15.605-2.463 6.155-9.45 9.148-15.605 6.685L128 100.93 92.46 115.15c-6.155 2.463-13.142-.53-15.605-6.685-2.463-6.155 .53-13.142 6.685-15.605L95.69 88 83.54 83.15C77.385 80.687 74.392 73.7 76.855 67.545c2.463-6.155 9.45-9.148 15.605-6.685L128 75.08 163.54 60.86c6.155-2.463 13.142 .53 15.605 6.685 2.463 6.155-.53 13.142-6.685 15.605ZM228 79.75c.08 76.45-25.2 135.68-49 152.59-5.895 4.139-13.56 4.788-20.067 1.7-6.507-3.088-10.851-9.437-11.373-16.62-.67-9.06-2.33-22-6.46-32.23C135.76 172 129.92 172 128 172c-7.76 0-11.77 9.92-13.08 13.18-4.13 10.22-5.79 23.17-6.46 32.23-.74 10.472-9.452 18.59-19.95 18.59-4.124 .005-8.146-1.275-11.51-3.66C53.2 215.43 27.92 156.2 28 79.75 28.138 46.711 54.96 20 88 20h80c33.04-0 59.862 26.711 60 59.75ZM204 79.75C203.863 59.965 187.785 44 168 44h-80C68.203 44 52.121 59.984 52 79.78c-.06 61.09 17.83 109.52 33.3 127.66C91.24 156 114.32 148 128 148c13.68 0 36.76 8 42.7 59.43C186.17 189.31 204.06 140.88 204 79.78Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
