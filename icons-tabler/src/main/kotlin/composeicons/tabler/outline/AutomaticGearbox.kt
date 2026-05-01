package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AutomaticGearbox: ImageVector
    get() {
        if (_automaticGearbox != null) return _automaticGearbox!!
        _automaticGearbox = tablerOutlineIcon(
            name = "AutomaticGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(19.10457f, 21.0f, 20.0f, 20.10457f, 20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 17.89543f, 19.10457f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.LineTo(18.5f, 11.0f),
                    PathNode.CurveTo(19.328426f, 11.0f, 20.0f, 10.328427f, 20.0f, 9.5f),
                    PathNode.CurveTo(20.0f, 8.671573f, 19.328426f, 8.0f, 18.5f, 8.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 6.10457f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.CurveTo(6.10457f, 7.0f, 7.0f, 6.10457f, 7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 6.10457f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 10.552285f, 5.447716f, 11.0f, 6.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 18.552284f, 9.447715f, 19.0f, 10.0f, 19.0f),
                    PathNode.LineTo(13.0f, 19.0f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f)
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
        return _automaticGearbox!!
    }

private var _automaticGearbox: ImageVector? = null
