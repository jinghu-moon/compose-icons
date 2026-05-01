package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pillow: ImageVector
    get() {
        if (_pillow != null) return _pillow!!
        _pillow = tablerOutlineIcon(
            name = "Pillow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(6.659881f, 10.94557f, 6.659881f, 13.05443f, 6.0f, 15.0f)
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
                    PathNode.MoveTo(21.699f, 16.607f),
                    PathNode.CurveTo(22.18f, 17.541f, 21.979f, 18.695f, 21.213f, 19.397f),
                    PathNode.CurveTo(20.446f, 20.1f, 19.313f, 20.167f, 18.473f, 19.562f),
                    PathNode.CurveTo(14.177466f, 20.14661f, 9.822534f, 20.14661f, 5.527f, 19.562f),
                    PathNode.CurveTo(4.691641f, 20.169016f, 3.543479f, 20.099874f, 2.787f, 19.397f),
                    PathNode.CurveTo(2.018316f, 18.680864f, 1.819736f, 17.540869f, 2.301f, 16.607f),
                    PathNode.CurveTo(1.964407f, 13.56194f, 1.964407f, 10.48906f, 2.301f, 7.444f),
                    PathNode.CurveTo(1.772635f, 6.505472f, 1.951192f, 5.32774f, 2.734f, 4.588f),
                    PathNode.CurveTo(3.503823f, 3.862109f, 4.686148f, 3.800728f, 5.527f, 4.443f),
                    PathNode.CurveTo(9.822534f, 3.858389f, 14.177466f, 3.858389f, 18.473f, 4.443f),
                    PathNode.CurveTo(19.313852f, 3.800728f, 20.496178f, 3.862109f, 21.266f, 4.588f),
                    PathNode.CurveTo(22.046f, 5.314f, 22.227f, 6.506f, 21.699f, 7.444f),
                    PathNode.CurveTo(22.035595f, 10.48906f, 22.035595f, 13.56194f, 21.699f, 16.607f)
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
        return _pillow!!
    }

private var _pillow: ImageVector? = null
