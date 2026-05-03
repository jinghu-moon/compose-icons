package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorDuotoneIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(64.0f, 64.0f),
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
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(107.58172f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 107.58172f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 68.41828f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 59.581722f, 220.41827f, 56.0f, 216.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(107.58172f, 56.0f, 104.0f, 59.581722f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 68.41828f, 107.58172f, 72.0f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.CurveTo(75.237656f, 144.00255f, 78.15764f, 142.05338f, 79.39698f, 139.06232f),
                    PathNode.CurveTo(80.63632f, 136.07126f, 79.95064f, 132.6281f, 77.66f, 130.34f),
                    PathNode.LineTo(43.31f, 96.0f),
                    PathNode.LineTo(77.66f, 61.66f),
                    PathNode.CurveTo(80.785934f, 58.53407f, 80.785934f, 53.46593f, 77.66f, 50.34f),
                    PathNode.CurveTo(74.534065f, 47.21407f, 69.465935f, 47.21407f, 66.34f, 50.34f),
                    PathNode.LineTo(26.34f, 90.34f),
                    PathNode.CurveTo(24.837784f, 91.840546f, 23.993708f, 93.876724f, 23.993708f, 96.0f),
                    PathNode.CurveTo(23.993708f, 98.123276f, 24.837784f, 100.159454f, 26.34f, 101.66f),
                    PathNode.LineTo(66.34f, 141.66f),
                    PathNode.CurveTo(67.841576f, 143.15993f, 69.87763f, 144.00166f, 72.0f, 144.0f),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
