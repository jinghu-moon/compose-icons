package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Droplet: ImageVector
    get() {
        if (_droplet != null) return _droplet!!
        _droplet = tablerFilledIcon(
            name = "Droplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.708f, 2.372f),
                    PathNode.CurveTo(10.426023f, 2.548574f, 10.184162f, 2.782259f, 9.998f, 3.058f),
                    PathNode.LineTo(5.106f, 10.318f),
                    PathNode.CurveTo(3.125f, 13.632f, 3.886f, 17.784f, 6.873f, 20.2f),
                    PathNode.CurveTo(9.842f, 22.602f, 14.159f, 22.602f, 17.127f, 20.2f),
                    PathNode.CurveTo(20.114f, 17.784f, 20.875f, 13.631f, 18.922f, 10.364f),
                    PathNode.LineTo(14.003f, 3.058f),
                    PathNode.CurveTo(13.281f, 1.983f, 11.811f, 1.682f, 10.708f, 2.372f),
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
        return _droplet!!
    }

private var _droplet: ImageVector? = null
