package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorThinIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.83f, 61.17f),
                    PathNode.LineTo(194.83f, 13.17f),
                    PathNode.CurveTo(193.26703f, 11.607034f, 190.73297f, 11.607035f, 189.17f, 13.17f),
                    PathNode.CurveTo(187.60704f, 14.732965f, 187.60704f, 17.267035f, 189.17f, 18.83f),
                    PathNode.LineTo(210.34f, 40.0f),
                    PathNode.LineTo(133.66f, 116.69f),
                    PathNode.LineTo(96.49f, 79.51f),
                    PathNode.CurveTo(94.23838f, 77.25055f, 91.17982f, 75.98054f, 87.99f, 75.98054f),
                    PathNode.CurveTo(84.80018f, 75.98054f, 81.74162f, 77.25055f, 79.49f, 79.51f),
                    PathNode.LineTo(23.49f, 135.51f),
                    PathNode.CurveTo(21.240904f, 137.76128f, 19.984451f, 140.8178f, 20.0f, 144.0f),
                    PathNode.LineTo(20.0f, 224.0f),
                    PathNode.CurveTo(20.0f, 230.62741f, 25.372583f, 236.0f, 32.0f, 236.0f),
                    PathNode.LineTo(112.0f, 236.0f),
                    PathNode.CurveTo(115.183556f, 236.0025f, 118.23763f, 234.73987f, 120.49f, 232.49f),
                    PathNode.LineTo(176.49f, 176.49f),
                    PathNode.CurveTo(178.74945f, 174.23837f, 180.01947f, 171.17982f, 180.01947f, 167.99f),
                    PathNode.CurveTo(180.01947f, 164.80019f, 178.74945f, 161.74162f, 176.49f, 159.49f),
                    PathNode.LineTo(139.31f, 122.32f),
                    PathNode.LineTo(216.0f, 45.66f),
                    PathNode.LineTo(237.17f, 66.83f),
                    PathNode.CurveTo(238.73297f, 68.39297f, 241.26703f, 68.39297f, 242.83f, 66.83f),
                    PathNode.CurveTo(244.39296f, 65.26704f, 244.39296f, 62.732967f, 242.83f, 61.17f),
                    PathNode.Close,
                    PathNode.MoveTo(170.83f, 165.17f),
                    PathNode.CurveTo(171.58112f, 165.92027f, 172.00314f, 166.93837f, 172.00314f, 168.0f),
                    PathNode.CurveTo(172.00314f, 169.06163f, 171.58112f, 170.07973f, 170.83f, 170.83f),
                    PathNode.LineTo(114.83f, 226.83f),
                    PathNode.CurveTo(114.07921f, 227.57996f, 113.06119f, 228.00084f, 112.0f, 228.0f),
                    PathNode.LineTo(32.0f, 228.0f),
                    PathNode.CurveTo(29.790861f, 228.0f, 28.0f, 226.20914f, 28.0f, 224.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(27.999166f, 142.93881f, 28.420046f, 141.92079f, 29.17f, 141.17f),
                    PathNode.LineTo(85.17f, 85.17f),
                    PathNode.CurveTo(85.92027f, 84.418884f, 86.93836f, 83.99686f, 88.0f, 83.99686f),
                    PathNode.CurveTo(89.06164f, 83.99686f, 90.07973f, 84.418884f, 90.83f, 85.17f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(85.17f, 165.17f),
                    PathNode.CurveTo(83.60703f, 166.73297f, 83.60703f, 169.26703f, 85.17f, 170.83f),
                    PathNode.CurveTo(86.73296f, 172.39296f, 89.26704f, 172.39296f, 90.83f, 170.83f),
                    PathNode.LineTo(133.66f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
