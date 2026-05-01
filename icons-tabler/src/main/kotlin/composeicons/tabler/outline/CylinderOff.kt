package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CylinderOff: ImageVector
    get() {
        if (_cylinderOff != null) return _cylinderOff!!
        _cylinderOff = tablerOutlineIcon(
            name = "CylinderOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.23f, 5.233f),
                    PathNode.CurveTo(5.08f, 5.478f, 5.0f, 5.735f, 5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 7.131f, 6.461f, 8.117f, 8.62f, 8.628f),
                    PathNode.MoveTo(12.977f, 8.971f),
                    PathNode.CurveTo(16.381f, 8.767f, 19.0f, 7.515f, 19.0f, 6.0f),
                    PathNode.CurveTo(19.0f, 4.343f, 15.866f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.355f, 3.0f, 8.842f, 3.243f, 7.647f, 3.65f)
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
                    PathNode.MoveTo(5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 19.657f, 8.134f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.245f, 21.0f, 17.974f, 20.054f, 18.767f, 18.77f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 6.0f)
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
        return _cylinderOff!!
    }

private var _cylinderOff: ImageVector? = null
