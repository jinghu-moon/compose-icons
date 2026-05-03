package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorRegularIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 76.0f),
                    PathNode.CurveTo(56.0f, 42.862915f, 82.862915f, 16.0f, 116.0f, 16.0f),
                    PathNode.CurveTo(149.13708f, 16.0f, 176.0f, 42.862915f, 176.0f, 76.0f),
                    PathNode.CurveTo(176.0f, 80.41828f, 172.41827f, 84.0f, 168.0f, 84.0f),
                    PathNode.CurveTo(163.58173f, 84.0f, 160.0f, 80.41828f, 160.0f, 76.0f),
                    PathNode.CurveTo(160.0f, 51.69947f, 140.30052f, 32.0f, 116.0f, 32.0f),
                    PathNode.CurveTo(91.69947f, 32.0f, 72.0f, 51.69947f, 72.0f, 76.0f),
                    PathNode.CurveTo(72.0f, 80.41828f, 68.41828f, 84.0f, 64.0f, 84.0f),
                    PathNode.CurveTo(59.581722f, 84.0f, 56.0f, 80.41828f, 56.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 120.0f),
                    PathNode.CurveTo(191.33324f, 119.994865f, 186.73973f, 121.16044f, 182.64f, 123.39f),
                    PathNode.CurveTo(180.16164f, 115.7206f, 174.49854f, 109.49116f, 167.09935f, 106.29519f),
                    PathNode.CurveTo(159.70018f, 103.09922f, 151.28265f, 103.246735f, 144.0f, 106.7f),
                    PathNode.LineTo(144.0f, 76.0f),
                    PathNode.CurveTo(144.0f, 60.53603f, 131.46397f, 48.0f, 116.0f, 48.0f),
                    PathNode.CurveTo(100.536026f, 48.0f, 88.0f, 60.53603f, 88.0f, 76.0f),
                    PathNode.LineTo(88.0f, 156.0f),
                    PathNode.LineTo(84.18f, 149.87f),
                    PathNode.CurveTo(76.40107f, 136.50195f, 59.258053f, 131.97107f, 45.89f, 139.75f),
                    PathNode.CurveTo(32.52195f, 147.52893f, 27.99107f, 164.67195f, 35.77f, 178.04f),
                    PathNode.LineTo(65.09f, 228.04f),
                    PathNode.CurveTo(66.4299f, 230.69353f, 69.13063f, 232.38531f, 72.10288f, 232.433f),
                    PathNode.CurveTo(75.07513f, 232.48068f, 77.828735f, 230.8764f, 79.253075f, 228.26723f),
                    PathNode.CurveTo(80.677414f, 225.65805f, 80.53759f, 222.47426f, 78.89f, 220.0f),
                    PathNode.LineTo(49.6f, 170.0f),
                    PathNode.CurveTo(47.361786f, 166.28241f, 47.30496f, 161.64607f, 49.45139f, 157.87477f),
                    PathNode.CurveTo(51.59782f, 154.10344f, 55.613075f, 151.78471f, 59.952354f, 151.81068f),
                    PathNode.CurveTo(64.29164f, 151.83665f, 68.278854f, 154.20326f, 70.38f, 158.0f),
                    PathNode.LineTo(70.52f, 158.23f),
                    PathNode.LineTo(89.2f, 188.23f),
                    PathNode.CurveTo(91.08451f, 191.27081f, 94.75878f, 192.69086f, 98.19847f, 191.70776f),
                    PathNode.CurveTo(101.63816f, 190.72466f, 104.00705f, 187.57742f, 104.0f, 184.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(104.0f, 69.37258f, 109.37258f, 64.0f, 116.0f, 64.0f),
                    PathNode.CurveTo(122.62742f, 64.0f, 128.0f, 69.37258f, 128.0f, 76.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(128.0f, 148.41827f, 131.58173f, 152.0f, 136.0f, 152.0f),
                    PathNode.CurveTo(140.41827f, 152.0f, 144.0f, 148.41827f, 144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 132.0f),
                    PathNode.CurveTo(144.0f, 125.37258f, 149.37259f, 120.0f, 156.0f, 120.0f),
                    PathNode.CurveTo(162.62741f, 120.0f, 168.0f, 125.37258f, 168.0f, 132.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 171.58173f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 156.41827f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 148.0f),
                    PathNode.CurveTo(184.0f, 141.37259f, 189.37259f, 136.0f, 196.0f, 136.0f),
                    PathNode.CurveTo(202.62741f, 136.0f, 208.0f, 141.37259f, 208.0f, 148.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 205.61f, 200.9f, 220.3f, 200.84f, 220.42f),
                    PathNode.CurveTo(198.86653f, 224.37166f, 200.46912f, 229.17496f, 204.42f, 231.15f),
                    PathNode.CurveTo(205.5298f, 231.71117f, 206.7564f, 232.0024f, 208.0f, 232.0f),
                    PathNode.CurveTo(211.03131f, 232.00217f, 213.80348f, 230.29086f, 215.16f, 227.58f),
                    PathNode.CurveTo(215.53f, 226.85f, 224.01f, 209.58f, 224.01f, 184.0f),
                    PathNode.LineTo(224.01f, 148.0f),
                    PathNode.CurveTo(224.01f, 140.5722f, 221.05864f, 133.44878f, 215.80545f, 128.19748f),
                    PathNode.CurveTo(210.55228f, 122.94617f, 203.4278f, 119.997345f, 196.0f, 120.0f),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
