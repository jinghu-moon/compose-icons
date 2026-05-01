package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Favicon: ImageVector
    get() {
        if (_favicon != null) return _favicon!!
        _favicon = tablerFilledIcon(
            name = "Favicon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(21.209139f, 4.0f, 23.0f, 5.790861f, 23.0f, 8.0f),
                    PathNode.LineTo(23.0f, 16.0f),
                    PathNode.CurveTo(23.0f, 18.209139f, 21.209139f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(2.790861f, 20.0f, 1.0f, 18.209139f, 1.0f, 16.0f),
                    PathNode.LineTo(1.0f, 8.0f),
                    PathNode.CurveTo(1.0f, 5.790861f, 2.790861f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.447716f, 9.0f, 5.0f, 9.447715f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.0f, 14.552285f, 5.447716f, 15.0f, 6.0f, 15.0f),
                    PathNode.CurveTo(6.552285f, 15.0f, 7.0f, 14.552285f, 7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 9.447715f, 6.552285f, 9.0f, 6.0f, 9.0f),
                    PathNode.MoveTo(11.0f, 9.0f),
                    PathNode.CurveTo(9.343145f, 9.0f, 8.0f, 10.343145f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 13.656855f, 9.343145f, 15.0f, 11.0f, 15.0f),
                    PathNode.CurveTo(11.529094f, 14.999413f, 11.966165f, 14.586789f, 11.997172f, 14.058605f),
                    PathNode.CurveTo(12.028179f, 13.530421f, 11.64239f, 13.06949f, 11.117f, 13.007f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(10.470906f, 12.999413f, 10.033835f, 12.586789f, 10.002828f, 12.058605f),
                    PathNode.CurveTo(9.971821f, 11.530421f, 10.35761f, 11.06949f, 10.883f, 11.007f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.552285f, 11.0f, 12.0f, 10.552285f, 12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 9.447715f, 11.552285f, 9.0f, 11.0f, 9.0f),
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.CurveTo(14.411443f, 8.999911f, 13.098195f, 10.238178f, 13.005f, 11.824f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 13.656855f, 14.343145f, 15.0f, 16.0f, 15.0f),
                    PathNode.CurveTo(17.656855f, 15.0f, 19.0f, 13.656855f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 10.343145f, 17.656855f, 9.0f, 16.0f, 9.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 11.0f),
                    PathNode.CurveTo(15.447715f, 11.0f, 15.0f, 11.447715f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 12.552285f, 15.447715f, 13.0f, 16.0f, 13.0f),
                    PathNode.CurveTo(16.552284f, 13.0f, 17.0f, 12.552285f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 11.447715f, 16.552284f, 11.0f, 16.0f, 11.0f)
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
        return _favicon!!
    }

private var _favicon: ImageVector? = null
