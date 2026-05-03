package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorFillIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 189.25484f, 221.25484f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(34.745167f, 200.0f, 24.0f, 189.25484f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 50.745167f, 34.745167f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(221.25484f, 40.0f, 232.0f, 50.745167f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(91.58172f, 216.0f, 88.0f, 219.58173f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 228.41827f, 91.58172f, 232.0f, 96.0f, 232.0f),
                    PathNode.LineTo(160.0f, 232.0f),
                    PathNode.CurveTo(164.41827f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 219.58173f, 164.41827f, 216.0f, 160.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _monitor!!
    }

private var _monitor: ImageVector? = null
