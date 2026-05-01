package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorFillIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.93f, 124.52f),
                    PathNode.CurveTo(246.11f, 77.54f, 207.07f, 40.0f, 160.06f, 40.0f),
                    PathNode.CurveTo(126.70742f, 40.00522f, 96.21726f, 58.844322f, 81.29f, 88.67f),
                    PathNode.LineTo(81.29f, 88.67f),
                    PathNode.CurveTo(75.20699f, 100.79369f, 72.02657f, 114.16585f, 72.0f, 127.73f),
                    PathNode.CurveTo(72.065f, 132.00471f, 68.827255f, 135.6085f, 64.57f, 136.0f),
                    PathNode.CurveTo(62.35136f, 136.1585f, 60.166897f, 135.38614f, 58.540943f, 133.86832f),
                    PathNode.CurveTo(56.914986f, 132.35051f, 55.994347f, 130.22429f, 56.0f, 128.0f),
                    PathNode.CurveTo(55.99155f, 116.81038f, 57.794884f, 105.6932f, 61.34f, 95.08f),
                    PathNode.CurveTo(61.815807f, 93.69374f, 61.495354f, 92.158264f, 60.50479f, 91.078026f),
                    PathNode.CurveTo(59.514233f, 89.997795f, 58.012203f, 89.54581f, 56.59f, 89.9f),
                    PathNode.CurveTo(28.069357f, 97.00864f, 8.040111f, 122.606834f, 8.0f, 152.0f),
                    PathNode.CurveTo(8.0f, 187.19f, 37.75f, 216.0f, 73.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(183.93454f, 215.97426f, 206.82822f, 206.2104f, 223.41438f, 188.95462f),
                    PathNode.CurveTo(240.00053f, 171.69884f, 248.85109f, 148.43681f, 247.93f, 124.52f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 154.34f),
                    PathNode.CurveTo(192.78593f, 157.46593f, 192.78593f, 162.53407f, 189.66f, 165.66f),
                    PathNode.CurveTo(186.53407f, 168.78593f, 181.46593f, 168.78593f, 178.34f, 165.66f),
                    PathNode.LineTo(160.0f, 147.31f),
                    PathNode.LineTo(141.66f, 165.66f),
                    PathNode.CurveTo(138.53407f, 168.78593f, 133.46593f, 168.78593f, 130.34f, 165.66f),
                    PathNode.CurveTo(127.214066f, 162.53407f, 127.214066f, 157.46593f, 130.34f, 154.34f),
                    PathNode.LineTo(148.69f, 136.0f),
                    PathNode.LineTo(130.34f, 117.66f),
                    PathNode.CurveTo(127.214066f, 114.534065f, 127.214066f, 109.465935f, 130.34f, 106.34f),
                    PathNode.CurveTo(133.46593f, 103.214066f, 138.53407f, 103.214066f, 141.66f, 106.34f),
                    PathNode.LineTo(160.0f, 124.69f),
                    PathNode.LineTo(178.34f, 106.34f),
                    PathNode.CurveTo(181.46593f, 103.214066f, 186.53407f, 103.214066f, 189.66f, 106.34f),
                    PathNode.CurveTo(192.78593f, 109.465935f, 192.78593f, 114.534065f, 189.66f, 117.66f),
                    PathNode.LineTo(171.31f, 136.0f),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
