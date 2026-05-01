package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorRegularIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(223.99919f, 131.09268f, 222.21584f, 133.90788f, 219.42f, 135.23f),
                    PathNode.LineTo(67.42f, 207.23f),
                    PathNode.CurveTo(63.426983f, 209.12158f, 58.656574f, 207.41801f, 56.765f, 203.425f),
                    PathNode.CurveTo(54.873425f, 199.43199f, 56.57698f, 194.66158f, 60.57f, 192.77f),
                    PathNode.LineTo(197.31f, 128.0f),
                    PathNode.LineTo(60.58f, 63.23f),
                    PathNode.CurveTo(56.586983f, 61.338425f, 54.883423f, 56.56802f, 56.775f, 52.575f),
                    PathNode.CurveTo(58.666576f, 48.58198f, 63.43698f, 46.878426f, 67.43f, 48.77f),
                    PathNode.LineTo(219.43f, 120.77f),
                    PathNode.CurveTo(222.22194f, 122.09501f, 224.001f, 124.9096f, 224.0f, 128.0f),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
