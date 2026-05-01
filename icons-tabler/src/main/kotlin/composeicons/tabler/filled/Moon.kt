package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = tablerFilledIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.992f),
                    PathNode.CurveTo(6.983455f, 1.992922f, 2.743941f, 5.710514f, 2.087756f, 10.683957f),
                    PathNode.CurveTo(1.43157f, 15.657401f, 4.561813f, 20.347343f, 9.406455f, 21.649328f),
                    PathNode.CurveTo(14.251097f, 22.951315f, 19.31065f, 20.462358f, 21.236f, 15.83f),
                    PathNode.CurveTo(21.577f, 15.01f, 20.76f, 14.186f, 19.938f, 14.52f),
                    PathNode.CurveTo(17.030928f, 15.697571f, 13.697583f, 14.631229f, 12.013743f, 11.98502f),
                    PathNode.CurveTo(10.329903f, 9.33881f, 10.775901f, 5.867593f, 13.074f, 3.733f),
                    PathNode.LineTo(13.151f, 3.653f),
                    PathNode.CurveTo(13.702f, 3.023f, 13.264f, 2.0f, 12.393f, 2.0f),
                    PathNode.LineTo(12.127f, 2.0f),
                    PathNode.LineTo(12.059f, 1.994f),
                    PathNode.LineTo(11.999f, 1.992f),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
