package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AtomOff: ImageVector
    get() {
        if (_atomOff != null) return _atomOff!!
        _atomOff = tablerOutlineIcon(
            name = "AtomOff",
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
                    PathNode.MoveTo(9.172f, 9.172f),
                    PathNode.CurveTo(5.266f, 13.077f, 3.367f, 17.509f, 4.929f, 19.072f),
                    PathNode.CurveTo(6.491f, 20.633f, 10.929f, 18.734f, 14.829f, 14.828f),
                    PathNode.MoveTo(16.713f, 12.715f),
                    PathNode.CurveTo(19.3f, 9.438f, 20.355f, 6.213f, 19.071f, 4.929f),
                    PathNode.CurveTo(17.787f, 3.645f, 14.563f, 4.699f, 11.287f, 7.286f)
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
                    PathNode.MoveTo(4.929f, 4.929f),
                    PathNode.CurveTo(3.367f, 6.491f, 5.266f, 10.929f, 9.172f, 14.829f),
                    PathNode.CurveTo(13.077f, 18.734f, 17.509f, 20.633f, 19.072f, 19.071f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.CurveTo(18.233f, 13.206f, 16.785f, 11.128f, 14.828f, 9.172f),
                    PathNode.CurveTo(12.884f, 7.227f, 10.787f, 5.77f, 9.0f, 5.0f)
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
        return _atomOff!!
    }

private var _atomOff: ImageVector? = null
