package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorBoldIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.49f, 119.51f),
                    PathNode.CurveTo(186.74945f, 121.76162f, 188.01947f, 124.82018f, 188.01947f, 128.01f),
                    PathNode.CurveTo(188.01947f, 131.19981f, 186.74945f, 134.25838f, 184.49f, 136.51f),
                    PathNode.LineTo(112.49f, 208.51f),
                    PathNode.CurveTo(107.79558f, 213.20442f, 100.18442f, 213.20442f, 95.49f, 208.51f),
                    PathNode.CurveTo(90.79558f, 203.81558f, 90.79558f, 196.20442f, 95.49f, 191.51f),
                    PathNode.LineTo(147.0f, 140.0f),
                    PathNode.LineTo(32.0f, 140.0f),
                    PathNode.CurveTo(25.372583f, 140.0f, 20.0f, 134.62741f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 121.37258f, 25.372583f, 116.0f, 32.0f, 116.0f),
                    PathNode.LineTo(147.0f, 116.0f),
                    PathNode.LineTo(95.51f, 64.49f),
                    PathNode.CurveTo(90.81558f, 59.79558f, 90.81558f, 52.18442f, 95.51f, 47.49f),
                    PathNode.CurveTo(100.20442f, 42.79558f, 107.81558f, 42.79558f, 112.51f, 47.49f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.CurveTo(209.37259f, 28.0f, 204.0f, 33.37258f, 204.0f, 40.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 222.62741f, 209.37259f, 228.0f, 216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
