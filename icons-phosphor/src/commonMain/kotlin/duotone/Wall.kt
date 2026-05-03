package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorDuotoneIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 204.41827f, 27.581722f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(228.41827f, 208.0f, 232.0f, 204.41827f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 51.581722f, 228.41827f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wall!!
    }

private var _wall: ImageVector? = null
