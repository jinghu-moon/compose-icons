package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorFillIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.49f, 207.8f),
                    PathNode.LineTo(207.8f, 220.49f),
                    PathNode.CurveTo(205.54837f, 222.74945f, 202.48982f, 224.01947f, 199.3f, 224.01947f),
                    PathNode.CurveTo(196.11017f, 224.01947f, 193.05162f, 222.74945f, 190.8f, 220.49f),
                    PathNode.LineTo(134.23f, 163.92f),
                    PathNode.LineTo(115.0f, 214.08f),
                    PathNode.LineTo(114.87f, 214.41f),
                    PathNode.CurveTo(112.36355f, 220.24706f, 106.6124f, 224.02211f, 100.26f, 224.0f),
                    PathNode.LineTo(99.48f, 224.0f),
                    PathNode.CurveTo(92.84375f, 223.72194f, 87.08787f, 219.32814f, 85.07f, 213.0f),
                    PathNode.LineTo(32.8f, 52.92f),
                    PathNode.CurveTo(30.930578f, 47.208054f, 32.430668f, 40.930206f, 36.680435f, 36.680435f),
                    PathNode.CurveTo(40.930206f, 32.430668f, 47.208054f, 30.930578f, 52.92f, 32.8f),
                    PathNode.LineTo(213.0f, 85.07f),
                    PathNode.CurveTo(219.26216f, 87.16482f, 223.5942f, 92.89145f, 223.90628f, 99.48732f),
                    PathNode.CurveTo(224.21837f, 106.0832f, 220.4464f, 112.19326f, 214.41f, 114.87f),
                    PathNode.LineTo(214.08f, 115.0f),
                    PathNode.LineTo(163.92f, 134.27f),
                    PathNode.LineTo(220.49f, 190.83f),
                    PathNode.CurveTo(225.17592f, 195.51622f, 225.17592f, 203.11377f, 220.49f, 207.8f),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
