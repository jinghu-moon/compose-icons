package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Candle: ImageVector
    get() {
        if (_candle != null) return _candle!!
        _candle = tablerFilledIcon(
            name = "Candle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(15.104569f, 9.0f, 16.0f, 9.895431f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(16.0f, 21.552284f, 15.552285f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 9.895431f, 8.895431f, 9.0f, 10.0f, 9.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.254f, 1.334f),
                    PathNode.CurveTo(11.443712f, 1.121803f, 11.714863f, 1.000506f, 11.9995f, 1.000506f),
                    PathNode.CurveTo(12.284138f, 1.000506f, 12.555287f, 1.121803f, 12.745f, 1.334f),
                    PathNode.LineTo(14.197f, 2.957f),
                    PathNode.CurveTo(15.28956f, 4.130741f, 15.265924f, 5.956158f, 14.143339f, 7.101217f),
                    PathNode.CurveTo(13.020753f, 8.246275f, 11.196164f, 8.306084f, 10.001f, 7.237f),
                    PathNode.CurveTo(8.806f, 6.167f, 8.662f, 4.348f, 9.704f, 3.071f),
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
        return _candle!!
    }

private var _candle: ImageVector? = null
