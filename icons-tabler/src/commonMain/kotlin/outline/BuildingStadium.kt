package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingStadium: ImageVector
    get() {
        if (_buildingStadium != null) return _buildingStadium!!
        _buildingStadium = tablerOutlineIcon(
            name = "BuildingStadium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 13.104569f, 7.581722f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(16.418278f, 14.0f, 20.0f, 13.104569f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 10.895431f, 16.418278f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(7.581722f, 10.0f, 4.0f, 10.895431f, 4.0f, 12.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 19.94f, 6.51f, 20.785f, 10.0f, 21.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(17.435f, 20.775f, 20.0f, 19.93f, 20.0f, 19.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 10.0f)
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
                    PathNode.MoveTo(7.0f, 6.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 10.0f)
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
        return _buildingStadium!!
    }

private var _buildingStadium: ImageVector? = null
