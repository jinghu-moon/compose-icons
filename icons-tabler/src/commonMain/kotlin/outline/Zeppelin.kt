package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) return _zeppelin!!
        _zeppelin = tablerOutlineIcon(
            name = "Zeppelin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 4.0f),
                    PathNode.CurveTo(18.194f, 4.0f, 22.0f, 6.686f, 22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 13.314f, 18.194f, 16.0f, 13.5f, 16.0f),
                    PathNode.CurveTo(11.37f, 16.0f, 8.916f, 15.074f, 6.136f, 13.223f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 11.67f),
                    PathNode.CurveTo(3.317722f, 11.1323f, 2.650789f, 10.575411f, 2.0f, 10.0f),
                    PathNode.CurveTo(2.650789f, 9.424589f, 3.317722f, 8.8677f, 4.0f, 8.33f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.LineTo(6.135f, 6.778f),
                    PathNode.CurveTo(8.915f, 4.926f, 11.37f, 4.0f, 13.5f, 4.0f)
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
                    PathNode.MoveTo(10.0f, 15.5f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
