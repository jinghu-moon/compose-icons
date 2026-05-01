package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorFillIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 160.83656f, 216.83656f, 168.0f, 208.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(39.163445f, 168.0f, 32.0f, 160.83656f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 119.163445f, 39.163445f, 112.0f, 48.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(216.83656f, 112.0f, 224.0f, 119.163445f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 88.836555f, 39.163445f, 96.0f, 48.0f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.CurveTo(216.83656f, 96.0f, 224.0f, 88.836555f, 224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 187.58173f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 187.58173f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(99.58172f, 208.0f, 96.0f, 211.58173f, 96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 220.41827f, 99.58172f, 224.0f, 104.0f, 224.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.CurveTo(156.41827f, 224.0f, 160.0f, 220.41827f, 160.0f, 216.0f),
                    PathNode.CurveTo(160.0f, 211.58173f, 156.41827f, 208.0f, 152.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
