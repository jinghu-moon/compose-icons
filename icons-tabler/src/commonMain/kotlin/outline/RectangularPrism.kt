package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RectangularPrism: ImageVector
    get() {
        if (_rectangularPrism != null) return _rectangularPrism!!
        _rectangularPrism = tablerOutlineIcon(
            name = "RectangularPrism",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 14.008f),
                    PathNode.LineTo(21.0f, 8.99f),
                    PathNode.CurveTo(20.998756f, 8.279734f, 20.617168f, 7.624546f, 20.0f, 7.273f),
                    PathNode.LineTo(16.0f, 5.265f),
                    PathNode.CurveTo(15.380326f, 4.911002f, 14.619674f, 4.911002f, 14.0f, 5.265f),
                    PathNode.LineTo(4.0f, 10.273f),
                    PathNode.CurveTo(3.381f, 10.628f, 3.0f, 11.283f, 3.0f, 11.991f),
                    PathNode.LineTo(3.0f, 17.009f),
                    PathNode.CurveTo(3.0f, 17.718f, 3.381f, 18.372f, 4.0f, 18.726f),
                    PathNode.LineTo(8.0f, 20.734f),
                    PathNode.CurveTo(8.619674f, 21.087997f, 9.380326f, 21.087997f, 10.0f, 20.734f),
                    PathNode.LineTo(20.0f, 15.726f),
                    PathNode.CurveTo(20.619f, 15.371f, 21.0f, 14.716f, 21.0f, 14.008f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 13.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 13.5f),
                    PathNode.LineTo(20.5f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.5f, 11.0f),
                    PathNode.LineTo(9.0f, 13.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rectangularPrism!!
    }

private var _rectangularPrism: ImageVector? = null
