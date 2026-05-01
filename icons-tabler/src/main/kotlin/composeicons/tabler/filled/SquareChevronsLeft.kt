package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsLeft: ImageVector
    get() {
        if (_squareChevronsLeft != null) return _squareChevronsLeft!!
        _squareChevronsLeft = tablerFilledIcon(
            name = "SquareChevronsLeft",
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
                    PathNode.MoveTo(16.707f, 8.293f),
                    PathNode.CurveTo(16.3165f, 7.902618f, 15.6835f, 7.902618f, 15.293f, 8.293f),
                    PathNode.LineTo(12.293f, 11.293f),
                    PathNode.LineTo(12.21f, 11.387f),
                    PathNode.CurveTo(11.901197f, 11.785086f, 11.936765f, 12.350732f, 12.293f, 12.707f),
                    PathNode.LineTo(15.293f, 15.707f),
                    PathNode.LineTo(15.387f, 15.79f),
                    PathNode.CurveTo(15.785086f, 16.098803f, 16.35073f, 16.063234f, 16.707f, 15.707f),
                    PathNode.LineTo(16.79f, 15.613f),
                    PathNode.CurveTo(17.098803f, 15.214914f, 17.063234f, 14.649268f, 16.707f, 14.293f),
                    PathNode.LineTo(14.415f, 12.0f),
                    PathNode.LineTo(16.707f, 9.707f),
                    PathNode.LineTo(16.79f, 9.613f),
                    PathNode.CurveTo(17.098803f, 9.214914f, 17.063234f, 8.649268f, 16.707f, 8.293f),
                    PathNode.Close,
                    PathNode.MoveTo(11.707f, 8.293f),
                    PathNode.CurveTo(11.3165f, 7.902618f, 10.6835f, 7.902618f, 10.293f, 8.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(7.21f, 11.387f),
                    PathNode.CurveTo(6.901198f, 11.785086f, 6.936765f, 12.350732f, 7.293f, 12.707f),
                    PathNode.LineTo(10.293f, 15.707f),
                    PathNode.LineTo(10.387f, 15.79f),
                    PathNode.CurveTo(10.785086f, 16.098803f, 11.350732f, 16.063234f, 11.707f, 15.707f),
                    PathNode.LineTo(11.79f, 15.613f),
                    PathNode.CurveTo(12.098803f, 15.214914f, 12.063235f, 14.649268f, 11.707f, 14.293f),
                    PathNode.LineTo(9.415f, 12.0f),
                    PathNode.LineTo(11.707f, 9.707f),
                    PathNode.LineTo(11.79f, 9.613f),
                    PathNode.CurveTo(12.098803f, 9.214914f, 12.063235f, 8.649268f, 11.707f, 8.293f),
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
        return _squareChevronsLeft!!
    }

private var _squareChevronsLeft: ImageVector? = null
