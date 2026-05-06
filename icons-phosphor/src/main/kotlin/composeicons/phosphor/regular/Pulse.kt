package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorRegularIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c0 4.418-3.582 8-8 8h-27.06l-37.78 75.58c-1.357 2.711-4.129 4.422-7.16 4.42h-.4c-3.171-.157-5.949-2.174-7.08-5.14L95.35 60.76 63.28 131.31C61.982 134.165 59.136 135.999 56 136h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h26.85L88.72 36.69c1.335-2.94 4.306-4.789 7.533-4.688 3.227 .101 6.077 2.131 7.227 5.148l57.51 151 31.85-63.71c1.351-2.719 4.124-4.438 7.16-4.44h32c4.418 0 8 3.582 8 8Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
