package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Servicemark: ImageVector
    get() {
        if (_servicemark != null) return _servicemark!!
        _servicemark = tablerOutlineIcon(
            name = "Servicemark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(6.5f, 9.0f),
                    PathNode.CurveTo(5.671573f, 9.0f, 5.0f, 9.671573f, 5.0f, 10.5f),
                    PathNode.CurveTo(5.0f, 11.328427f, 5.671573f, 12.0f, 6.5f, 12.0f),
                    PathNode.LineTo(7.5f, 12.0f),
                    PathNode.CurveTo(8.328428f, 12.0f, 9.0f, 12.671573f, 9.0f, 13.5f),
                    PathNode.CurveTo(9.0f, 14.328427f, 8.328428f, 15.0f, 7.5f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f)
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
                    PathNode.MoveTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _servicemark!!
    }

private var _servicemark: ImageVector? = null
