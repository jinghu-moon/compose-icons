package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorFillIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.66f, 169.66f),
                    PathNode.LineTo(185.66f, 177.66f),
                    PathNode.CurveTo(182.17711f, 181.16917f, 182.17711f, 186.83083f, 185.66f, 190.34f),
                    PathNode.LineTo(189.66f, 194.34f),
                    PathNode.CurveTo(192.78593f, 197.46593f, 192.78593f, 202.53407f, 189.66f, 205.66f),
                    PathNode.CurveTo(186.53407f, 208.78593f, 181.46593f, 208.78593f, 178.34f, 205.66f),
                    PathNode.LineTo(174.34f, 201.66f),
                    PathNode.CurveTo(164.60043f, 191.90096f, 164.60043f, 176.09904f, 174.34f, 166.34f),
                    PathNode.LineTo(182.34f, 158.34f),
                    PathNode.CurveTo(185.82289f, 154.83083f, 185.82289f, 149.16917f, 182.34f, 145.66f),
                    PathNode.CurveTo(178.83083f, 142.17711f, 173.16917f, 142.17711f, 169.66f, 145.66f),
                    PathNode.LineTo(121.66f, 193.66f),
                    PathNode.CurveTo(111.790955f, 202.6837f, 96.568344f, 202.3433f, 87.11252f, 192.88748f),
                    PathNode.CurveTo(77.65669f, 183.43164f, 77.3163f, 168.20905f, 86.34f, 158.34f),
                    PathNode.LineTo(158.34f, 86.34f),
                    PathNode.CurveTo(161.82289f, 82.83083f, 161.82289f, 77.16917f, 158.34f, 73.66f),
                    PathNode.CurveTo(154.83083f, 70.17711f, 149.16917f, 70.17711f, 145.66f, 73.66f),
                    PathNode.LineTo(97.66f, 121.66f),
                    PathNode.CurveTo(87.790955f, 130.6837f, 72.568344f, 130.3433f, 63.112522f, 120.88748f),
                    PathNode.CurveTo(53.656693f, 111.431656f, 53.3163f, 96.209045f, 62.34f, 86.34f),
                    PathNode.LineTo(90.34f, 58.34f),
                    PathNode.CurveTo(93.465935f, 55.21407f, 98.534065f, 55.21407f, 101.66f, 58.34f),
                    PathNode.CurveTo(104.785934f, 61.46593f, 104.785934f, 66.534065f, 101.66f, 69.66f),
                    PathNode.LineTo(73.66f, 97.66f),
                    PathNode.CurveTo(70.17711f, 101.16917f, 70.17711f, 106.83083f, 73.66f, 110.34f),
                    PathNode.CurveTo(77.16917f, 113.82289f, 82.83083f, 113.82289f, 86.34f, 110.34f),
                    PathNode.LineTo(134.34f, 62.34f),
                    PathNode.CurveTo(144.20905f, 53.3163f, 159.43164f, 53.656693f, 168.88748f, 63.112522f),
                    PathNode.CurveTo(178.3433f, 72.568344f, 178.6837f, 87.790955f, 169.66f, 97.66f),
                    PathNode.LineTo(97.66f, 169.66f),
                    PathNode.CurveTo(94.17711f, 173.16917f, 94.17711f, 178.83083f, 97.66f, 182.34f),
                    PathNode.CurveTo(101.16917f, 185.82289f, 106.83083f, 185.82289f, 110.34f, 182.34f),
                    PathNode.LineTo(158.34f, 134.34f),
                    PathNode.CurveTo(168.20905f, 125.3163f, 183.43164f, 125.65669f, 192.88748f, 135.11252f),
                    PathNode.CurveTo(202.3433f, 144.56836f, 202.6837f, 159.79095f, 193.66f, 169.66f),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
