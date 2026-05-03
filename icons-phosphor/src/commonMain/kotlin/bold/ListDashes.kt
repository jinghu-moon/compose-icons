package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorBoldIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 64.0f),
                    PathNode.CurveTo(84.0f, 57.37258f, 89.37258f, 52.0f, 96.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(89.37258f, 76.0f, 84.0f, 70.62742f, 84.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(89.37258f, 116.0f, 84.0f, 121.37258f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 134.62741f, 89.37258f, 140.0f, 96.0f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 134.62741f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 121.37258f, 222.62741f, 116.0f, 216.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(96.0f, 180.0f),
                    PathNode.CurveTo(89.37258f, 180.0f, 84.0f, 185.37259f, 84.0f, 192.0f),
                    PathNode.CurveTo(84.0f, 198.62741f, 89.37258f, 204.0f, 96.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 185.37259f, 222.62741f, 180.0f, 216.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 70.62742f, 33.37258f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.CurveTo(62.62742f, 76.0f, 68.0f, 70.62742f, 68.0f, 64.0f),
                    PathNode.CurveTo(68.0f, 57.37258f, 62.62742f, 52.0f, 56.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(62.62742f, 140.0f, 68.0f, 134.62741f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 121.37258f, 62.62742f, 116.0f, 56.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(62.62742f, 204.0f, 68.0f, 198.62741f, 68.0f, 192.0f),
                    PathNode.CurveTo(68.0f, 185.37259f, 62.62742f, 180.0f, 56.0f, 180.0f),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
