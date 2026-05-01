package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = tablerOutlineIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.01f)
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
                    PathNode.MoveTo(19.071f, 4.929f),
                    PathNode.CurveTo(17.509f, 3.367f, 13.071f, 5.266f, 9.171f, 9.172f),
                    PathNode.CurveTo(5.266f, 13.077f, 3.367f, 17.509f, 4.929f, 19.072f),
                    PathNode.CurveTo(6.491f, 20.633f, 10.929f, 18.734f, 14.829f, 14.828f),
                    PathNode.CurveTo(18.734f, 10.923f, 20.633f, 6.491f, 19.071f, 4.928f)
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
                    PathNode.MoveTo(4.929f, 4.929f),
                    PathNode.CurveTo(3.367f, 6.491f, 5.266f, 10.929f, 9.172f, 14.829f),
                    PathNode.CurveTo(13.077f, 18.734f, 17.509f, 20.633f, 19.072f, 19.071f),
                    PathNode.CurveTo(20.633f, 17.509f, 18.734f, 13.071f, 14.828f, 9.171f),
                    PathNode.CurveTo(10.923f, 5.266f, 6.491f, 3.367f, 4.928f, 4.929f)
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
        return _atom!!
    }

private var _atom: ImageVector? = null
