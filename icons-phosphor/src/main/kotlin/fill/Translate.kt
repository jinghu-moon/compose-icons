package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorFillIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 129.89f),
                    PathNode.LineTo(175.06f, 160.0f),
                    PathNode.LineTo(144.94f, 160.0f),
                    PathNode.LineTo(151.3f, 147.3f),
                    PathNode.LineTo(151.3f, 147.3f),
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
                    PathNode.MoveTo(207.16f, 188.42f),
                    PathNode.LineTo(167.16f, 108.42f),
                    PathNode.CurveTo(165.80669f, 105.70468f, 163.03387f, 103.988525f, 160.0f, 103.988525f),
                    PathNode.CurveTo(156.96613f, 103.988525f, 154.19331f, 105.70468f, 152.84f, 108.42f),
                    PathNode.LineTo(139.66f, 134.8f),
                    PathNode.CurveTo(131.18185f, 133.13947f, 123.141655f, 129.73404f, 116.05f, 124.8f),
                    PathNode.CurveTo(127.10333f, 112.28623f, 133.94247f, 96.613945f, 135.6f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(156.41827f, 80.0f, 160.0f, 76.41828f, 160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 67.58172f, 156.41827f, 64.0f, 152.0f, 64.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 51.581722f, 108.41828f, 48.0f, 104.0f, 48.0f),
                    PathNode.CurveTo(99.58172f, 48.0f, 96.0f, 51.581722f, 96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(51.581722f, 64.0f, 48.0f, 67.58172f, 48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 76.41828f, 51.581722f, 80.0f, 56.0f, 80.0f),
                    PathNode.LineTo(119.48f, 80.0f),
                    PathNode.CurveTo(117.89294f, 92.62271f, 112.56429f, 104.481544f, 104.18f, 114.05f),
                    PathNode.CurveTo(100.62803f, 109.903496f, 97.60489f, 105.331825f, 95.18f, 100.44f),
                    PathNode.CurveTo(93.1373f, 96.630875f, 88.43836f, 95.133064f, 84.568085f, 97.05739f),
                    PathNode.CurveTo(80.697815f, 98.98171f, 79.05588f, 103.632256f, 80.86f, 107.56f),
                    PathNode.CurveTo(83.9219f, 113.734344f, 87.75228f, 119.49672f, 92.26f, 124.71f),
                    PathNode.CurveTo(81.604645f, 132.07718f, 68.954216f, 136.01604f, 56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 148.41827f, 51.581722f, 152.0f, 56.0f, 152.0f),
                    PathNode.CurveTo(73.36735f, 152.01848f, 90.26371f, 146.35358f, 104.11f, 135.87f),
                    PathNode.CurveTo(112.48808f, 142.27377f, 122.07294f, 146.91995f, 132.29f, 149.53f),
                    PathNode.LineTo(112.84f, 188.42f),
                    PathNode.CurveTo(110.86282f, 192.37436f, 112.465645f, 197.18282f, 116.42f, 199.16f),
                    PathNode.CurveTo(120.37436f, 201.13718f, 125.18282f, 199.53436f, 127.16f, 195.58f),
                    PathNode.LineTo(136.94f, 176.0f),
                    PathNode.LineTo(183.06f, 176.0f),
                    PathNode.LineTo(192.84f, 195.58f),
                    PathNode.CurveTo(194.81718f, 199.53436f, 199.62564f, 201.13718f, 203.58f, 199.16f),
                    PathNode.CurveTo(207.53436f, 197.18282f, 209.13718f, 192.37436f, 207.16f, 188.42f),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
