package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Contrast2: ImageVector
    get() {
        if (_contrast2 != null) return _contrast2!!
        _contrast2 = tablerFilledIcon(
            name = "Contrast2",
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
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.447716f, 4.0f, 4.0f, 4.447716f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(3.999979f, 19.463316f, 4.318215f, 19.865974f, 4.769f, 19.973f),
                    PathNode.CurveTo(8.268f, 19.626f, 11.851f, 15.846f, 11.995f, 12.226f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 8.313f, 15.66f, 4.381f, 19.232f, 4.026f),
                    PathNode.CurveTo(19.155947f, 4.008305f, 19.078085f, 3.999579f, 19.0f, 4.0f)
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
        return _contrast2!!
    }

private var _contrast2: ImageVector? = null
