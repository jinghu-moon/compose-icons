package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorBoldIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(227.99867f, 132.63493f, 225.32822f, 136.8547f, 221.14f, 138.84f),
                    PathNode.LineTo(69.14f, 210.84f),
                    PathNode.CurveTo(63.1662f, 213.58777f, 56.093662f, 211.01624f, 53.279743f, 205.0733f),
                    PathNode.CurveTo(50.465828f, 199.13037f, 52.958683f, 192.02972f, 58.87f, 189.15f),
                    PathNode.LineTo(188.0f, 128.0f),
                    PathNode.LineTo(58.87f, 66.85f),
                    PathNode.CurveTo(52.958683f, 63.970276f, 50.465828f, 56.869625f, 53.279743f, 50.926697f),
                    PathNode.CurveTo(56.093662f, 44.983772f, 63.1662f, 42.41224f, 69.14f, 45.16f),
                    PathNode.LineTo(221.14f, 117.16f),
                    PathNode.CurveTo(225.32822f, 119.145294f, 227.99867f, 123.36507f, 228.0f, 128.0f),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
