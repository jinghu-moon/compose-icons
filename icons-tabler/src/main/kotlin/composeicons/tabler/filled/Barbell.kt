package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = tablerFilledIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.552285f, 7.0f, 5.0f, 7.447716f, 5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(5.0f, 16.552284f, 4.552285f, 17.0f, 4.0f, 17.0f),
                    PathNode.CurveTo(3.447715f, 17.0f, 3.0f, 16.552284f, 3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.CurveTo(1.447715f, 13.0f, 1.0f, 12.552285f, 1.0f, 12.0f),
                    PathNode.CurveTo(1.0f, 11.447715f, 1.447715f, 11.0f, 2.0f, 11.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 7.447716f, 3.447715f, 7.0f, 4.0f, 7.0f)
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
                    PathNode.MoveTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.552284f, 7.0f, 21.0f, 7.447716f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.552284f, 11.0f, 23.0f, 11.447715f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 12.552285f, 22.552284f, 13.0f, 22.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 16.552284f, 20.552284f, 17.0f, 20.0f, 17.0f),
                    PathNode.CurveTo(19.447716f, 17.0f, 19.0f, 16.552284f, 19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 7.447716f, 19.447716f, 7.0f, 20.0f, 7.0f)
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
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.CurveTo(17.10457f, 5.0f, 18.0f, 5.895431f, 18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 18.10457f, 17.10457f, 19.0f, 16.0f, 19.0f),
                    PathNode.CurveTo(14.895431f, 19.0f, 14.0f, 18.10457f, 14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 18.10457f, 9.104569f, 19.0f, 8.0f, 19.0f),
                    PathNode.CurveTo(6.895431f, 19.0f, 6.0f, 18.10457f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 5.895431f, 6.895431f, 5.0f, 8.0f, 5.0f),
                    PathNode.CurveTo(9.104569f, 5.0f, 10.0f, 5.895431f, 10.0f, 7.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 5.895431f, 14.895431f, 5.0f, 16.0f, 5.0f)
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
