package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScooterElectric: ImageVector
    get() {
        if (_scooterElectric != null) return _scooterElectric!!
        _scooterElectric = tablerOutlineIcon(
            name = "ScooterElectric",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 18.10457f, 16.89543f, 19.0f, 18.0f, 19.0f),
                    PathNode.CurveTo(19.10457f, 19.0f, 20.0f, 18.10457f, 20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 15.895431f, 19.10457f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(16.89543f, 15.0f, 16.0f, 15.895431f, 16.0f, 17.0f)
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
                    PathNode.MoveTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 18.10457f, 4.895431f, 19.0f, 6.0f, 19.0f),
                    PathNode.CurveTo(7.10457f, 19.0f, 8.0f, 18.10457f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 15.895431f, 7.10457f, 15.0f, 6.0f, 15.0f),
                    PathNode.CurveTo(4.895431f, 15.0f, 4.0f, 15.895431f, 4.0f, 17.0f)
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.403203f, 14.423961f, 15.423961f, 12.403203f, 18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(18.0f, 5.895431f, 17.10457f, 5.0f, 16.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f)
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
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(9.0f, 12.0f)
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
        return _scooterElectric!!
    }

private var _scooterElectric: ImageVector? = null
