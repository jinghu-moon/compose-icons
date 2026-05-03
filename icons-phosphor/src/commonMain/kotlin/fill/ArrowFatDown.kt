package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorFillIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 141.66f),
                    PathNode.LineTo(133.66f, 237.66f),
                    PathNode.CurveTo(132.15945f, 239.16223f, 130.12328f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(125.876724f, 240.00629f, 123.840546f, 239.16223f, 122.34f, 237.66f),
                    PathNode.LineTo(26.34f, 141.66f),
                    PathNode.CurveTo(24.049358f, 139.3719f, 23.36368f, 135.92874f, 24.60302f, 132.93768f),
                    PathNode.CurveTo(25.842361f, 129.94662f, 28.762346f, 127.99745f, 32.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(72.0f, 39.163445f, 79.163445f, 32.0f, 88.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(176.83656f, 32.0f, 184.0f, 39.163445f, 184.0f, 48.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(227.23764f, 127.99745f, 230.15764f, 129.94662f, 231.39697f, 132.93768f),
                    PathNode.CurveTo(232.63632f, 135.92874f, 231.95064f, 139.3719f, 229.66f, 141.66f),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
