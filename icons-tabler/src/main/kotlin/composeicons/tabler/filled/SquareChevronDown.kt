package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronDown: ImageVector
    get() {
        if (_squareChevronDown != null) return _squareChevronDown!!
        _squareChevronDown = tablerFilledIcon(
            name = "SquareChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.613f, 10.21f),
                    PathNode.CurveTo(9.19587f, 9.887465f, 8.599978f, 9.94423f, 8.251249f, 10.339722f),
                    PathNode.CurveTo(7.902519f, 10.735212f, 7.920789f, 11.333524f, 8.293f, 11.707f),
                    PathNode.LineTo(11.293f, 14.707f),
                    PathNode.LineTo(11.387f, 14.79f),
                    PathNode.CurveTo(11.785086f, 15.098803f, 12.350732f, 15.063235f, 12.707f, 14.707f),
                    PathNode.LineTo(15.707f, 11.707f),
                    PathNode.LineTo(15.79f, 11.613f),
                    PathNode.CurveTo(16.098803f, 11.214914f, 16.063234f, 10.649268f, 15.707f, 10.293f),
                    PathNode.LineTo(15.613f, 10.21f),
                    PathNode.CurveTo(15.214914f, 9.901197f, 14.649268f, 9.936765f, 14.293f, 10.293f),
                    PathNode.LineTo(12.0f, 12.585f),
                    PathNode.LineTo(9.707f, 10.293f),
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
        return _squareChevronDown!!
    }

private var _squareChevronDown: ImageVector? = null
