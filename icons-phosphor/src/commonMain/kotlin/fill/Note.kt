package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorFillIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(156.69f, 224.0f),
                    PathNode.CurveTo(160.93446f, 224.00687f, 165.00595f, 222.31853f, 168.0f, 219.31f),
                    PathNode.LineTo(219.31f, 168.0f),
                    PathNode.CurveTo(222.31853f, 165.00595f, 224.00687f, 160.93446f, 224.0f, 156.69f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(164.41827f, 88.0f, 168.0f, 91.58172f, 168.0f, 96.0f),
                    PathNode.CurveTo(168.0f, 100.41828f, 164.41827f, 104.0f, 160.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(91.58172f, 104.0f, 88.0f, 100.41828f, 88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 91.58172f, 91.58172f, 88.0f, 96.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 164.41827f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 155.58173f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 155.58173f, 136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 164.41827f, 132.41827f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 123.58172f, 91.58172f, 120.0f, 96.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(164.41827f, 120.0f, 168.0f, 123.58172f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 164.41827f, 136.0f, 160.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 204.69f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(204.7f, 160.0f),
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
        return _note!!
    }

private var _note: ImageVector? = null
