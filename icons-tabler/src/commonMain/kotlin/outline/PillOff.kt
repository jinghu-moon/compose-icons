package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PillOff: ImageVector
    get() {
        if (_pillOff != null) return _pillOff!!
        _pillOff = tablerOutlineIcon(
            name = "PillOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.495f, 6.505f),
                    PathNode.LineTo(12.495f, 4.505f),
                    PathNode.CurveTo(14.433591f, 2.605183f, 17.540522f, 2.620875f, 19.459824f, 4.540177f),
                    PathNode.CurveTo(21.379126f, 6.459479f, 21.394817f, 9.566409f, 19.495f, 11.505f),
                    PathNode.LineTo(17.495f, 13.505f),
                    PathNode.MoveTo(15.495f, 15.505f),
                    PathNode.LineTo(11.495f, 19.505f),
                    PathNode.CurveTo(9.556409f, 21.404818f, 6.449479f, 21.389126f, 4.530177f, 19.469824f),
                    PathNode.CurveTo(2.610875f, 17.550522f, 2.595183f, 14.443591f, 4.495f, 12.505f),
                    PathNode.LineTo(8.495f, 8.505f)
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
                    PathNode.MoveTo(8.5f, 8.5f),
                    PathNode.LineTo(15.5f, 15.5f)
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
        return _pillOff!!
    }

private var _pillOff: ImageVector? = null
