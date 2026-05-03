package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorFillIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(86.51f, 64.0f),
                    PathNode.LineTo(194.3f, 31.67f),
                    PathNode.CurveTo(198.53326f, 30.399746f, 200.93526f, 25.938263f, 199.665f, 21.705f),
                    PathNode.CurveTo(198.39474f, 17.471737f, 193.93326f, 15.069745f, 189.7f, 16.34f),
                    PathNode.LineTo(29.7f, 64.34f),
                    PathNode.LineTo(29.7f, 64.34f),
                    PathNode.CurveTo(26.317535f, 65.35532f, 24.000992f, 68.46844f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 71.163445f, 224.83656f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 176.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(59.581722f, 176.0f, 56.0f, 172.41827f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(108.41828f, 160.0f, 112.0f, 163.58173f, 112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 172.41827f, 108.41828f, 176.0f, 104.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 140.41827f, 56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 131.58173f, 59.581722f, 128.0f, 64.0f, 128.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(108.41828f, 128.0f, 112.0f, 131.58173f, 112.0f, 136.0f),
                    PathNode.CurveTo(112.0f, 140.41827f, 108.41828f, 144.0f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 112.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.CurveTo(59.581722f, 112.0f, 56.0f, 108.41828f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 99.58172f, 59.581722f, 96.0f, 64.0f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(108.41828f, 96.0f, 112.0f, 99.58172f, 112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 108.41828f, 108.41828f, 112.0f, 104.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.CurveTo(150.32689f, 168.0f, 136.0f, 153.67311f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 118.32689f, 150.32689f, 104.0f, 168.0f, 104.0f),
                    PathNode.CurveTo(185.67311f, 104.0f, 200.0f, 118.32689f, 200.0f, 136.0f),
                    PathNode.CurveTo(200.0f, 153.67311f, 185.67311f, 168.0f, 168.0f, 168.0f),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
