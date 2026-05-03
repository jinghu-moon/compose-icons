package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Versions: ImageVector
    get() {
        if (_versions != null) return _versions!!
        _versions = tablerFilledIcon(
            name = "Versions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.CurveTo(10.343145f, 4.0f, 9.0f, 5.343146f, 9.0f, 7.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.656855f, 10.343145f, 20.0f, 12.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(19.656855f, 20.0f, 21.0f, 18.656855f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 5.343146f, 19.656855f, 4.0f, 18.0f, 4.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.506975f, 6.000067f, 7.933684f, 6.379507f, 7.993f, 6.883f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.999413f, 17.529093f, 7.58679f, 17.966166f, 7.058605f, 17.997171f),
                    PathNode.CurveTo(6.530421f, 18.02818f, 6.069491f, 17.642391f, 6.007f, 17.117f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 6.447716f, 6.447716f, 6.0f, 7.0f, 6.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.506975f, 7.000067f, 4.933684f, 7.379507f, 4.993f, 7.883f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(4.999413f, 16.529093f, 4.58679f, 16.966166f, 4.058605f, 16.997171f),
                    PathNode.CurveTo(3.530421f, 17.02818f, 3.069491f, 16.642391f, 3.007f, 16.117f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 7.447716f, 3.447715f, 7.0f, 4.0f, 7.0f),
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
        return _versions!!
    }

private var _versions: ImageVector? = null
