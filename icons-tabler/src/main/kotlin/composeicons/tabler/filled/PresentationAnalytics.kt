package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PresentationAnalytics: ImageVector
    get() {
        if (_presentationAnalytics != null) return _presentationAnalytics!!
        _presentationAnalytics = tablerFilledIcon(
            name = "PresentationAnalytics",
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
                    PathNode.MoveTo(9.0f, 7.0f),
                    PathNode.CurveTo(8.447715f, 7.0f, 8.0f, 7.447716f, 8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.552285f, 13.0f, 10.0f, 12.552285f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(10.0f, 7.447716f, 9.552285f, 7.0f, 9.0f, 7.0f),
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.CurveTo(14.447715f, 9.0f, 14.0f, 9.447715f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 12.552285f, 14.447715f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.552285f, 13.0f, 16.0f, 12.552285f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 9.447715f, 15.552285f, 9.0f, 15.0f, 9.0f),
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(11.447715f, 10.0f, 11.0f, 10.447715f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.552285f, 13.0f, 13.0f, 12.552285f, 13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 10.447715f, 12.552285f, 10.0f, 12.0f, 10.0f)
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
        return _presentationAnalytics!!
    }

private var _presentationAnalytics: ImageVector? = null
