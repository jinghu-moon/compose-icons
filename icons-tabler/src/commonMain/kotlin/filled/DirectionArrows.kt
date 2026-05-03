package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionArrows: ImageVector
    get() {
        if (_directionArrows != null) return _directionArrows!!
        _directionArrows = tablerFilledIcon(
            name = "DirectionArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.LineTo(2.004f, 11.72f),
                    PathNode.CurveTo(2.152f, 6.327f, 6.57f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(11.707f, 15.293f),
                    PathNode.CurveTo(11.314621f, 14.914028f, 10.690915f, 14.919448f, 10.305182f, 15.305182f),
                    PathNode.CurveTo(9.919448f, 15.690915f, 9.914028f, 16.314621f, 10.293f, 16.707f),
                    PathNode.LineTo(11.293f, 17.707f),
                    PathNode.CurveTo(11.6835f, 18.097382f, 12.3165f, 18.097382f, 12.707f, 17.707f),
                    PathNode.LineTo(13.707f, 16.707f),
                    PathNode.CurveTo(14.097382f, 16.3165f, 14.097382f, 15.6835f, 13.707f, 15.293f),
                    PathNode.LineTo(13.613f, 15.21f),
                    PathNode.CurveTo(13.214914f, 14.901197f, 12.649268f, 14.936765f, 12.293f, 15.293f),
                    PathNode.LineTo(12.0f, 15.585f),
                    PathNode.Close,
                    PathNode.MoveTo(8.707f, 10.293f),
                    PathNode.CurveTo(8.3165f, 9.902618f, 7.6835f, 9.902618f, 7.293f, 10.293f),
                    PathNode.LineTo(6.293f, 11.293f),
                    PathNode.CurveTo(5.902618f, 11.6835f, 5.902618f, 12.3165f, 6.293f, 12.707f),
                    PathNode.LineTo(7.293f, 13.707f),
                    PathNode.CurveTo(7.6835f, 14.097382f, 8.3165f, 14.097382f, 8.707f, 13.707f),
                    PathNode.LineTo(8.79f, 13.613f),
                    PathNode.CurveTo(9.098803f, 13.214914f, 9.063235f, 12.649268f, 8.707f, 12.293f),
                    PathNode.LineTo(8.415f, 12.0f),
                    PathNode.LineTo(8.707f, 11.707f),
                    PathNode.CurveTo(9.097382f, 11.3165f, 9.097382f, 10.6835f, 8.707f, 10.293f),
                    PathNode.MoveTo(16.707f, 10.293f),
                    PathNode.CurveTo(16.3165f, 9.902618f, 15.6835f, 9.902618f, 15.293f, 10.293f),
                    PathNode.LineTo(15.21f, 10.387f),
                    PathNode.CurveTo(14.901197f, 10.785086f, 14.936765f, 11.350732f, 15.293f, 11.707f),
                    PathNode.LineTo(15.585f, 11.999f),
                    PathNode.LineTo(15.293f, 12.293f),
                    PathNode.CurveTo(14.914028f, 12.685379f, 14.919448f, 13.309085f, 15.305182f, 13.694818f),
                    PathNode.CurveTo(15.690915f, 14.080552f, 16.314621f, 14.085972f, 16.707f, 13.707f),
                    PathNode.LineTo(17.707f, 12.707f),
                    PathNode.CurveTo(18.097382f, 12.3165f, 18.097382f, 11.6835f, 17.707f, 11.293f),
                    PathNode.Close,
                    PathNode.MoveTo(12.707f, 6.293f),
                    PathNode.CurveTo(12.3165f, 5.902618f, 11.6835f, 5.902618f, 11.293f, 6.293f),
                    PathNode.LineTo(10.293f, 7.293f),
                    PathNode.CurveTo(9.902618f, 7.6835f, 9.902618f, 8.3165f, 10.293f, 8.707f),
                    PathNode.LineTo(10.387f, 8.79f),
                    PathNode.CurveTo(10.785086f, 9.098803f, 11.350732f, 9.063235f, 11.707f, 8.707f),
                    PathNode.LineTo(12.0f, 8.415f),
                    PathNode.LineTo(12.293f, 8.707f),
                    PathNode.CurveTo(12.685379f, 9.085972f, 13.309085f, 9.080552f, 13.694818f, 8.694818f),
                    PathNode.CurveTo(14.080552f, 8.309085f, 14.085972f, 7.685379f, 13.707f, 7.293f),
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
        return _directionArrows!!
    }

private var _directionArrows: ImageVector? = null
