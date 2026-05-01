package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorBoldIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.00058f, 45.69213f, 222.26056f, 30.299534f, 204.07007f, 28.22969f),
                    PathNode.CurveTo(185.8796f, 26.159847f, 169.03264f, 38.072044f, 164.92006f, 55.912018f),
                    PathNode.CurveTo(160.80746f, 73.75199f, 170.73918f, 91.83738f, 188.0f, 97.94f),
                    PathNode.LineTo(188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 114.20914f, 186.20914f, 116.0f, 184.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(94.66142f, 116.00024f, 93.324615f, 116.09716f, 92.0f, 116.29f),
                    PathNode.LineTo(92.0f, 97.94f),
                    PathNode.CurveTo(108.53056f, 92.095566f, 118.446465f, 75.19201f, 115.481544f, 57.9112f),
                    PathNode.CurveTo(112.51663f, 40.6304f, 97.53331f, 27.998875f, 80.0f, 27.998875f),
                    PathNode.CurveTo(62.466694f, 27.998875f, 47.483368f, 40.6304f, 44.51845f, 57.9112f),
                    PathNode.CurveTo(41.553535f, 75.19201f, 51.46944f, 92.095566f, 68.0f, 97.94f),
                    PathNode.LineTo(68.0f, 158.06f),
                    PathNode.CurveTo(51.46944f, 163.90443f, 41.553535f, 180.808f, 44.51845f, 198.08879f),
                    PathNode.CurveTo(47.483368f, 215.3696f, 62.466694f, 228.00113f, 80.0f, 228.00113f),
                    PathNode.CurveTo(97.53331f, 228.00113f, 112.51663f, 215.3696f, 115.481544f, 198.08879f),
                    PathNode.CurveTo(118.446465f, 180.808f, 108.53056f, 163.90443f, 92.0f, 158.06f),
                    PathNode.LineTo(92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 141.79086f, 93.79086f, 140.0f, 96.0f, 140.0f),
                    PathNode.LineTo(184.0f, 140.0f),
                    PathNode.CurveTo(199.46397f, 140.0f, 212.0f, 127.463974f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 97.94f),
                    PathNode.CurveTo(226.37004f, 92.83724f, 235.9786f, 79.249115f, 236.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 52.0f),
                    PathNode.CurveTo(86.62742f, 52.0f, 92.0f, 57.37258f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 70.62742f, 86.62742f, 76.0f, 80.0f, 76.0f),
                    PathNode.CurveTo(73.37258f, 76.0f, 68.0f, 70.62742f, 68.0f, 64.0f),
                    PathNode.CurveTo(68.0f, 57.37258f, 73.37258f, 52.0f, 80.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 204.0f),
                    PathNode.CurveTo(73.37258f, 204.0f, 68.0f, 198.62741f, 68.0f, 192.0f),
                    PathNode.CurveTo(68.0f, 185.37259f, 73.37258f, 180.0f, 80.0f, 180.0f),
                    PathNode.CurveTo(86.62742f, 180.0f, 92.0f, 185.37259f, 92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 198.62741f, 86.62742f, 204.0f, 80.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 76.0f),
                    PathNode.CurveTo(193.37259f, 76.0f, 188.0f, 70.62742f, 188.0f, 64.0f),
                    PathNode.CurveTo(188.0f, 57.37258f, 193.37259f, 52.0f, 200.0f, 52.0f),
                    PathNode.CurveTo(206.62741f, 52.0f, 212.0f, 57.37258f, 212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 70.62742f, 206.62741f, 76.0f, 200.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
