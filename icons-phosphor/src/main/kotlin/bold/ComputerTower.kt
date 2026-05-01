package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorBoldIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 76.0f),
                    PathNode.CurveTo(84.0f, 69.37258f, 89.37258f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(166.62741f, 64.0f, 172.0f, 69.37258f, 172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 82.62742f, 166.62741f, 88.0f, 160.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(89.37258f, 88.0f, 84.0f, 82.62742f, 84.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(166.62741f, 128.0f, 172.0f, 122.62742f, 172.0f, 116.0f),
                    PathNode.CurveTo(172.0f, 109.37258f, 166.62741f, 104.0f, 160.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(89.37258f, 104.0f, 84.0f, 109.37258f, 84.0f, 116.0f),
                    PathNode.CurveTo(84.0f, 122.62742f, 89.37258f, 128.0f, 96.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 40.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 227.0457f, 203.0457f, 236.0f, 192.0f, 236.0f),
                    PathNode.LineTo(64.0f, 236.0f),
                    PathNode.CurveTo(52.954304f, 236.0f, 44.0f, 227.0457f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 28.954306f, 52.954304f, 20.0f, 64.0f, 20.0f),
                    PathNode.LineTo(192.0f, 20.0f),
                    PathNode.CurveTo(203.0457f, 20.0f, 212.0f, 28.954306f, 212.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 44.0f),
                    PathNode.LineTo(68.0f, 44.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(119.163445f, 168.0f, 112.0f, 175.16344f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 192.83656f, 119.163445f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(136.83656f, 200.0f, 144.0f, 192.83656f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 175.16344f, 136.83656f, 168.0f, 128.0f, 168.0f),
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
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
