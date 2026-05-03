package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerFilledIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.CurveTo(15.447715f, 19.0f, 15.0f, 18.552284f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 17.447716f, 15.447715f, 17.0f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.552284f, 17.0f, 17.0f, 16.552284f, 17.0f, 16.0f),
                    PathNode.CurveTo(17.0f, 14.667f, 19.0f, 14.667f, 19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 16.552284f, 19.447716f, 17.0f, 20.0f, 17.0f),
                    PathNode.CurveTo(21.333f, 17.0f, 21.333f, 19.0f, 20.0f, 19.0f),
                    PathNode.CurveTo(19.447716f, 19.0f, 19.0f, 19.447716f, 19.0f, 20.0f),
                    PathNode.CurveTo(19.0f, 21.333f, 17.0f, 21.333f, 17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 19.447716f, 16.552284f, 19.0f, 16.0f, 19.0f)
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
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.CurveTo(5.761424f, 11.0f, 8.0f, 8.761424f, 8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 4.667f, 10.0f, 4.667f, 10.0f, 6.0f),
                    PathNode.CurveTo(10.0f, 8.761424f, 12.238576f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(16.333f, 11.0f, 16.333f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(12.238576f, 13.0f, 10.0f, 15.238576f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 18.552284f, 9.552285f, 19.0f, 9.0f, 19.0f),
                    PathNode.CurveTo(8.447715f, 19.0f, 8.0f, 18.552284f, 8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 15.238576f, 5.761424f, 13.0f, 3.0f, 13.0f),
                    PathNode.CurveTo(1.667f, 13.0f, 1.667f, 11.0f, 3.0f, 11.0f)
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
                    PathNode.MoveTo(16.0f, 7.0f),
                    PathNode.CurveTo(15.447715f, 7.0f, 15.0f, 6.552285f, 15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 5.447716f, 15.447715f, 5.0f, 16.0f, 5.0f),
                    PathNode.CurveTo(16.552284f, 5.0f, 17.0f, 4.552285f, 17.0f, 4.0f),
                    PathNode.CurveTo(17.0f, 2.667f, 19.0f, 2.667f, 19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 4.552285f, 19.447716f, 5.0f, 20.0f, 5.0f),
                    PathNode.CurveTo(21.333f, 5.0f, 21.333f, 7.0f, 20.0f, 7.0f),
                    PathNode.CurveTo(19.447716f, 7.0f, 19.0f, 7.447716f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 9.333f, 17.0f, 9.333f, 17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 7.447716f, 16.552284f, 7.0f, 16.0f, 7.0f)
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
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
