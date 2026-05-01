package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorBoldIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(128.0f, 134.62741f, 122.62742f, 140.0f, 116.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(41.37258f, 140.0f, 36.0f, 134.62741f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 121.37258f, 41.37258f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(122.62742f, 116.0f, 128.0f, 121.37258f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.CurveTo(186.62741f, 76.0f, 192.0f, 70.62742f, 192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 57.37258f, 186.62741f, 52.0f, 180.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 70.62742f, 41.37258f, 76.0f, 48.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(41.37258f, 180.0f, 36.0f, 185.37259f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(100.0f, 204.0f),
                    PathNode.CurveTo(106.62742f, 204.0f, 112.0f, 198.62741f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 185.37259f, 106.62742f, 180.0f, 100.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.49f, 159.51f),
                    PathNode.CurveTo(230.23837f, 157.25055f, 227.17982f, 155.98053f, 223.99f, 155.98053f),
                    PathNode.CurveTo(220.80019f, 155.98053f, 217.74162f, 157.25055f, 215.49f, 159.51f),
                    PathNode.LineTo(196.0f, 179.0f),
                    PathNode.LineTo(196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 105.37258f, 190.62741f, 100.0f, 184.0f, 100.0f),
                    PathNode.CurveTo(177.37259f, 100.0f, 172.0f, 105.37258f, 172.0f, 112.0f),
                    PathNode.LineTo(172.0f, 179.0f),
                    PathNode.LineTo(152.49f, 159.48f),
                    PathNode.CurveTo(147.79558f, 154.78558f, 140.18442f, 154.78558f, 135.49f, 159.48f),
                    PathNode.CurveTo(130.79558f, 164.17442f, 130.79558f, 171.78558f, 135.49f, 176.48f),
                    PathNode.LineTo(175.49f, 216.48f),
                    PathNode.CurveTo(177.74162f, 218.73946f, 180.80019f, 220.00946f, 183.99f, 220.00946f),
                    PathNode.CurveTo(187.17982f, 220.00946f, 190.23837f, 218.73946f, 192.49f, 216.48f),
                    PathNode.LineTo(232.49f, 176.48f),
                    PathNode.CurveTo(237.17592f, 171.79378f, 237.17592f, 164.19623f, 232.49f, 159.51f),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
