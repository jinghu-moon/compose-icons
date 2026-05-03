package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorRegularIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(88.836555f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 39.163445f, 88.836555f, 32.0f, 80.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(119.163445f, 32.0f, 112.0f, 39.163445f, 112.0f, 48.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 216.83656f, 119.163445f, 224.0f, 128.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.CurveTo(160.83656f, 224.0f, 168.0f, 216.83656f, 168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 39.163445f, 160.83656f, 32.0f, 152.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 208.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 132.41827f, 244.41827f, 136.0f, 240.0f, 136.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 156.41827f, 220.41827f, 160.0f, 216.0f, 160.0f),
                    PathNode.CurveTo(211.58173f, 160.0f, 208.0f, 156.41827f, 208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(187.58173f, 136.0f, 184.0f, 132.41827f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 123.58172f, 187.58173f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 99.58172f, 211.58173f, 96.0f, 216.0f, 96.0f),
                    PathNode.CurveTo(220.41827f, 96.0f, 224.0f, 99.58172f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 123.58172f, 248.0f, 128.0f),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
