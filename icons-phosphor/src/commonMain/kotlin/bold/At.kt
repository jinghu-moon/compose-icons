package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorBoldIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(150.27f, 236.0f, 173.69f, 229.27f, 190.64f, 218.0f),
                    PathNode.CurveTo(196.16284f, 214.33006f, 197.66493f, 206.87785f, 193.995f, 201.355f),
                    PathNode.CurveTo(190.32507f, 195.83215f, 182.87285f, 194.33006f, 177.35f, 198.0f),
                    PathNode.CurveTo(164.35f, 206.63f, 145.46f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 137.29f, 210.33f, 145.08f, 207.31f, 149.95f),
                    PathNode.CurveTo(204.67f, 154.19f, 201.31f, 156.0f, 196.0f, 156.0f),
                    PathNode.CurveTo(190.69f, 156.0f, 187.33f, 154.19f, 184.69f, 149.95f),
                    PathNode.CurveTo(181.69f, 145.08f, 180.0f, 137.29f, 180.0f, 128.0f),
                    PathNode.LineTo(180.0f, 88.0f),
                    PathNode.CurveTo(179.9994f, 82.048454f, 175.6367f, 76.99658f, 169.74869f, 76.129295f),
                    PathNode.CurveTo(163.86069f, 75.26201f, 158.22662f, 78.8414f, 156.51f, 84.54f),
                    PathNode.CurveTo(133.55635f, 69.45754f, 102.83114f, 74.8268f, 86.35298f, 96.79999f),
                    PathNode.CurveTo(69.87483f, 118.77318f, 73.32655f, 149.77242f, 94.234535f, 167.58272f),
                    PathNode.CurveTo(115.14252f, 185.39302f, 146.29625f, 183.87215f, 165.37f, 164.11f),
                    PathNode.CurveTo(172.3f, 174.3f, 182.81f, 180.0f, 196.0f, 180.0f),
                    PathNode.CurveTo(220.67f, 180.0f, 236.0f, 160.08f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
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
        return _at!!
    }

private var _at: ImageVector? = null
