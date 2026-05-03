package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckOff: ImageVector
    get() {
        if (_truckOff != null) return _truckOff!!
        _truckOff = tablerOutlineIcon(
            name = "TruckOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(8.10457f, 19.0f, 9.0f, 18.10457f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 15.895431f, 8.10457f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(5.895431f, 15.0f, 5.0f, 15.895431f, 5.0f, 17.0f)
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
                    PathNode.MoveTo(15.585f, 15.586f),
                    PathNode.CurveTo(14.803241f, 16.366379f, 14.802122f, 17.63274f, 15.5825f, 18.4145f),
                    PathNode.CurveTo(16.362879f, 19.196259f, 17.62924f, 19.197378f, 18.411f, 18.417f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 5.447716f, 3.447715f, 5.0f, 4.0f, 5.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.MoveTo(8.96f, 5.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(21.0f, 11.0f)
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
        }
        return _truckOff!!
    }

private var _truckOff: ImageVector? = null
