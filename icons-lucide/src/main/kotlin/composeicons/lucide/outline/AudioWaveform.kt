package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AudioWaveform: ImageVector
    get() {
        if (_audioWaveform != null) return _audioWaveform!!
        _audioWaveform = lucideOutlineIcon(
            name = "AudioWaveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 13c1.105 0 2-.895 2-2v-4C4 5.895 4.895 5 6 5c1.105 0 2 .895 2 2v13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4c0-1.105 .895-2 2-2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _audioWaveform!!
    }

private var _audioWaveform: ImageVector? = null
