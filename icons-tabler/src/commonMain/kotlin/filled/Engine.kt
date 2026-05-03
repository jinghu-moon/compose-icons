package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = tablerFilledIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.552285f, 4.0f, 15.0f, 4.447716f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 5.552285f, 14.552285f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.383f, 7.0f),
                    PathNode.CurveTo(14.139971f, 7.000783f, 14.831635f, 7.428863f, 15.17f, 8.106f),
                    PathNode.LineTo(16.62f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.000067f, 9.493025f, 17.379507f, 9.066316f, 17.883f, 9.007f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(21.10457f, 9.0f, 22.0f, 9.895431f, 22.0f, 11.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.10457f, 21.10457f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(17.447716f, 19.0f, 17.0f, 18.552284f, 17.0f, 18.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(16.000332f, 19.046625f, 15.193677f, 19.916504f, 14.15f, 19.995f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(10.535f, 20.0f),
                    PathNode.CurveTo(9.866443f, 20.0001f, 9.242049f, 19.66614f, 8.871f, 19.11f),
                    PathNode.LineTo(7.464f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(5.493026f, 16.999933f, 5.066316f, 16.620493f, 5.007f, 16.117f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 16.552284f, 3.552285f, 17.0f, 3.0f, 17.0f),
                    PathNode.CurveTo(2.447715f, 17.0f, 2.0f, 16.552284f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 9.447715f, 2.447715f, 9.0f, 3.0f, 9.0f),
                    PathNode.CurveTo(3.552285f, 9.0f, 4.0f, 9.447715f, 4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 9.447715f, 5.447716f, 9.0f, 6.0f, 9.0f),
                    PathNode.LineTo(7.584f, 9.0f),
                    PathNode.LineTo(9.293f, 7.293f),
                    PathNode.CurveTo(9.448553f, 7.13758f, 9.650997f, 7.037763f, 9.869f, 7.009f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(9.447715f, 6.0f, 9.0f, 5.552285f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 4.447716f, 9.447715f, 4.0f, 10.0f, 4.0f),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
