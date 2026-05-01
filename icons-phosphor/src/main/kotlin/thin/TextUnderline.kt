package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorThinIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 226.20914f, 194.20914f, 228.0f, 192.0f, 228.0f),
                    PathNode.LineTo(64.0f, 228.0f),
                    PathNode.CurveTo(61.79086f, 228.0f, 60.0f, 226.20914f, 60.0f, 224.0f),
                    PathNode.CurveTo(60.0f, 221.79086f, 61.79086f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(194.20914f, 220.0f, 196.0f, 221.79086f, 196.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(161.1211f, 195.96143f, 187.96143f, 169.1211f, 188.0f, 136.0f),
                    PathNode.LineTo(188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 53.79086f, 186.20914f, 52.0f, 184.0f, 52.0f),
                    PathNode.CurveTo(181.79086f, 52.0f, 180.0f, 53.79086f, 180.0f, 56.0f),
                    PathNode.LineTo(180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 164.71881f, 156.71881f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(99.2812f, 188.0f, 76.0f, 164.71881f, 76.0f, 136.0f),
                    PathNode.LineTo(76.0f, 56.0f),
                    PathNode.CurveTo(76.0f, 53.79086f, 74.20914f, 52.0f, 72.0f, 52.0f),
                    PathNode.CurveTo(69.79086f, 52.0f, 68.0f, 53.79086f, 68.0f, 56.0f),
                    PathNode.LineTo(68.0f, 136.0f),
                    PathNode.CurveTo(68.038574f, 169.1211f, 94.87891f, 195.96143f, 128.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
