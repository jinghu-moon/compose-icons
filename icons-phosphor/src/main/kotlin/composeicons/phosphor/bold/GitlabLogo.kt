package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorBoldIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234 116.09 214.13 40C212.391 33.231 206.446 28.384 199.466 28.044c-6.981-.34-13.368 3.908-15.756 10.476L167 84h-78L72.29 38.49C69.897 31.923 63.504 27.681 56.523 28.027 49.542 28.374 43.601 33.228 41.87 40L22 116.09c-6.415 24.527 2.959 50.469 23.57 65.23l73.27 51.77c5.505 3.881 12.855 3.881 18.36 0l73.27-51.77C231.066 166.548 240.423 140.608 234 116.09ZM58.61 70.86l10.76 29.28c1.736 4.724 6.237 7.863 11.27 7.86h94.72c5.033 .003 9.534-3.136 11.27-7.86L197.39 70.86l9.14 35L128 161.31 49.47 105.83ZM44 131.37 107.2 176l-13.79 9.74-34-24C49.624 154.739 43.872 143.402 44 131.37ZM128 210.19l-13.79-9.75L128 190.7l13.79 9.74ZM196.6 161.72l-34 24L148.8 176 212 131.37c.124 12.023-5.624 23.351-15.4 30.35Z"),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
