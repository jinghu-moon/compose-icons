package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorRegularIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 228.41827f, 196.41827f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(187.58173f, 232.0f, 184.0f, 228.41827f, 184.0f, 224.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(67.31f, 88.0f),
                    PathNode.LineTo(101.66f, 122.34f),
                    PathNode.CurveTo(104.785934f, 125.465935f, 104.785934f, 130.53407f, 101.66f, 133.66f),
                    PathNode.CurveTo(98.534065f, 136.78593f, 93.465935f, 136.78593f, 90.34f, 133.66f),
                    PathNode.LineTo(42.34f, 85.66f),
                    PathNode.LineTo(42.28f, 85.59f),
                    PathNode.CurveTo(42.12f, 85.43f, 41.96f, 85.25f, 41.81f, 85.07f),
                    PathNode.LineTo(41.58f, 84.76f),
                    PathNode.CurveTo(41.49772f, 84.657486f, 41.420944f, 84.55067f, 41.35f, 84.44f),
                    PathNode.LineTo(41.12f, 84.07f),
                    PathNode.CurveTo(41.057453f, 83.97345f, 41.000687f, 83.873276f, 40.95f, 83.77f),
                    PathNode.CurveTo(40.88f, 83.65f, 40.82f, 83.52f, 40.76f, 83.39f),
                    PathNode.CurveTo(40.7f, 83.26f, 40.66f, 83.18f, 40.61f, 83.06f),
                    PathNode.CurveTo(40.56f, 82.94f, 40.52f, 82.81f, 40.47f, 82.69f),
                    PathNode.LineTo(40.34f, 82.33f),
                    PathNode.LineTo(40.25f, 81.94f),
                    PathNode.CurveTo(40.25f, 81.81f, 40.18f, 81.69f, 40.15f, 81.57f),
                    PathNode.CurveTo(40.12f, 81.45f, 40.15f, 81.26f, 40.09f, 81.11f),
                    PathNode.CurveTo(40.03f, 80.96f, 40.09f, 80.9f, 40.04f, 80.79f),
                    PathNode.CurveTo(39.989998f, 80.26452f, 39.989998f, 79.73548f, 40.04f, 79.21f),
                    PathNode.CurveTo(40.04f, 79.1f, 40.04f, 79.0f, 40.09f, 78.89f),
                    PathNode.CurveTo(40.14f, 78.78f, 40.09f, 78.58f, 40.15f, 78.43f),
                    PathNode.CurveTo(40.21f, 78.28f, 40.21f, 78.19f, 40.25f, 78.06f),
                    PathNode.LineTo(40.34f, 77.67f),
                    PathNode.LineTo(40.47f, 77.31f),
                    PathNode.CurveTo(40.52f, 77.19f, 40.56f, 77.06f, 40.61f, 76.94f),
                    PathNode.CurveTo(40.66f, 76.82f, 40.71f, 76.72f, 40.76f, 76.61f),
                    PathNode.CurveTo(40.81f, 76.5f, 40.88f, 76.35f, 40.95f, 76.23f),
                    PathNode.CurveTo(41.000687f, 76.126724f, 41.057453f, 76.02655f, 41.12f, 75.93f),
                    PathNode.LineTo(41.35f, 75.56f),
                    PathNode.CurveTo(41.420944f, 75.44933f, 41.49772f, 75.342514f, 41.58f, 75.24f),
                    PathNode.LineTo(41.81f, 74.93f),
                    PathNode.CurveTo(41.96f, 74.75f, 42.12f, 74.57f, 42.28f, 74.41f),
                    PathNode.LineTo(42.34f, 74.34f),
                    PathNode.LineTo(90.34f, 26.34f),
                    PathNode.CurveTo(93.465935f, 23.214067f, 98.534065f, 23.21407f, 101.66f, 26.34f),
                    PathNode.CurveTo(104.785934f, 29.46593f, 104.785934f, 34.53407f, 101.66f, 37.66f),
                    PathNode.LineTo(67.31f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
