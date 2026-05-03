package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorFillIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 31.163445f, 111.163445f, 24.0f, 120.0f, 24.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(144.83656f, 24.0f, 152.0f, 31.163445f, 152.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(23.163445f, 168.0f, 16.0f, 175.16344f, 16.0f, 184.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 175.16344f, 232.83656f, 168.0f, 224.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 148.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(223.90063f, 100.8671f, 204.70345f, 68.56785f, 173.89f, 51.69f),
                    PathNode.CurveTo(172.64958f, 51.024986f, 171.15096f, 51.060806f, 169.94373f, 51.78432f),
                    PathNode.CurveTo(168.7365f, 52.507835f, 167.99835f, 53.81257f, 168.0f, 55.22f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(222.20914f, 152.0f, 224.0f, 150.20914f, 224.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 152.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 55.22f),
                    PathNode.CurveTo(88.00165f, 53.81257f, 87.2635f, 52.507835f, 86.056274f, 51.78432f),
                    PathNode.CurveTo(84.849045f, 51.060806f, 83.35041f, 51.024986f, 82.11f, 51.69f),
                    PathNode.CurveTo(51.29656f, 68.56785f, 32.09936f, 100.8671f, 32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(32.0f, 150.20914f, 33.79086f, 152.0f, 36.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
