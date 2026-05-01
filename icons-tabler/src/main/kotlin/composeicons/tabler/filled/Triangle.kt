package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = tablerFilledIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.67f),
                    PathNode.CurveTo(10.981186f, 1.669875f, 10.036287f, 2.201854f, 9.508f, 3.073f),
                    PathNode.LineTo(1.398f, 16.61f),
                    PathNode.CurveTo(0.873753f, 17.506344f, 0.8661f, 18.613941f, 1.377913f, 19.517443f),
                    PathNode.CurveTo(1.889726f, 20.420944f, 2.843663f, 20.983824f, 3.882f, 20.995f),
                    PathNode.LineTo(20.107f, 20.995f),
                    PathNode.CurveTo(21.14439f, 20.987682f, 22.099663f, 20.429386f, 22.615187f, 19.529125f),
                    PathNode.CurveTo(23.130709f, 18.628866f, 23.128735f, 17.522413f, 22.61f, 16.624f),
                    PathNode.LineTo(14.494f, 3.078f),
                    PathNode.CurveTo(13.966147f, 2.204766f, 13.020375f, 1.670825f, 12.0f, 1.67f),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
