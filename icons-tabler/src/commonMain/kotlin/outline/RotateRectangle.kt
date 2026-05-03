package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateRectangle: ImageVector
    get() {
        if (_rotateRectangle != null) return _rotateRectangle!!
        _rotateRectangle = tablerOutlineIcon(
            name = "RotateRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.09f, 4.01f),
                    PathNode.LineTo(10.586f, 3.515f),
                    PathNode.CurveTo(11.367f, 2.734236f, 12.633f, 2.734236f, 13.414f, 3.515f),
                    PathNode.LineTo(20.485f, 10.585f),
                    PathNode.CurveTo(20.860554f, 10.960136f, 21.071573f, 11.469181f, 21.071573f, 12.0f),
                    PathNode.CurveTo(21.071573f, 12.530819f, 20.860554f, 13.039864f, 20.485f, 13.415f),
                    PathNode.LineTo(13.415f, 20.485f),
                    PathNode.CurveTo(13.039864f, 20.860554f, 12.530819f, 21.071573f, 12.0f, 21.071573f),
                    PathNode.CurveTo(11.469181f, 21.071573f, 10.960136f, 20.860554f, 10.585f, 20.485f),
                    PathNode.LineTo(3.515f, 13.415f),
                    PathNode.CurveTo(3.139446f, 13.039864f, 2.928427f, 12.530819f, 2.928427f, 12.0f),
                    PathNode.CurveTo(2.928427f, 11.469181f, 3.139446f, 10.960136f, 3.515f, 10.585f),
                    PathNode.LineTo(7.05f, 7.05f),
                    PathNode.LineTo(3.062f, 7.05f)
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
                    PathNode.MoveTo(7.05f, 11.038f),
                    PathNode.LineTo(7.05f, 7.05f)
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
        return _rotateRectangle!!
    }

private var _rotateRectangle: ImageVector? = null
