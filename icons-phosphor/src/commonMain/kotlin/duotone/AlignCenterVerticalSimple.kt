package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorDuotoneIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 164.41827f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(91.58172f, 216.0f, 88.0f, 212.41827f, 88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(88.0f, 43.581722f, 91.58172f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(164.41827f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
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
                    PathNode.MoveTo(208.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 39.163445f, 168.83656f, 32.0f, 160.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(87.163445f, 32.0f, 80.0f, 39.163445f, 80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 123.58172f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 132.41827f, 43.581722f, 136.0f, 48.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 216.83656f, 87.163445f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(168.83656f, 224.0f, 176.0f, 216.83656f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.CurveTo(212.41827f, 136.0f, 216.0f, 132.41827f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 123.58172f, 212.41827f, 120.0f, 208.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
