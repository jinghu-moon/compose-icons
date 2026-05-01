package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorDuotoneIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(128.0f, 160.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.39f, 156.94f),
                    PathNode.CurveTo(230.15236f, 153.95038f, 227.23566f, 152.00067f, 224.0f, 152.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.CurveTo(184.0f, 59.581722f, 180.41827f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(27.581722f, 56.0f, 24.0f, 59.581722f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 68.41828f, 27.581722f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(124.762344f, 151.99745f, 121.84236f, 153.94662f, 120.60302f, 156.93768f),
                    PathNode.CurveTo(119.36368f, 159.92874f, 120.04936f, 163.3719f, 122.34f, 165.66f),
                    PathNode.LineTo(170.34f, 213.66f),
                    PathNode.CurveTo(171.84055f, 215.16223f, 173.87672f, 216.00629f, 176.0f, 216.00629f),
                    PathNode.CurveTo(178.12328f, 216.00629f, 180.15945f, 215.16223f, 181.66f, 213.66f),
                    PathNode.LineTo(229.66f, 165.66f),
                    PathNode.CurveTo(231.94725f, 163.37076f, 232.63007f, 159.92903f, 231.39f, 156.94f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 196.69f),
                    PathNode.LineTo(147.31f, 168.0f),
                    PathNode.LineTo(204.69f, 168.0f),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
