package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorLightIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 191.73198f, 32.268013f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(101.59f, 198.0f),
                    PathNode.LineTo(115.84f, 223.0f),
                    PathNode.CurveTo(118.33135f, 227.36658f, 122.97269f, 230.0621f, 128.0f, 230.0621f),
                    PathNode.CurveTo(133.02731f, 230.0621f, 137.66864f, 227.36658f, 140.16f, 223.0f),
                    PathNode.LineTo(154.41f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(223.73198f, 198.0f, 230.0f, 191.73198f, 230.0f, 184.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 184.0f),
                    PathNode.CurveTo(218.0f, 185.10457f, 217.10457f, 186.0f, 216.0f, 186.0f),
                    PathNode.LineTo(150.93f, 186.0f),
                    PathNode.CurveTo(148.78146f, 185.99504f, 146.79427f, 187.1393f, 145.72f, 189.0f),
                    PathNode.LineTo(129.72f, 217.0f),
                    PathNode.CurveTo(129.36488f, 217.62662f, 128.70026f, 218.0139f, 127.98f, 218.0139f),
                    PathNode.CurveTo(127.25974f, 218.0139f, 126.59512f, 217.62662f, 126.24f, 217.0f),
                    PathNode.LineTo(110.24f, 189.0f),
                    PathNode.CurveTo(109.16573f, 187.1393f, 107.178535f, 185.99504f, 105.03f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(38.89543f, 186.0f, 38.0f, 185.10457f, 38.0f, 184.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
