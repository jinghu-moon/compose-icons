package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorBoldIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 85.48f, 44.73f, 46.66f, 83.0f, 29.1f),
                    PathNode.CurveTo(86.914604f, 27.191525f, 91.55593f, 27.553741f, 95.12705f, 30.046417f),
                    PathNode.CurveTo(98.69818f, 32.539093f, 100.6385f, 36.770916f, 100.196785f, 41.1035f),
                    PathNode.CurveTo(99.75507f, 45.43608f, 97.00069f, 49.189274f, 93.0f, 50.91f),
                    PathNode.CurveTo(63.24f, 64.57f, 44.0f, 94.83f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.39192f, 212.0f, 212.0f, 174.39192f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 94.83f, 192.76f, 64.57f, 163.0f, 50.91f),
                    PathNode.CurveTo(158.99931f, 49.189274f, 156.24492f, 45.43608f, 155.8032f, 41.1035f),
                    PathNode.CurveTo(155.36151f, 36.770916f, 157.30182f, 32.539093f, 160.87294f, 30.046417f),
                    PathNode.CurveTo(164.44408f, 27.553741f, 169.0854f, 27.191525f, 173.0f, 29.1f),
                    PathNode.CurveTo(211.27f, 46.66f, 236.0f, 85.48f, 236.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
