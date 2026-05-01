package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) return _directionSign!!
        _directionSign = tablerOutlineIcon(
            name = "DirectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.32f, 12.774f),
                    PathNode.LineTo(11.226f, 20.679f),
                    PathNode.CurveTo(11.653f, 21.107f, 12.346f, 21.107f, 12.774f, 20.679f),
                    PathNode.LineTo(20.679f, 12.774f),
                    PathNode.CurveTo(21.106249f, 12.34644f, 21.106249f, 11.65356f, 20.679f, 11.226f),
                    PathNode.LineTo(12.774f, 3.321f),
                    PathNode.CurveTo(12.34644f, 2.893752f, 11.65356f, 2.893752f, 11.226f, 3.321f),
                    PathNode.LineTo(3.321f, 11.226f),
                    PathNode.CurveTo(2.893752f, 11.65356f, 2.893752f, 12.34644f, 3.321f, 12.774f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(15.5f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 8.5f),
                    PathNode.LineTo(15.5f, 12.0f),
                    PathNode.LineTo(12.0f, 15.5f)
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
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
