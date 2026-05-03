package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorDuotoneIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 164.41827f, 228.41827f, 168.0f, 224.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(67.58172f, 168.0f, 64.0f, 164.41827f, 64.0f, 160.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(64.0f, 91.58172f, 67.58172f, 88.0f, 72.0f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(228.41827f, 88.0f, 232.0f, 91.58172f, 232.0f, 96.0f),
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
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 36.418278f, 208.0f, 32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 51.581722f, 27.581722f, 48.0f, 32.0f, 48.0f),
                    PathNode.CurveTo(36.418278f, 48.0f, 40.0f, 51.581722f, 40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 96.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.0f, 168.83656f, 232.83656f, 176.0f, 224.0f, 176.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.CurveTo(63.163445f, 176.0f, 56.0f, 168.83656f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 87.163445f, 63.163445f, 80.0f, 72.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(232.83656f, 80.0f, 240.0f, 87.163445f, 240.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
