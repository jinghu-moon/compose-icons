package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = tablerFilledIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.586f, 3.0f),
                    PathNode.LineTo(4.0f, 9.586f),
                    PathNode.CurveTo(3.42767f, 10.157971f, 3.256364f, 11.018445f, 3.566f, 11.766f),
                    PathNode.LineTo(3.634f, 11.911f),
                    PathNode.CurveTo(3.975939f, 12.579289f, 4.663312f, 12.999823f, 5.414f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 21.10457f, 8.895431f, 22.0f, 10.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.LineTo(14.15f, 21.995f),
                    PathNode.CurveTo(15.193677f, 21.916504f, 16.000332f, 21.046625f, 16.0f, 20.0f),
                    PathNode.LineTo(15.999f, 13.0f),
                    PathNode.LineTo(18.586f, 13.0f),
                    PathNode.CurveTo(19.394793f, 12.999827f, 20.123869f, 12.512545f, 20.433355f, 11.765309f),
                    PathNode.CurveTo(20.742844f, 11.018073f, 20.571815f, 10.157989f, 20.0f, 9.586f),
                    PathNode.LineTo(13.414f, 3.0f),
                    PathNode.CurveTo(12.633f, 2.219236f, 11.367f, 2.219236f, 10.586f, 3.0f),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
