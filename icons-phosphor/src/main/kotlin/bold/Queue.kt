package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorBoldIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 70.62742f, 28.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.CurveTo(138.62741f, 140.0f, 144.0f, 134.62741f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 121.37258f, 138.62741f, 116.0f, 132.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.CurveTo(138.62741f, 204.0f, 144.0f, 198.62741f, 144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 185.37259f, 138.62741f, 180.0f, 132.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 160.0f),
                    PathNode.CurveTo(252.00139f, 164.1389f, 249.86978f, 167.98637f, 246.36f, 170.18f),
                    PathNode.LineTo(182.36f, 210.18f),
                    PathNode.CurveTo(178.66016f, 212.4924f, 173.99675f, 212.61447f, 170.18102f, 210.49876f),
                    PathNode.CurveTo(166.36528f, 208.38307f, 163.99854f, 204.36302f, 164.0f, 200.0f),
                    PathNode.LineTo(164.0f, 120.0f),
                    PathNode.CurveTo(163.99854f, 115.63697f, 166.36528f, 111.61693f, 170.18102f, 109.50123f),
                    PathNode.CurveTo(173.99675f, 107.38554f, 178.66016f, 107.5076f, 182.36f, 109.82f),
                    PathNode.LineTo(246.36f, 149.82f),
                    PathNode.CurveTo(249.86978f, 152.01363f, 252.00139f, 155.8611f, 252.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.36f, 160.0f),
                    PathNode.LineTo(188.0f, 141.65f),
                    PathNode.LineTo(188.0f, 178.35f),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
