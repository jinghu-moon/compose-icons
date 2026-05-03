package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorFillIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.CurveTo(141.25484f, 72.0f, 152.0f, 82.74516f, 152.0f, 96.0f),
                    PathNode.CurveTo(152.0f, 109.25484f, 141.25484f, 120.0f, 128.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 186.34f),
                    PathNode.LineTo(175.31f, 172.0f),
                    PathNode.LineTo(189.66f, 157.66f),
                    PathNode.CurveTo(192.78593f, 154.53407f, 192.78593f, 149.46593f, 189.66f, 146.34f),
                    PathNode.CurveTo(186.53407f, 143.21407f, 181.46593f, 143.21407f, 178.34f, 146.34f),
                    PathNode.LineTo(164.0f, 160.69f),
                    PathNode.LineTo(138.0f, 134.69f),
                    PathNode.CurveTo(157.42627f, 129.59276f, 170.06085f, 110.88067f, 167.52895f, 90.95703f),
                    PathNode.CurveTo(164.99702f, 71.033394f, 148.08372f, 56.076283f, 128.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(83.58172f, 56.0f, 80.0f, 59.581722f, 80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 180.41827f, 83.58172f, 184.0f, 88.0f, 184.0f),
                    PathNode.CurveTo(92.41828f, 184.0f, 96.0f, 180.41827f, 96.0f, 176.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(116.69f, 136.0f),
                    PathNode.LineTo(152.69f, 172.0f),
                    PathNode.LineTo(138.34f, 186.34f),
                    PathNode.CurveTo(135.21407f, 189.46593f, 135.21407f, 194.53407f, 138.34f, 197.66f),
                    PathNode.CurveTo(141.46593f, 200.78593f, 146.53407f, 200.78593f, 149.66f, 197.66f),
                    PathNode.LineTo(164.0f, 183.31f),
                    PathNode.LineTo(178.34f, 197.66f),
                    PathNode.CurveTo(181.46593f, 200.78593f, 186.53407f, 200.78593f, 189.66f, 197.66f),
                    PathNode.CurveTo(192.78593f, 194.53407f, 192.78593f, 189.46593f, 189.66f, 186.34f),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
