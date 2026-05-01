package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorLightIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 107.313705f, 163.3137f, 110.0f, 160.0f, 110.0f),
                    PathNode.LineTo(96.0f, 110.0f),
                    PathNode.CurveTo(92.686295f, 110.0f, 90.0f, 107.313705f, 90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 100.686295f, 92.686295f, 98.0f, 96.0f, 98.0f),
                    PathNode.LineTo(160.0f, 98.0f),
                    PathNode.CurveTo(163.3137f, 98.0f, 166.0f, 100.686295f, 166.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 130.0f),
                    PathNode.LineTo(96.0f, 130.0f),
                    PathNode.CurveTo(92.686295f, 130.0f, 90.0f, 132.6863f, 90.0f, 136.0f),
                    PathNode.CurveTo(90.0f, 139.3137f, 92.686295f, 142.0f, 96.0f, 142.0f),
                    PathNode.LineTo(160.0f, 142.0f),
                    PathNode.CurveTo(163.3137f, 142.0f, 166.0f, 139.3137f, 166.0f, 136.0f),
                    PathNode.CurveTo(166.0f, 132.6863f, 163.3137f, 130.0f, 160.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 191.73198f, 223.73198f, 198.0f, 216.0f, 198.0f),
                    PathNode.LineTo(154.41f, 198.0f),
                    PathNode.LineTo(140.16f, 223.0f),
                    PathNode.CurveTo(137.66864f, 227.36658f, 133.02731f, 230.0621f, 128.0f, 230.0621f),
                    PathNode.CurveTo(122.97269f, 230.0621f, 118.33135f, 227.36658f, 115.84f, 223.0f),
                    PathNode.LineTo(101.59f, 198.0f),
                    PathNode.LineTo(40.0f, 198.0f),
                    PathNode.CurveTo(32.268013f, 198.0f, 26.0f, 191.73198f, 26.0f, 184.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 184.0f),
                    PathNode.CurveTo(38.0f, 185.10457f, 38.89543f, 186.0f, 40.0f, 186.0f),
                    PathNode.LineTo(105.07f, 186.0f),
                    PathNode.CurveTo(107.21854f, 185.99504f, 109.205734f, 187.1393f, 110.28f, 189.0f),
                    PathNode.LineTo(126.28f, 217.0f),
                    PathNode.CurveTo(126.635124f, 217.62662f, 127.29974f, 218.0139f, 128.02f, 218.0139f),
                    PathNode.CurveTo(128.74025f, 218.0139f, 129.40488f, 217.62662f, 129.76f, 217.0f),
                    PathNode.LineTo(145.76f, 189.0f),
                    PathNode.CurveTo(146.83427f, 187.1393f, 148.82146f, 185.99504f, 150.97f, 186.0f),
                    PathNode.LineTo(216.0f, 186.0f),
                    PathNode.CurveTo(217.10457f, 186.0f, 218.0f, 185.10457f, 218.0f, 184.0f),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
