package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorBoldIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.28f, 71.32f),
                    PathNode.CurveTo(230.3682f, 69.49542f, 227.90755f, 68.35298f, 225.28f, 68.07f),
                    PathNode.CurveTo(217.2686f, 45.3517f, 193.65921f, 32.0904f, 170.09f, 37.07f),
                    PathNode.CurveTo(161.6729f, 21.668892f, 145.52112f, 12.089679f, 127.97f, 12.089679f),
                    PathNode.CurveTo(110.41888f, 12.089679f, 94.267105f, 21.668892f, 85.85f, 37.07f),
                    PathNode.CurveTo(62.280796f, 32.0904f, 38.671406f, 45.3517f, 30.66f, 68.07f),
                    PathNode.CurveTo(27.249023f, 68.45313f, 24.165392f, 70.27859f, 22.188824f, 73.084785f),
                    PathNode.CurveTo(20.212254f, 75.890976f, 19.531975f, 79.409256f, 20.32f, 82.75f),
                    PathNode.LineTo(50.87f, 212.58f),
                    PathNode.CurveTo(52.969093f, 221.632f, 61.047844f, 228.03027f, 70.34f, 228.0f),
                    PathNode.LineTo(185.66f, 228.0f),
                    PathNode.CurveTo(194.95215f, 228.03027f, 203.03091f, 221.632f, 205.13f, 212.58f),
                    PathNode.LineTo(235.68f, 82.75f),
                    PathNode.CurveTo(236.65392f, 78.60664f, 235.36017f, 74.25741f, 232.28f, 71.32f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 60.0f),
                    PathNode.CurveTo(79.91646f, 59.987015f, 83.77499f, 60.945633f, 87.23f, 62.79f),
                    PathNode.CurveTo(90.54058f, 64.5504f, 94.48371f, 64.66218f, 97.8887f, 63.092155f),
                    PathNode.CurveTo(101.29369f, 61.52213f, 103.769104f, 58.45079f, 104.58f, 54.79f),
                    PathNode.CurveTo(107.03484f, 43.827328f, 116.76583f, 36.034386f, 128.0f, 36.034386f),
                    PathNode.CurveTo(139.23416f, 36.034386f, 148.96515f, 43.827328f, 151.42f, 54.79f),
                    PathNode.CurveTo(152.2309f, 58.45079f, 154.70631f, 61.52213f, 158.1113f, 63.092155f),
                    PathNode.CurveTo(161.51628f, 64.66218f, 165.45943f, 64.5504f, 168.77f, 62.79f),
                    PathNode.CurveTo(172.225f, 60.945633f, 176.08354f, 59.987015f, 180.0f, 60.0f),
                    PathNode.CurveTo(189.34045f, 59.991196f, 197.83755f, 65.402336f, 201.78f, 73.87f),
                    PathNode.LineTo(168.65f, 83.33f),
                    PathNode.LineTo(135.43f, 70.05f),
                    PathNode.CurveTo(130.66269f, 68.13017f, 125.33731f, 68.13017f, 120.57f, 70.05f),
                    PathNode.LineTo(87.35f, 83.33f),
                    PathNode.LineTo(54.22f, 73.87f),
                    PathNode.CurveTo(58.16245f, 65.402336f, 66.659546f, 59.991196f, 76.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.13f, 103.67f),
                    PathNode.LineTo(128.0f, 92.92f),
                    PathNode.LineTo(154.87f, 103.67f),
                    PathNode.LineTo(141.49f, 204.0f),
                    PathNode.LineTo(114.49f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.36f, 97.16f),
                    PathNode.LineTo(77.14f, 105.38f),
                    PathNode.LineTo(90.29f, 204.0f),
                    PathNode.LineTo(73.5f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.5f, 204.0f),
                    PathNode.LineTo(165.71f, 204.0f),
                    PathNode.LineTo(178.86f, 105.38f),
                    PathNode.LineTo(207.64f, 97.16f),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
