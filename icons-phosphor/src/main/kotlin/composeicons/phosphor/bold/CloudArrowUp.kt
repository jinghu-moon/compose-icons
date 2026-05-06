package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorBoldIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.49 151.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L168 157v51c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-51l-11.51 11.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM160 36C126.164 36.016 95.062 54.589 79 84.37 53.986 81.75 29.568 93.151 15.517 114.012 1.466 134.872 .077 161.784 11.906 183.98 23.735 206.177 46.849 220.031 72 220h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28C48.158 195.854 28.77 176.744 28.279 152.906c-.491-23.838 18.095-43.729 41.911-44.856C68.732 114.6 67.998 121.29 68 128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .023-26.878 15.875-51.22 40.447-62.111 24.572-10.891 53.254-6.286 73.182 11.75 19.928 18.036 27.363 46.117 18.971 71.651-2.074 6.296 1.349 13.081 7.645 15.155 6.296 2.074 13.081-1.349 15.155-7.645 9.214-28.038 4.426-58.793-12.873-82.703C217.227 50.186 189.513 36.019 160 36Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
