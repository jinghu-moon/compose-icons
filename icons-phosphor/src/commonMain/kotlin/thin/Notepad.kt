package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorThinIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 130.20914f, 162.20914f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(93.79086f, 132.0f, 92.0f, 130.20914f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 125.79086f, 93.79086f, 124.0f, 96.0f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(162.20914f, 124.0f, 164.0f, 125.79086f, 164.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.CurveTo(93.79086f, 156.0f, 92.0f, 157.79086f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 162.20914f, 93.79086f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(162.20914f, 164.0f, 164.0f, 162.20914f, 164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 157.79086f, 162.20914f, 156.0f, 160.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 40.0f),
                    PathNode.LineTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 215.46397f, 199.46397f, 228.0f, 184.0f, 228.0f),
                    PathNode.LineTo(72.0f, 228.0f),
                    PathNode.CurveTo(56.53603f, 228.0f, 44.0f, 215.46397f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 37.79086f, 45.79086f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(76.0f, 36.0f),
                    PathNode.LineTo(76.0f, 24.0f),
                    PathNode.CurveTo(76.0f, 21.790861f, 77.79086f, 20.0f, 80.0f, 20.0f),
                    PathNode.CurveTo(82.20914f, 20.0f, 84.0f, 21.790861f, 84.0f, 24.0f),
                    PathNode.LineTo(84.0f, 36.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.LineTo(124.0f, 24.0f),
                    PathNode.CurveTo(124.0f, 21.790861f, 125.79086f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(130.20914f, 20.0f, 132.0f, 21.790861f, 132.0f, 24.0f),
                    PathNode.LineTo(132.0f, 36.0f),
                    PathNode.LineTo(172.0f, 36.0f),
                    PathNode.LineTo(172.0f, 24.0f),
                    PathNode.CurveTo(172.0f, 21.790861f, 173.79086f, 20.0f, 176.0f, 20.0f),
                    PathNode.CurveTo(178.20914f, 20.0f, 180.0f, 21.790861f, 180.0f, 24.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(210.20914f, 36.0f, 212.0f, 37.79086f, 212.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 44.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 58.20914f, 178.20914f, 60.0f, 176.0f, 60.0f),
                    PathNode.CurveTo(173.79086f, 60.0f, 172.0f, 58.20914f, 172.0f, 56.0f),
                    PathNode.LineTo(172.0f, 44.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(132.0f, 56.0f),
                    PathNode.CurveTo(132.0f, 58.20914f, 130.20914f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(125.79086f, 60.0f, 124.0f, 58.20914f, 124.0f, 56.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(84.0f, 44.0f),
                    PathNode.LineTo(84.0f, 56.0f),
                    PathNode.CurveTo(84.0f, 58.20914f, 82.20914f, 60.0f, 80.0f, 60.0f),
                    PathNode.CurveTo(77.79086f, 60.0f, 76.0f, 58.20914f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.LineTo(52.0f, 44.0f),
                    PathNode.LineTo(52.0f, 200.0f),
                    PathNode.CurveTo(52.0f, 211.0457f, 60.954304f, 220.0f, 72.0f, 220.0f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.CurveTo(195.0457f, 220.0f, 204.0f, 211.0457f, 204.0f, 200.0f),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
