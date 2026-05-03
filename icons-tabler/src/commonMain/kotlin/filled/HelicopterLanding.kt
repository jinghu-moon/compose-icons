package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelicopterLanding: ImageVector
    get() {
        if (_helicopterLanding != null) return _helicopterLanding!!
        _helicopterLanding = tablerFilledIcon(
            name = "HelicopterLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.CurveTo(14.447715f, 7.0f, 14.0f, 7.447716f, 14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.999933f, 7.493026f, 9.620493f, 7.066316f, 9.117f, 7.007f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(8.447715f, 7.0f, 8.0f, 7.447716f, 8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 16.552284f, 8.447715f, 17.0f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.552285f, 17.0f, 10.0f, 16.552284f, 10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(14.000067f, 16.506975f, 14.379507f, 16.933683f, 14.883f, 16.993f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.552285f, 17.0f, 16.0f, 16.552284f, 16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 7.447716f, 15.552285f, 7.0f, 15.0f, 7.0f)
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
        return _helicopterLanding!!
    }

private var _helicopterLanding: ImageVector? = null
