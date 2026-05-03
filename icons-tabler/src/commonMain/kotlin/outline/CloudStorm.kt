package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudStorm: ImageVector
    get() {
        if (_cloudStorm != null) return _cloudStorm!!
        _cloudStorm = tablerOutlineIcon(
            name = "CloudStorm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.CurveTo(4.401752f, 18.0f, 2.295455f, 15.985281f, 2.295455f, 13.5f),
                    PathNode.CurveTo(2.295455f, 11.014719f, 4.401752f, 9.0f, 7.0f, 9.0f),
                    PathNode.CurveTo(7.61365f, 6.266191f, 10.573545f, 4.497716f, 13.611111f, 5.05f),
                    PathNode.CurveTo(16.648678f, 5.602285f, 18.61365f, 8.266191f, 18.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(20.932997f, 11.0f, 22.5f, 12.567003f, 22.5f, 14.5f),
                    PathNode.CurveTo(22.5f, 16.432997f, 20.932997f, 18.0f, 19.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f)
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
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
        return _cloudStorm!!
    }

private var _cloudStorm: ImageVector? = null
