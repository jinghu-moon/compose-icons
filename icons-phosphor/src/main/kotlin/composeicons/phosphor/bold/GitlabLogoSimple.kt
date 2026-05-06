package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorBoldIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234 116.09 214.13 40C212.391 33.231 206.446 28.384 199.466 28.044c-6.981-.34-13.368 3.908-15.756 10.476L167 84h-78L72.29 38.49C69.897 31.923 63.504 27.681 56.523 28.027 49.542 28.374 43.601 33.228 41.87 40L22 116.09c-6.415 24.527 2.959 50.469 23.57 65.23l73.27 51.77c5.505 3.881 12.855 3.881 18.36 0l73.27-51.77C231.066 166.548 240.423 140.608 234 116.09ZM196.6 161.72 128 210.19 59.4 161.72C46.932 152.746 41.289 137.013 45.21 122.16L58.61 70.86l10.76 29.28c1.736 4.724 6.237 7.863 11.27 7.86h94.72c5.033 .003 9.534-3.136 11.27-7.86L197.39 70.86l13.4 51.3c3.921 14.853-1.722 30.586-14.19 39.56Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
