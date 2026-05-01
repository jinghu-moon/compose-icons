package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorBoldIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 232.0f),
                    PathNode.CurveTo(180.0f, 238.62741f, 174.62741f, 244.0f, 168.0f, 244.0f),
                    PathNode.LineTo(88.0f, 244.0f),
                    PathNode.CurveTo(81.37258f, 244.0f, 76.0f, 238.62741f, 76.0f, 232.0f),
                    PathNode.CurveTo(76.0f, 225.37259f, 81.37258f, 220.0f, 88.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(174.62741f, 220.0f, 180.0f, 225.37259f, 180.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(219.91989f, 133.02112f, 206.21988f, 160.32114f, 183.0f, 177.73f),
                    PathNode.CurveTo(181.07382f, 179.2353f, 179.9636f, 181.55566f, 180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 195.0457f, 171.0457f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(84.95431f, 204.0f, 76.0f, 195.0457f, 76.0f, 184.0f),
                    PathNode.LineTo(76.0f, 183.77f),
                    PathNode.CurveTo(75.9633f, 181.30434f, 74.7569f, 179.0029f, 72.75f, 177.57f),
                    PathNode.CurveTo(49.692127f, 160.37798f, 36.076275f, 133.33153f, 36.0f, 104.57f),
                    PathNode.CurveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f),
                    PathNode.CurveTo(150.57054f, 11.404555f, 174.5429f, 20.833878f, 192.27722f, 38.152184f),
                    PathNode.CurveTo(210.01155f, 55.47049f, 220.00716f, 79.2123f, 220.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0054f, 85.67572f, 188.61508f, 68.124825f, 175.50348f, 55.32384f),
                    PathNode.CurveTo(162.39189f, 42.522858f, 144.66888f, 35.555367f, 126.35f, 36.0f),
                    PathNode.CurveTo(89.56f, 36.89f, 59.8f, 67.56f, 60.0f, 104.39f),
                    PathNode.CurveTo(60.045593f, 125.66708f, 70.11774f, 145.67796f, 87.18f, 158.39f),
                    PathNode.LineTo(87.18f, 158.39f),
                    PathNode.CurveTo(94.12216f, 163.5981f, 98.66307f, 171.3923f, 99.77f, 180.0f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 149.0f),
                    PathNode.LineTo(87.51f, 120.49f),
                    PathNode.CurveTo(82.81558f, 115.79558f, 82.81558f, 108.18442f, 87.51f, 103.49f),
                    PathNode.CurveTo(92.20442f, 98.79558f, 99.81558f, 98.79558f, 104.51f, 103.49f),
                    PathNode.LineTo(128.0f, 127.0f),
                    PathNode.LineTo(151.51f, 103.49f),
                    PathNode.CurveTo(156.20442f, 98.79558f, 163.81558f, 98.79558f, 168.51f, 103.49f),
                    PathNode.CurveTo(173.20442f, 108.18442f, 173.20442f, 115.79558f, 168.51f, 120.49f),
                    PathNode.LineTo(140.0f, 149.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.LineTo(156.25f, 180.0f),
                    PathNode.CurveTo(157.31554f, 171.45494f, 161.79153f, 163.704f, 168.66f, 158.51f),
                    PathNode.CurveTo(185.9358f, 145.7322f, 196.08966f, 125.48762f, 196.0f, 104.0f),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
