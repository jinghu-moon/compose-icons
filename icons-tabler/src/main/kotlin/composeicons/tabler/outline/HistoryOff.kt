package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HistoryOff: ImageVector
    get() {
        if (_historyOff != null) return _historyOff!!
        _historyOff = tablerOutlineIcon(
            name = "HistoryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.05f, 11.0f),
                    PathNode.CurveTo(3.255285f, 8.961914f, 4.151568f, 7.055372f, 5.59f, 5.597f),
                    PathNode.MoveTo(7.904f, 3.9f),
                    PathNode.CurveTo(11.380257f, 2.120165f, 15.607677f, 2.785385f, 18.369328f, 5.546809f),
                    PathNode.CurveTo(21.130978f, 8.308232f, 21.796549f, 12.535596f, 20.017f, 16.012f),
                    PathNode.MoveTo(18.322f, 18.324f),
                    PathNode.CurveTo(16.14088f, 20.473688f, 13.01633f, 21.366768f, 10.028612f, 20.694471f),
                    PathNode.CurveTo(7.040894f, 20.022175f, 4.600064f, 17.87677f, 3.55f, 15.0f),
                    PathNode.MoveTo(3.05f, 20.0f),
                    PathNode.LineTo(3.05f, 15.0f),
                    PathNode.LineTo(8.05f, 15.0f)
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
        return _historyOff!!
    }

private var _historyOff: ImageVector? = null
