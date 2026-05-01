package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorFillIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 98.0f),
                    PathNode.CurveTo(240.03447f, 113.388214f, 233.91327f, 128.1511f, 223.0f, 139.0f),
                    PathNode.LineTo(133.7f, 229.62f),
                    PathNode.CurveTo(132.19633f, 231.14687f, 130.14296f, 232.00662f, 128.0f, 232.00662f),
                    PathNode.CurveTo(125.85703f, 232.00662f, 123.80366f, 231.14687f, 122.3f, 229.62f),
                    PathNode.LineTo(33.0f, 139.0f),
                    PathNode.CurveTo(10.328711f, 116.35632f, 10.306325f, 79.6213f, 32.95f, 56.95f),
                    PathNode.CurveTo(55.593674f, 34.27871f, 92.32871f, 34.256325f, 115.0f, 56.9f),
                    PathNode.LineTo(128.0f, 69.05f),
                    PathNode.LineTo(141.09f, 56.86f),
                    PathNode.CurveTo(157.70383f, 40.328655f, 182.63423f, 35.42093f, 204.27425f, 44.42174f),
                    PathNode.CurveTo(225.91426f, 53.42255f, 240.01045f, 74.56275f, 240.0f, 98.0f),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
