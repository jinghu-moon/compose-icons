package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorDuotoneIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 128.0f),
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
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 188.41827f, 236.41827f, 192.0f, 232.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 28.418278f, 136.0f, 24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(16.0f, 67.58172f, 19.581722f, 64.0f, 24.0f, 64.0f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 227.58173f, 120.0f, 232.0f, 120.0f),
                    PathNode.CurveTo(236.41827f, 120.0f, 240.0f, 123.58172f, 240.0f, 128.0f),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
