package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorBoldIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.00058f, 45.69213f, 214.26056f, 30.299534f, 196.07007f, 28.22969f),
                    PathNode.CurveTo(177.8796f, 26.159847f, 161.03264f, 38.072044f, 156.92006f, 55.912018f),
                    PathNode.CurveTo(152.80746f, 73.75199f, 162.73918f, 91.83738f, 180.0f, 97.94f),
                    PathNode.LineTo(180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 114.20914f, 178.20914f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(77.79086f, 116.0f, 76.0f, 114.20914f, 76.0f, 112.0f),
                    PathNode.LineTo(76.0f, 97.94f),
                    PathNode.CurveTo(92.53056f, 92.095566f, 102.446465f, 75.19201f, 99.481544f, 57.9112f),
                    PathNode.CurveTo(96.51663f, 40.6304f, 81.53331f, 27.998875f, 64.0f, 27.998875f),
                    PathNode.CurveTo(46.466694f, 27.998875f, 31.483368f, 40.6304f, 28.518452f, 57.9112f),
                    PathNode.CurveTo(25.553535f, 75.19201f, 35.46944f, 92.095566f, 52.0f, 97.94f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 127.463974f, 64.536026f, 140.0f, 80.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 158.06f),
                    PathNode.CurveTo(99.46944f, 163.90443f, 89.553535f, 180.808f, 92.518456f, 198.08879f),
                    PathNode.CurveTo(95.48337f, 215.3696f, 110.46669f, 228.00113f, 128.0f, 228.00113f),
                    PathNode.CurveTo(145.53331f, 228.00113f, 160.51665f, 215.3696f, 163.48155f, 198.08879f),
                    PathNode.CurveTo(166.44649f, 180.808f, 156.53056f, 163.90443f, 140.0f, 158.06f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(176.0f, 140.0f),
                    PathNode.CurveTo(191.46397f, 140.0f, 204.0f, 127.463974f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 97.94f),
                    PathNode.CurveTo(218.37004f, 92.83724f, 227.9786f, 79.249115f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 52.0f),
                    PathNode.CurveTo(70.62742f, 52.0f, 76.0f, 57.37258f, 76.0f, 64.0f),
                    PathNode.CurveTo(76.0f, 70.62742f, 70.62742f, 76.0f, 64.0f, 76.0f),
                    PathNode.CurveTo(57.37258f, 76.0f, 52.0f, 70.62742f, 52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 57.37258f, 57.37258f, 52.0f, 64.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(121.37258f, 204.0f, 116.0f, 198.62741f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 185.37259f, 121.37258f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(134.62741f, 180.0f, 140.0f, 185.37259f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 198.62741f, 134.62741f, 204.0f, 128.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 76.0f),
                    PathNode.CurveTo(185.37259f, 76.0f, 180.0f, 70.62742f, 180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 57.37258f, 185.37259f, 52.0f, 192.0f, 52.0f),
                    PathNode.CurveTo(198.62741f, 52.0f, 204.0f, 57.37258f, 204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 70.62742f, 198.62741f, 76.0f, 192.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
