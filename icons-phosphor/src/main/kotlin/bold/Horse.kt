package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorBoldIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 112.836555f, 136.83656f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(119.163445f, 120.0f, 112.0f, 112.836555f, 112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 95.163445f, 119.163445f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(136.83656f, 88.0f, 144.0f, 95.163445f, 144.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 129.53f),
                    PathNode.CurveTo(235.03242f, 187.67464f, 188.31763f, 234.67639f, 130.18f, 236.0f),
                    PathNode.LineTo(127.93f, 236.0f),
                    PathNode.CurveTo(101.434875f, 236.16934f, 75.8138f, 226.53072f, 56.0f, 208.94f),
                    PathNode.CurveTo(52.690083f, 206.11266f, 51.17088f, 201.71454f, 52.030106f, 197.44708f),
                    PathNode.CurveTo(52.88933f, 193.17963f, 55.99223f, 189.71214f, 60.138416f, 188.38605f),
                    PathNode.CurveTo(64.28461f, 187.05995f, 68.82381f, 188.08322f, 72.0f, 191.06f),
                    PathNode.CurveTo(76.92362f, 195.45612f, 82.36355f, 199.2372f, 88.2f, 202.32f),
                    PathNode.LineTo(109.74f, 172.7f),
                    PathNode.CurveTo(89.34f, 165.7f, 67.83f, 169.37f, 55.31f, 171.49f),
                    PathNode.CurveTo(41.7636f, 173.85097f, 28.06236f, 168.24219f, 20.06f, 157.06f),
                    PathNode.CurveTo(19.9f, 156.85f, 19.75f, 156.63f, 19.61f, 156.41f),
                    PathNode.LineTo(5.83f, 134.41f),
                    PathNode.CurveTo(2.362247f, 128.87213f, 3.962496f, 121.57766f, 9.43f, 118.0f),
                    PathNode.LineTo(108.0f, 53.51f),
                    PathNode.LineTo(108.0f, 32.0f),
                    PathNode.CurveTo(108.0f, 25.372583f, 113.37258f, 20.0f, 120.0f, 20.0f),
                    PathNode.LineTo(128.0f, 20.0f),
                    PathNode.CurveTo(156.91045f, 19.997099f, 184.61513f, 31.585423f, 204.9136f, 52.171474f),
                    PathNode.CurveTo(225.2121f, 72.75753f, 236.40956f, 100.62245f, 236.0f, 129.53f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 129.2f),
                    PathNode.CurveTo(212.64987f, 83.8978f, 177.25569f, 46.24281f, 132.0f, 44.09f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.CurveTo(131.98598f, 64.03416f, 129.94585f, 67.79131f, 126.57f, 70.0f),
                    PathNode.LineTo(32.41f, 131.61f),
                    PathNode.LineTo(39.72f, 143.29f),
                    PathNode.CurveTo(42.43328f, 146.84181f, 46.89572f, 148.59134f, 51.3f, 147.83f),
                    PathNode.CurveTo(67.53f, 145.08f, 100.7f, 139.47f, 130.94f, 155.83f),
                    PathNode.CurveTo(149.6007f, 154.30095f, 163.97412f, 138.7232f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 113.37258f, 169.37259f, 108.0f, 176.0f, 108.0f),
                    PathNode.CurveTo(182.62741f, 108.0f, 188.0f, 113.37258f, 188.0f, 120.0f),
                    PathNode.CurveTo(187.95773f, 150.65858f, 164.84148f, 176.36917f, 134.36f, 179.66f),
                    PathNode.LineTo(111.91f, 210.53f),
                    PathNode.CurveTo(117.778404f, 211.61867f, 123.74276f, 212.10454f, 129.71f, 211.98f),
                    PathNode.CurveTo(174.89867f, 210.91454f, 211.2028f, 174.3942f, 212.0f, 129.2f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
