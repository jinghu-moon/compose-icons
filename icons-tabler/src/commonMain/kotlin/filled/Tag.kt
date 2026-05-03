package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = tablerFilledIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.172f, 2.0f),
                    PathNode.CurveTo(11.967585f, 2.00017f, 12.730522f, 2.316352f, 13.293f, 2.879f),
                    PathNode.LineTo(21.003f, 10.589f),
                    PathNode.CurveTo(22.334375f, 11.920634f, 22.334375f, 14.079366f, 21.003f, 15.411f),
                    PathNode.LineTo(15.411f, 21.003f),
                    PathNode.CurveTo(14.079366f, 22.334375f, 11.920634f, 22.334375f, 10.589f, 21.003f),
                    PathNode.LineTo(2.879f, 13.293f),
                    PathNode.CurveTo(2.316352f, 12.730522f, 2.00017f, 11.967585f, 2.0f, 11.172f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 3.790861f, 3.790861f, 2.0f, 6.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.5f, 5.5f),
                    PathNode.CurveTo(6.453376f, 5.499669f, 5.583497f, 6.306323f, 5.505f, 7.35f),
                    PathNode.LineTo(5.5f, 7.5f),
                    PathNode.CurveTo(5.5f, 8.604569f, 6.395431f, 9.5f, 7.5f, 9.5f),
                    PathNode.CurveTo(8.604569f, 9.5f, 9.5f, 8.604569f, 9.5f, 7.5f),
                    PathNode.CurveTo(9.5f, 6.395431f, 8.604569f, 5.5f, 7.5f, 5.5f)
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
        return _tag!!
    }

private var _tag: ImageVector? = null
