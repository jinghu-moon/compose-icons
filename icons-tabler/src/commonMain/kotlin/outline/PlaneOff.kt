package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneOff: ImageVector
    get() {
        if (_planeOff != null) return _planeOff!!
        _planeOff = tablerOutlineIcon(
            name = "PlaneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.788f, 5.758f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(21.10457f, 10.0f, 22.0f, 10.895431f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 13.104569f, 21.10457f, 14.0f, 20.0f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(15.282f, 15.256f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f)
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
        return _planeOff!!
    }

private var _planeOff: ImageVector? = null
