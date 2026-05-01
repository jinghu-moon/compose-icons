package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AccessibleOff: ImageVector
    get() {
        if (_accessibleOff != null) return _accessibleOff!!
        _accessibleOff = tablerOutlineIcon(
            name = "AccessibleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.5f),
                    PathNode.LineTo(12.0f, 13.5f),
                    PathNode.LineTo(14.0f, 16.5f),
                    PathNode.MoveTo(12.0f, 13.5f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(14.627f, 10.624f),
                    PathNode.LineTo(15.0f, 10.5f),
                    PathNode.MoveTo(9.0f, 10.5f),
                    PathNode.LineTo(11.231f, 11.244f)
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
                    PathNode.MoveTo(20.042f, 16.045f),
                    PathNode.CurveTo(21.789572f, 12.576373f, 21.11484f, 8.377954f, 18.368443f, 5.631557f),
                    PathNode.CurveTo(15.622046f, 2.885161f, 11.423627f, 2.210428f, 7.955f, 3.958f),
                    PathNode.MoveTo(5.637f, 5.635f),
                    PathNode.CurveTo(3.332051f, 7.90183f, 2.419973f, 11.230749f, 3.247604f, 14.355863f),
                    PathNode.CurveTo(4.075236f, 17.480976f, 6.515411f, 19.92211f, 9.6402f, 20.750969f),
                    PathNode.CurveTo(12.764988f, 21.579828f, 16.094265f, 20.669058f, 18.362f, 18.365f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.276142f, 8.0f, 12.5f, 7.776143f, 12.5f, 7.5f),
                    PathNode.CurveTo(12.5f, 7.223858f, 12.276142f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.723858f, 7.0f, 11.5f, 7.223858f, 11.5f, 7.5f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
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
        }
        return _accessibleOff!!
    }

private var _accessibleOff: ImageVector? = null
