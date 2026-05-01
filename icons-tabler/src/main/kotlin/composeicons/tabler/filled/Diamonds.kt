package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerFilledIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.005f),
                    PathNode.CurveTo(11.223f, 2.005f, 10.492f, 2.372f, 10.029f, 2.995f),
                    PathNode.LineTo(4.667f, 9.89f),
                    PathNode.CurveTo(3.777f, 11.026f, 3.777f, 12.973f, 4.667f, 14.117f),
                    PathNode.LineTo(10.042f, 21.028f),
                    PathNode.CurveTo(10.508724f, 21.644218f, 11.238237f, 22.00486f, 12.011248f, 22.001516f),
                    PathNode.CurveTo(12.784258f, 21.998173f, 13.510624f, 21.631233f, 13.972f, 21.011f),
                    PathNode.LineTo(19.333f, 14.117f),
                    PathNode.CurveTo(20.223f, 12.981f, 20.223f, 11.034f, 19.333f, 9.89f),
                    PathNode.LineTo(13.958f, 2.979f),
                    PathNode.CurveTo(13.494889f, 2.364403f, 12.769545f, 2.003583f, 12.0f, 2.005f),
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
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
