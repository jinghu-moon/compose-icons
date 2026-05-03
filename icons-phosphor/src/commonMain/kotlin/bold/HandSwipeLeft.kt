package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorBoldIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 56.0f),
                    PathNode.CurveTo(256.0f, 62.62742f, 250.62741f, 68.0f, 244.0f, 68.0f),
                    PathNode.LineTo(201.0f, 68.0f),
                    PathNode.LineTo(212.51f, 79.51f),
                    PathNode.CurveTo(217.20442f, 84.20442f, 217.20442f, 91.81558f, 212.51f, 96.51f),
                    PathNode.CurveTo(207.81558f, 101.20442f, 200.20442f, 101.20442f, 195.51f, 96.51f),
                    PathNode.LineTo(163.51f, 64.51f),
                    PathNode.CurveTo(161.25055f, 62.258377f, 159.98053f, 59.199818f, 159.98053f, 56.01f),
                    PathNode.CurveTo(159.98053f, 52.820183f, 161.25055f, 49.761623f, 163.51f, 47.51f),
                    PathNode.LineTo(195.51f, 15.51f),
                    PathNode.CurveTo(200.20442f, 10.815579f, 207.81558f, 10.815579f, 212.51f, 15.51f),
                    PathNode.CurveTo(217.20442f, 20.20442f, 217.20442f, 27.81558f, 212.51f, 32.51f),
                    PathNode.LineTo(201.0f, 44.0f),
                    PathNode.LineTo(244.0f, 44.0f),
                    PathNode.CurveTo(250.62741f, 44.0f, 256.0f, 49.37258f, 256.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 116.0f),
                    PathNode.CurveTo(184.1702f, 115.98688f, 180.36942f, 116.66438f, 176.78f, 118.0f),
                    PathNode.CurveTo(170.12585f, 104.30463f, 154.74313f, 97.19462f, 140.0f, 101.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 58.32689f, 125.67311f, 44.0f, 108.0f, 44.0f),
                    PathNode.CurveTo(90.32689f, 44.0f, 76.0f, 58.32689f, 76.0f, 76.0f),
                    PathNode.LineTo(76.0f, 142.83f),
                    PathNode.CurveTo(65.13078f, 130.47296f, 46.661137f, 128.37492f, 33.297253f, 137.97925f),
                    PathNode.CurveTo(19.933367f, 147.58357f, 16.033257f, 165.75824f, 24.28f, 180.0f),
                    PathNode.LineTo(24.4f, 180.2f),
                    PathNode.LineTo(49.71f, 222.2f),
                    PathNode.CurveTo(53.134167f, 227.87749f, 60.512512f, 229.70416f, 66.19f, 226.28f),
                    PathNode.CurveTo(71.867485f, 222.85583f, 73.69417f, 215.4775f, 70.27f, 209.8f),
                    PathNode.LineTo(45.0f, 167.92f),
                    PathNode.CurveTo(42.81295f, 164.0761f, 44.156097f, 159.18704f, 48.0f, 157.0f),
                    PathNode.CurveTo(51.843903f, 154.81296f, 56.732952f, 156.1561f, 58.92f, 160.0f),
                    PathNode.LineTo(59.13f, 160.34f),
                    PathNode.LineTo(77.81f, 190.34f),
                    PathNode.CurveTo(80.64006f, 194.89043f, 86.14414f, 197.01294f, 91.29665f, 195.54079f),
                    PathNode.CurveTo(96.449165f, 194.06865f, 100.001114f, 189.35869f, 100.0f, 184.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.CurveTo(100.0f, 71.58172f, 103.58172f, 68.0f, 108.0f, 68.0f),
                    PathNode.CurveTo(112.41828f, 68.0f, 116.0f, 71.58172f, 116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 150.62741f, 121.37258f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 150.62741f, 140.0f, 144.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 127.58172f, 143.58173f, 124.0f, 148.0f, 124.0f),
                    PathNode.CurveTo(152.41827f, 124.0f, 156.0f, 127.58172f, 156.0f, 132.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 158.62741f, 161.37259f, 164.0f, 168.0f, 164.0f),
                    PathNode.CurveTo(174.62741f, 164.0f, 180.0f, 158.62741f, 180.0f, 152.0f),
                    PathNode.LineTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 143.58173f, 183.58173f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(192.41827f, 140.0f, 196.0f, 143.58173f, 196.0f, 148.0f),
                    PathNode.LineTo(196.0f, 184.0f),
                    PathNode.CurveTo(196.0f, 195.08f, 194.72f, 205.67f, 192.58f, 212.32f),
                    PathNode.CurveTo(191.18062f, 216.42352f, 192.10355f, 220.96278f, 194.99425f, 224.19406f),
                    PathNode.CurveTo(197.88493f, 227.42532f, 202.29382f, 228.84605f, 206.52724f, 227.91046f),
                    PathNode.CurveTo(210.76067f, 226.97488f, 214.16023f, 223.8285f, 215.42f, 219.68f),
                    PathNode.CurveTo(218.42f, 210.52f, 220.0f, 197.85f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.CurveTo(220.0f, 130.32689f, 205.67311f, 116.0f, 188.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
