package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = tablerOutlineIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(9.514719f, 3.0f, 7.5f, 5.014719f, 7.5f, 7.5f),
                    PathNode.CurveTo(7.5f, 9.985281f, 9.514719f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(14.485281f, 12.0f, 16.5f, 14.014719f, 16.5f, 16.5f),
                    PathNode.CurveTo(16.5f, 18.98528f, 14.485281f, 21.0f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(11.5f, 7.5f),
                    PathNode.CurveTo(11.5f, 7.776143f, 11.723858f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.276142f, 8.0f, 12.5f, 7.776143f, 12.5f, 7.5f),
                    PathNode.CurveTo(12.5f, 7.223858f, 12.276142f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.723858f, 7.0f, 11.5f, 7.223858f, 11.5f, 7.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(11.5f, 16.5f),
                    PathNode.CurveTo(11.5f, 16.776142f, 11.723858f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.276142f, 17.0f, 12.5f, 16.776142f, 12.5f, 16.5f),
                    PathNode.CurveTo(12.5f, 16.223858f, 12.276142f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.723858f, 16.0f, 11.5f, 16.223858f, 11.5f, 16.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
