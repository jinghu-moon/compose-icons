package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorDuotoneIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 156.41827f, 212.41827f, 160.0f, 208.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(43.581722f, 160.0f, 40.0f, 156.41827f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(43.581722f, 48.0f, 40.0f, 51.581722f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 84.41828f, 43.581722f, 88.0f, 48.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(212.41827f, 88.0f, 216.0f, 84.41828f, 216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 51.581722f, 212.41827f, 48.0f, 208.0f, 48.0f),
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
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(39.163445f, 112.0f, 32.0f, 119.163445f, 32.0f, 128.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 160.83656f, 39.163445f, 168.0f, 48.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(216.83656f, 168.0f, 224.0f, 160.83656f, 224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 119.163445f, 216.83656f, 112.0f, 208.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.LineTo(208.0f, 152.0f),
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
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 216.0f),
                    PathNode.CurveTo(160.0f, 220.41827f, 156.41827f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(99.58172f, 224.0f, 96.0f, 220.41827f, 96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 211.58173f, 99.58172f, 208.0f, 104.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 187.58173f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(132.41827f, 184.0f, 136.0f, 187.58173f, 136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(156.41827f, 208.0f, 160.0f, 211.58173f, 160.0f, 216.0f),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
