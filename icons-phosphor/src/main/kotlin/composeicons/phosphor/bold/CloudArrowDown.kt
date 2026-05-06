package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorBoldIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192.49 167.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L140 179v-51c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v51l11.51-11.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534ZM160 36C126.164 36.016 95.062 54.589 79 84.37 53.986 81.75 29.568 93.151 15.517 114.012 1.466 134.872 .077 161.784 11.906 183.98 23.735 206.177 46.849 220.031 72 220h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12C48.158 195.854 28.77 176.744 28.279 152.906c-.491-23.838 18.095-43.729 41.911-44.856C68.732 114.6 67.998 121.29 68 128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C92 90.445 122.445 60 160 60c37.555 0 68 30.445 68 68 .033 10.626-2.451 21.109-7.25 30.59-2.004 3.835-1.789 8.451 .563 12.083 2.352 3.632 6.478 5.715 10.797 5.454 4.319-.262 8.163-2.828 10.06-6.717C248.671 156.577 252.04 142.386 252 128 251.945 77.213 210.787 36.055 160 36Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
