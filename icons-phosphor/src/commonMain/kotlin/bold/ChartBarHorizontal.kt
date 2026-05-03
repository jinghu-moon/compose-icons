package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorBoldIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 92.0f),
                    PathNode.LineTo(188.0f, 92.0f),
                    PathNode.LineTo(188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 49.37258f, 182.62741f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 33.37258f, 54.62742f, 28.0f, 48.0f, 28.0f),
                    PathNode.CurveTo(41.37258f, 28.0f, 36.0f, 33.37258f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 222.62741f, 41.37258f, 228.0f, 48.0f, 228.0f),
                    PathNode.CurveTo(54.62742f, 228.0f, 60.0f, 222.62741f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(144.0f, 212.0f),
                    PathNode.CurveTo(150.62741f, 212.0f, 156.0f, 206.62741f, 156.0f, 200.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(224.0f, 164.0f),
                    PathNode.CurveTo(230.62741f, 164.0f, 236.0f, 158.62741f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 97.37258f, 230.62741f, 92.0f, 224.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(60.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 188.0f),
                    PathNode.LineTo(60.0f, 188.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 140.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
