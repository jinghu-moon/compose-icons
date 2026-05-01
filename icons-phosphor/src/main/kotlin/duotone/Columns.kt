package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorDuotoneIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 48.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 212.41827f, 108.41828f, 216.0f, 104.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(59.581722f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(56.0f, 43.581722f, 59.581722f, 40.0f, 64.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(108.41828f, 40.0f, 112.0f, 43.581722f, 112.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(147.58173f, 40.0f, 144.0f, 43.581722f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 212.41827f, 147.58173f, 216.0f, 152.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(196.41827f, 216.0f, 200.0f, 212.41827f, 200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 43.581722f, 196.41827f, 40.0f, 192.0f, 40.0f),
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
                    PathNode.MoveTo(104.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(55.163445f, 32.0f, 48.0f, 39.163445f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(112.836555f, 224.0f, 120.0f, 216.83656f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 39.163445f, 112.836555f, 32.0f, 104.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(143.16344f, 32.0f, 136.0f, 39.163445f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 216.83656f, 143.16344f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(200.83656f, 224.0f, 208.0f, 216.83656f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 39.163445f, 200.83656f, 32.0f, 192.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
