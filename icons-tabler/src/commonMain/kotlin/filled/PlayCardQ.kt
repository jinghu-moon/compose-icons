package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardQ: ImageVector
    get() {
        if (_playCardQ != null) return _playCardQ!!
        _playCardQ = tablerFilledIcon(
            name = "PlayCardQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.01f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(16.470907f, 18.000587f, 16.033834f, 18.41321f, 16.002829f, 18.941395f),
                    PathNode.CurveTo(15.971821f, 19.46958f, 16.357609f, 19.93051f, 16.883f, 19.993f),
                    PathNode.LineTo(17.01f, 20.0f),
                    PathNode.CurveTo(17.562284f, 20.0f, 18.01f, 19.552284f, 18.01f, 19.0f),
                    PathNode.CurveTo(18.01f, 18.447716f, 17.562284f, 18.0f, 17.01f, 18.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.999676f, 14.030273f, 9.528051f, 14.98864f, 10.399445f, 15.538309f),
                    PathNode.CurveTo(11.270838f, 16.087978f, 12.363331f, 16.152048f, 13.293f, 15.708f),
                    PathNode.LineTo(13.793f, 16.208f),
                    PathNode.CurveTo(14.183742f, 16.598465f, 14.817035f, 16.598242f, 15.2075f, 16.2075f),
                    PathNode.CurveTo(15.597965f, 15.816758f, 15.597741f, 15.183465f, 15.207f, 14.793f),
                    PathNode.LineTo(14.708f, 14.293f),
                    PathNode.CurveTo(14.895f, 13.901f, 15.0f, 13.463f, 15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.552285f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.0f, 13.552285f, 12.552285f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(11.447715f, 14.0f, 11.0f, 13.552285f, 11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 10.447715f, 11.447715f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(7.01f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(6.470907f, 4.000587f, 6.033836f, 4.413211f, 6.002828f, 4.941395f),
                    PathNode.CurveTo(5.971821f, 5.469579f, 6.35761f, 5.930509f, 6.883f, 5.993f),
                    PathNode.LineTo(7.01f, 6.0f),
                    PathNode.CurveTo(7.562285f, 6.0f, 8.01f, 5.552285f, 8.01f, 5.0f),
                    PathNode.CurveTo(8.01f, 4.447716f, 7.562285f, 4.0f, 7.01f, 4.0f)
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
        return _playCardQ!!
    }

private var _playCardQ: ImageVector? = null
