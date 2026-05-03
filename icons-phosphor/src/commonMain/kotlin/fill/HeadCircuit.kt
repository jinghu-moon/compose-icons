package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorFillIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 76.41828f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 76.41828f, 120.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 136.0f),
                    PathNode.CurveTo(144.0f, 140.41827f, 147.58173f, 144.0f, 152.0f, 144.0f),
                    PathNode.CurveTo(156.41827f, 144.0f, 160.0f, 140.41827f, 160.0f, 136.0f),
                    PathNode.CurveTo(160.0f, 131.58173f, 156.41827f, 128.0f, 152.0f, 128.0f),
                    PathNode.CurveTo(147.58173f, 128.0f, 144.0f, 131.58173f, 144.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.5f, 171.47f),
                    PathNode.CurveTo(213.0043f, 154.25061f, 224.58998f, 128.65912f, 224.0f, 101.89f),
                    PathNode.QuadTo(224.0f, 100.79f, 223.91f, 99.7f),
                    PathNode.CurveTo(223.77782f, 97.58905f, 222.02509f, 95.94586f, 219.91f, 95.95f),
                    PathNode.LineTo(195.75f, 95.95f),
                    PathNode.LineTo(172.62f, 123.7f),
                    PathNode.CurveTo(178.58488f, 133.75287f, 176.43954f, 146.64099f, 167.53976f, 154.21951f),
                    PathNode.CurveTo(158.63998f, 161.79802f, 145.57468f, 161.86235f, 136.6007f, 154.37186f),
                    PathNode.CurveTo(127.62672f, 146.88136f, 125.35455f, 134.01498f, 131.22015f, 123.90386f),
                    PathNode.CurveTo(137.08574f, 113.79275f, 149.38281f, 109.37817f, 160.34f, 113.45f),
                    PathNode.LineTo(185.85f, 82.83f),
                    PathNode.CurveTo(187.38017f, 81.02302f, 189.6322f, 79.98672f, 192.0f, 80.0f),
                    PathNode.LineTo(215.14f, 80.0f),
                    PathNode.CurveTo(216.44249f, 80.00153f, 217.66417f, 79.3688f, 218.41443f, 78.30409f),
                    PathNode.CurveTo(219.1647f, 77.239395f, 219.3496f, 75.876076f, 218.91f, 74.65f),
                    PathNode.CurveTo(207.27f, 42.0f, 176.86f, 18.0f, 140.74f, 16.08f),
                    PathNode.LineTo(140.15f, 16.08f),
                    PathNode.CurveTo(139.06339f, 16.039223f, 138.007f, 16.44258f, 137.2241f, 17.19719f),
                    PathNode.CurveTo(136.4412f, 17.951801f, 135.99924f, 18.992626f, 136.0f, 20.08f),
                    PathNode.LineTo(136.0f, 49.33f),
                    PathNode.CurveTo(147.02037f, 53.22629f, 153.63098f, 64.49533f, 151.65436f, 76.01586f),
                    PathNode.CurveTo(149.67775f, 87.5364f, 139.68887f, 95.95742f, 128.0f, 95.95742f),
                    PathNode.CurveTo(116.31113f, 95.95742f, 106.32224f, 87.5364f, 104.345634f, 76.01586f),
                    PathNode.CurveTo(102.369026f, 64.49533f, 108.97963f, 53.22629f, 120.0f, 49.33f),
                    PathNode.LineTo(120.0f, 22.33f),
                    PathNode.CurveTo(120.00313f, 21.110916f, 119.45015f, 19.95695f, 118.49802f, 19.19563f),
                    PathNode.CurveTo(117.545876f, 18.43431f, 116.29853f, 18.148748f, 115.11f, 18.42f),
                    PathNode.CurveTo(76.427246f, 27.920141f, 48.91983f, 62.178375f, 48.0f, 102.0f),
                    PathNode.LineTo(25.55f, 145.14f),
                    PathNode.LineTo(25.33f, 145.59f),
                    PathNode.CurveTo(21.932049f, 153.38928f, 25.231577f, 162.48386f, 32.84f, 166.29f),
                    PathNode.LineTo(33.09f, 166.41f),
                    PathNode.LineTo(56.0f, 176.9f),
                    PathNode.LineTo(56.0f, 207.9f),
                    PathNode.CurveTo(56.0f, 216.73656f, 63.163445f, 223.9f, 72.0f, 223.9f),
                    PathNode.LineTo(112.0f, 223.9f),
                    PathNode.LineTo(112.0f, 231.9f),
                    PathNode.CurveTo(112.0f, 236.31828f, 115.58172f, 239.9f, 120.0f, 239.9f),
                    PathNode.LineTo(191.77f, 239.9f),
                    PathNode.CurveTo(193.18588f, 239.91335f, 194.58228f, 239.56941f, 195.83f, 238.9f),
                    PathNode.CurveTo(198.71121f, 237.32877f, 200.34058f, 234.15726f, 199.94f, 230.9f),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
