package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorFillIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 204.41827f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.LineTo(8.0f, 208.0f),
                    PathNode.CurveTo(3.581722f, 208.0f, 0f, 204.41827f, 0f, 200.0f),
                    PathNode.CurveTo(0f, 195.58173f, 3.581722f, 192.0f, 8.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 147.58173f, 59.581722f, 144.0f, 64.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 99.58172f, 115.58172f, 96.0f, 120.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 51.581722f, 171.58173f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _steps!!
    }

private var _steps: ImageVector? = null
