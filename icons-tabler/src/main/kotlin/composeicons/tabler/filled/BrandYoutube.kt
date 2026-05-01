package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandYoutube: ImageVector
    get() {
        if (_brandYoutube != null) return _brandYoutube!!
        _brandYoutube = tablerFilledIcon(
            name = "BrandYoutube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(20.761423f, 3.0f, 23.0f, 5.238577f, 23.0f, 8.0f),
                    PathNode.LineTo(23.0f, 16.0f),
                    PathNode.CurveTo(23.0f, 18.761423f, 20.761423f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(3.238576f, 21.0f, 1.0f, 18.761423f, 1.0f, 16.0f),
                    PathNode.LineTo(1.0f, 8.0f),
                    PathNode.CurveTo(1.0f, 5.238577f, 3.238576f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.000284f, 15.360027f, 9.194078f, 15.69211f, 9.507393f, 15.869462f),
                    PathNode.CurveTo(9.820708f, 16.046814f, 10.205172f, 16.042055f, 10.514f, 15.857f),
                    PathNode.LineTo(15.514f, 12.857f),
                    PathNode.CurveTo(15.81474f, 12.676165f, 15.998684f, 12.350922f, 15.998684f, 12.0f),
                    PathNode.CurveTo(15.998684f, 11.649078f, 15.81474f, 11.323835f, 15.514f, 11.143f),
                    PathNode.LineTo(10.514f, 8.143f),
                    PathNode.CurveTo(10.205172f, 7.957946f, 9.820708f, 7.953186f, 9.507393f, 8.130538f),
                    PathNode.CurveTo(9.194078f, 8.30789f, 9.000284f, 8.639973f, 9.0f, 9.0f),
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
        return _brandYoutube!!
    }

private var _brandYoutube: ImageVector? = null
