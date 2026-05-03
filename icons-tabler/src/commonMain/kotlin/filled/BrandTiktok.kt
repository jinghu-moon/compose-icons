package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerFilledIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.083f, 2.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.CurveTo(11.447715f, 2.0f, 11.0f, 2.447715f, 11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 14.5f),
                    PathNode.CurveTo(11.00034f, 15.186173f, 10.535027f, 15.785094f, 9.870063f, 15.954379f),
                    PathNode.CurveTo(9.205099f, 16.123663f, 8.510044f, 15.820147f, 8.18224f, 15.217339f),
                    PathNode.CurveTo(7.854435f, 14.614531f, 7.977466f, 13.86614f, 8.481f, 13.4f),
                    PathNode.LineTo(8.601f, 13.3f),
                    PathNode.CurveTo(8.852429f, 13.110936f, 9.000237f, 12.814582f, 9.0f, 12.5f),
                    PathNode.LineTo(9.0f, 8.174f),
                    PathNode.CurveTo(9.000248f, 7.868187f, 8.860549f, 7.579072f, 8.620801f, 7.389222f),
                    PathNode.CurveTo(8.381053f, 7.199373f, 8.067615f, 7.129663f, 7.77f, 7.2f),
                    PathNode.CurveTo(4.062642f, 8.073737f, 1.598937f, 11.587598f, 2.041159f, 15.370767f),
                    PathNode.CurveTo(2.483381f, 19.153934f, 5.691077f, 22.004856f, 9.5f, 22.0f),
                    PathNode.LineTo(9.743f, 21.995f),
                    PathNode.CurveTo(13.788f, 21.863873f, 16.999426f, 18.547125f, 17.0f, 14.5f),
                    PathNode.LineTo(17.0f, 11.8f),
                    PathNode.LineTo(17.311f, 11.953f),
                    PathNode.CurveTo(18.433f, 12.483f, 19.644f, 12.821f, 20.901f, 12.946f),
                    PathNode.CurveTo(21.18221f, 12.973977f, 21.462132f, 12.881663f, 21.671532f, 12.691889f),
                    PathNode.CurveTo(21.880932f, 12.502114f, 22.000257f, 12.232599f, 22.0f, 11.95f),
                    PathNode.LineTo(22.0f, 7.917f),
                    PathNode.CurveTo(21.999937f, 7.428822f, 21.647406f, 7.012038f, 21.166f, 6.931f),
                    PathNode.CurveTo(19.068623f, 6.575124f, 17.425388f, 4.93229f, 17.069f, 2.835f),
                    PathNode.CurveTo(16.988398f, 2.353198f, 16.571497f, 2.000144f, 16.083f, 2.0f),
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
