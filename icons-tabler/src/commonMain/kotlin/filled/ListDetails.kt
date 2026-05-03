package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ListDetails: ImageVector
    get() {
        if (_listDetails != null) return _listDetails!!
        _listDetails = tablerFilledIcon(
            name = "ListDetails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 5.552285f, 21.552284f, 6.0f, 21.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(12.447715f, 6.0f, 12.0f, 5.552285f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.0f, 4.447716f, 12.447715f, 4.0f, 13.0f, 4.0f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.CurveTo(21.552284f, 4.0f, 22.0f, 4.447716f, 22.0f, 5.0f),
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 9.552285f, 18.552284f, 10.0f, 18.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(12.447715f, 10.0f, 12.0f, 9.552285f, 12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 8.447715f, 12.447715f, 8.0f, 13.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.552284f, 8.0f, 19.0f, 8.447715f, 19.0f, 9.0f),
                    PathNode.MoveTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 15.552285f, 21.552284f, 16.0f, 21.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(12.447715f, 16.0f, 12.0f, 15.552285f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 14.447715f, 12.447715f, 14.0f, 13.0f, 14.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.552284f, 14.0f, 22.0f, 14.447715f, 22.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 19.552284f, 18.552284f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.CurveTo(12.447715f, 20.0f, 12.0f, 19.552284f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.0f, 18.447716f, 12.447715f, 18.0f, 13.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.552284f, 18.0f, 19.0f, 18.447716f, 19.0f, 19.0f),
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.CurveTo(9.104569f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 10.104569f, 9.104569f, 11.0f, 8.0f, 11.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(2.895431f, 11.0f, 2.0f, 10.104569f, 2.0f, 9.0f),
                    PathNode.LineTo(2.001f, 4.949f),
                    PathNode.LineTo(2.005f, 4.898f),
                    PathNode.CurveTo(2.05728f, 3.834474f, 2.935191f, 2.999249f, 4.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.CurveTo(9.104569f, 13.0f, 10.0f, 13.895431f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.10457f, 9.104569f, 21.0f, 8.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(2.895431f, 21.0f, 2.0f, 20.10457f, 2.0f, 19.0f),
                    PathNode.LineTo(2.001f, 14.949f),
                    PathNode.LineTo(2.005f, 14.898f),
                    PathNode.CurveTo(2.05728f, 13.834475f, 2.935191f, 12.999249f, 4.0f, 13.0f),
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
        return _listDetails!!
    }

private var _listDetails: ImageVector? = null
