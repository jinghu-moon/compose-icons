package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ConeOff: ImageVector
    get() {
        if (_coneOff != null) return _coneOff!!
        _coneOff = tablerOutlineIcon(
            name = "ConeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.396f, 16.384f),
                    PathNode.LineTo(12.87f, 2.507f),
                    PathNode.CurveTo(12.692439f, 2.19369f, 12.360126f, 2.000052f, 12.0f, 2.000052f),
                    PathNode.CurveTo(11.639874f, 2.000052f, 11.307561f, 2.19369f, 11.13f, 2.507f),
                    PathNode.LineTo(9.504f, 5.505f),
                    PathNode.MoveTo(8.097f, 8.099f),
                    PathNode.LineTo(3.0f, 17.497f),
                    PathNode.LineTo(3.0f, 17.997f),
                    PathNode.CurveTo(3.0f, 19.657f, 7.03f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.202f, 21.0f, 18.014f, 20.442f, 19.609f, 19.602f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _coneOff!!
    }

private var _coneOff: ImageVector? = null
