package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorFillIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(113.29f, 55.31f),
                    PathNode.CurveTo(90.17964f, 33.119198f, 53.455803f, 33.864643f, 31.265f, 56.975f),
                    PathNode.CurveTo(9.074199f, 80.08536f, 9.819645f, 116.8092f, 32.93f, 139.0f),
                    PathNode.LineTo(122.3f, 229.66f),
                    PathNode.CurveTo(123.80366f, 231.18686f, 125.85703f, 232.04662f, 128.0f, 232.04662f),
                    PathNode.CurveTo(130.14296f, 232.04662f, 132.19633f, 231.18686f, 133.7f, 229.66f),
                    PathNode.LineTo(223.0f, 139.0f),
                    PathNode.CurveTo(245.6713f, 116.35632f, 245.69368f, 79.6213f, 223.05f, 56.95f),
                    PathNode.CurveTo(200.40633f, 34.27871f, 163.6713f, 34.256325f, 141.0f, 56.9f),
                    PathNode.LineTo(141.0f, 56.9f),
                    PathNode.LineTo(116.6f, 79.9f),
                    PathNode.LineTo(143.0f, 106.32f),
                    PathNode.CurveTo(144.50221f, 107.82055f, 145.3463f, 109.85673f, 145.3463f, 111.98f),
                    PathNode.CurveTo(145.3463f, 114.10327f, 144.50221f, 116.13946f, 143.0f, 117.64f),
                    PathNode.LineTo(122.31f, 138.33f),
                    PathNode.CurveTo(119.181305f, 141.45317f, 114.11317f, 141.4487f, 110.99f, 138.32f),
                    PathNode.CurveTo(107.86683f, 135.1913f, 107.87131f, 130.12317f, 111.0f, 127.0f),
                    PathNode.LineTo(126.0f, 112.0f),
                    PathNode.LineTo(99.5f, 85.42f),
                    PathNode.CurveTo(97.960815f, 83.882095f, 97.11445f, 81.78361f, 97.15595f, 79.60818f),
                    PathNode.CurveTo(97.197464f, 77.43275f, 98.123276f, 75.368065f, 99.72f, 73.89f),
                    PathNode.LineTo(113.27f, 61.11f),
                    PathNode.CurveTo(114.064926f, 60.354824f, 114.51501f, 59.30645f, 114.51501f, 58.21f),
                    PathNode.CurveTo(114.51501f, 57.113556f, 114.064926f, 56.065174f, 113.27f, 55.31f),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
