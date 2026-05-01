package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Directions: ImageVector
    get() {
        if (_directions != null) return _directions!!
        _directions = tablerFilledIcon(
            name = "Directions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 22.0f),
                    PathNode.CurveTo(9.447715f, 22.0f, 9.0f, 21.552284f, 9.0f, 21.0f),
                    PathNode.CurveTo(9.0f, 20.447716f, 9.447715f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 17.999f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(5.734805f, 17.999943f, 5.480493f, 17.89455f, 5.293f, 17.707f),
                    PathNode.LineTo(3.293f, 15.707f),
                    PathNode.CurveTo(2.902618f, 15.3165f, 2.902618f, 14.6835f, 3.293f, 14.293f),
                    PathNode.LineTo(5.293f, 12.293f),
                    PathNode.CurveTo(5.480493f, 12.105451f, 5.734805f, 12.000056f, 6.0f, 12.0f),
                    PathNode.LineTo(11.0f, 11.999f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(7.447716f, 10.0f, 7.0f, 9.552285f, 7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 4.447716f, 7.447716f, 4.0f, 8.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 2.447715f, 11.447715f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(12.552285f, 2.0f, 13.0f, 2.447715f, 13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.265194f, 4.000057f, 19.519506f, 4.105451f, 19.707f, 4.293f),
                    PathNode.LineTo(21.707f, 6.293f),
                    PathNode.CurveTo(22.097382f, 6.6835f, 22.097382f, 7.3165f, 21.707f, 7.707f),
                    PathNode.LineTo(19.707f, 9.707f),
                    PathNode.CurveTo(19.519506f, 9.894549f, 19.265194f, 9.999944f, 19.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 11.999f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.552285f, 12.0f, 15.0f, 12.447715f, 15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 17.552284f, 14.552285f, 18.0f, 14.0f, 18.0f),
                    PathNode.LineTo(13.0f, 17.999f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.552285f, 20.0f, 15.0f, 20.447716f, 15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.552284f, 14.552285f, 22.0f, 14.0f, 22.0f),
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
        return _directions!!
    }

private var _directions: ImageVector? = null
