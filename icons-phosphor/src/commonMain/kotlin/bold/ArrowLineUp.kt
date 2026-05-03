package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorBoldIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 143.51f),
                    PathNode.CurveTo(213.18442f, 148.20442f, 213.18442f, 155.81558f, 208.49f, 160.51f),
                    PathNode.CurveTo(203.79558f, 165.20442f, 196.18442f, 165.20442f, 191.49f, 160.51f),
                    PathNode.LineTo(140.0f, 109.0f),
                    PathNode.LineTo(140.0f, 224.0f),
                    PathNode.CurveTo(140.0f, 230.62741f, 134.62741f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(121.37258f, 236.0f, 116.0f, 230.62741f, 116.0f, 224.0f),
                    PathNode.LineTo(116.0f, 109.0f),
                    PathNode.LineTo(64.49f, 160.49f),
                    PathNode.CurveTo(59.79558f, 165.18442f, 52.18442f, 165.18442f, 47.49f, 160.49f),
                    PathNode.CurveTo(42.79558f, 155.79558f, 42.79558f, 148.18442f, 47.49f, 143.49f),
                    PathNode.LineTo(119.49f, 71.49f),
                    PathNode.CurveTo(121.74162f, 69.230545f, 124.80018f, 67.96054f, 127.99f, 67.96054f),
                    PathNode.CurveTo(131.17982f, 67.96054f, 134.23837f, 69.230545f, 136.49f, 71.49f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.CurveTo(28.0f, 46.62742f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 46.62742f, 228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
