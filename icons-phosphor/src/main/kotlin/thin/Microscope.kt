package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorThinIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 212.0f),
                    PathNode.LineTo(194.8f, 212.0f),
                    PathNode.CurveTo(210.9978f, 196.2509f, 220.09457f, 174.59189f, 220.0f, 152.0f),
                    PathNode.CurveTo(219.94672f, 107.18534f, 184.76141f, 70.28475f, 140.0f, 68.1f),
                    PathNode.LineTo(140.0f, 32.0f),
                    PathNode.CurveTo(140.0f, 25.372583f, 134.62741f, 20.0f, 128.0f, 20.0f),
                    PathNode.LineTo(80.0f, 20.0f),
                    PathNode.CurveTo(73.37258f, 20.0f, 68.0f, 25.372583f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 142.62741f, 73.37258f, 148.0f, 80.0f, 148.0f),
                    PathNode.LineTo(128.0f, 148.0f),
                    PathNode.CurveTo(134.62741f, 148.0f, 140.0f, 142.62741f, 140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 76.11f),
                    PathNode.CurveTo(171.68858f, 77.78547f, 199.00069f, 98.97305f, 208.50119f, 129.25034f),
                    PathNode.CurveTo(218.0017f, 159.52762f, 207.69058f, 192.52074f, 182.64f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 213.79086f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 218.20914f, 29.790861f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(226.20914f, 220.0f, 228.0f, 218.20914f, 228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 213.79086f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(77.79086f, 140.0f, 76.0f, 138.20914f, 76.0f, 136.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 29.790861f, 77.79086f, 28.0f, 80.0f, 28.0f),
                    PathNode.LineTo(128.0f, 28.0f),
                    PathNode.CurveTo(130.20914f, 28.0f, 132.0f, 29.790861f, 132.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 180.0f),
                    PathNode.CurveTo(69.79086f, 180.0f, 68.0f, 178.20914f, 68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 173.79086f, 69.79086f, 172.0f, 72.0f, 172.0f),
                    PathNode.LineTo(136.0f, 172.0f),
                    PathNode.CurveTo(138.20914f, 172.0f, 140.0f, 173.79086f, 140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 138.20914f, 180.0f, 136.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
