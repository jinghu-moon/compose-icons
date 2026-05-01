package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeLeft: ImageVector
    get() {
        if (_arrowBadgeLeft != null) return _arrowBadgeLeft!!
        _arrowBadgeLeft = tablerFilledIcon(
            name = "ArrowBadgeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 6.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(10.696572f, 6.00019f, 10.409642f, 6.138137f, 10.22f, 6.375f),
                    PathNode.LineTo(6.22f, 11.375f),
                    PathNode.CurveTo(5.9275f, 11.740333f, 5.9275f, 12.259667f, 6.22f, 12.625f),
                    PathNode.LineTo(10.22f, 17.625f),
                    PathNode.CurveTo(10.409642f, 17.861864f, 10.696572f, 17.999811f, 11.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.LineTo(17.112f, 17.994f),
                    PathNode.CurveTo(17.474178f, 17.953386f, 17.785582f, 17.718952f, 17.924763f, 17.382128f),
                    PathNode.CurveTo(18.063946f, 17.045303f, 18.008863f, 16.65943f, 17.781f, 16.375f),
                    PathNode.LineTo(14.28f, 12.0f),
                    PathNode.LineTo(17.78f, 7.625f),
                    PathNode.CurveTo(18.020227f, 7.324957f, 18.067225f, 6.913781f, 17.900898f, 6.567269f),
                    PathNode.CurveTo(17.734573f, 6.220757f, 17.384363f, 6.00024f, 17.0f, 6.0f),
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
        return _arrowBadgeLeft!!
    }

private var _arrowBadgeLeft: ImageVector? = null
