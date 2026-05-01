package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorBoldIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 184.49f),
                    PathNode.LineTo(184.49f, 216.49f),
                    PathNode.CurveTo(179.79558f, 221.18442f, 172.18442f, 221.18442f, 167.49f, 216.49f),
                    PathNode.CurveTo(162.79558f, 211.79558f, 162.79558f, 204.18442f, 167.49f, 199.49f),
                    PathNode.LineTo(179.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(41.37258f, 188.0f, 36.0f, 182.62741f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 169.37259f, 41.37258f, 164.0f, 48.0f, 164.0f),
                    PathNode.LineTo(179.0f, 164.0f),
                    PathNode.LineTo(167.48f, 152.49f),
                    PathNode.CurveTo(162.78558f, 147.79558f, 162.78558f, 140.18442f, 167.48f, 135.49f),
                    PathNode.CurveTo(172.17442f, 130.79558f, 179.78558f, 130.79558f, 184.48f, 135.49f),
                    PathNode.LineTo(216.48f, 167.49f),
                    PathNode.CurveTo(218.74078f, 169.7403f, 220.01259f, 172.79811f, 220.01447f, 175.98793f),
                    PathNode.CurveTo(220.01634f, 179.17773f, 218.74812f, 182.23705f, 216.49f, 184.49f),
                    PathNode.Close,
                    PathNode.MoveTo(71.49f, 120.49f),
                    PathNode.CurveTo(76.18442f, 125.18442f, 83.79558f, 125.18442f, 88.49f, 120.49f),
                    PathNode.CurveTo(93.18442f, 115.79558f, 93.18442f, 108.18442f, 88.49f, 103.49f),
                    PathNode.LineTo(77.0f, 92.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.CurveTo(214.62741f, 92.0f, 220.0f, 86.62742f, 220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 73.37258f, 214.62741f, 68.0f, 208.0f, 68.0f),
                    PathNode.LineTo(77.0f, 68.0f),
                    PathNode.LineTo(88.49f, 56.49f),
                    PathNode.CurveTo(93.18442f, 51.79558f, 93.18442f, 44.18442f, 88.49f, 39.49f),
                    PathNode.CurveTo(83.79558f, 34.79558f, 76.18442f, 34.79558f, 71.49f, 39.49f),
                    PathNode.LineTo(39.49f, 71.49f),
                    PathNode.CurveTo(37.230545f, 73.74162f, 35.960537f, 76.80018f, 35.960537f, 79.99f),
                    PathNode.CurveTo(35.960537f, 83.17982f, 37.230545f, 86.23838f, 39.49f, 88.49f),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
