package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorRegularIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.0f, 80.4f),
                    PathNode.LineTo(183.6f, 39.0f),
                    PathNode.CurveTo(174.22754f, 29.628168f, 159.03246f, 29.628168f, 149.66f, 39.0f),
                    PathNode.LineTo(31.0f, 157.66f),
                    PathNode.CurveTo(21.628168f, 167.03246f, 21.628168f, 182.22754f, 31.0f, 191.6f),
                    PathNode.LineTo(61.06f, 221.66f),
                    PathNode.CurveTo(62.566475f, 223.16483f, 64.6107f, 224.00699f, 66.74f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 211.58173f, 220.41827f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(131.3f, 208.0f),
                    PathNode.LineTo(225.0f, 114.34f),
                    PathNode.CurveTo(234.37183f, 104.967545f, 234.37183f, 89.77245f, 225.0f, 80.4f),
                    PathNode.Close,
                    PathNode.MoveTo(108.68f, 208.0f),
                    PathNode.LineTo(70.05f, 208.0f),
                    PathNode.LineTo(42.33f, 180.28f),
                    PathNode.CurveTo(39.20828f, 177.15623f, 39.20828f, 172.09377f, 42.33f, 168.97f),
                    PathNode.LineTo(96.0f, 115.31f),
                    PathNode.LineTo(148.69f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.68f, 103.0f),
                    PathNode.LineTo(160.0f, 156.69f),
                    PathNode.LineTo(107.31f, 104.0f),
                    PathNode.LineTo(161.0f, 50.34f),
                    PathNode.CurveTo(162.50055f, 48.837784f, 164.53671f, 47.993706f, 166.66f, 47.993706f),
                    PathNode.CurveTo(168.78328f, 47.993706f, 170.81946f, 48.837784f, 172.32f, 50.34f),
                    PathNode.LineTo(213.7f, 91.72f),
                    PathNode.CurveTo(216.82172f, 94.84377f, 216.82172f, 99.90623f, 213.7f, 103.03f),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
