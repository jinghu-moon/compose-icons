package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorThinIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 117.79086f, 85.79086f, 116.0f, 88.0f, 116.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(108.0f, 96.0f),
                    PathNode.CurveTo(108.0f, 93.79086f, 109.79086f, 92.0f, 112.0f, 92.0f),
                    PathNode.CurveTo(114.20914f, 92.0f, 116.0f, 93.79086f, 116.0f, 96.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(136.0f, 116.0f),
                    PathNode.CurveTo(138.20914f, 116.0f, 140.0f, 117.79086f, 140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 122.20914f, 138.20914f, 124.0f, 136.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 146.20914f, 114.20914f, 148.0f, 112.0f, 148.0f),
                    PathNode.CurveTo(109.79086f, 148.0f, 108.0f, 146.20914f, 108.0f, 144.0f),
                    PathNode.LineTo(108.0f, 124.0f),
                    PathNode.LineTo(88.0f, 124.0f),
                    PathNode.CurveTo(85.79086f, 124.0f, 84.0f, 122.20914f, 84.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 120.0f),
                    PathNode.LineTo(252.0f, 184.0f),
                    PathNode.CurveTo(252.0f, 190.62741f, 246.62741f, 196.0f, 240.0f, 196.0f),
                    PathNode.LineTo(219.71f, 196.0f),
                    PathNode.CurveTo(217.71301f, 209.76724f, 205.91133f, 219.98056f, 192.0f, 219.98056f),
                    PathNode.CurveTo(178.08867f, 219.98056f, 166.28699f, 209.76724f, 164.29f, 196.0f),
                    PathNode.LineTo(107.71f, 196.0f),
                    PathNode.CurveTo(105.713005f, 209.76724f, 93.91133f, 219.98056f, 80.0f, 219.98056f),
                    PathNode.CurveTo(66.08867f, 219.98056f, 54.28699f, 209.76724f, 52.29f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 190.62741f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 72.0f),
                    PathNode.CurveTo(20.0f, 65.37258f, 25.372583f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(184.0f, 60.0f),
                    PathNode.CurveTo(186.20914f, 60.0f, 188.0f, 61.79086f, 188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(226.58f, 76.0f),
                    PathNode.CurveTo(231.48906f, 75.99607f, 235.90547f, 78.9826f, 237.73f, 83.54f),
                    PathNode.LineTo(251.73f, 118.54f),
                    PathNode.CurveTo(251.91032f, 119.005554f, 252.0019f, 119.50075f, 252.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 84.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.LineTo(242.09f, 116.0f),
                    PathNode.LineTo(230.3f, 86.51f),
                    PathNode.CurveTo(229.6903f, 84.99104f, 228.21675f, 83.99678f, 226.58f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 188.0f),
                    PathNode.LineTo(52.29f, 188.0f),
                    PathNode.CurveTo(54.28699f, 174.23276f, 66.08867f, 164.01944f, 80.0f, 164.01944f),
                    PathNode.CurveTo(93.91133f, 164.01944f, 105.713005f, 174.23276f, 107.71f, 188.0f),
                    PathNode.LineTo(164.29f, 188.0f),
                    PathNode.CurveTo(165.64043f, 178.72417f, 171.53499f, 170.73593f, 180.0f, 166.71f),
                    PathNode.LineTo(180.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(29.790861f, 68.0f, 28.0f, 69.79086f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 192.0f),
                    PathNode.CurveTo(100.0f, 180.9543f, 91.04569f, 172.0f, 80.0f, 172.0f),
                    PathNode.CurveTo(68.95431f, 172.0f, 60.0f, 180.9543f, 60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 203.0457f, 68.95431f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(91.04569f, 212.0f, 100.0f, 203.0457f, 100.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 180.9543f, 203.0457f, 172.0f, 192.0f, 172.0f),
                    PathNode.CurveTo(180.9543f, 172.0f, 172.0f, 180.9543f, 172.0f, 192.0f),
                    PathNode.CurveTo(172.0f, 203.0457f, 180.9543f, 212.0f, 192.0f, 212.0f),
                    PathNode.CurveTo(203.0457f, 212.0f, 212.0f, 203.0457f, 212.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 184.0f),
                    PathNode.LineTo(244.0f, 124.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(188.0f, 164.29f),
                    PathNode.CurveTo(203.3034f, 162.08247f, 217.49944f, 172.69704f, 219.71f, 188.0f),
                    PathNode.LineTo(240.0f, 188.0f),
                    PathNode.CurveTo(242.20914f, 188.0f, 244.0f, 186.20914f, 244.0f, 184.0f),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
