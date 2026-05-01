package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronDown: ImageVector
    get() {
        if (_circleChevronDown != null) return _circleChevronDown!!
        _circleChevronDown = tablerFilledIcon(
            name = "CircleChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(9.707f, 10.293f),
                    PathNode.CurveTo(9.314621f, 9.914028f, 8.690915f, 9.919448f, 8.305182f, 10.305182f),
                    PathNode.CurveTo(7.919448f, 10.690915f, 7.914028f, 11.314621f, 8.293f, 11.707f),
                    PathNode.LineTo(11.293f, 14.707f),
                    PathNode.CurveTo(11.6835f, 15.097382f, 12.3165f, 15.097382f, 12.707f, 14.707f),
                    PathNode.LineTo(15.707f, 11.707f),
                    PathNode.CurveTo(16.097382f, 11.3165f, 16.097382f, 10.6835f, 15.707f, 10.293f),
                    PathNode.LineTo(15.613f, 10.21f),
                    PathNode.CurveTo(15.214914f, 9.901197f, 14.649268f, 9.936765f, 14.293f, 10.293f),
                    PathNode.LineTo(11.999f, 12.585f),
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
        return _circleChevronDown!!
    }

private var _circleChevronDown: ImageVector? = null
