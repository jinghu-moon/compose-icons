package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorFillIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 200.83656f, 216.83656f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(39.163445f, 208.0f, 32.0f, 200.83656f, 32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 143.16344f, 39.163445f, 136.0f, 48.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.CurveTo(216.83656f, 136.0f, 224.0f, 143.16344f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(39.163445f, 48.0f, 32.0f, 55.163445f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 112.836555f, 39.163445f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(216.83656f, 120.0f, 224.0f, 112.836555f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 55.163445f, 216.83656f, 48.0f, 208.0f, 48.0f),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
