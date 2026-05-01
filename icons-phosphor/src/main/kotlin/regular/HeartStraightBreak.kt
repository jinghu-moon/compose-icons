package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorRegularIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.0f, 57.0f),
                    PathNode.CurveTo(200.34616f, 34.40426f, 163.68689f, 34.377434f, 141.0f, 56.94f),
                    PathNode.LineTo(128.0f, 69.47f),
                    PathNode.LineTo(115.0f, 56.91f),
                    PathNode.CurveTo(92.34252f, 34.266327f, 55.618675f, 34.27752f, 32.975002f, 56.935f),
                    PathNode.CurveTo(10.331326f, 79.59248f, 10.342519f, 116.31632f, 33.0f, 138.96f),
                    PathNode.LineTo(122.37f, 229.62f),
                    PathNode.CurveTo(123.87366f, 231.14687f, 125.92703f, 232.00662f, 128.07f, 232.00662f),
                    PathNode.CurveTo(130.21297f, 232.00662f, 132.26634f, 231.14687f, 133.77f, 229.62f),
                    PathNode.LineTo(223.0f, 139.0f),
                    PathNode.CurveTo(245.58463f, 116.3319f, 245.58463f, 79.6681f, 223.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.64f, 127.76f),
                    PathNode.LineTo(128.0f, 212.6f),
                    PathNode.LineTo(44.29f, 127.68f),
                    PathNode.CurveTo(27.887142f, 111.27438f, 27.889381f, 84.67786f, 44.295f, 68.275f),
                    PathNode.CurveTo(60.70062f, 51.872143f, 87.29714f, 51.874386f, 103.7f, 68.28f),
                    PathNode.LineTo(103.8f, 68.38f),
                    PathNode.LineTo(116.47f, 80.57f),
                    PathNode.LineTo(106.47f, 90.22f),
                    PathNode.CurveTo(104.92234f, 91.70958f, 104.038734f, 93.758965f, 104.01804f, 95.90691f),
                    PathNode.CurveTo(103.99735f, 98.054855f, 104.84132f, 100.12088f, 106.36f, 101.64f),
                    PathNode.LineTo(132.69f, 128.0f),
                    PathNode.LineTo(122.34f, 138.35f),
                    PathNode.CurveTo(119.214066f, 141.47594f, 119.214066f, 146.54407f, 122.34f, 149.67f),
                    PathNode.CurveTo(125.465935f, 152.79593f, 130.53407f, 152.79593f, 133.66f, 149.67f),
                    PathNode.LineTo(149.66f, 133.67f),
                    PathNode.CurveTo(152.78172f, 130.54623f, 152.78172f, 125.48377f, 149.66f, 122.36f),
                    PathNode.LineTo(123.42f, 96.09f),
                    PathNode.LineTo(152.2f, 68.38f),
                    PathNode.LineTo(152.31f, 68.28f),
                    PathNode.CurveTo(168.7239f, 51.885426f, 195.32043f, 51.901096f, 211.715f, 68.315f),
                    PathNode.CurveTo(228.10957f, 84.728905f, 228.0939f, 111.325424f, 211.68f, 127.72f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
