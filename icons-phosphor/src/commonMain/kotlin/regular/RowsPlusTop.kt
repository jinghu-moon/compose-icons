package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorRegularIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(39.163445f, 160.0f, 32.0f, 167.16344f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 208.83656f, 39.163445f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(216.83656f, 216.0f, 224.0f, 208.83656f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 167.16344f, 216.83656f, 160.0f, 208.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(39.163445f, 88.0f, 32.0f, 95.163445f, 32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 136.83656f, 39.163445f, 144.0f, 48.0f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(216.83656f, 144.0f, 224.0f, 136.83656f, 224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 95.163445f, 216.83656f, 88.0f, 208.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 35.581722f, 99.58172f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 11.581722f, 123.58172f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(132.41827f, 8.0f, 136.0f, 11.581722f, 136.0f, 16.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(156.41827f, 32.0f, 160.0f, 35.581722f, 160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 44.418278f, 156.41827f, 48.0f, 152.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 68.41828f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(123.58172f, 72.0f, 120.0f, 68.41828f, 120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(99.58172f, 48.0f, 96.0f, 44.418278f, 96.0f, 40.0f),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
