package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = tablerFilledIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 6.10457f, 21.10457f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(2.895431f, 7.0f, 2.0f, 6.10457f, 2.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.513f, 9.0f, 19.936f, 9.463f, 19.993f, 10.06f),
                    PathNode.LineTo(20.0f, 10.2f),
                    PathNode.LineTo(20.0f, 17.4f),
                    PathNode.CurveTo(20.0f, 19.317f, 18.751f, 20.884f, 17.176f, 20.994f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.402f, 21.0f, 4.096f, 19.501f, 4.005f, 17.612f),
                    PathNode.LineTo(4.0f, 17.4f),
                    PathNode.LineTo(4.0f, 10.2f),
                    PathNode.CurveTo(4.0f, 9.537f, 4.448f, 9.0f, 5.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(9.883f, 11.007f),
                    PathNode.CurveTo(9.37995f, 11.066836f, 9.001114f, 11.493402f, 9.001114f, 12.0f),
                    PathNode.CurveTo(9.001114f, 12.506598f, 9.37995f, 12.933164f, 9.883f, 12.993f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(14.117f, 12.993f),
                    PathNode.CurveTo(14.62005f, 12.933164f, 14.998886f, 12.506598f, 14.998886f, 12.0f),
                    PathNode.CurveTo(14.998886f, 11.493402f, 14.62005f, 11.066836f, 14.117f, 11.007f),
                    PathNode.LineTo(14.0f, 11.0f),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
