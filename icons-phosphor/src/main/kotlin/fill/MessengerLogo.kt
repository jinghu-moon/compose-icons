package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorFillIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(91.476974f, 23.992031f, 57.626514f, 43.143078f, 38.82172f, 74.452995f),
                    PathNode.CurveTo(20.016926f, 105.76292f, 19.014177f, 144.64235f, 36.18f, 176.88f),
                    PathNode.LineTo(24.83f, 210.93f),
                    PathNode.CurveTo(22.912483f, 216.67986f, 24.408623f, 223.0196f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(32.980404f, 231.59138f, 39.320145f, 233.08752f, 45.07f, 231.17f),
                    PathNode.LineTo(79.12f, 219.82f),
                    PathNode.CurveTo(117.32672f, 240.14143f, 164.12462f, 234.68008f, 196.6253f, 206.10704f),
                    PathNode.CurveTo(229.126f, 177.53398f, 240.53671f, 131.82114f, 225.27657f, 91.326164f),
                    PathNode.CurveTo(210.01642f, 50.8312f, 171.27486f, 24.01775f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.66f, 117.66f),
                    PathNode.LineTo(149.66f, 149.66f),
                    PathNode.CurveTo(148.15945f, 151.16223f, 146.12328f, 152.00629f, 144.0f, 152.00629f),
                    PathNode.CurveTo(141.87672f, 152.00629f, 139.84055f, 151.16223f, 138.34f, 149.66f),
                    PathNode.LineTo(112.0f, 123.31f),
                    PathNode.LineTo(85.66f, 149.66f),
                    PathNode.CurveTo(82.534065f, 152.78593f, 77.465935f, 152.78593f, 74.34f, 149.66f),
                    PathNode.CurveTo(71.214066f, 146.53407f, 71.214066f, 141.46593f, 74.34f, 138.34f),
                    PathNode.LineTo(106.34f, 106.34f),
                    PathNode.CurveTo(107.840546f, 104.83778f, 109.876724f, 103.993706f, 112.0f, 103.993706f),
                    PathNode.CurveTo(114.123276f, 103.993706f, 116.159454f, 104.83778f, 117.66f, 106.34f),
                    PathNode.LineTo(144.0f, 132.69f),
                    PathNode.LineTo(170.34f, 106.34f),
                    PathNode.CurveTo(173.46593f, 103.214066f, 178.53407f, 103.214066f, 181.66f, 106.34f),
                    PathNode.CurveTo(184.78593f, 109.465935f, 184.78593f, 114.534065f, 181.66f, 117.66f),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
