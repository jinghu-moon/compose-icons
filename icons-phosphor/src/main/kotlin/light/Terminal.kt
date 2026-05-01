package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorLightIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 132.48f),
                    PathNode.LineTo(44.0f, 196.48f),
                    PathNode.CurveTo(41.514717f, 198.68913f, 37.70914f, 198.46529f, 35.5f, 195.98f),
                    PathNode.CurveTo(33.29086f, 193.49472f, 33.514717f, 189.68913f, 36.0f, 187.48f),
                    PathNode.LineTo(103.0f, 128.0f),
                    PathNode.LineTo(36.0f, 68.49f),
                    PathNode.CurveTo(33.514717f, 66.28086f, 33.29086f, 62.47528f, 35.5f, 59.99f),
                    PathNode.CurveTo(37.70914f, 57.50472f, 41.514717f, 57.28086f, 44.0f, 59.49f),
                    PathNode.LineTo(116.0f, 123.49f),
                    PathNode.CurveTo(117.291504f, 124.629f, 118.03138f, 126.268f, 118.03138f, 127.99f),
                    PathNode.CurveTo(118.03138f, 129.712f, 117.291504f, 131.351f, 116.0f, 132.49f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(120.0f, 186.0f),
                    PathNode.CurveTo(116.686295f, 186.0f, 114.0f, 188.6863f, 114.0f, 192.0f),
                    PathNode.CurveTo(114.0f, 195.3137f, 116.686295f, 198.0f, 120.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _terminal!!
    }

private var _terminal: ImageVector? = null
