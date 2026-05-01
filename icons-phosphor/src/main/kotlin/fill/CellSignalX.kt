package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorFillIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 194.34f),
                    PathNode.CurveTo(216.78593f, 197.46593f, 216.78593f, 202.53407f, 213.66f, 205.66f),
                    PathNode.CurveTo(210.53407f, 208.78593f, 205.46593f, 208.78593f, 202.34f, 205.66f),
                    PathNode.LineTo(184.0f, 187.31f),
                    PathNode.LineTo(165.66f, 205.66f),
                    PathNode.CurveTo(162.53407f, 208.78593f, 157.46593f, 208.78593f, 154.34f, 205.66f),
                    PathNode.CurveTo(151.21407f, 202.53407f, 151.21407f, 197.46593f, 154.34f, 194.34f),
                    PathNode.LineTo(172.69f, 176.0f),
                    PathNode.LineTo(154.34f, 157.66f),
                    PathNode.CurveTo(151.21407f, 154.53407f, 151.21407f, 149.46593f, 154.34f, 146.34f),
                    PathNode.CurveTo(157.46593f, 143.21407f, 162.53407f, 143.21407f, 165.66f, 146.34f),
                    PathNode.LineTo(184.0f, 164.69f),
                    PathNode.LineTo(202.34f, 146.34f),
                    PathNode.CurveTo(205.46593f, 143.21407f, 210.53407f, 143.21407f, 213.66f, 146.34f),
                    PathNode.CurveTo(216.78593f, 149.46593f, 216.78593f, 154.53407f, 213.66f, 157.66f),
                    PathNode.LineTo(195.31f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.41f, 120.1f),
                    PathNode.CurveTo(166.14948f, 119.39297f, 174.79623f, 122.30294f, 181.33f, 128.15f),
                    PathNode.CurveTo(182.84943f, 129.51208f, 185.15057f, 129.51208f, 186.67f, 128.15f),
                    PathNode.CurveTo(191.61311f, 123.6939f, 197.82684f, 120.8965f, 204.44f, 120.15f),
                    PathNode.CurveTo(206.47574f, 119.924736f, 208.01242f, 118.19813f, 208.0f, 116.15f),
                    PathNode.LineTo(208.0f, 40.46f),
                    PathNode.CurveTo(208.07639f, 34.12912f, 204.50394f, 28.319033f, 198.82f, 25.53f),
                    PathNode.CurveTo(192.71234f, 22.649872f, 185.45401f, 23.914276f, 180.68f, 28.69f),
                    PathNode.LineTo(20.68f, 188.69f),
                    PathNode.CurveTo(15.905339f, 193.45992f, 14.637161f, 200.71294f, 17.51f, 206.82f),
                    PathNode.CurveTo(20.30026f, 212.51224f, 26.121262f, 216.08661f, 32.46f, 216.0f),
                    PathNode.LineTo(126.06f, 216.0f),
                    PathNode.CurveTo(127.35181f, 215.99908f, 128.56364f, 215.37433f, 129.31374f, 214.32262f),
                    PathNode.CurveTo(130.06383f, 213.2709f, 130.25984f, 211.92168f, 129.84f, 210.7f),
                    PathNode.CurveTo(125.94154f, 199.68141f, 128.36055f, 187.41388f, 136.15f, 178.7f),
                    PathNode.CurveTo(137.51208f, 177.18057f, 137.51208f, 174.87943f, 136.15f, 173.36f),
                    PathNode.CurveTo(128.04865f, 164.30367f, 125.77555f, 151.44028f, 130.2825f, 140.15591f),
                    PathNode.CurveTo(134.78946f, 128.87157f, 145.29877f, 121.11345f, 157.41f, 120.13f),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
