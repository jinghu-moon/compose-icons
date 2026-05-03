package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorFillIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 72.0f),
                    PathNode.LineTo(159.92f, 72.0f),
                    PathNode.CurveTo(152.23508f, 71.993385f, 145.63092f, 77.45136f, 144.19f, 85.0f),
                    PathNode.LineTo(137.64f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(172.41827f, 120.0f, 176.0f, 123.58172f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 132.41827f, 172.41827f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(134.64f, 136.0f),
                    PathNode.LineTo(127.53f, 173.9f),
                    PathNode.CurveTo(124.69112f, 189.03333f, 111.477295f, 199.99933f, 96.08f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(75.58172f, 200.0f, 72.0f, 196.41827f, 72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 187.58173f, 75.58172f, 184.0f, 80.0f, 184.0f),
                    PathNode.LineTo(96.08f, 184.0f),
                    PathNode.CurveTo(103.76493f, 184.0066f, 110.36908f, 178.54863f, 111.81f, 171.0f),
                    PathNode.LineTo(118.36f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(83.58172f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 83.58172f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(121.36f, 120.0f),
                    PathNode.LineTo(128.47f, 82.1f),
                    PathNode.CurveTo(131.30888f, 66.966675f, 144.5227f, 56.000668f, 159.92f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.CurveTo(184.0f, 68.41828f, 180.41827f, 72.0f, 176.0f, 72.0f),
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
        return _function!!
    }

private var _function: ImageVector? = null
