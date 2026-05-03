package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeUp: ImageVector
    get() {
        if (_arrowBadgeUp != null) return _arrowBadgeUp!!
        _arrowBadgeUp = tablerFilledIcon(
            name = "ArrowBadgeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.375f, 6.22f),
                    PathNode.LineTo(6.375f, 10.22f),
                    PathNode.CurveTo(6.138137f, 10.409642f, 6.00019f, 10.696572f, 6.0f, 11.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(6.006f, 17.112f),
                    PathNode.CurveTo(6.046615f, 17.474178f, 6.281049f, 17.785582f, 6.617873f, 17.924763f),
                    PathNode.CurveTo(6.954698f, 18.063946f, 7.34057f, 18.008863f, 7.625f, 17.781f),
                    PathNode.LineTo(12.0f, 14.28f),
                    PathNode.LineTo(16.375f, 17.78f),
                    PathNode.CurveTo(16.675043f, 18.020227f, 17.08622f, 18.067225f, 17.432732f, 17.900898f),
                    PathNode.CurveTo(17.779243f, 17.734573f, 17.99976f, 17.384363f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(17.999811f, 10.696572f, 17.861864f, 10.409642f, 17.625f, 10.22f),
                    PathNode.LineTo(12.625f, 6.22f),
                    PathNode.CurveTo(12.259667f, 5.9275f, 11.740333f, 5.9275f, 11.375f, 6.22f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBadgeUp!!
    }

private var _arrowBadgeUp: ImageVector? = null
