package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorFillIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 216.83656f, 136.83656f, 224.0f, 128.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(95.163445f, 224.0f, 88.0f, 216.83656f, 88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(88.0f, 39.163445f, 95.163445f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(136.83656f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(167.16344f, 32.0f, 160.0f, 39.163445f, 160.0f, 48.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 216.83656f, 167.16344f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(208.83656f, 224.0f, 216.0f, 216.83656f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 99.58172f, 44.418278f, 96.0f, 40.0f, 96.0f),
                    PathNode.CurveTo(35.581722f, 96.0f, 32.0f, 99.58172f, 32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 156.41827f, 35.581722f, 160.0f, 40.0f, 160.0f),
                    PathNode.CurveTo(44.418278f, 160.0f, 48.0f, 156.41827f, 48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(68.41828f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 123.58172f, 68.41828f, 120.0f, 64.0f, 120.0f),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
