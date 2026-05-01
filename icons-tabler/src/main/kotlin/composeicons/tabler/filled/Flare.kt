package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flare: ImageVector
    get() {
        if (_flare != null) return _flare!!
        _flare = tablerFilledIcon(
            name = "Flare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.106f, 2.553f),
                    PathNode.CurveTo(11.275561f, 2.214685f, 11.621572f, 2.001067f, 12.0f, 2.001067f),
                    PathNode.CurveTo(12.378428f, 2.001067f, 12.724439f, 2.214685f, 12.894f, 2.553f),
                    PathNode.LineTo(15.745f, 8.254f),
                    PathNode.LineTo(21.447f, 11.106f),
                    PathNode.CurveTo(21.76545f, 11.265147f, 21.975277f, 11.581594f, 21.997932f, 11.936875f),
                    PathNode.CurveTo(22.02059f, 12.292156f, 21.852655f, 12.632692f, 21.557f, 12.831f),
                    PathNode.LineTo(21.447f, 12.894f),
                    PathNode.LineTo(15.745f, 15.745f),
                    PathNode.LineTo(12.895f, 21.447f),
                    PathNode.CurveTo(12.735999f, 21.765919f, 12.419296f, 21.976126f, 12.063661f, 21.99879f),
                    PathNode.CurveTo(11.708026f, 22.021456f, 11.3672f, 21.853153f, 11.169f, 21.557f),
                    PathNode.LineTo(11.106f, 21.447f),
                    PathNode.LineTo(8.254f, 15.745f),
                    PathNode.LineTo(2.553f, 12.895f),
                    PathNode.CurveTo(2.234082f, 12.735999f, 2.023874f, 12.419296f, 2.001209f, 12.063661f),
                    PathNode.CurveTo(1.978544f, 11.708026f, 2.146846f, 11.3672f, 2.443f, 11.169f),
                    PathNode.LineTo(2.553f, 11.106f),
                    PathNode.LineTo(8.254f, 8.254f),
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
        return _flare!!
    }

private var _flare: ImageVector? = null
