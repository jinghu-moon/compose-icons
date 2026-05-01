package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorBoldIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 110.62742f, 182.62741f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(73.37258f, 116.0f, 68.0f, 110.62742f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 97.37258f, 73.37258f, 92.0f, 80.0f, 92.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(182.62741f, 92.0f, 188.0f, 97.37258f, 188.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(255.91f, 131.63f),
                    PathNode.CurveTo(253.90106f, 171.1633f, 221.9893f, 202.593f, 182.43f, 204.0f),
                    PathNode.CurveTo(181.87f, 204.0f, 181.3f, 204.0f, 180.74f, 204.0f),
                    PathNode.CurveTo(166.3f, 204.0f, 151.37f, 198.22f, 135.16f, 186.36f),
                    PathNode.CurveTo(130.90114f, 183.22583f, 125.09886f, 183.22583f, 120.84f, 186.36f),
                    PathNode.CurveTo(104.0f, 198.68f, 88.56f, 204.44f, 73.57f, 204.0f),
                    PathNode.CurveTo(34.010696f, 202.593f, 2.098943f, 171.1633f, 0.09f, 131.63f),
                    PathNode.CurveTo(-0.902796f, 110.867905f, 6.65142f, 90.60518f, 20.993591f, 75.560165f),
                    PathNode.CurveTo(35.335766f, 60.515152f, 55.21418f, 52.000893f, 76.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.CurveTo(200.78581f, 52.000893f, 220.66425f, 60.515152f, 235.00641f, 75.560165f),
                    PathNode.CurveTo(249.34859f, 90.60518f, 256.9028f, 110.867905f, 255.91f, 131.63f),
                    PathNode.Close,
                    PathNode.MoveTo(217.62f, 92.1f),
                    PathNode.CurveTo(207.83762f, 81.773895f, 194.22395f, 75.94774f, 180.0f, 76.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.CurveTo(61.773052f, 75.99983f, 48.16732f, 81.82877f, 38.353085f, 92.12862f),
                    PathNode.CurveTo(28.538849f, 102.42847f, 23.373276f, 116.29964f, 24.06f, 130.51f),
                    PathNode.CurveTo(25.443214f, 157.54472f, 47.26714f, 179.0343f, 74.32f, 180.0f),
                    PathNode.CurveTo(83.74f, 180.29f, 94.32f, 176.0f, 106.67f, 167.0f),
                    PathNode.CurveTo(119.35874f, 157.66739f, 136.64125f, 157.66739f, 149.33f, 167.0f),
                    PathNode.CurveTo(161.69f, 176.0f, 172.24f, 180.29f, 181.68f, 180.0f),
                    PathNode.CurveTo(208.72922f, 179.0347f, 230.55177f, 157.55081f, 231.94f, 130.52f),
                    PathNode.CurveTo(232.6745f, 116.28572f, 227.49191f, 102.381035f, 217.62f, 92.1f),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
