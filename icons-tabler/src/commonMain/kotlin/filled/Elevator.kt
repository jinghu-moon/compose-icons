package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = tablerFilledIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.10457f, 3.0f, 20.0f, 3.895431f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.895431f, 4.895431f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.707f, 13.293f),
                    PathNode.CurveTo(10.455926f, 13.033044f, 10.084122f, 12.928787f, 9.734492f, 13.020303f),
                    PathNode.CurveTo(9.384863f, 13.111818f, 9.111818f, 13.384863f, 9.020303f, 13.734492f),
                    PathNode.CurveTo(8.928787f, 14.084122f, 9.033044f, 14.455926f, 9.293f, 14.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.CurveTo(11.6835f, 17.097382f, 12.3165f, 17.097382f, 12.707f, 16.707f),
                    PathNode.LineTo(14.707f, 14.707f),
                    PathNode.CurveTo(15.097382f, 14.3165f, 15.097382f, 13.6835f, 14.707f, 13.293f),
                    PathNode.LineTo(14.613f, 13.21f),
                    PathNode.CurveTo(14.214914f, 12.901197f, 13.649268f, 12.936765f, 13.293f, 13.293f),
                    PathNode.LineTo(11.999f, 14.585f),
                    PathNode.Close,
                    PathNode.MoveTo(12.707f, 7.293f),
                    PathNode.CurveTo(12.3165f, 6.902618f, 11.6835f, 6.902618f, 11.293f, 7.293f),
                    PathNode.LineTo(9.293f, 9.293f),
                    PathNode.CurveTo(8.902618f, 9.6835f, 8.902618f, 10.3165f, 9.293f, 10.707f),
                    PathNode.LineTo(9.387f, 10.79f),
                    PathNode.CurveTo(9.785086f, 11.098803f, 10.350732f, 11.063235f, 10.707f, 10.707f),
                    PathNode.LineTo(12.0f, 9.415f),
                    PathNode.LineTo(13.293f, 10.707f),
                    PathNode.CurveTo(13.685379f, 11.085972f, 14.309085f, 11.080552f, 14.694818f, 10.694818f),
                    PathNode.CurveTo(15.080552f, 10.309085f, 15.085972f, 9.685379f, 14.707f, 9.293f),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
