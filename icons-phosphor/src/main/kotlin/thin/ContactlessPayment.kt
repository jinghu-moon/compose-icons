package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorThinIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.54f, 102.13f),
                    PathNode.CurveTo(102.09f, 118.317f, 102.09f, 137.683f, 93.54f, 153.87f),
                    PathNode.CurveTo(92.84637f, 155.1816f, 91.48372f, 156.0015f, 90.0f, 156.0f),
                    PathNode.CurveTo(89.34885f, 155.99846f, 88.70756f, 155.84071f, 88.13f, 155.54f),
                    PathNode.CurveTo(87.19044f, 155.04474f, 86.48642f, 154.19614f, 86.17314f, 153.1813f),
                    PathNode.CurveTo(85.85987f, 152.16646f, 85.96307f, 151.06866f, 86.46f, 150.13f),
                    PathNode.CurveTo(93.88973f, 136.31207f, 93.88973f, 119.687935f, 86.46f, 105.87f),
                    PathNode.CurveTo(85.42723f, 103.91491f, 86.17491f, 101.492775f, 88.13f, 100.46f),
                    PathNode.CurveTo(90.08509f, 99.42723f, 92.507225f, 100.17491f, 93.54f, 102.13f),
                    PathNode.Close,
                    PathNode.MoveTo(144.12f, 68.47f),
                    PathNode.CurveTo(142.1707f, 69.50852f, 141.43205f, 71.930405f, 142.47f, 73.88f),
                    PathNode.CurveTo(160.56976f, 107.69003f, 160.56976f, 148.30997f, 142.47f, 182.12f),
                    PathNode.CurveTo(141.7688f, 183.38393f, 141.804f, 184.92783f, 142.5621f, 186.15846f),
                    PathNode.CurveTo(143.3202f, 187.38911f, 144.68326f, 188.11504f, 146.1275f, 188.05731f),
                    PathNode.CurveTo(147.57176f, 187.9996f, 148.87253f, 187.16722f, 149.53f, 185.88f),
                    PathNode.CurveTo(168.88487f, 149.72041f, 168.88487f, 106.27959f, 149.53f, 70.12f),
                    PathNode.CurveTo(148.49149f, 68.17071f, 146.0696f, 67.43205f, 144.12f, 68.47f),
                    PathNode.Close,
                    PathNode.MoveTo(116.12f, 84.47f),
                    PathNode.CurveTo(114.17071f, 85.50852f, 113.43205f, 87.930405f, 114.47f, 89.88f),
                    PathNode.CurveTo(127.17756f, 113.70478f, 127.17756f, 142.29523f, 114.47f, 166.12f),
                    PathNode.CurveTo(113.76879f, 167.38393f, 113.80401f, 168.92783f, 114.5621f, 170.15846f),
                    PathNode.CurveTo(115.320206f, 171.38911f, 116.68325f, 172.11504f, 118.1275f, 172.05731f),
                    PathNode.CurveTo(119.571754f, 171.9996f, 120.87253f, 171.16722f, 121.53f, 169.88f),
                    PathNode.CurveTo(135.4891f, 143.70477f, 135.4891f, 112.29522f, 121.53f, 86.12f),
                    PathNode.CurveTo(120.49148f, 84.17071f, 118.069595f, 83.43205f, 116.12f, 84.47f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 77.18981f, 178.8102f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(77.18981f, 36.0f, 36.0f, 77.18981f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 178.8102f, 77.18981f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(178.78735f, 219.94489f, 219.94489f, 178.78735f, 220.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
