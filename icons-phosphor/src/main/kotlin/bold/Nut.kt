package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorBoldIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 156.71881f, 99.2812f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(156.71881f, 180.0f, 180.0f, 156.71881f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 99.2812f, 156.71881f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(99.29262f, 76.027565f, 76.027565f, 99.29262f, 76.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.6f, 62.64f),
                    PathNode.LineTo(137.6f, 14.47f),
                    PathNode.CurveTo(131.62274f, 11.180279f, 124.37726f, 11.180279f, 118.4f, 14.47f),
                    PathNode.LineTo(30.4f, 62.64f),
                    PathNode.CurveTo(23.986143f, 66.14936f, 19.998308f, 72.87883f, 20.0f, 80.19f),
                    PathNode.LineTo(20.0f, 175.81f),
                    PathNode.CurveTo(19.998308f, 183.12117f, 23.986143f, 189.85065f, 30.4f, 193.36f),
                    PathNode.LineTo(118.4f, 241.53f),
                    PathNode.CurveTo(124.37628f, 244.8235f, 131.62372f, 244.8235f, 137.6f, 241.53f),
                    PathNode.LineTo(225.6f, 193.36f),
                    PathNode.LineTo(225.6f, 193.36f),
                    PathNode.CurveTo(232.01385f, 189.85065f, 236.0017f, 183.12117f, 236.0f, 175.81f),
                    PathNode.LineTo(236.0f, 80.19f),
                    PathNode.CurveTo(236.0017f, 72.87883f, 232.01385f, 66.14936f, 225.6f, 62.64f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 173.44f),
                    PathNode.LineTo(128.0f, 219.44f),
                    PathNode.LineTo(44.0f, 173.44f),
                    PathNode.LineTo(44.0f, 82.56f),
                    PathNode.LineTo(128.0f, 36.56f),
                    PathNode.LineTo(212.0f, 82.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _nut!!
    }

private var _nut: ImageVector? = null
