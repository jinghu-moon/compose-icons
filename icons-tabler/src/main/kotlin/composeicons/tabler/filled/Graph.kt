package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = tablerFilledIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.707f, 9.293f),
                    PathNode.CurveTo(15.3165f, 8.902618f, 14.6835f, 8.902618f, 14.293f, 9.293f),
                    PathNode.LineTo(12.0f, 11.585f),
                    PathNode.LineTo(10.707f, 10.293f),
                    PathNode.CurveTo(10.3165f, 9.902618f, 9.6835f, 9.902618f, 9.293f, 10.293f),
                    PathNode.LineTo(6.293f, 13.293f),
                    PathNode.CurveTo(5.902618f, 13.6835f, 5.902618f, 14.3165f, 6.293f, 14.707f),
                    PathNode.LineTo(6.387f, 14.79f),
                    PathNode.CurveTo(6.785085f, 15.098803f, 7.350732f, 15.063235f, 7.707f, 14.707f),
                    PathNode.LineTo(10.0f, 12.415f),
                    PathNode.LineTo(11.293f, 13.707f),
                    PathNode.LineTo(11.387f, 13.79f),
                    PathNode.CurveTo(11.785086f, 14.098803f, 12.350732f, 14.063235f, 12.707f, 13.707f),
                    PathNode.LineTo(15.0f, 11.415f),
                    PathNode.LineTo(16.293f, 12.707f),
                    PathNode.CurveTo(16.685379f, 13.085972f, 17.309084f, 13.080552f, 17.694818f, 12.694818f),
                    PathNode.CurveTo(18.080553f, 12.309085f, 18.085972f, 11.685379f, 17.707f, 11.293f),
                    PathNode.LineTo(15.707f, 9.293f),
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
        return _graph!!
    }

private var _graph: ImageVector? = null
