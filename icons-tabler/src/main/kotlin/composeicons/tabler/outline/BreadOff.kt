package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BreadOff: ImageVector
    get() {
        if (_breadOff != null) return _breadOff!!
        _breadOff = tablerOutlineIcon(
            name = "BreadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.005f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.243338f, 4.000495f, 20.357521f, 4.767882f, 20.80125f, 5.929343f),
                    PathNode.CurveTo(21.24498f, 7.090804f, 20.926287f, 8.405614f, 20.0f, 9.235f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.41f, 19.418f),
                    PathNode.CurveTo(19.05f, 19.778f, 18.55f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 9.236f),
                    PathNode.CurveTo(3.295485f, 8.605845f, 2.929153f, 7.680515f, 3.01141f, 6.738883f),
                    PathNode.CurveTo(3.093668f, 5.797251f, 3.614894f, 4.949454f, 4.418f, 4.451f)
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
        return _breadOff!!
    }

private var _breadOff: ImageVector? = null
