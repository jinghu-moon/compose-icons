package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = tablerFilledIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.04f, 4.305f),
                    PathNode.CurveTo(12.235f, 3.638f, 14.655f, 4.081f, 16.4f, 5.481f),
                    PathNode.CurveTo(17.786f, 6.589f, 18.588f, 8.167f, 18.652f, 9.821f),
                    PathNode.LineTo(18.655f, 10.033f),
                    PathNode.LineTo(18.746f, 10.036f),
                    PathNode.CurveTo(21.046f, 10.143f, 22.889f, 11.997f, 22.996f, 14.306f),
                    PathNode.LineTo(23.0f, 14.517f),
                    PathNode.CurveTo(23.0f, 16.924f, 21.115f, 18.889f, 18.745f, 18.999f),
                    PathNode.LineTo(18.535f, 19.004f),
                    PathNode.LineTo(6.657f, 19.004f),
                    PathNode.LineTo(6.435f, 18.996f),
                    PathNode.CurveTo(3.495f, 18.886f, 1.118f, 16.597f, 1.005f, 13.733f),
                    PathNode.LineTo(1.0f, 13.517f),
                    PathNode.CurveTo(1.0f, 10.77f, 3.08f, 8.507f, 5.784f, 8.100001f),
                    PathNode.LineTo(5.898f, 8.084f),
                    PathNode.LineTo(5.968f, 7.903f),
                    PathNode.CurveTo(6.631f, 6.283f, 8.024f, 4.997f, 9.797f, 4.385f),
                    PathNode.LineTo(10.041f, 4.305f),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
