package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorDuotoneIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 208.83656f, 192.83656f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 47.163445f, 63.163445f, 40.0f, 72.0f, 40.0f),
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
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 44.418278f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(170.71f, 48.0f),
                    PathNode.CurveTo(159.10742f, 47.99684f, 149.16396f, 56.29429f, 147.09f, 67.71f),
                    PathNode.LineTo(137.59f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(188.41827f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 132.41827f, 188.41827f, 136.0f, 184.0f, 136.0f),
                    PathNode.LineTo(134.68f, 136.0f),
                    PathNode.LineTo(124.68f, 191.16f),
                    PathNode.CurveTo(121.21756f, 210.19089f, 104.63328f, 224.01743f, 85.29f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 211.58173f, 51.581722f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(85.29f, 208.0f),
                    PathNode.CurveTo(96.89258f, 208.00316f, 106.83604f, 199.70572f, 108.91f, 188.29f),
                    PathNode.LineTo(118.41f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(121.32f, 120.0f),
                    PathNode.LineTo(131.32f, 64.84f),
                    PathNode.CurveTo(134.78246f, 45.809124f, 151.36671f, 31.982574f, 170.71f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
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
        return _function!!
    }

private var _function: ImageVector? = null
