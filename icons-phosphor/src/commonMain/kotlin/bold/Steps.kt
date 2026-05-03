package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorBoldIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 56.0f),
                    PathNode.CurveTo(252.0f, 62.62742f, 246.62741f, 68.0f, 240.0f, 68.0f),
                    PathNode.LineTo(196.0f, 68.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 110.62742f, 190.62741f, 116.0f, 184.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 158.62741f, 134.62741f, 164.0f, 128.0f, 164.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 206.62741f, 78.62742f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(9.372583f, 212.0f, 4.0f, 206.62741f, 4.0f, 200.0f),
                    PathNode.CurveTo(4.0f, 193.37259f, 9.372583f, 188.0f, 16.0f, 188.0f),
                    PathNode.LineTo(60.0f, 188.0f),
                    PathNode.LineTo(60.0f, 152.0f),
                    PathNode.CurveTo(60.0f, 145.37259f, 65.37258f, 140.0f, 72.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 97.37258f, 121.37258f, 92.0f, 128.0f, 92.0f),
                    PathNode.LineTo(172.0f, 92.0f),
                    PathNode.LineTo(172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 49.37258f, 177.37259f, 44.0f, 184.0f, 44.0f),
                    PathNode.LineTo(240.0f, 44.0f),
                    PathNode.CurveTo(246.62741f, 44.0f, 252.0f, 49.37258f, 252.0f, 56.0f),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
