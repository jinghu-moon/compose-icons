package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) return _dualScreen!!
        _dualScreen = tablerFilledIcon(
            name = "DualScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.CurveTo(19.552284f, 3.0f, 20.0f, 3.447715f, 20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 19.552284f, 19.552284f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.CurveTo(13.999877f, 22.32789f, 13.839019f, 22.634888f, 13.569495f, 22.82162f),
                    PathNode.CurveTo(13.299971f, 23.00835f, 12.956028f, 23.05109f, 12.649f, 22.936f),
                    PathNode.LineTo(4.649f, 19.936f),
                    PathNode.CurveTo(4.258761f, 19.789719f, 4.000157f, 19.416756f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.999928f, 3.776759f, 4.074556f, 3.559914f, 4.212f, 3.384f),
                    PathNode.LineTo(4.28f, 3.305f),
                    PathNode.LineTo(4.358f, 3.233f),
                    PathNode.LineTo(4.424f, 3.183f),
                    PathNode.LineTo(4.516f, 3.125f),
                    PathNode.LineTo(4.581f, 3.092f),
                    PathNode.LineTo(4.681f, 3.052f),
                    PathNode.LineTo(4.78f, 3.024f),
                    PathNode.LineTo(4.826f, 3.014f),
                    PathNode.LineTo(4.934f, 3.001f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.351f, 6.064f),
                    PathNode.CurveTo(13.74124f, 6.210281f, 13.999844f, 6.583245f, 14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(10.514f, 5.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
