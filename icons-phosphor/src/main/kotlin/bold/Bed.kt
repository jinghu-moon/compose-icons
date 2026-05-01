package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorBoldIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 68.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 30.627417f, 36.0f, 24.0f, 36.0f),
                    PathNode.CurveTo(17.372583f, 36.0f, 12.0f, 41.37258f, 12.0f, 48.0f),
                    PathNode.LineTo(12.0f, 208.0f),
                    PathNode.CurveTo(12.0f, 214.62741f, 17.372583f, 220.0f, 24.0f, 220.0f),
                    PathNode.CurveTo(30.627417f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 214.62741f, 237.37259f, 220.0f, 244.0f, 220.0f),
                    PathNode.CurveTo(250.62741f, 220.0f, 256.0f, 214.62741f, 256.0f, 208.0f),
                    PathNode.LineTo(256.0f, 112.0f),
                    PathNode.CurveTo(255.97244f, 87.71089f, 236.28911f, 68.02756f, 212.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 156.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.LineTo(36.0f, 92.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 156.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.CurveTo(223.0457f, 92.0f, 232.0f, 100.95431f, 232.0f, 112.0f),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
