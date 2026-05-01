package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) return _brandWindows!!
        _brandWindows = tablerFilledIcon(
            name = "BrandWindows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 13.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.57f, 19.752f, 20.832f, 18.285f, 20.923f),
                    PathNode.LineTo(18.172f, 20.926f),
                    PathNode.LineTo(18.13f, 20.944f),
                    PathNode.CurveTo(18.022026f, 20.981745f, 17.908379f, 21.000687f, 17.794f, 21.0f),
                    PathNode.LineTo(17.676f, 20.992f),
                    PathNode.LineTo(13.0f, 20.407f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 20.157f),
                    PathNode.LineTo(5.7f, 19.495f),
                    PathNode.CurveTo(4.186f, 19.344f, 3.0f, 18.112f, 3.0f, 16.6f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 3.842f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 7.4f),
                    PathNode.CurveTo(3.0f, 5.946f, 4.096f, 4.752f, 5.505f, 4.53f),
                    PathNode.Close,
                    PathNode.MoveTo(21.0f, 5.9f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 3.591f),
                    PathNode.LineTo(17.717f, 3.002f),
                    PathNode.CurveTo(19.476f, 2.857f, 21.0f, 4.191f, 21.0f, 5.9f)
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
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
