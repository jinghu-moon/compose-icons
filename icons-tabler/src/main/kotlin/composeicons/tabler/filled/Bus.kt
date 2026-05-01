package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = tablerFilledIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.CurveTo(20.4f, 4.0f, 23.0f, 7.64f, 23.0f, 12.0f),
                    PathNode.LineTo(23.0f, 17.0f),
                    PathNode.CurveTo(23.0f, 17.552284f, 22.552284f, 18.0f, 22.0f, 18.0f),
                    PathNode.LineTo(20.829f, 18.0f),
                    PathNode.CurveTo(20.404768f, 19.198498f, 19.271366f, 19.99962f, 18.0f, 19.99962f),
                    PathNode.CurveTo(16.728634f, 19.99962f, 15.595232f, 19.198498f, 15.171f, 18.0f),
                    PathNode.LineTo(8.829f, 18.0f),
                    PathNode.CurveTo(8.404768f, 19.198498f, 7.271366f, 19.99962f, 6.0f, 19.99962f),
                    PathNode.CurveTo(4.728635f, 19.99962f, 3.595232f, 19.198498f, 3.171f, 18.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(1.447715f, 18.0f, 1.0f, 17.552284f, 1.0f, 17.0f),
                    PathNode.LineTo(1.0f, 6.0f),
                    PathNode.CurveTo(1.0f, 4.895431f, 1.895431f, 4.0f, 3.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.CurveTo(5.447716f, 16.0f, 5.0f, 16.447716f, 5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 17.552284f, 5.447716f, 18.0f, 6.0f, 18.0f),
                    PathNode.CurveTo(6.552285f, 18.0f, 7.0f, 17.552284f, 7.0f, 17.0f),
                    PathNode.CurveTo(7.0f, 16.447716f, 6.552285f, 16.0f, 6.0f, 16.0f),
                    PathNode.MoveTo(18.0f, 16.0f),
                    PathNode.CurveTo(17.447716f, 16.0f, 17.0f, 16.447716f, 17.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 17.552284f, 17.447716f, 18.0f, 18.0f, 18.0f),
                    PathNode.CurveTo(18.552284f, 18.0f, 19.0f, 17.552284f, 19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 16.447716f, 18.552284f, 16.0f, 18.0f, 16.0f),
                    PathNode.MoveTo(17.24f, 6.011f),
                    PathNode.LineTo(18.308f, 11.0f),
                    PathNode.LineTo(20.944f, 11.0f),
                    PathNode.CurveTo(20.631f, 8.244001f, 19.049f, 6.18f, 17.24f, 6.011f),
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 6.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.191f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(15.834f, 9.0f),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
