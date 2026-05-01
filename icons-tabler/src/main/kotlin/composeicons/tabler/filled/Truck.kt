package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = tablerFilledIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.552285f, 4.0f, 14.0f, 4.447716f, 14.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.304985f, 5.000005f, 18.593298f, 5.13919f, 18.783f, 5.378f),
                    PathNode.LineTo(18.857f, 5.486f),
                    PathNode.LineTo(21.857f, 10.486f),
                    PathNode.LineTo(21.912f, 10.589f),
                    PathNode.LineTo(21.952f, 10.696f),
                    PathNode.LineTo(21.981f, 10.805f),
                    PathNode.LineTo(21.997f, 10.915f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 17.552284f, 21.552284f, 18.0f, 21.0f, 18.0f),
                    PathNode.LineTo(19.829f, 18.0f),
                    PathNode.CurveTo(19.404768f, 19.198498f, 18.271366f, 19.99962f, 17.0f, 19.99962f),
                    PathNode.CurveTo(15.728634f, 19.99962f, 14.595232f, 19.198498f, 14.171f, 18.0f),
                    PathNode.LineTo(9.829f, 18.0f),
                    PathNode.CurveTo(9.404768f, 19.198498f, 8.271366f, 19.99962f, 7.0f, 19.99962f),
                    PathNode.CurveTo(5.728635f, 19.99962f, 4.595232f, 19.198498f, 4.171f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(2.447715f, 18.0f, 2.0f, 17.552284f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 4.895431f, 2.895431f, 4.0f, 4.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.CurveTo(6.447716f, 16.0f, 6.0f, 16.447716f, 6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 17.552284f, 6.447716f, 18.0f, 7.0f, 18.0f),
                    PathNode.CurveTo(7.552285f, 18.0f, 8.0f, 17.552284f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 16.447716f, 7.552285f, 16.0f, 7.0f, 16.0f),
                    PathNode.MoveTo(17.0f, 16.0f),
                    PathNode.CurveTo(16.447716f, 16.0f, 16.0f, 16.447716f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 17.552284f, 16.447716f, 18.0f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.552284f, 18.0f, 18.0f, 17.552284f, 18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 16.447716f, 17.552284f, 16.0f, 17.0f, 16.0f),
                    PathNode.MoveTo(17.434f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(19.234f, 10.0f),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
