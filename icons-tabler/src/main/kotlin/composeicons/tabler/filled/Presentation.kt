package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = tablerFilledIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(21.552284f, 3.0f, 22.0f, 3.447715f, 22.0f, 4.0f),
                    PathNode.CurveTo(22.0f, 4.552285f, 21.552284f, 5.0f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 15.656855f, 19.656855f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.552285f, 19.0f, 16.0f, 19.447716f, 16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 20.552284f, 15.552285f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(8.447715f, 21.0f, 8.0f, 20.552284f, 8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 19.447716f, 8.447715f, 19.0f, 9.0f, 19.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(4.343146f, 17.0f, 3.0f, 15.656855f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(2.447715f, 5.0f, 2.0f, 4.552285f, 2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 3.447715f, 2.447715f, 3.0f, 3.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.707f, 7.293f),
                    PathNode.CurveTo(16.3165f, 6.902618f, 15.6835f, 6.902618f, 15.293f, 7.293f),
                    PathNode.LineTo(13.0f, 9.585f),
                    PathNode.LineTo(11.707f, 8.293f),
                    PathNode.CurveTo(11.3165f, 7.902618f, 10.6835f, 7.902618f, 10.293f, 8.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(6.902618f, 11.6835f, 6.902618f, 12.3165f, 7.293f, 12.707f),
                    PathNode.LineTo(7.387f, 12.79f),
                    PathNode.CurveTo(7.785085f, 13.098803f, 8.350732f, 13.063235f, 8.707f, 12.707f),
                    PathNode.LineTo(11.0f, 10.415f),
                    PathNode.LineTo(12.293f, 11.707f),
                    PathNode.CurveTo(12.6835f, 12.097382f, 13.3165f, 12.097382f, 13.707f, 11.707f),
                    PathNode.LineTo(16.707f, 8.707f),
                    PathNode.CurveTo(17.097382f, 8.3165f, 17.097382f, 7.6835f, 16.707f, 7.293f)
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
