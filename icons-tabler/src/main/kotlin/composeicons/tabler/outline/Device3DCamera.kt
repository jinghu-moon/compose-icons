package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Device3DCamera: ImageVector
    get() {
        if (_device3DCamera != null) return _device3DCamera!!
        _device3DCamera = tablerOutlineIcon(
            name = "Device3DCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 8.0f),
                    PathNode.CurveTo(11.0f, 6.895431f, 11.895431f, 6.0f, 13.0f, 6.0f),
                    PathNode.CurveTo(14.104569f, 6.0f, 15.0f, 6.895431f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 9.104569f, 14.104569f, 10.0f, 13.0f, 10.0f),
                    PathNode.CurveTo(11.895431f, 10.0f, 11.0f, 9.104569f, 11.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 4.343146f, 9.343145f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(16.656855f, 3.0f, 18.0f, 4.343146f, 18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.656855f, 16.656855f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(9.343145f, 21.0f, 8.0f, 19.656855f, 8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 6.0f)
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
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 16.0f)
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
        return _device3DCamera!!
    }

private var _device3DCamera: ImageVector? = null
