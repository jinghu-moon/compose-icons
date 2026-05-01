package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorFillIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.58f, 145.23f),
                    PathNode.LineTo(175.58f, 156.71f),
                    PathNode.CurveTo(173.33165f, 167.94391f, 163.45667f, 176.0223f, 152.0f, 176.0f),
                    PathNode.CurveTo(112.25378f, 175.95592f, 80.04409f, 143.74623f, 80.0f, 104.0f),
                    PathNode.CurveTo(79.9968f, 92.558365f, 88.07086f, 82.70542f, 99.29f, 80.46f),
                    PathNode.LineTo(110.77f, 103.46f),
                    PathNode.LineTo(101.0f, 118.0f),
                    PathNode.CurveTo(99.517265f, 120.22416f, 99.24337f, 123.04191f, 100.27f, 125.51f),
                    PathNode.CurveTo(105.99385f, 139.11383f, 116.81617f, 149.93614f, 130.42f, 155.66f),
                    PathNode.CurveTo(132.89627f, 156.73251f, 135.74637f, 156.48434f, 138.0f, 155.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00797f, 164.52303f, 212.85693f, 198.37349f, 181.54701f, 217.17828f),
                    PathNode.CurveTo(150.23709f, 235.98308f, 111.35765f, 236.98582f, 79.12f, 219.82f),
                    PathNode.LineTo(45.07f, 231.17f),
                    PathNode.CurveTo(39.320145f, 233.08752f, 32.980404f, 231.59138f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(24.408623f, 223.0196f, 22.912483f, 216.67986f, 24.83f, 210.93f),
                    PathNode.LineTo(36.18f, 176.88f),
                    PathNode.CurveTo(15.858562f, 138.67328f, 21.319912f, 91.87539f, 49.892963f, 59.374695f),
                    PathNode.CurveTo(78.46601f, 26.873999f, 124.17886f, 15.463294f, 164.67383f, 30.723438f),
                    PathNode.CurveTo(205.1688f, 45.98358f, 231.98225f, 84.725136f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.CurveTo(192.00217f, 148.96869f, 190.29086f, 146.19652f, 187.58f, 144.84f),
                    PathNode.LineTo(155.58f, 128.84f),
                    PathNode.CurveTo(153.01614f, 127.56236f, 149.96483f, 127.75307f, 147.58f, 129.34f),
                    PathNode.LineTo(132.89f, 139.14f),
                    PathNode.CurveTo(126.14653f, 135.43289f, 120.597115f, 129.88347f, 116.89f, 123.14f),
                    PathNode.LineTo(126.69f, 108.45f),
                    PathNode.CurveTo(128.27693f, 106.06517f, 128.46764f, 103.01386f, 127.19f, 100.45f),
                    PathNode.LineTo(111.19f, 68.45f),
                    PathNode.CurveTo(109.83709f, 65.71778f, 107.04882f, 63.99208f, 104.0f, 64.0f),
                    PathNode.CurveTo(81.90861f, 64.0f, 64.0f, 81.90861f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.05511f, 152.57822f, 103.42178f, 191.94489f, 152.0f, 192.0f),
                    PathNode.CurveTo(174.09138f, 192.0f, 192.0f, 174.09138f, 192.0f, 152.0f),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
