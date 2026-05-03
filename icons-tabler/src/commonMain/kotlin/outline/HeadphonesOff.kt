package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadphonesOff: ImageVector
    get() {
        if (_headphonesOff != null) return _headphonesOff!!
        _headphonesOff = tablerOutlineIcon(
            name = "HeadphonesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 13.895431f, 4.895431f, 13.0f, 6.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(8.10457f, 13.0f, 9.0f, 13.895431f, 9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 19.10457f, 8.10457f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 15.0f)
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
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(19.10457f, 13.0f, 20.0f, 13.895431f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.411f, 19.417f),
                    PathNode.CurveTo(19.05f, 19.777f, 18.551f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(15.895431f, 20.0f, 15.0f, 19.10457f, 15.0f, 18.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 9.79f, 4.896f, 7.79f, 6.344f, 6.342f),
                    PathNode.MoveTo(8.713f, 4.704f),
                    PathNode.CurveTo(11.18903f, 3.58812f, 14.06209f, 3.804628f, 16.342924f, 5.278977f),
                    PathNode.CurveTo(18.62376f, 6.753325f, 20.000837f, 9.284137f, 20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 15.0f)
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
        return _headphonesOff!!
    }

private var _headphonesOff: ImageVector? = null
