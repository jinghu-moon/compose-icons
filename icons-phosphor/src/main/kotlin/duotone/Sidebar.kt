package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorDuotoneIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(40.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(60.418278f, 152.0f, 64.0f, 148.41827f, 64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 139.58173f, 60.418278f, 136.0f, 56.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(60.418278f, 120.0f, 64.0f, 116.41828f, 64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 107.58172f, 60.418278f, 104.0f, 56.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(60.418278f, 88.0f, 64.0f, 84.41828f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 60.418278f, 72.0f, 56.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
