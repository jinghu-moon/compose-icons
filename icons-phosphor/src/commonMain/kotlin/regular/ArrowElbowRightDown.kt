package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorRegularIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 165.66f),
                    PathNode.LineTo(181.66f, 213.66f),
                    PathNode.CurveTo(180.15945f, 215.16223f, 178.12328f, 216.00629f, 176.0f, 216.00629f),
                    PathNode.CurveTo(173.87672f, 216.00629f, 171.84055f, 215.16223f, 170.34f, 213.66f),
                    PathNode.LineTo(122.34f, 165.66f),
                    PathNode.CurveTo(119.214066f, 162.53407f, 119.214066f, 157.46593f, 122.34f, 154.34f),
                    PathNode.CurveTo(125.465935f, 151.21407f, 130.53407f, 151.21407f, 133.66f, 154.34f),
                    PathNode.LineTo(168.0f, 188.69f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(27.581722f, 72.0f, 24.0f, 68.41828f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 59.581722f, 27.581722f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 188.69f),
                    PathNode.LineTo(218.34f, 154.34f),
                    PathNode.CurveTo(221.46593f, 151.21407f, 226.53407f, 151.21407f, 229.66f, 154.34f),
                    PathNode.CurveTo(232.78593f, 157.46593f, 232.78593f, 162.53407f, 229.66f, 165.66f),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
