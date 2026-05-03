package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronLeft: ImageVector
    get() {
        if (_squareChevronLeft != null) return _squareChevronLeft!!
        _squareChevronLeft = tablerFilledIcon(
            name = "SquareChevronLeft",
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
                    PathNode.MoveTo(13.707f, 8.293f),
                    PathNode.CurveTo(13.3165f, 7.902618f, 12.6835f, 7.902618f, 12.293f, 8.293f),
                    PathNode.LineTo(9.293f, 11.293f),
                    PathNode.LineTo(9.21f, 11.387f),
                    PathNode.CurveTo(8.901197f, 11.785086f, 8.936765f, 12.350732f, 9.293f, 12.707f),
                    PathNode.LineTo(12.293f, 15.707f),
                    PathNode.LineTo(12.387f, 15.79f),
                    PathNode.CurveTo(12.785086f, 16.098803f, 13.350732f, 16.063234f, 13.707f, 15.707f),
                    PathNode.LineTo(13.79f, 15.613f),
                    PathNode.CurveTo(14.098803f, 15.214914f, 14.063235f, 14.649268f, 13.707f, 14.293f),
                    PathNode.LineTo(11.415f, 12.0f),
                    PathNode.LineTo(13.707f, 9.707f),
                    PathNode.LineTo(13.79f, 9.613f),
                    PathNode.CurveTo(14.098803f, 9.214914f, 14.063235f, 8.649268f, 13.707f, 8.293f),
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
        return _squareChevronLeft!!
    }

private var _squareChevronLeft: ImageVector? = null
