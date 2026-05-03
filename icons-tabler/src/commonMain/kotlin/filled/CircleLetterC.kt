package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterC: ImageVector
    get() {
        if (_circleLetterC != null) return _circleLetterC!!
        _circleLetterC = tablerFilledIcon(
            name = "CircleLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 10.343145f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.656855f, 17.0f, 15.0f, 15.656855f, 15.0f, 14.0f),
                    PathNode.CurveTo(14.999413f, 13.470906f, 14.586789f, 13.033835f, 14.058605f, 13.002828f),
                    PathNode.CurveTo(13.530421f, 12.971821f, 13.06949f, 13.35761f, 13.007f, 13.883f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 14.552285f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 14.552285f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.000587f, 9.470906f, 11.413211f, 9.033835f, 11.941395f, 9.002828f),
                    PathNode.CurveTo(12.469579f, 8.971821f, 12.93051f, 9.35761f, 12.993f, 9.883f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 13.447715f, 11.0f, 14.0f, 11.0f),
                    PathNode.CurveTo(14.552285f, 11.0f, 15.0f, 10.552285f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f)
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
        return _circleLetterC!!
    }

private var _circleLetterC: ImageVector? = null
