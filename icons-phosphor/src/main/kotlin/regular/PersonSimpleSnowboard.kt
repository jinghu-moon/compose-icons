package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorRegularIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(179.46397f, 80.0f, 192.0f, 67.463974f, 192.0f, 52.0f),
                    PathNode.CurveTo(192.0f, 36.53603f, 179.46397f, 24.0f, 164.0f, 24.0f),
                    PathNode.CurveTo(148.53603f, 24.0f, 136.0f, 36.53603f, 136.0f, 52.0f),
                    PathNode.CurveTo(136.0f, 67.463974f, 148.53603f, 80.0f, 164.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 40.0f),
                    PathNode.CurveTo(170.62741f, 40.0f, 176.0f, 45.37258f, 176.0f, 52.0f),
                    PathNode.CurveTo(176.0f, 58.62742f, 170.62741f, 64.0f, 164.0f, 64.0f),
                    PathNode.CurveTo(157.37259f, 64.0f, 152.0f, 58.62742f, 152.0f, 52.0f),
                    PathNode.CurveTo(152.0f, 45.37258f, 157.37259f, 40.0f, 164.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.25f, 112.32f),
                    PathNode.LineTo(82.25f, 72.32f),
                    PathNode.CurveTo(78.011215f, 71.07184f, 73.56316f, 73.496216f, 72.315f, 77.735f),
                    PathNode.CurveTo(71.06683f, 81.973785f, 73.49121f, 86.42184f, 77.73f, 87.67f),
                    PathNode.LineTo(118.58f, 99.67f),
                    PathNode.LineTo(85.07f, 150.0f),
                    PathNode.LineTo(40.34f, 137.0f),
                    PathNode.CurveTo(26.991278f, 133.09811f, 13.006891f, 140.75627f, 9.105f, 154.105f),
                    PathNode.CurveTo(5.203108f, 167.45374f, 12.861278f, 181.43811f, 26.21f, 185.34f),
                    PathNode.LineTo(183.65f, 231.0f),
                    PathNode.CurveTo(185.97168f, 231.66484f, 188.37502f, 232.00143f, 190.79f, 232.0f),
                    PathNode.CurveTo(203.34271f, 232.02249f, 213.9932f, 222.79256f, 215.75574f, 210.36417f),
                    PathNode.CurveTo(217.51826f, 197.93578f, 209.85402f, 186.10855f, 197.79f, 182.64f),
                    PathNode.LineTo(146.9f, 167.89f),
                    PathNode.LineTo(166.65f, 138.45f),
                    PathNode.CurveTo(168.07211f, 136.32921f, 168.3964f, 133.65697f, 167.52281f, 131.2576f),
                    PathNode.CurveTo(166.64923f, 128.85822f, 164.68275f, 127.020004f, 162.23f, 126.31f),
                    PathNode.LineTo(126.9f, 116.08f),
                    PathNode.LineTo(134.68f, 104.41f),
                    PathNode.LineTo(213.75f, 127.67f),
                    PathNode.CurveTo(217.96753f, 128.85397f, 222.35292f, 126.42582f, 223.58777f, 122.222916f),
                    PathNode.CurveTo(224.82265f, 118.02f, 222.44768f, 113.60557f, 218.26f, 112.32f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 206.81f),
                    PathNode.CurveTo(200.00403f, 209.68776f, 198.64215f, 212.39667f, 196.33f, 214.11f),
                    PathNode.CurveTo(193.98349f, 215.88655f, 190.93275f, 216.44325f, 188.11f, 215.61f),
                    PathNode.LineTo(30.67f, 170.0f),
                    PathNode.CurveTo(26.745699f, 168.86382f, 24.033377f, 165.28534f, 24.0f, 161.2f),
                    PathNode.CurveTo(23.992027f, 158.32364f, 25.350367f, 155.61438f, 27.66f, 153.9f),
                    PathNode.CurveTo(30.00827f, 152.1187f, 33.06428f, 151.5617f, 35.89f, 152.4f),
                    PathNode.LineTo(193.33f, 198.0f),
                    PathNode.CurveTo(197.2598f, 199.13437f, 199.97433f, 202.71983f, 200.0f, 206.81f),
                    PathNode.Close,
                    PathNode.MoveTo(147.25f, 138.63f),
                    PathNode.LineTo(130.76f, 163.22f),
                    PathNode.LineTo(101.18f, 154.64f),
                    PathNode.LineTo(117.58f, 130.04f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
