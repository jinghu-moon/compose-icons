package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeLink: ImageVector
    get() {
        if (_homeLink != null) return _homeLink!!
        _homeLink = tablerOutlineIcon(
            name = "HomeLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.085f, 11.085f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(11.5f, 21.0f)
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
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.895431f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.772533f, 13.000032f, 14.475969f, 13.444983f, 14.807f, 14.143f)
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 20.447716f, 22.0f, 21.0f, 22.0f),
                    PathNode.CurveTo(21.552284f, 22.0f, 22.0f, 21.552284f, 22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 20.447716f, 21.552284f, 20.0f, 21.0f, 20.0f),
                    PathNode.CurveTo(20.447716f, 20.0f, 20.0f, 20.447716f, 20.0f, 21.0f)
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
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 16.552284f, 20.447716f, 17.0f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.552284f, 17.0f, 22.0f, 16.552284f, 22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 15.447715f, 21.552284f, 15.0f, 21.0f, 15.0f),
                    PathNode.CurveTo(20.447716f, 15.0f, 20.0f, 15.447715f, 20.0f, 16.0f)
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
                    PathNode.MoveTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.0f, 19.552284f, 15.447715f, 20.0f, 16.0f, 20.0f),
                    PathNode.CurveTo(16.552284f, 20.0f, 17.0f, 19.552284f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 18.447716f, 16.552284f, 18.0f, 16.0f, 18.0f),
                    PathNode.CurveTo(15.447715f, 18.0f, 15.0f, 18.447716f, 15.0f, 19.0f)
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
                    PathNode.MoveTo(21.0f, 16.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _homeLink!!
    }

private var _homeLink: ImageVector? = null
