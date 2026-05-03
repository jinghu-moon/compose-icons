package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorFillIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.34f, 98.34f),
                    PathNode.LineTo(164.69f, 80.0f),
                    PathNode.LineTo(146.34f, 61.66f),
                    PathNode.CurveTo(143.21407f, 58.53407f, 143.21407f, 53.46593f, 146.34f, 50.34f),
                    PathNode.CurveTo(149.46593f, 47.21407f, 154.53407f, 47.21407f, 157.66f, 50.34f),
                    PathNode.LineTo(176.0f, 68.69f),
                    PathNode.LineTo(194.34f, 50.34f),
                    PathNode.CurveTo(197.46593f, 47.21407f, 202.53407f, 47.21407f, 205.66f, 50.34f),
                    PathNode.CurveTo(208.78593f, 53.46593f, 208.78593f, 58.53407f, 205.66f, 61.66f),
                    PathNode.LineTo(187.32f, 80.0f),
                    PathNode.LineTo(205.66f, 98.34f),
                    PathNode.CurveTo(208.78593f, 101.465935f, 208.78593f, 106.534065f, 205.66f, 109.66f),
                    PathNode.CurveTo(202.53407f, 112.785934f, 197.46593f, 112.785934f, 194.34f, 109.66f),
                    PathNode.LineTo(176.0f, 91.31f),
                    PathNode.LineTo(157.66f, 109.66f),
                    PathNode.CurveTo(154.53407f, 112.785934f, 149.46593f, 112.785934f, 146.34f, 109.66f),
                    PathNode.CurveTo(143.21407f, 106.534065f, 143.21407f, 101.465935f, 146.34f, 98.34f),
                    PathNode.Close,
                    PathNode.MoveTo(214.34f, 166.46f),
                    PathNode.LineTo(167.23f, 145.35f),
                    PathNode.LineTo(167.1f, 145.29f),
                    PathNode.CurveTo(162.13138f, 143.16489f, 156.42577f, 143.69144f, 151.93f, 146.69f),
                    PathNode.CurveTo(151.66943f, 146.86209f, 151.41902f, 147.04907f, 151.18f, 147.25f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
