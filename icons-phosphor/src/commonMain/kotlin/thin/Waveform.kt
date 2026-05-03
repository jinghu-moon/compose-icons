package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorThinIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 162.20914f, 50.20914f, 164.0f, 48.0f, 164.0f),
                    PathNode.CurveTo(45.79086f, 164.0f, 44.0f, 162.20914f, 44.0f, 160.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 93.79086f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.CurveTo(50.20914f, 92.0f, 52.0f, 93.79086f, 52.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 28.0f),
                    PathNode.CurveTo(85.79086f, 28.0f, 84.0f, 29.790861f, 84.0f, 32.0f),
                    PathNode.LineTo(84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 226.20914f, 85.79086f, 228.0f, 88.0f, 228.0f),
                    PathNode.CurveTo(90.20914f, 228.0f, 92.0f, 226.20914f, 92.0f, 224.0f),
                    PathNode.LineTo(92.0f, 32.0f),
                    PathNode.CurveTo(92.0f, 29.790861f, 90.20914f, 28.0f, 88.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(125.79086f, 60.0f, 124.0f, 61.79086f, 124.0f, 64.0f),
                    PathNode.LineTo(124.0f, 192.0f),
                    PathNode.CurveTo(124.0f, 194.20914f, 125.79086f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(130.20914f, 196.0f, 132.0f, 194.20914f, 132.0f, 192.0f),
                    PathNode.LineTo(132.0f, 64.0f),
                    PathNode.CurveTo(132.0f, 61.79086f, 130.20914f, 60.0f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 92.0f),
                    PathNode.CurveTo(165.79086f, 92.0f, 164.0f, 93.79086f, 164.0f, 96.0f),
                    PathNode.LineTo(164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 162.20914f, 165.79086f, 164.0f, 168.0f, 164.0f),
                    PathNode.CurveTo(170.20914f, 164.0f, 172.0f, 162.20914f, 172.0f, 160.0f),
                    PathNode.LineTo(172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 93.79086f, 170.20914f, 92.0f, 168.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.CurveTo(205.79086f, 76.0f, 204.0f, 77.79086f, 204.0f, 80.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 178.20914f, 205.79086f, 180.0f, 208.0f, 180.0f),
                    PathNode.CurveTo(210.20914f, 180.0f, 212.0f, 178.20914f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 77.79086f, 210.20914f, 76.0f, 208.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveform!!
    }

private var _waveform: ImageVector? = null
