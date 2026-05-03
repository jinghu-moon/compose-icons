package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorFillIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.07f, 186.76f),
                    PathNode.CurveTo(243.28496f, 163.49991f, 242.58287f, 136.25674f, 230.18472f, 113.605194f),
                    PathNode.CurveTo(217.78659f, 90.95364f, 195.21713f, 75.679405f, 169.58f, 72.59f),
                    PathNode.CurveTo(158.07767f, 46.066708f, 133.16023f, 27.812626f, 104.40319f, 24.84261f),
                    PathNode.CurveTo(75.64615f, 21.872593f, 47.523914f, 34.648754f, 30.843573f, 58.261353f),
                    PathNode.CurveTo(14.163231f, 81.87395f, 11.520135f, 112.64901f, 23.93f, 138.76f),
                    PathNode.LineTo(16.66f, 163.47f),
                    PathNode.CurveTo(15.004216f, 169.08914f, 16.551607f, 175.16391f, 20.69385f, 179.30617f),
                    PathNode.CurveTo(24.83609f, 183.4484f, 30.91086f, 184.99579f, 36.53f, 183.34f),
                    PathNode.LineTo(61.24f, 176.07f),
                    PathNode.CurveTo(69.16822f, 179.90712f, 77.682304f, 182.39139f, 86.43f, 183.42f),
                    PathNode.CurveTo(95.00997f, 203.52017f, 111.43965f, 219.2351f, 131.9013f, 226.9132f),
                    PathNode.CurveTo(152.36298f, 234.59128f, 175.07506f, 233.56398f, 194.76f, 224.07f),
                    PathNode.LineTo(219.47f, 231.34f),
                    PathNode.CurveTo(225.08914f, 232.99579f, 231.16391f, 231.4484f, 235.30617f, 227.30617f),
                    PathNode.CurveTo(239.4484f, 223.16391f, 240.99579f, 217.08914f, 239.34f, 211.47f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 152.0f),
                    PathNode.CurveTo(125.37258f, 152.0f, 120.0f, 146.62741f, 120.0f, 140.0f),
                    PathNode.CurveTo(120.0f, 133.37259f, 125.37258f, 128.0f, 132.0f, 128.0f),
                    PathNode.CurveTo(138.62741f, 128.0f, 144.0f, 133.37259f, 144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 146.62741f, 138.62741f, 152.0f, 132.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 152.0f),
                    PathNode.CurveTo(80.00554f, 156.79591f, 80.440605f, 161.58171f, 81.3f, 166.3f),
                    PathNode.CurveTo(75.903305f, 165.03497f, 70.69564f, 163.06824f, 65.81f, 160.45f),
                    PathNode.CurveTo(63.968857f, 159.46503f, 61.81558f, 159.23894f, 59.81f, 159.82f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(40.17f, 140.24f),
                    PathNode.CurveTo(40.75107f, 138.23442f, 40.524975f, 136.08115f, 39.54f, 134.24f),
                    PathNode.CurveTo(22.47164f, 103.27339f, 33.738396f, 64.33336f, 64.705f, 47.265f),
                    PathNode.CurveTo(95.67161f, 30.19664f, 134.61163f, 41.463394f, 151.68f, 72.43f),
                    PathNode.CurveTo(110.96577f, 76.74288f, 80.05326f, 111.05801f, 80.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 152.0f),
                    PathNode.CurveTo(181.37259f, 152.0f, 176.0f, 146.62741f, 176.0f, 140.0f),
                    PathNode.CurveTo(176.0f, 133.37259f, 181.37259f, 128.0f, 188.0f, 128.0f),
                    PathNode.CurveTo(194.62741f, 128.0f, 200.0f, 133.37259f, 200.0f, 140.0f),
                    PathNode.CurveTo(200.0f, 146.62741f, 194.62741f, 152.0f, 188.0f, 152.0f),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
