package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorRegularIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 228.41827f, 196.41827f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(64.0f, 232.0f),
                    PathNode.CurveTo(59.581722f, 232.0f, 56.0f, 228.41827f, 56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 219.58173f, 59.581722f, 216.0f, 64.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(196.41827f, 216.0f, 200.0f, 219.58173f, 200.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(163.33023f, 199.96143f, 191.96143f, 171.33023f, 192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(192.0f, 51.581722f, 188.41827f, 48.0f, 184.0f, 48.0f),
                    PathNode.CurveTo(179.58173f, 48.0f, 176.0f, 51.581722f, 176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 162.50967f, 154.50967f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(101.49033f, 184.0f, 80.0f, 162.50967f, 80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(80.0f, 51.581722f, 76.41828f, 48.0f, 72.0f, 48.0f),
                    PathNode.CurveTo(67.58172f, 48.0f, 64.0f, 51.581722f, 64.0f, 56.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(64.03858f, 171.33023f, 92.66977f, 199.96143f, 128.0f, 200.0f),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
