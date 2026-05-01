package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HemisphereOff: ImageVector
    get() {
        if (_hemisphereOff != null) return _hemisphereOff!!
        _hemisphereOff = tablerOutlineIcon(
            name = "HemisphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.588f, 6.603f),
                    PathNode.CurveTo(4.41f, 7.15f, 3.0f, 8.020001f, 3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 10.657f, 7.03f, 12.0f, 12.0f, 12.0f),
                    PathNode.MoveTo(15.72f, 11.733f),
                    PathNode.CurveTo(18.834f, 11.26f, 21.0f, 10.215f, 21.0f, 9.0f),
                    PathNode.CurveTo(21.0f, 7.343f, 16.97f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(11.338f, 6.0f, 10.692f, 6.024f, 10.07f, 6.07f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.CurveTo(2.999755f, 12.252295f, 4.754178f, 15.251718f, 7.589093f, 16.845669f),
                    PathNode.CurveTo(10.424006f, 18.439623f, 13.898339f, 18.38011f, 16.677f, 16.69f),
                    PathNode.MoveTo(18.842f, 14.847f),
                    PathNode.CurveTo(20.237465f, 13.218813f, 21.003098f, 11.144365f, 21.0f, 9.0f)
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
        return _hemisphereOff!!
    }

private var _hemisphereOff: ImageVector? = null
