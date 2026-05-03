package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorRegularIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(151.16344f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 216.83656f, 151.16344f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(188.41827f, 176.0f, 192.0f, 172.41827f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 163.58173f, 188.41827f, 160.0f, 184.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(188.41827f, 136.0f, 192.0f, 132.41827f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 123.58172f, 188.41827f, 120.0f, 184.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(188.41827f, 96.0f, 192.0f, 92.41828f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 83.58172f, 188.41827f, 80.0f, 184.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.66f, 26.34f),
                    PathNode.CurveTo(76.159454f, 24.837784f, 74.123276f, 23.993708f, 72.0f, 23.993708f),
                    PathNode.CurveTo(69.876724f, 23.993708f, 67.840546f, 24.837784f, 66.34f, 26.34f),
                    PathNode.LineTo(34.34f, 58.34f),
                    PathNode.CurveTo(32.84009f, 59.841576f, 31.998331f, 61.87763f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(104.836555f, 224.0f, 112.0f, 216.83656f, 112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.00167f, 61.87763f, 111.15991f, 59.841576f, 109.66f, 58.34f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 43.31f),
                    PathNode.LineTo(92.69f, 64.0f),
                    PathNode.LineTo(51.31f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 208.0f),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
