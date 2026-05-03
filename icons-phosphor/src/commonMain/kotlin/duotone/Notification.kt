package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorDuotoneIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.CurveTo(224.0f, 75.463974f, 211.46397f, 88.0f, 196.0f, 88.0f),
                    PathNode.CurveTo(180.53603f, 88.0f, 168.0f, 75.463974f, 168.0f, 60.0f),
                    PathNode.CurveTo(168.0f, 44.53603f, 180.53603f, 32.0f, 196.0f, 32.0f),
                    PathNode.CurveTo(211.46397f, 32.0f, 224.0f, 44.53603f, 224.0f, 60.0f),
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
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 216.83656f, 208.83656f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 47.163445f, 39.163445f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.CurveTo(132.41827f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 52.418278f, 132.41827f, 56.0f, 128.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 203.58173f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 60.0f),
                    PathNode.CurveTo(232.0f, 79.88225f, 215.88223f, 96.0f, 196.0f, 96.0f),
                    PathNode.CurveTo(176.11777f, 96.0f, 160.0f, 79.88225f, 160.0f, 60.0f),
                    PathNode.CurveTo(160.0f, 40.11775f, 176.11777f, 24.0f, 196.0f, 24.0f),
                    PathNode.CurveTo(215.88223f, 24.0f, 232.0f, 40.11775f, 232.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.CurveTo(216.0f, 48.954304f, 207.0457f, 40.0f, 196.0f, 40.0f),
                    PathNode.CurveTo(184.9543f, 40.0f, 176.0f, 48.954304f, 176.0f, 60.0f),
                    PathNode.CurveTo(176.0f, 71.04569f, 184.9543f, 80.0f, 196.0f, 80.0f),
                    PathNode.CurveTo(207.0457f, 80.0f, 216.0f, 71.04569f, 216.0f, 60.0f),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
