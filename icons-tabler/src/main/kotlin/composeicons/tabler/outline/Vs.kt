package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vs: ImageVector
    get() {
        if (_vs != null) return _vs!!
        _vs = tablerOutlineIcon(
            name = "Vs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 14.25f),
                    PathNode.CurveTo(14.0f, 14.664f, 14.336f, 15.0f, 14.75f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.552284f, 15.0f, 17.0f, 14.552285f, 17.0f, 14.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 12.447715f, 16.552284f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(14.447715f, 12.0f, 14.0f, 11.552285f, 14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 9.447715f, 14.447715f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(16.25f, 9.0f),
                    PathNode.CurveTo(16.664213f, 9.0f, 17.0f, 9.335787f, 17.0f, 9.75f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(11.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _vs!!
    }

private var _vs: ImageVector? = null
