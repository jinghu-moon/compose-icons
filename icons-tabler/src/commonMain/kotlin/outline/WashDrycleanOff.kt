package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDrycleanOff: ImageVector
    get() {
        if (_washDrycleanOff != null) return _washDrycleanOff!!
        _washDrycleanOff = tablerOutlineIcon(
            name = "WashDrycleanOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.048f, 16.033f),
                    PathNode.CurveTo(21.789745f, 12.563762f, 21.110819f, 8.368677f, 18.36373f, 5.625905f),
                    PathNode.CurveTo(15.616643f, 2.883133f, 11.420495f, 2.210803f, 7.954f, 3.958f),
                    PathNode.MoveTo(5.633f, 5.64f),
                    PathNode.CurveTo(2.119641f, 9.156121f, 2.121879f, 14.854641f, 5.638f, 18.368f),
                    PathNode.CurveTo(9.15412f, 21.88136f, 14.85264f, 21.87912f, 18.366f, 18.363f)
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
        return _washDrycleanOff!!
    }

private var _washDrycleanOff: ImageVector? = null
