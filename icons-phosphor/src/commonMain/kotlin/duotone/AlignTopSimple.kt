package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorDuotoneIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 72.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.LineTo(88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(164.41827f, 64.0f, 168.0f, 67.58172f, 168.0f, 72.0f),
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
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 36.418278f, 204.41827f, 40.0f, 200.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 36.418278f, 48.0f, 32.0f),
                    PathNode.CurveTo(48.0f, 27.581722f, 51.581722f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(204.41827f, 24.0f, 208.0f, 27.581722f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 72.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(176.0f, 232.83656f, 168.83656f, 240.0f, 160.0f, 240.0f),
                    PathNode.LineTo(96.0f, 240.0f),
                    PathNode.CurveTo(87.163445f, 240.0f, 80.0f, 232.83656f, 80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 63.163445f, 87.163445f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(168.83656f, 56.0f, 176.0f, 63.163445f, 176.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
