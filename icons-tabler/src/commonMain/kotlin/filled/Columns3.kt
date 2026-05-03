package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Columns3: ImageVector
    get() {
        if (_columns3 != null) return _columns3!!
        _columns3 = tablerFilledIcon(
            name = "Columns3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.552285f, 2.0f, 7.0f, 2.447715f, 7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 21.552284f, 6.552285f, 22.0f, 6.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.895431f, 22.0f, 2.0f, 21.10457f, 2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 2.447715f, 9.447715f, 2.0f, 10.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.552285f, 2.0f, 15.0f, 2.447715f, 15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.552284f, 14.552285f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(9.447715f, 22.0f, 9.0f, 21.552284f, 9.0f, 21.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.CurveTo(21.10457f, 2.0f, 22.0f, 2.895431f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(17.447716f, 22.0f, 17.0f, 21.552284f, 17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.0f, 2.447715f, 17.447716f, 2.0f, 18.0f, 2.0f)
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
        return _columns3!!
    }

private var _columns3: ImageVector? = null
