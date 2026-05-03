package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Milkshake: ImageVector
    get() {
        if (_milkshake != null) return _milkshake!!
        _milkshake = tablerOutlineIcon(
            name = "Milkshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 7.238577f, 14.761424f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(9.238576f, 5.0f, 7.0f, 7.238577f, 7.0f, 10.0f)
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
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 10.447715f, 6.447716f, 10.0f, 7.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.552284f, 10.0f, 18.0f, 10.447715f, 18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 12.552285f, 17.552284f, 13.0f, 17.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(6.447716f, 13.0f, 6.0f, 12.552285f, 6.0f, 12.0f),
                    PathNode.LineTo(6.0f, 11.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(8.81f, 20.243f),
                    PathNode.CurveTo(8.921459f, 20.687931f, 9.321321f, 20.999989f, 9.78f, 21.0f),
                    PathNode.LineTo(14.22f, 21.0f),
                    PathNode.CurveTo(14.678679f, 20.999989f, 15.078541f, 20.687931f, 15.19f, 20.243f),
                    PathNode.LineTo(17.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 3.0f)
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
        return _milkshake!!
    }

private var _milkshake: ImageVector? = null
