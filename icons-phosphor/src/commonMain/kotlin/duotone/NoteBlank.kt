package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) return _noteBlank!!
        _noteBlank = phosphorDuotoneIcon(
            name = "NoteBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(160.0f, 160.0f),
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
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(156.69f, 224.0f),
                    PathNode.CurveTo(160.93579f, 224.01357f, 165.00975f, 222.32419f, 168.0f, 219.31f),
                    PathNode.LineTo(219.31f, 168.0f),
                    PathNode.CurveTo(222.32419f, 165.00975f, 224.01357f, 160.93579f, 224.0f, 156.69f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 155.58173f, 152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.69f, 168.0f),
                    PathNode.LineTo(168.0f, 196.69f),
                    PathNode.LineTo(168.0f, 168.0f),
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
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
