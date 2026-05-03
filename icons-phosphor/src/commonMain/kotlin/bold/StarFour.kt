package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorBoldIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.86f, 109.25f),
                    PathNode.LineTo(169.18f, 86.82f),
                    PathNode.LineTo(146.75f, 25.14f),
                    PathNode.CurveTo(143.88397f, 17.254374f, 136.3903f, 12.00469f, 128.0f, 12.00469f),
                    PathNode.CurveTo(119.609695f, 12.00469f, 112.116035f, 17.254374f, 109.25f, 25.14f),
                    PathNode.LineTo(86.82f, 86.82f),
                    PathNode.LineTo(25.14f, 109.25f),
                    PathNode.CurveTo(17.254374f, 112.116035f, 12.00469f, 119.609695f, 12.00469f, 128.0f),
                    PathNode.CurveTo(12.00469f, 136.3903f, 17.254374f, 143.88397f, 25.14f, 146.75f),
                    PathNode.LineTo(86.82f, 169.18f),
                    PathNode.LineTo(109.25f, 230.86f),
                    PathNode.CurveTo(112.116035f, 238.74562f, 119.609695f, 243.99532f, 128.0f, 243.99532f),
                    PathNode.CurveTo(136.3903f, 243.99532f, 143.88397f, 238.74562f, 146.75f, 230.86f),
                    PathNode.LineTo(169.18f, 169.18f),
                    PathNode.LineTo(230.86f, 146.75f),
                    PathNode.CurveTo(238.74562f, 143.88397f, 243.99532f, 136.3903f, 243.99532f, 128.0f),
                    PathNode.CurveTo(243.99532f, 119.609695f, 238.74562f, 112.116035f, 230.86f, 109.25f),
                    PathNode.Close,
                    PathNode.MoveTo(155.72f, 148.54f),
                    PathNode.CurveTo(152.38211f, 149.75294f, 149.75294f, 152.38211f, 148.54f, 155.72f),
                    PathNode.LineTo(128.0f, 212.21f),
                    PathNode.LineTo(107.46f, 155.72f),
                    PathNode.CurveTo(106.247055f, 152.38211f, 103.61789f, 149.75294f, 100.28f, 148.54f),
                    PathNode.LineTo(43.79f, 128.0f),
                    PathNode.LineTo(100.28f, 107.46f),
                    PathNode.CurveTo(103.61789f, 106.247055f, 106.247055f, 103.61789f, 107.46f, 100.28f),
                    PathNode.LineTo(128.0f, 43.79f),
                    PathNode.LineTo(148.54f, 100.28f),
                    PathNode.CurveTo(149.75294f, 103.61789f, 152.38211f, 106.247055f, 155.72f, 107.46f),
                    PathNode.LineTo(212.21f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _starFour!!
    }

private var _starFour: ImageVector? = null
