package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorLightIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.91f, 83.08f),
                    PathNode.CurveTo(166.33504f, 43.887344f, 131.345f, 15.90399f, 91.66564f, 18.104643f),
                    PathNode.CurveTo(51.986286f, 20.305296f, 20.305296f, 51.986286f, 18.104643f, 91.66564f),
                    PathNode.CurveTo(15.90399f, 131.345f, 43.887344f, 166.33504f, 83.08f, 172.91f),
                    PathNode.CurveTo(89.65497f, 212.10266f, 124.645f, 240.08601f, 164.32436f, 237.88536f),
                    PathNode.CurveTo(204.00371f, 235.68471f, 235.68471f, 204.00371f, 237.88536f, 164.32436f),
                    PathNode.CurveTo(240.08601f, 124.645f, 212.10266f, 89.65497f, 172.91f, 83.08f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 160.0f),
                    PathNode.CurveTo(225.99644f, 162.97733f, 225.78929f, 165.95093f, 225.38f, 168.9f),
                    PathNode.LineTo(171.62f, 115.13f),
                    PathNode.CurveTo(173.20293f, 108.87658f, 174.0024f, 102.45065f, 174.0f, 96.0f),
                    PathNode.CurveTo(174.0f, 95.83f, 174.0f, 95.66f, 174.0f, 95.49f),
                    PathNode.CurveTo(204.39595f, 102.00972f, 226.0819f, 128.9128f, 226.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.71f, 155.19f),
                    PathNode.LineTo(202.21f, 210.69f),
                    PathNode.CurveTo(196.34935f, 215.56921f, 189.68744f, 219.39584f, 182.52f, 222.0f),
                    PathNode.LineTo(127.72f, 167.19f),
                    PathNode.CurveTo(134.59679f, 164.12898f, 140.99335f, 160.08691f, 146.71f, 155.19f),
                    PathNode.Close,
                    PathNode.MoveTo(155.19f, 146.71f),
                    PathNode.CurveTo(160.08774f, 140.99026f, 164.12982f, 134.5903f, 167.19f, 127.71f),
                    PathNode.LineTo(222.0f, 182.52f),
                    PathNode.CurveTo(219.38367f, 189.69025f, 215.54341f, 196.35234f, 210.65f, 202.21f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 59.549206f, 59.549206f, 30.0f, 96.0f, 30.0f),
                    PathNode.CurveTo(132.45079f, 30.0f, 162.0f, 59.549206f, 162.0f, 96.0f),
                    PathNode.CurveTo(162.0f, 132.45079f, 132.45079f, 162.0f, 96.0f, 162.0f),
                    PathNode.CurveTo(59.56748f, 161.95592f, 30.04408f, 132.43253f, 30.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.49f, 174.0f),
                    PathNode.LineTo(96.0f, 174.0f),
                    PathNode.CurveTo(102.45065f, 174.0024f, 108.87658f, 173.20293f, 115.13f, 171.62f),
                    PathNode.LineTo(168.9f, 225.38f),
                    PathNode.CurveTo(134.7559f, 230.09834f, 102.74788f, 207.69577f, 95.49f, 174.0f),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
