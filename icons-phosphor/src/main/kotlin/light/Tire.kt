package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorLightIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 174.0f),
                    PathNode.CurveTo(182.44f, 174.0f, 190.0f, 150.86f, 190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 105.14f, 182.44f, 82.0f, 168.0f, 82.0f),
                    PathNode.CurveTo(153.56f, 82.0f, 146.0f, 105.14f, 146.0f, 128.0f),
                    PathNode.CurveTo(146.0f, 150.86f, 153.56f, 174.0f, 168.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 94.0f),
                    PathNode.CurveTo(170.57f, 94.0f, 178.0f, 105.69f, 178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 150.31f, 170.57f, 162.0f, 168.0f, 162.0f),
                    PathNode.CurveTo(165.43f, 162.0f, 158.0f, 150.31f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 105.69f, 165.43f, 94.0f, 168.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 218.0f),
                    PathNode.LineTo(191.71f, 218.0f),
                    PathNode.CurveTo(209.89f, 201.0f, 222.0f, 167.43f, 222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 70.8f, 196.52f, 26.0f, 164.0f, 26.0f),
                    PathNode.LineTo(92.0f, 26.0f),
                    PathNode.CurveTo(59.48f, 26.0f, 34.0f, 70.8f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 185.2f, 59.48f, 230.0f, 92.0f, 230.0f),
                    PathNode.LineTo(232.0f, 230.0f),
                    PathNode.CurveTo(235.3137f, 230.0f, 238.0f, 227.3137f, 238.0f, 224.0f),
                    PathNode.CurveTo(238.0f, 220.6863f, 235.3137f, 218.0f, 232.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 176.79f, 188.93f, 218.0f, 164.0f, 218.0f),
                    PathNode.CurveTo(139.07f, 218.0f, 118.0f, 176.79f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 79.21f, 139.07f, 38.0f, 164.0f, 38.0f),
                    PathNode.CurveTo(188.93f, 38.0f, 210.0f, 79.21f, 210.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 128.0f),
                    PathNode.CurveTo(46.0f, 125.14f, 46.08f, 122.31f, 46.22f, 119.5f),
                    PathNode.LineTo(80.0f, 95.37f),
                    PathNode.LineTo(106.5f, 114.3f),
                    PathNode.CurveTo(106.17f, 118.77f, 106.0f, 123.3f, 106.0f, 128.0f),
                    PathNode.CurveTo(105.94228f, 140.80115f, 107.28358f, 153.57027f, 110.0f, 166.08f),
                    PathNode.LineTo(83.45f, 147.08f),
                    PathNode.CurveTo(81.35843f, 145.57787f, 78.54157f, 145.57787f, 76.45f, 147.08f),
                    PathNode.LineTo(50.35f, 165.72f),
                    PathNode.CurveTo(47.41019f, 153.36351f, 45.94994f, 140.7013f, 46.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 38.0f),
                    PathNode.LineTo(136.29f, 38.0f),
                    PathNode.CurveTo(122.49f, 50.92f, 112.2f, 73.35f, 108.0f, 100.65f),
                    PathNode.LineTo(83.49f, 83.12f),
                    PathNode.CurveTo(81.39842f, 81.61787f, 78.58157f, 81.61787f, 76.49f, 83.12f),
                    PathNode.LineTo(47.79f, 103.63f),
                    PathNode.CurveTo(53.37f, 66.24f, 71.36f, 38.0f, 92.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 218.0f),
                    PathNode.CurveTo(76.42f, 218.0f, 62.36f, 201.92f, 54.0f, 178.0f),
                    PathNode.LineTo(80.0f, 159.42f),
                    PathNode.LineTo(115.53f, 184.81f),
                    PathNode.CurveTo(120.75f, 198.73f, 127.87f, 210.16f, 136.29f, 218.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tire!!
    }

private var _tire: ImageVector? = null
