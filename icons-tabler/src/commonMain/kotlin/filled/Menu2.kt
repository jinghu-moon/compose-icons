package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Menu2: ImageVector
    get() {
        if (_menu2 != null) return _menu2!!
        _menu2 = tablerFilledIcon(
            name = "Menu2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 6.552285f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.447715f, 7.0f, 3.0f, 6.552285f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 5.447716f, 3.447715f, 5.0f, 4.0f, 5.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.552284f, 5.0f, 21.0f, 5.447716f, 21.0f, 6.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 12.552285f, 20.552284f, 13.0f, 20.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.447715f, 13.0f, 3.0f, 12.552285f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(20.552284f, 11.0f, 21.0f, 11.447715f, 21.0f, 12.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 18.552284f, 20.552284f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(3.447715f, 19.0f, 3.0f, 18.552284f, 3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 17.447716f, 3.447715f, 17.0f, 4.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.552284f, 17.0f, 21.0f, 17.447716f, 21.0f, 18.0f)
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
        return _menu2!!
    }

private var _menu2: ImageVector? = null
