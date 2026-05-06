package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorFillIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80h31.37L90.83 158.33C79.124 143.971 76.726 124.159 84.668 107.422 92.61 90.685 109.475 80.013 128 80ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM189.27 58c-1.597-1.398-3.683-2.104-5.8-1.964-2.117 .141-4.092 1.117-5.49 2.714L173.37 64h-45.37c-25.187 .02-48.02 14.81-58.335 37.787-10.316 22.977-6.196 49.868 10.525 68.703L66 186.73c-2.599 3.341-2.145 8.129 1.035 10.923 3.181 2.794 7.987 2.626 10.965-.383L92.22 181c10.554 7.172 23.02 11.004 35.78 11h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-8.877 .012-17.581-2.458-25.13-7.13L190 69.27c2.903-3.316 2.576-8.356-.73-11.27Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
