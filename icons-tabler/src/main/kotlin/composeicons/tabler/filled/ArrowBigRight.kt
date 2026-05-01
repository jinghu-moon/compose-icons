package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = tablerFilledIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.089f, 3.634f),
                    PathNode.CurveTo(11.420711f, 3.975939f, 11.000177f, 4.663312f, 11.0f, 5.414f),
                    PathNode.LineTo(10.999f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(2.895431f, 8.0f, 2.0f, 8.895431f, 2.0f, 10.0f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.LineTo(2.005f, 14.15f),
                    PathNode.CurveTo(2.083497f, 15.193677f, 2.953375f, 16.000332f, 4.0f, 16.0f),
                    PathNode.LineTo(10.999f, 15.999f),
                    PathNode.LineTo(11.0f, 18.586f),
                    PathNode.CurveTo(11.000173f, 19.394793f, 11.487455f, 20.123869f, 12.234691f, 20.433355f),
                    PathNode.CurveTo(12.981927f, 20.742844f, 13.842011f, 20.571815f, 14.414f, 20.0f),
                    PathNode.LineTo(21.0f, 13.414f),
                    PathNode.CurveTo(21.780764f, 12.633f, 21.780764f, 11.367f, 21.0f, 10.586f),
                    PathNode.LineTo(14.414f, 4.0f),
                    PathNode.CurveTo(13.842029f, 3.42767f, 12.981555f, 3.256364f, 12.234f, 3.566f),
                    PathNode.LineTo(12.089f, 3.634f),
                    PathNode.Close
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
