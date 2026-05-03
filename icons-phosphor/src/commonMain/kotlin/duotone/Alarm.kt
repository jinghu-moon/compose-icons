package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorDuotoneIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 184.60106f, 176.60106f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(79.39894f, 224.0f, 40.0f, 184.60106f, 40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 87.39894f, 79.39894f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(176.60106f, 48.0f, 216.0f, 87.39894f, 216.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(74.98067f, 40.0f, 32.0f, 82.98067f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 189.01933f, 74.98067f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(181.01933f, 232.0f, 224.0f, 189.01933f, 224.0f, 136.0f),
                    PathNode.CurveTo(223.93938f, 83.00579f, 180.9942f, 40.06062f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(83.81722f, 216.0f, 48.0f, 180.18279f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 91.81722f, 83.81722f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(172.18279f, 56.0f, 208.0f, 91.81722f, 208.0f, 136.0f),
                    PathNode.CurveTo(207.9504f, 180.16223f, 172.16223f, 215.9504f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(61.66f, 37.66f),
                    PathNode.LineTo(29.66f, 69.66f),
                    PathNode.CurveTo(26.53407f, 72.785934f, 21.46593f, 72.785934f, 18.34f, 69.66f),
                    PathNode.CurveTo(15.214068f, 66.534065f, 15.214068f, 61.46593f, 18.34f, 58.34f),
                    PathNode.LineTo(50.34f, 26.34f),
                    PathNode.CurveTo(53.46593f, 23.21407f, 58.53407f, 23.21407f, 61.66f, 26.34f),
                    PathNode.CurveTo(64.785934f, 29.46593f, 64.785934f, 34.53407f, 61.66f, 37.66f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 69.66f),
                    PathNode.CurveTo(236.15945f, 71.16222f, 234.12328f, 72.006294f, 232.0f, 72.006294f),
                    PathNode.CurveTo(229.87672f, 72.006294f, 227.84055f, 71.16222f, 226.34f, 69.66f),
                    PathNode.LineTo(194.34f, 37.66f),
                    PathNode.CurveTo(191.21407f, 34.53407f, 191.21407f, 29.46593f, 194.34f, 26.34f),
                    PathNode.CurveTo(197.46593f, 23.21407f, 202.53407f, 23.214067f, 205.66f, 26.34f),
                    PathNode.LineTo(237.66f, 58.34f),
                    PathNode.CurveTo(239.16223f, 59.840546f, 240.00629f, 61.876724f, 240.00629f, 64.0f),
                    PathNode.CurveTo(240.00629f, 66.123276f, 239.16223f, 68.159454f, 237.66f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(188.41827f, 128.0f, 192.0f, 131.58173f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 140.41827f, 188.41827f, 144.0f, 184.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 128.0f),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
