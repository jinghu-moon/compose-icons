package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = tablerFilledIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.CurveTo(9.656855f, 9.0f, 11.0f, 10.343145f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 13.656855f, 9.656855f, 15.0f, 8.0f, 15.0f),
                    PathNode.CurveTo(6.343146f, 15.0f, 5.0f, 13.656855f, 5.0f, 12.0f),
                    PathNode.LineTo(5.005f, 11.824f),
                    PathNode.CurveTo(5.098196f, 10.238178f, 6.411443f, 8.999911f, 8.0f, 9.0f)
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
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.CurveTo(19.865993f, 5.0f, 23.0f, 8.134007f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 15.865993f, 19.865993f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(4.134007f, 19.0f, 1.0f, 15.865993f, 1.0f, 12.0f),
                    PathNode.CurveTo(1.0f, 8.134007f, 4.134007f, 5.0f, 8.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 7.0f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.CurveTo(5.238577f, 7.0f, 3.0f, 9.238576f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 14.761424f, 5.238577f, 17.0f, 8.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(18.761423f, 17.0f, 21.0f, 14.761424f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 9.238576f, 18.761423f, 7.0f, 16.0f, 7.0f)
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
