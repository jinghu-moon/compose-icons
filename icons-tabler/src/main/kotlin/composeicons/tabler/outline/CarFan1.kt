package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFan1: ImageVector
    get() {
        if (_carFan1 != null) return _carFan1!!
        _carFan1 = tablerOutlineIcon(
            name = "CarFan1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(16.912f, 4.914f),
                    PathNode.CurveTo(17.48185f, 5.135945f, 17.888575f, 5.64686f, 17.977116f, 6.251961f),
                    PathNode.CurveTo(18.065659f, 6.857062f, 17.822369f, 7.463091f, 17.34f, 7.839f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(14.424f, 15.03f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(4.914f, 7.088f),
                    PathNode.CurveTo(5.135945f, 6.518152f, 5.64686f, 6.111425f, 6.251961f, 6.022884f),
                    PathNode.CurveTo(6.857062f, 5.934342f, 7.463091f, 6.177633f, 7.839f, 6.66f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(7.088f, 19.086f),
                    PathNode.CurveTo(6.518152f, 18.864056f, 6.111425f, 18.35314f, 6.022884f, 17.74804f),
                    PathNode.CurveTo(5.934342f, 17.142939f, 6.177633f, 16.53691f, 6.66f, 16.161f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 17.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 21.0f)
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
        return _carFan1!!
    }

private var _carFan1: ImageVector? = null
