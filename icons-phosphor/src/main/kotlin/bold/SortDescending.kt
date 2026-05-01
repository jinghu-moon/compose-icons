package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorBoldIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 121.37258f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(122.62742f, 116.0f, 128.0f, 121.37258f, 128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 134.62741f, 122.62742f, 140.0f, 116.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(41.37258f, 140.0f, 36.0f, 134.62741f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.CurveTo(106.62742f, 76.0f, 112.0f, 70.62742f, 112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 57.37258f, 106.62742f, 52.0f, 100.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 70.62742f, 41.37258f, 76.0f, 48.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(41.37258f, 180.0f, 36.0f, 185.37259f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.CurveTo(186.62741f, 204.0f, 192.0f, 198.62741f, 192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 185.37259f, 186.62741f, 180.0f, 180.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.49f, 79.51f),
                    PathNode.LineTo(192.49f, 39.51f),
                    PathNode.CurveTo(190.23837f, 37.250546f, 187.17982f, 35.980537f, 183.99f, 35.980537f),
                    PathNode.CurveTo(180.80019f, 35.980537f, 177.74162f, 37.250546f, 175.49f, 39.51f),
                    PathNode.LineTo(135.49f, 79.51f),
                    PathNode.CurveTo(130.79558f, 84.20442f, 130.79558f, 91.81558f, 135.49f, 96.51f),
                    PathNode.CurveTo(140.18442f, 101.20442f, 147.79558f, 101.20442f, 152.49f, 96.51f),
                    PathNode.LineTo(172.0f, 77.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 150.62741f, 177.37259f, 156.0f, 184.0f, 156.0f),
                    PathNode.CurveTo(190.62741f, 156.0f, 196.0f, 150.62741f, 196.0f, 144.0f),
                    PathNode.LineTo(196.0f, 77.0f),
                    PathNode.LineTo(215.51f, 96.52f),
                    PathNode.CurveTo(220.20442f, 101.21442f, 227.81558f, 101.21442f, 232.51f, 96.52f),
                    PathNode.CurveTo(237.20442f, 91.82558f, 237.20442f, 84.214424f, 232.51f, 79.52f),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
