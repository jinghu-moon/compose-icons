package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerOutlineIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.LineTo(9.5f, 6.0f),
                    PathNode.LineTo(12.0f, 3.5f),
                    PathNode.LineTo(14.5f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 9.5f),
                    PathNode.LineTo(20.5f, 12.0f),
                    PathNode.LineTo(18.0f, 14.5f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.LineTo(14.5f, 18.0f),
                    PathNode.LineTo(12.0f, 20.5f),
                    PathNode.LineTo(9.5f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.LineTo(6.0f, 14.5f),
                    PathNode.LineTo(3.5f, 12.0f),
                    PathNode.LineTo(6.0f, 9.5f),
                    PathNode.LineTo(6.0f, 6.0f)
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
                    PathNode.MoveTo(10.0f, 14.5f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 9.895431f, 10.895431f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.104569f, 9.0f, 14.0f, 9.895431f, 14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 14.5f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f)
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
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
