package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dashboard: ImageVector
    get() {
        if (_dashboard != null) return _dashboard!!
        _dashboard = tablerOutlineIcon(
            name = "Dashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 14.104569f, 10.895431f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.104569f, 15.0f, 14.0f, 14.104569f, 14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 11.895431f, 13.104569f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(10.895431f, 11.0f, 10.0f, 11.895431f, 10.0f, 13.0f)
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
                    PathNode.MoveTo(13.45f, 11.55f),
                    PathNode.LineTo(15.5f, 9.5f)
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
                    PathNode.MoveTo(6.4f, 20.0f),
                    PathNode.CurveTo(3.403739f, 17.618494f, 2.241455f, 13.602468f, 3.502645f, 9.988806f),
                    PathNode.CurveTo(4.763835f, 6.375143f, 8.172579f, 3.954434f, 12.0f, 3.954434f),
                    PathNode.CurveTo(15.827421f, 3.954434f, 19.236166f, 6.375143f, 20.497355f, 9.988806f),
                    PathNode.CurveTo(21.758545f, 13.602468f, 20.596262f, 17.618494f, 17.6f, 20.0f),
                    PathNode.LineTo(6.4f, 20.0f)
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
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
