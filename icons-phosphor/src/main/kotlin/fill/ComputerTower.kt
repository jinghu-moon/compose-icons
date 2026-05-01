package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorFillIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(55.163445f, 24.0f, 48.0f, 31.163445f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 224.83656f, 55.163445f, 232.0f, 64.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(200.83656f, 232.0f, 208.0f, 224.83656f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(121.37258f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 173.37259f, 121.37258f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(134.62741f, 168.0f, 140.0f, 173.37259f, 140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 134.62741f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(91.58172f, 112.0f, 88.0f, 108.41828f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 99.58172f, 91.58172f, 96.0f, 96.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(164.41827f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 164.41827f, 112.0f, 160.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 76.41828f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(164.41827f, 64.0f, 168.0f, 67.58172f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 76.41828f, 164.41827f, 80.0f, 160.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
