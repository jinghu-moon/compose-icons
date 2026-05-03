package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxA: ImageVector
    get() {
        if (_xboxA != null) return _xboxA!!
        _xboxA = tablerFilledIcon(
            name = "XboxA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.936f, 7.649f),
                    PathNode.CurveTo(12.612f, 6.784f, 11.388f, 6.784f, 11.064f, 7.649f),
                    PathNode.LineTo(8.064f, 15.649f),
                    PathNode.CurveTo(7.870358f, 16.165932f, 8.132205f, 16.741995f, 8.649f, 16.936f),
                    PathNode.LineTo(8.76f, 16.971f),
                    PathNode.CurveTo(9.252516f, 17.092537f, 9.758004f, 16.826036f, 9.936f, 16.351f),
                    PathNode.LineTo(10.443f, 15.0f),
                    PathNode.LineTo(13.557f, 15.0f),
                    PathNode.LineTo(14.064f, 16.351f),
                    PathNode.CurveTo(14.182593f, 16.694704f, 14.478395f, 16.946957f, 14.836514f, 17.009783f),
                    PathNode.CurveTo(15.194633f, 17.07261f, 15.558636f, 16.93611f, 15.787142f, 16.6533f),
                    PathNode.CurveTo(16.015648f, 16.370487f, 16.072647f, 15.985934f, 15.936f, 15.649f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.848f),
                    PathNode.LineTo(12.807f, 13.0f),
                    PathNode.LineTo(11.193f, 13.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _xboxA!!
    }

private var _xboxA: ImageVector? = null
