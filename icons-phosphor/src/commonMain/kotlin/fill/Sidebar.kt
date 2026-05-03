package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorFillIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(43.581722f, 152.0f, 40.0f, 148.41827f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 139.58173f, 43.581722f, 136.0f, 48.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(68.41828f, 136.0f, 72.0f, 139.58173f, 72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 148.41827f, 68.41828f, 152.0f, 64.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 116.41828f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 107.58172f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(68.41828f, 104.0f, 72.0f, 107.58172f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 116.41828f, 68.41828f, 120.0f, 64.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 84.41828f, 40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 75.58172f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(68.41828f, 72.0f, 72.0f, 75.58172f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 84.41828f, 68.41828f, 88.0f, 64.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
