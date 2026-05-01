package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandLinkedin: ImageVector
    get() {
        if (_brandLinkedin != null) return _brandLinkedin!!
        _brandLinkedin = tablerFilledIcon(
            name = "BrandLinkedin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(19.761423f, 2.0f, 22.0f, 4.238577f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(4.238577f, 22.0f, 2.0f, 19.761423f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.238577f, 4.238577f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.CurveTo(7.447716f, 10.0f, 7.0f, 10.447715f, 7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.CurveTo(7.0f, 16.552284f, 7.447716f, 17.0f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.552285f, 17.0f, 9.0f, 16.552284f, 9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 10.447715f, 8.552285f, 10.0f, 8.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.CurveTo(13.598803f, 9.999776f, 13.201636f, 10.080025f, 12.832f, 10.236f),
                    PathNode.LineTo(12.707f, 10.293f),
                    PathNode.CurveTo(12.421006f, 10.007092f, 11.990963f, 9.921578f, 11.617346f, 10.076322f),
                    PathNode.CurveTo(11.243728f, 10.231066f, 11.000087f, 10.595604f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.552284f, 11.447715f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.552285f, 17.0f, 13.0f, 16.552284f, 13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.0f, 12.447715f, 13.447715f, 12.0f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.552285f, 12.0f, 15.0f, 12.447715f, 15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 16.552284f, 15.447715f, 17.0f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.552284f, 17.0f, 17.0f, 16.552284f, 17.0f, 16.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 11.343145f, 15.656855f, 10.0f, 14.0f, 10.0f),
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(7.493026f, 7.000067f, 7.066316f, 7.379507f, 7.007f, 7.883f),
                    PathNode.LineTo(7.0f, 8.01f),
                    PathNode.CurveTo(7.000587f, 8.539093f, 7.413211f, 8.976165f, 7.941395f, 9.007172f),
                    PathNode.CurveTo(8.469579f, 9.038179f, 8.93051f, 8.65239f, 8.993f, 8.127f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 7.447716f, 8.552285f, 7.0f, 8.0f, 7.0f)
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
        return _brandLinkedin!!
    }

private var _brandLinkedin: ImageVector? = null
