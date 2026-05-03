package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber9: ImageVector
    get() {
        if (_circleNumber9 != null) return _circleNumber9!!
        _circleNumber9 = tablerFilledIcon(
            name = "CircleNumber9",
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
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(10.85f, 7.005f),
                    PathNode.CurveTo(9.866108f, 7.07894f, 9.083146f, 7.859354f, 9.006f, 8.843f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.005f, 11.15f),
                    PathNode.CurveTo(9.078939f, 12.133892f, 9.859354f, 12.916854f, 10.843f, 12.994f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(10.993f, 14.883f),
                    PathNode.CurveTo(10.93051f, 14.35761f, 10.469579f, 13.971821f, 9.941395f, 14.002828f),
                    PathNode.CurveTo(9.413211f, 14.033835f, 9.000587f, 14.470906f, 9.0f, 15.0f),
                    PathNode.CurveTo(8.999669f, 16.046625f, 9.806323f, 16.916504f, 10.85f, 16.995f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.15f, 16.995f),
                    PathNode.CurveTo(14.133892f, 16.92106f, 14.916854f, 16.140646f, 14.994f, 15.157f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.995f, 8.85f),
                    PathNode.CurveTo(14.921061f, 7.866108f, 14.140646f, 7.083146f, 13.157f, 7.006f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
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
        return _circleNumber9!!
    }

private var _circleNumber9: ImageVector? = null
