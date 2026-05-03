package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorLightIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 224.0f),
                    PathNode.CurveTo(198.0f, 227.3137f, 195.3137f, 230.0f, 192.0f, 230.0f),
                    PathNode.LineTo(64.0f, 230.0f),
                    PathNode.CurveTo(60.68629f, 230.0f, 58.0f, 227.3137f, 58.0f, 224.0f),
                    PathNode.CurveTo(58.0f, 220.6863f, 60.68629f, 218.0f, 64.0f, 218.0f),
                    PathNode.LineTo(192.0f, 218.0f),
                    PathNode.CurveTo(195.3137f, 218.0f, 198.0f, 220.6863f, 198.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 198.0f),
                    PathNode.CurveTo(162.22566f, 197.96143f, 189.96143f, 170.22566f, 190.0f, 136.0f),
                    PathNode.LineTo(190.0f, 56.0f),
                    PathNode.CurveTo(190.0f, 52.68629f, 187.3137f, 50.0f, 184.0f, 50.0f),
                    PathNode.CurveTo(180.6863f, 50.0f, 178.0f, 52.68629f, 178.0f, 56.0f),
                    PathNode.LineTo(178.0f, 136.0f),
                    PathNode.CurveTo(178.0f, 163.61424f, 155.61424f, 186.0f, 128.0f, 186.0f),
                    PathNode.CurveTo(100.385765f, 186.0f, 78.0f, 163.61424f, 78.0f, 136.0f),
                    PathNode.LineTo(78.0f, 56.0f),
                    PathNode.CurveTo(78.0f, 52.68629f, 75.313705f, 50.0f, 72.0f, 50.0f),
                    PathNode.CurveTo(68.686295f, 50.0f, 66.0f, 52.68629f, 66.0f, 56.0f),
                    PathNode.LineTo(66.0f, 136.0f),
                    PathNode.CurveTo(66.038574f, 170.22566f, 93.77434f, 197.96143f, 128.0f, 198.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
