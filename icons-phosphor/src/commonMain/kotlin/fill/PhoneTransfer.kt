package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorFillIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 139.58173f, 64.0f, 144.0f, 64.0f),
                    PathNode.LineTo(196.69f, 64.0f),
                    PathNode.LineTo(178.34f, 45.66f),
                    PathNode.CurveTo(175.21407f, 42.53407f, 175.21407f, 37.46593f, 178.34f, 34.34f),
                    PathNode.CurveTo(181.46593f, 31.21407f, 186.53407f, 31.214067f, 189.66f, 34.34f),
                    PathNode.LineTo(221.66f, 66.34f),
                    PathNode.CurveTo(223.16223f, 67.840546f, 224.00629f, 69.876724f, 224.00629f, 72.0f),
                    PathNode.CurveTo(224.00629f, 74.123276f, 223.16223f, 76.159454f, 221.66f, 77.66f),
                    PathNode.LineTo(189.66f, 109.66f),
                    PathNode.CurveTo(186.53407f, 112.785934f, 181.46593f, 112.785934f, 178.34f, 109.66f),
                    PathNode.CurveTo(175.21407f, 106.534065f, 175.21407f, 101.465935f, 178.34f, 98.34f),
                    PathNode.LineTo(196.69f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.36f, 166.46f),
                    PathNode.LineTo(167.25f, 145.35f),
                    PathNode.LineTo(167.14f, 145.29f),
                    PathNode.CurveTo(162.16856f, 143.16124f, 156.45824f, 143.6879f, 151.96f, 146.69f),
                    PathNode.CurveTo(151.69943f, 146.86209f, 151.44902f, 147.04907f, 151.21f, 147.25f),
                    PathNode.LineTo(126.87f, 168.0f),
                    PathNode.CurveTo(111.45f, 160.51f, 95.53f, 144.71f, 88.04f, 129.49f),
                    PathNode.LineTo(108.82f, 104.78f),
                    PathNode.CurveTo(109.02f, 104.53f, 109.21f, 104.28f, 109.39f, 104.01f),
                    PathNode.CurveTo(112.323395f, 99.52752f, 112.818886f, 93.874435f, 110.71f, 88.95f),
                    PathNode.LineTo(110.71f, 88.83f),
                    PathNode.LineTo(89.54f, 41.64f),
                    PathNode.CurveTo(86.71769f, 35.138905f, 79.95482f, 31.269175f, 72.92f, 32.13f),
                    PathNode.CurveTo(44.88823f, 35.809765f, 23.945507f, 59.727787f, 24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 167.4f, 88.6f, 232.0f, 168.0f, 232.0f),
                    PathNode.CurveTo(196.27222f, 232.05449f, 220.19023f, 211.11177f, 223.87f, 183.08f),
                    PathNode.CurveTo(224.73082f, 176.04518f, 220.8611f, 169.2823f, 214.36f, 166.46f),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
