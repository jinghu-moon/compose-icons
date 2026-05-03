package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingFactory: ImageVector
    get() {
        if (_buildingFactory != null) return _buildingFactory!!
        _buildingFactory = tablerOutlineIcon(
            name = "BuildingFactory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 21.0f),
                    PathNode.CurveTo(5.147f, 16.98f, 5.983f, 12.973f, 6.0f, 9.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.017f, 12.973f, 12.853f, 16.98f, 14.0f, 21.0f)
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
                    PathNode.MoveTo(12.5f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.025f, 15.612f, 17.894f, 18.296f, 19.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.461176f, 4.357493f, 10.209289f, 3.983437f, 11.0f, 4.0f),
                    PathNode.CurveTo(11.790711f, 3.983437f, 12.538824f, 4.357493f, 13.0f, 5.0f),
                    PathNode.CurveTo(13.461176f, 5.642508f, 14.209289f, 6.016564f, 15.0f, 6.0f),
                    PathNode.CurveTo(15.790711f, 6.016564f, 16.538824f, 5.642508f, 17.0f, 5.0f),
                    PathNode.CurveTo(17.461176f, 4.357493f, 18.209288f, 3.983437f, 19.0f, 4.0f),
                    PathNode.CurveTo(19.790712f, 3.983437f, 20.538824f, 4.357493f, 21.0f, 5.0f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(22.0f, 21.0f)
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
        return _buildingFactory!!
    }

private var _buildingFactory: ImageVector? = null
