package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFanAuto: ImageVector
    get() {
        if (_carFanAuto != null) return _carFanAuto!!
        _carFanAuto = tablerOutlineIcon(
            name = "CarFanAuto",
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
                    PathNode.MoveTo(14.044f, 14.624f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 15.895431f, 17.89543f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(20.10457f, 15.0f, 21.0f, 15.895431f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.LineTo(21.0f, 19.0f)
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
        return _carFanAuto!!
    }

private var _carFanAuto: ImageVector? = null
