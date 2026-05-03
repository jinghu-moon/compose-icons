package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceCream2: ImageVector
    get() {
        if (_iceCream2 != null) return _iceCream2!!
        _iceCream2 = tablerOutlineIcon(
            name = "IceCream2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.657f, 11.0f),
                    PathNode.CurveTo(18.535126f, 8.513732f, 17.687138f, 5.745541f, 15.56711f, 4.177705f),
                    PathNode.CurveTo(13.447082f, 2.609868f, 10.551919f, 2.609868f, 8.43189f, 4.177705f),
                    PathNode.CurveTo(6.311862f, 5.745541f, 5.463875f, 8.513732f, 6.342f, 11.0f)
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
                    PathNode.MoveTo(6.342f, 11.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(17.657f, 11.0f),
                    PathNode.LineTo(6.342f, 11.0f)
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
        return _iceCream2!!
    }

private var _iceCream2: ImageVector? = null
