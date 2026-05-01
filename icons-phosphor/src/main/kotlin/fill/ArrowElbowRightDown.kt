package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorFillIcon(
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
                    PathNode.CurveTo(120.04936f, 163.3719f, 119.36368f, 159.92874f, 120.60302f, 156.93768f),
                    PathNode.CurveTo(121.84236f, 153.94662f, 124.762344f, 151.99745f, 128.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(27.581722f, 72.0f, 24.0f, 68.41828f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 59.581722f, 27.581722f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(227.23764f, 151.99745f, 230.15764f, 153.94662f, 231.39697f, 156.93768f),
                    PathNode.CurveTo(232.63632f, 159.92874f, 231.95064f, 163.3719f, 229.66f, 165.66f),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
