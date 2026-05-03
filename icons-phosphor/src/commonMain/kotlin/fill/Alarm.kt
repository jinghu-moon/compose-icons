package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorFillIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(61.66f, 37.66f),
                    PathNode.LineTo(29.66f, 69.66f),
                    PathNode.CurveTo(26.53407f, 72.785934f, 21.46593f, 72.785934f, 18.34f, 69.66f),
                    PathNode.CurveTo(15.214068f, 66.534065f, 15.214068f, 61.46593f, 18.34f, 58.34f),
                    PathNode.LineTo(50.34f, 26.34f),
                    PathNode.CurveTo(53.46593f, 23.21407f, 58.53407f, 23.21407f, 61.66f, 26.34f),
                    PathNode.CurveTo(64.785934f, 29.46593f, 64.785934f, 34.53407f, 61.66f, 37.66f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 58.34f),
                    PathNode.LineTo(205.66f, 26.34f),
                    PathNode.CurveTo(202.53407f, 23.214067f, 197.46593f, 23.21407f, 194.34f, 26.34f),
                    PathNode.CurveTo(191.21407f, 29.46593f, 191.21407f, 34.53407f, 194.34f, 37.66f),
                    PathNode.LineTo(226.34f, 69.66f),
                    PathNode.CurveTo(229.46593f, 72.785934f, 234.53407f, 72.785934f, 237.66f, 69.66f),
                    PathNode.CurveTo(240.78593f, 66.534065f, 240.78593f, 61.46593f, 237.66f, 58.34f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 136.0f),
                    PathNode.CurveTo(224.0f, 189.01933f, 181.01933f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(74.98067f, 232.0f, 32.0f, 189.01933f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 82.98067f, 74.98067f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(180.9942f, 40.06062f, 223.93938f, 83.00579f, 224.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 131.58173f, 188.41827f, 128.0f, 184.0f, 128.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 75.58172f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(123.58172f, 72.0f, 120.0f, 75.58172f, 120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 140.41827f, 123.58172f, 144.0f, 128.0f, 144.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(188.41827f, 144.0f, 192.0f, 140.41827f, 192.0f, 136.0f),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
