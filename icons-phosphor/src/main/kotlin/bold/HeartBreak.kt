package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorBoldIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 36.0f),
                    PathNode.CurveTo(160.48674f, 35.95524f, 143.6827f, 42.915215f, 131.33f, 55.33f),
                    PathNode.LineTo(128.0f, 58.66f),
                    PathNode.LineTo(124.67f, 55.33f),
                    PathNode.CurveTo(105.7941f, 36.453327f, 77.40565f, 30.806276f, 52.742634f, 41.022152f),
                    PathNode.CurveTo(28.079622f, 51.23803f, 11.999229f, 75.3049f, 12.0f, 102.0f),
                    PathNode.CurveTo(12.0f, 174.34f, 117.81f, 232.14f, 122.31f, 234.57f),
                    PathNode.CurveTo(125.86214f, 236.48305f, 130.13786f, 236.48305f, 133.69f, 234.57f),
                    PathNode.CurveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f),
                    PathNode.CurveTo(243.95592f, 65.56748f, 214.43253f, 36.04408f, 178.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.51f, 178.36f),
                    PathNode.CurveTo(158.5827f, 190.17833f, 143.69449f, 200.81517f, 128.0f, 210.16f),
                    PathNode.CurveTo(112.30551f, 200.81517f, 97.417305f, 190.17833f, 83.49f, 178.36f),
                    PathNode.CurveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f),
                    PathNode.CurveTo(35.998775f, 85.01164f, 46.23176f, 69.695526f, 61.926888f, 63.1942f),
                    PathNode.CurveTo(77.62201f, 56.69287f, 95.688034f, 60.286804f, 107.7f, 72.3f),
                    PathNode.LineTo(111.0f, 75.63f),
                    PathNode.LineTo(103.48f, 83.15f),
                    PathNode.CurveTo(101.22054f, 85.40162f, 99.95054f, 88.46018f, 99.95054f, 91.65f),
                    PathNode.CurveTo(99.95054f, 94.83982f, 101.22054f, 97.89838f, 103.48f, 100.15f),
                    PathNode.LineTo(125.18f, 121.85f),
                    PathNode.LineTo(111.48f, 135.54f),
                    PathNode.CurveTo(106.785576f, 140.23442f, 106.785576f, 147.84558f, 111.48f, 152.54f),
                    PathNode.CurveTo(116.17442f, 157.23442f, 123.785576f, 157.23442f, 128.48f, 152.54f),
                    PathNode.LineTo(150.66f, 130.35f),
                    PathNode.CurveTo(152.91945f, 128.09837f, 154.18947f, 125.03982f, 154.18947f, 121.85f),
                    PathNode.CurveTo(154.18947f, 118.66018f, 152.91945f, 115.60162f, 150.66f, 113.35f),
                    PathNode.LineTo(129.0f, 91.63f),
                    PathNode.LineTo(148.3f, 72.3f),
                    PathNode.CurveTo(160.31197f, 60.286804f, 178.37799f, 56.69287f, 194.07312f, 63.1942f),
                    PathNode.CurveTo(209.76823f, 69.695526f, 220.00122f, 85.01164f, 220.0f, 102.0f),
                    PathNode.CurveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
