package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorFillIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 60.418278f, 220.41827f, 64.0f, 216.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 216.83656f, 200.83656f, 224.0f, 192.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(55.163445f, 224.0f, 48.0f, 216.83656f, 48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(35.581722f, 64.0f, 32.0f, 60.418278f, 32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(172.41827f, 32.0f, 176.0f, 28.418278f, 176.0f, 24.0f),
                    PathNode.CurveTo(176.0f, 19.581722f, 172.41827f, 16.0f, 168.0f, 16.0f),
                    PathNode.LineTo(88.0f, 16.0f),
                    PathNode.CurveTo(83.58172f, 16.0f, 80.0f, 19.581722f, 80.0f, 24.0f),
                    PathNode.CurveTo(80.0f, 28.418278f, 83.58172f, 32.0f, 88.0f, 32.0f),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
