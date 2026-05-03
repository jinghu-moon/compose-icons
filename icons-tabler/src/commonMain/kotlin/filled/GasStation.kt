package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GasStation: ImageVector
    get() {
        if (_gasStation != null) return _gasStation!!
        _gasStation = tablerFilledIcon(
            name = "GasStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.CurveTo(2.447715f, 21.0f, 2.0f, 20.552284f, 2.0f, 20.0f),
                    PathNode.CurveTo(2.0f, 19.447716f, 2.447715f, 19.0f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.656855f, 3.0f, 15.0f, 4.343146f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(16.656855f, 10.0f, 18.0f, 11.343145f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 16.276142f, 18.223858f, 16.5f, 18.5f, 16.5f),
                    PathNode.CurveTo(18.776142f, 16.5f, 19.0f, 16.276142f, 19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(17.89543f, 10.0f, 17.0f, 9.104569f, 17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 7.415f),
                    PathNode.LineTo(16.293f, 6.707f),
                    PathNode.CurveTo(15.936765f, 6.350732f, 15.901197f, 5.785085f, 16.21f, 5.387f),
                    PathNode.LineTo(16.293f, 5.293f),
                    PathNode.CurveTo(16.6835f, 4.902618f, 17.3165f, 4.902618f, 17.707f, 5.293f),
                    PathNode.LineTo(20.71f, 8.295f),
                    PathNode.LineTo(20.805f, 8.407f),
                    PathNode.LineTo(20.833f, 8.447f),
                    PathNode.LineTo(20.877f, 8.52f),
                    PathNode.LineTo(20.929f, 8.63f),
                    PathNode.LineTo(20.96f, 8.72f),
                    PathNode.LineTo(20.98f, 8.796f),
                    PathNode.LineTo(20.992f, 8.874f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 17.380713f, 19.880713f, 18.5f, 18.5f, 18.5f),
                    PathNode.CurveTo(17.119287f, 18.5f, 16.0f, 17.380713f, 16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(16.0f, 12.447715f, 15.552285f, 12.0f, 15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.552285f, 19.0f, 16.0f, 19.447716f, 16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 20.552284f, 15.552285f, 21.0f, 15.0f, 21.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(5.447716f, 5.0f, 5.0f, 5.447716f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 5.447716f, 12.552285f, 5.0f, 12.0f, 5.0f)
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
        return _gasStation!!
    }

private var _gasStation: ImageVector? = null
