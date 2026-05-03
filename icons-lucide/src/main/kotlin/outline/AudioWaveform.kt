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
                pathData = parseSvgPathData("M 2.000 13.000 C 3.105 13.000 4.000 12.105 4.000 11.000 L 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 C 7.105 5.000 8.000 5.895 8.000 7.000 L 8.000 20.000 C 8.000 21.105 8.895 22.000 10.000 22.000 C 11.105 22.000 12.000 21.105 12.000 20.000 L 12.000 4.000 C 12.000 2.895 12.895 2.000 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 L 16.000 17.000 C 16.000 18.105 16.895 19.000 18.000 19.000 C 19.105 19.000 20.000 18.105 20.000 17.000 L 20.000 13.000 C 20.000 11.895 20.895 11.000 22.000 11.000"),
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
