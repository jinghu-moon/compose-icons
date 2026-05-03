package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tower: ImageVector
    get() {
        if (_tower != null) return _tower!!
        _tower = tablerOutlineIcon(
            name = "Tower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(6.552285f, 3.0f, 7.0f, 3.447715f, 7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 3.447715f, 10.447715f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(13.552285f, 3.0f, 14.0f, 3.447715f, 14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(17.0f, 3.447715f, 17.447716f, 3.0f, 18.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(19.552284f, 3.0f, 20.0f, 3.447715f, 20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 8.394f),
                    PathNode.CurveTo(20.000088f, 8.789064f, 19.883171f, 9.175306f, 19.664f, 9.504f),
                    PathNode.LineTo(18.336f, 11.496f),
                    PathNode.CurveTo(18.116829f, 11.824694f, 17.999912f, 12.210936f, 18.0f, 12.606f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 20.552284f, 17.552284f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.447716f, 21.0f, 6.0f, 20.552284f, 6.0f, 20.0f),
                    PathNode.LineTo(6.0f, 12.606f),
                    PathNode.CurveTo(6.000089f, 12.210936f, 5.883172f, 11.824694f, 5.664f, 11.496f),
                    PathNode.LineTo(4.336f, 9.504f),
                    PathNode.CurveTo(4.116828f, 9.175306f, 3.999911f, 8.789064f, 4.0f, 8.394f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 3.447715f, 4.447716f, 3.0f, 5.0f, 3.0f)
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
                    PathNode.MoveTo(10.0f, 21.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 14.895431f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 14.895431f, 14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 21.0f)
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
        return _tower!!
    }

private var _tower: ImageVector? = null
