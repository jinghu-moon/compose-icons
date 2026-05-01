package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorBoldIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.14f, 100.46f),
                    PathNode.LineTo(139.14f, 180.46f),
                    PathNode.CurveTo(137.31651f, 185.01363f, 132.90517f, 187.99901f, 128.0f, 187.99901f),
                    PathNode.CurveTo(123.09483f, 187.99901f, 118.68349f, 185.01363f, 116.86f, 180.46f),
                    PathNode.LineTo(84.86f, 100.46f),
                    PathNode.CurveTo(83.22701f, 96.47183f, 83.85799f, 91.91427f, 86.51308f, 88.51977f),
                    PathNode.CurveTo(89.16816f, 85.12527f, 93.43959f, 83.41516f, 97.70366f, 84.03951f),
                    PathNode.CurveTo(101.96773f, 84.66387f, 105.569565f, 87.52679f, 107.14f, 91.54f),
                    PathNode.LineTo(128.0f, 143.69f),
                    PathNode.LineTo(148.86f, 91.54f),
                    PathNode.CurveTo(151.35742f, 85.44068f, 158.30661f, 82.497086f, 164.42526f, 84.94675f),
                    PathNode.CurveTo(170.54393f, 87.39641f, 173.54175f, 94.32239f, 171.14f, 100.46f),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
