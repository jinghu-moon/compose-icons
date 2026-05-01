package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorDuotoneIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 96.0f),
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
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 96.836555f, 23.163445f, 104.0f, 32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(216.83656f, 208.0f, 224.0f, 200.83656f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(232.83656f, 104.0f, 240.0f, 96.836555f, 240.0f, 88.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 131.58173f, 99.58172f, 128.0f, 104.0f, 128.0f),
                    PathNode.LineTo(152.0f, 128.0f),
                    PathNode.CurveTo(156.41827f, 128.0f, 160.0f, 131.58173f, 160.0f, 136.0f),
                    PathNode.CurveTo(160.0f, 140.41827f, 156.41827f, 144.0f, 152.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 140.41827f, 96.0f, 136.0f),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
