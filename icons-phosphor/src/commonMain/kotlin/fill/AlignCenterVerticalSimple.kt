package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorFillIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 212.41827f, 136.0f, 208.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 216.83656f, 168.83656f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(87.163445f, 224.0f, 80.0f, 216.83656f, 80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 39.163445f, 87.163445f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(168.83656f, 32.0f, 176.0f, 39.163445f, 176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
