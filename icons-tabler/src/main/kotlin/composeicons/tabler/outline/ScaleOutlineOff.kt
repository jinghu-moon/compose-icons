package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutlineOff: ImageVector
    get() {
        if (_scaleOutlineOff != null) return _scaleOutlineOff!!
        _scaleOutlineOff = tablerOutlineIcon(
            name = "ScaleOutlineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(19.209139f, 3.0f, 21.0f, 4.790861f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.MoveTo(19.827f, 19.83f),
                    PathNode.CurveTo(19.077757f, 20.580433f, 18.06043f, 21.00147f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(4.790861f, 21.0f, 3.0f, 19.209139f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 5.896f, 3.447f, 4.897f, 4.17f, 4.173f)
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
                    PathNode.MoveTo(11.062f, 7.062f),
                    PathNode.CurveTo(11.372f, 7.021f, 11.684f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.956f, 7.0f, 15.724f, 7.802f, 17.0f, 9.095f),
                    PathNode.CurveTo(16.32721f, 9.72354f, 15.660512f, 10.358569f, 15.0f, 11.0f),
                    PathNode.MoveTo(11.277f, 11.288f),
                    PathNode.CurveTo(10.785793f, 11.409953f, 10.333425f, 11.654198f, 9.962f, 11.998f),
                    PathNode.LineTo(7.006f, 9.095f),
                    PathNode.CurveTo(7.352183f, 8.741389f, 7.735004f, 8.425612f, 8.148f, 8.153f)
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
        return _scaleOutlineOff!!
    }

private var _scaleOutlineOff: ImageVector? = null
