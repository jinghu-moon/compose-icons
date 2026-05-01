package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVercel: ImageVector
    get() {
        if (_brandVercel != null) return _brandVercel!!
        _brandVercel = tablerFilledIcon(
            name = "BrandVercel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.143f, 3.486f),
                    PathNode.CurveTo(11.323835f, 3.18526f, 11.649078f, 3.001316f, 12.0f, 3.001316f),
                    PathNode.CurveTo(12.350922f, 3.001316f, 12.676165f, 3.18526f, 12.857f, 3.486f),
                    PathNode.LineTo(21.857f, 18.486f),
                    PathNode.CurveTo(22.042055f, 18.794828f, 22.046814f, 19.179293f, 21.869461f, 19.492607f),
                    PathNode.CurveTo(21.69211f, 19.805922f, 21.360027f, 19.999716f, 21.0f, 20.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(2.639973f, 19.999716f, 2.30789f, 19.805922f, 2.130538f, 19.492607f),
                    PathNode.CurveTo(1.953186f, 19.179293f, 1.957946f, 18.794828f, 2.143f, 18.486f),
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
        return _brandVercel!!
    }

private var _brandVercel: ImageVector? = null
