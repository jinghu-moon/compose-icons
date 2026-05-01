package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorFillIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.66f, 106.34f),
                    PathNode.CurveTo(252.15945f, 104.83778f, 250.12328f, 103.993706f, 248.0f, 103.993706f),
                    PathNode.CurveTo(245.87672f, 103.993706f, 243.84055f, 104.83778f, 242.34f, 106.34f),
                    PathNode.LineTo(192.0f, 156.69f),
                    PathNode.LineTo(107.31f, 72.0f),
                    PathNode.LineTo(157.66f, 21.66f),
                    PathNode.CurveTo(160.78593f, 18.53407f, 160.78593f, 13.465932f, 157.66f, 10.34f),
                    PathNode.CurveTo(154.53407f, 7.214069f, 149.46593f, 7.214069f, 146.34f, 10.34f),
                    PathNode.LineTo(96.0f, 60.69f),
                    PathNode.CurveTo(91.03076f, 65.660126f, 89.88672f, 73.29115f, 93.18f, 79.5f),
                    PathNode.LineTo(72.0f, 100.69f),
                    PathNode.CurveTo(65.75655f, 106.93754f, 65.75655f, 117.06246f, 72.0f, 123.31f),
                    PathNode.LineTo(76.69f, 128.0f),
                    PathNode.LineTo(18.34f, 186.34f),
                    PathNode.CurveTo(16.37774f, 188.30086f, 15.571364f, 191.1383f, 16.209118f, 193.83806f),
                    PathNode.CurveTo(16.846874f, 196.53783f, 18.837715f, 198.7145f, 21.47f, 199.59f),
                    PathNode.LineTo(93.47f, 223.59f),
                    PathNode.CurveTo(94.28531f, 223.86382f, 95.139946f, 224.00232f, 96.0f, 224.0f),
                    PathNode.CurveTo(98.12237f, 224.00166f, 100.158424f, 223.15993f, 101.66f, 221.66f),
                    PathNode.LineTo(136.0f, 187.31f),
                    PathNode.LineTo(140.69f, 192.0f),
                    PathNode.CurveTo(146.93755f, 198.24344f, 157.06245f, 198.24344f, 163.31f, 192.0f),
                    PathNode.LineTo(184.49f, 170.82f),
                    PathNode.CurveTo(190.70134f, 174.11829f, 198.33818f, 172.97397f, 203.31f, 168.0f),
                    PathNode.LineTo(253.66f, 117.66f),
                    PathNode.CurveTo(255.16223f, 116.159454f, 256.0063f, 114.123276f, 256.0063f, 112.0f),
                    PathNode.CurveTo(256.0063f, 109.876724f, 255.16223f, 107.840546f, 253.66f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 180.69f),
                    PathNode.LineTo(83.31f, 112.0f),
                    PathNode.LineTo(104.0f, 91.31f),
                    PathNode.LineTo(172.69f, 160.0f),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
