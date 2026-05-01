package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorFillIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.27f, 45.93f),
                    PathNode.CurveTo(144.81844f, 43.879528f, 146.15924f, 42.131058f, 147.99728f, 41.069508f),
                    PathNode.CurveTo(149.83531f, 40.007954f, 152.01985f, 39.72035f, 154.07f, 40.27f),
                    PathNode.CurveTo(184.26808f, 48.149033f, 207.85097f, 71.73192f, 215.73f, 101.93f),
                    PathNode.CurveTo(216.27965f, 103.98015f, 215.99205f, 106.16469f, 214.9305f, 108.00272f),
                    PathNode.CurveTo(213.86894f, 109.84074f, 212.12047f, 111.18156f, 210.07f, 111.73f),
                    PathNode.CurveTo(209.39426f, 111.9075f, 208.69867f, 111.99823f, 208.0f, 112.0f),
                    PathNode.CurveTo(204.37804f, 112.00111f, 201.20718f, 109.56862f, 200.27f, 106.07f),
                    PathNode.CurveTo(193.84706f, 81.41399f, 174.59473f, 62.15784f, 149.94f, 55.73f),
                    PathNode.CurveTo(147.88768f, 55.18372f, 146.13681f, 53.843792f, 145.07324f, 52.00552f),
                    PathNode.CurveTo(144.00966f, 50.167248f, 143.72069f, 47.98151f, 144.27f, 45.93f),
                    PathNode.Close,
                    PathNode.MoveTo(141.94f, 87.73f),
                    PathNode.CurveTo(155.73f, 91.41f, 164.59f, 100.28f, 168.27f, 114.07f),
                    PathNode.CurveTo(169.20718f, 117.56862f, 172.37804f, 120.00111f, 176.0f, 120.0f),
                    PathNode.CurveTo(176.69867f, 119.99823f, 177.39426f, 119.9075f, 178.07f, 119.73f),
                    PathNode.CurveTo(180.12047f, 119.18156f, 181.86894f, 117.84074f, 182.9305f, 116.00272f),
                    PathNode.CurveTo(183.99205f, 114.16469f, 184.27965f, 111.98015f, 183.73f, 109.93f),
                    PathNode.CurveTo(178.61f, 90.77f, 165.23f, 77.39f, 146.07f, 72.27f),
                    PathNode.CurveTo(141.80084f, 71.129524f, 137.41547f, 73.66584f, 136.275f, 77.935f),
                    PathNode.CurveTo(135.13454f, 82.20416f, 137.67084f, 86.58953f, 141.94f, 87.73f),
                    PathNode.Close,
                    PathNode.MoveTo(214.37f, 166.46f),
                    PathNode.LineTo(167.26f, 145.35f),
                    PathNode.LineTo(167.13f, 145.29f),
                    PathNode.CurveTo(162.16138f, 143.16489f, 156.45576f, 143.69144f, 151.96f, 146.69f),
                    PathNode.CurveTo(151.69943f, 146.86209f, 151.44902f, 147.04907f, 151.21f, 147.25f),
                    PathNode.LineTo(126.87f, 168.0f),
                    PathNode.CurveTo(111.45f, 160.51f, 95.53f, 144.71f, 88.04f, 129.49f),
                    PathNode.LineTo(108.82f, 104.78f),
                    PathNode.CurveTo(109.02f, 104.53f, 109.21f, 104.28f, 109.39f, 104.01f),
                    PathNode.CurveTo(112.323395f, 99.52752f, 112.818886f, 93.874435f, 110.71f, 88.95f),
                    PathNode.LineTo(110.71f, 88.83f),
                    PathNode.LineTo(89.54f, 41.64f),
                    PathNode.CurveTo(86.720985f, 35.134975f, 79.95731f, 31.26072f, 72.92f, 32.12f),
                    PathNode.CurveTo(44.8889f, 35.80858f, 23.949318f, 59.7273f, 24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 167.4f, 88.6f, 232.0f, 168.0f, 232.0f),
                    PathNode.CurveTo(196.2727f, 232.05067f, 220.19142f, 211.1111f, 223.88f, 183.08f),
                    PathNode.CurveTo(224.74083f, 176.04518f, 220.8711f, 169.2823f, 214.37f, 166.46f),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
