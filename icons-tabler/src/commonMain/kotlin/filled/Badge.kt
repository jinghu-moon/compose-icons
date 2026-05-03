package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = tablerFilledIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.486f, 3.143f),
                    PathNode.LineTo(12.0f, 5.833f),
                    PathNode.LineTo(7.514f, 3.143f),
                    PathNode.CurveTo(7.205172f, 2.957946f, 6.820708f, 2.953186f, 6.507394f, 3.130538f),
                    PathNode.CurveTo(6.194079f, 3.30789f, 6.000284f, 3.639973f, 6.0f, 4.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(6.000278f, 17.351187f, 6.184755f, 17.67649f, 6.486f, 17.857f),
                    PathNode.LineTo(11.486f, 20.857f),
                    PathNode.CurveTo(11.802436f, 21.046614f, 12.197564f, 21.046614f, 12.514f, 20.857f),
                    PathNode.LineTo(17.514f, 17.857f),
                    PathNode.CurveTo(17.815245f, 17.67649f, 17.999722f, 17.351187f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(17.999716f, 3.639973f, 17.805922f, 3.30789f, 17.492607f, 3.130538f),
                    PathNode.CurveTo(17.179293f, 2.953186f, 16.794828f, 2.957946f, 16.486f, 3.143f),
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
        return _badge!!
    }

private var _badge: ImageVector? = null
