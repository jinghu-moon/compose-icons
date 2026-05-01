package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorDuotoneIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 75.58172f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 168.0f),
                    PathNode.CurveTo(142.32689f, 168.0f, 128.0f, 153.67311f, 128.0f, 136.0f),
                    PathNode.CurveTo(128.0f, 118.32689f, 142.32689f, 104.0f, 160.0f, 104.0f),
                    PathNode.CurveTo(177.67311f, 104.0f, 192.0f, 118.32689f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 153.67311f, 177.67311f, 168.0f, 160.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 172.41827f, 100.41828f, 176.0f, 96.0f, 176.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(59.581722f, 176.0f, 56.0f, 172.41827f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.CurveTo(100.41828f, 160.0f, 104.0f, 163.58173f, 104.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.CurveTo(59.581722f, 128.0f, 56.0f, 131.58173f, 56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 140.41827f, 59.581722f, 144.0f, 64.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(100.41828f, 144.0f, 104.0f, 140.41827f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 131.58173f, 100.41828f, 128.0f, 96.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 99.58172f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 108.41828f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(100.41828f, 112.0f, 104.0f, 108.41828f, 104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 99.58172f, 100.41828f, 96.0f, 96.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 200.83656f, 224.83656f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(31.163445f, 208.0f, 24.0f, 200.83656f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.000992f, 68.46844f, 26.317535f, 65.35532f, 29.7f, 64.34f),
                    PathNode.LineTo(189.7f, 16.34f),
                    PathNode.CurveTo(193.93326f, 15.069745f, 198.39474f, 17.471737f, 199.665f, 21.705f),
                    PathNode.CurveTo(200.93526f, 25.938263f, 198.53326f, 30.399746f, 194.3f, 31.67f),
                    PathNode.LineTo(86.51f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(224.83656f, 64.0f, 232.0f, 71.163445f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.CurveTo(200.0f, 158.09138f, 182.09138f, 176.0f, 160.0f, 176.0f),
                    PathNode.CurveTo(137.90862f, 176.0f, 120.0f, 158.09138f, 120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 113.90861f, 137.90862f, 96.0f, 160.0f, 96.0f),
                    PathNode.CurveTo(182.09138f, 96.0f, 200.0f, 113.90861f, 200.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 122.74516f, 173.25484f, 112.0f, 160.0f, 112.0f),
                    PathNode.CurveTo(146.74516f, 112.0f, 136.0f, 122.74516f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 149.25484f, 146.74516f, 160.0f, 160.0f, 160.0f),
                    PathNode.CurveTo(173.25484f, 160.0f, 184.0f, 149.25484f, 184.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _radio!!
    }

private var _radio: ImageVector? = null
