package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorBoldIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 52.0f),
                    PathNode.LineTo(16.0f, 52.0f),
                    PathNode.CurveTo(9.372583f, 52.0f, 4.0f, 57.37258f, 4.0f, 64.0f),
                    PathNode.LineTo(4.0f, 192.0f),
                    PathNode.CurveTo(4.0f, 198.62741f, 9.372583f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(246.62741f, 204.0f, 252.0f, 198.62741f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 64.0f),
                    PathNode.CurveTo(252.0f, 57.37258f, 246.62741f, 52.0f, 240.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.21f, 180.0f),
                    PathNode.LineTo(74.79f, 180.0f),
                    PathNode.CurveTo(69.93697f, 156.45876f, 51.541237f, 138.06303f, 28.0f, 133.21f),
                    PathNode.LineTo(28.0f, 122.79f),
                    PathNode.CurveTo(51.541237f, 117.93697f, 69.93697f, 99.54124f, 74.79f, 76.0f),
                    PathNode.LineTo(181.21f, 76.0f),
                    PathNode.CurveTo(186.06303f, 99.54124f, 204.45876f, 117.93697f, 228.0f, 122.79f),
                    PathNode.LineTo(228.0f, 133.21f),
                    PathNode.CurveTo(204.45876f, 138.06303f, 186.06303f, 156.45876f, 181.21f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 97.94f),
                    PathNode.CurveTo(217.76665f, 94.28676f, 209.71324f, 86.23337f, 206.06f, 76.0f),
                    PathNode.LineTo(228.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(49.94f, 76.0f),
                    PathNode.CurveTo(46.28676f, 86.23337f, 38.23337f, 94.28676f, 28.0f, 97.94f),
                    PathNode.LineTo(28.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 158.06f),
                    PathNode.CurveTo(38.23337f, 161.71324f, 46.28676f, 169.76665f, 49.94f, 180.0f),
                    PathNode.LineTo(28.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.06f, 180.0f),
                    PathNode.CurveTo(209.71324f, 169.76665f, 217.76665f, 161.71324f, 228.0f, 158.06f),
                    PathNode.LineTo(228.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(105.90861f, 88.0f, 88.0f, 105.90861f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 150.09138f, 105.90861f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(150.09138f, 168.0f, 168.0f, 150.09138f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 105.90861f, 150.09138f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
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
        return _money!!
    }

private var _money: ImageVector? = null
