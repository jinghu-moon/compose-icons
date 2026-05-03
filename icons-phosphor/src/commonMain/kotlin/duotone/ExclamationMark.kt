package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorDuotoneIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
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
                    PathNode.MoveTo(144.0f, 200.0f),
                    PathNode.CurveTo(144.0f, 208.83656f, 136.83656f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(119.163445f, 216.0f, 112.0f, 208.83656f, 112.0f, 200.0f),
                    PathNode.CurveTo(112.0f, 191.16344f, 119.163445f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(136.83656f, 184.0f, 144.0f, 191.16344f, 144.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(132.41827f, 160.0f, 136.0f, 156.41827f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 43.581722f, 132.41827f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(123.58172f, 40.0f, 120.0f, 43.581722f, 120.0f, 48.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 156.41827f, 123.58172f, 160.0f, 128.0f, 160.0f),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
