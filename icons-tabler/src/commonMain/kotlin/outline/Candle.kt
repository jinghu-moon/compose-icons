package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Candle: ImageVector
    get() {
        if (_candle != null) return _candle!!
        _candle = tablerOutlineIcon(
            name = "Candle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 10.447715f, 14.552285f, 10.0f, 14.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.447715f, 10.0f, 9.0f, 10.447715f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(13.465f, 3.638f),
                    PathNode.CurveTo(14.192967f, 4.420593f, 14.17696f, 5.637252f, 13.428656f, 6.400421f),
                    PathNode.CurveTo(12.68035f, 7.16359f, 11.464241f, 7.203522f, 10.667483f, 6.491086f),
                    PathNode.CurveTo(9.870726f, 5.778651f, 9.77494f, 4.565662f, 10.45f, 3.737f),
                    PathNode.LineTo(12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _candle!!
    }

private var _candle: ImageVector? = null
