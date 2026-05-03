package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AdjustmentsHorizontal: ImageVector
    get() {
        if (_adjustmentsHorizontal != null) return _adjustmentsHorizontal!!
        _adjustmentsHorizontal = tablerFilledIcon(
            name = "AdjustmentsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.CurveTo(18.306f, 15.0f, 19.418f, 15.835f, 19.83f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.552284f, 17.0f, 21.0f, 17.447716f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 18.552284f, 20.552284f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(19.829f, 19.0f),
                    PathNode.CurveTo(19.404768f, 20.198498f, 18.271366f, 20.99962f, 17.0f, 20.99962f),
                    PathNode.CurveTo(15.728634f, 20.99962f, 14.595232f, 20.198498f, 14.171f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(3.447715f, 19.0f, 3.0f, 18.552284f, 3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 17.447716f, 3.447715f, 17.0f, 4.0f, 17.0f),
                    PathNode.LineTo(14.173f, 17.0f),
                    PathNode.CurveTo(14.583f, 15.835f, 15.693f, 15.0f, 17.0f, 15.0f),
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.CurveTo(9.306f, 9.0f, 10.418f, 9.835f, 10.83f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(20.552284f, 11.0f, 21.0f, 11.447715f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 12.552285f, 20.552284f, 13.0f, 20.0f, 13.0f),
                    PathNode.LineTo(10.829f, 13.0f),
                    PathNode.CurveTo(10.404768f, 14.198499f, 9.271366f, 14.999621f, 8.0f, 14.999621f),
                    PathNode.CurveTo(6.728635f, 14.999621f, 5.595232f, 14.198499f, 5.171f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.447715f, 13.0f, 3.0f, 12.552285f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(5.173f, 11.0f),
                    PathNode.CurveTo(5.583f, 9.835f, 6.693f, 9.0f, 8.0f, 9.0f),
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.CurveTo(15.306f, 3.0f, 16.418f, 3.835f, 16.83f, 5.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.552284f, 5.0f, 21.0f, 5.447716f, 21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 6.552285f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(16.829f, 7.0f),
                    PathNode.CurveTo(16.404768f, 8.198499f, 15.271366f, 8.999621f, 14.0f, 8.999621f),
                    PathNode.CurveTo(12.728634f, 8.999621f, 11.595232f, 8.198499f, 11.171f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.447715f, 7.0f, 3.0f, 6.552285f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 5.447716f, 3.447715f, 5.0f, 4.0f, 5.0f),
                    PathNode.LineTo(11.173f, 5.0f),
                    PathNode.CurveTo(11.583f, 3.835f, 12.693f, 3.0f, 14.0f, 3.0f)
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
        return _adjustmentsHorizontal!!
    }

private var _adjustmentsHorizontal: ImageVector? = null
