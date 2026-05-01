package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HourglassOff: ImageVector
    get() {
        if (_hourglassOff != null) return _hourglassOff!!
        _hourglassOff = tablerOutlineIcon(
            name = "HourglassOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 20.552284f, 17.552284f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.447716f, 21.0f, 6.0f, 20.552284f, 6.0f, 20.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(6.0f, 14.686292f, 8.686292f, 12.0f, 12.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.0f, 9.313708f, 8.686292f, 12.0f, 12.0f, 12.0f),
                    PathNode.MoveTo(15.13f, 11.12f),
                    PathNode.CurveTo(16.913124f, 10.029692f, 18.000385f, 8.090049f, 18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.0f, 3.447715f, 17.552284f, 3.0f, 17.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
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
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hourglassOff!!
    }

private var _hourglassOff: ImageVector? = null
