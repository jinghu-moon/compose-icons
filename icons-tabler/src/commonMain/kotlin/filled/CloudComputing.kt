package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudComputing: ImageVector
    get() {
        if (_cloudComputing != null) return _cloudComputing!!
        _cloudComputing = tablerFilledIcon(
            name = "CloudComputing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 20.0f),
                    PathNode.CurveTo(9.0f, 21.10457f, 8.10457f, 22.0f, 7.0f, 22.0f),
                    PathNode.LineTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.CurveTo(2.0f, 20.447716f, 2.447715f, 20.0f, 3.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 17.003f),
                    PathNode.LineTo(6.657f, 17.004f),
                    PathNode.CurveTo(6.617897f, 17.003956f, 6.57883f, 17.00162f, 6.54f, 16.997f),
                    PathNode.LineTo(6.435f, 16.996f),
                    PathNode.CurveTo(3.495f, 16.886f, 1.118f, 14.597f, 1.005f, 11.733f),
                    PathNode.LineTo(1.0f, 11.517f),
                    PathNode.CurveTo(1.0f, 8.77f, 3.08f, 6.507f, 5.784f, 6.1f),
                    PathNode.LineTo(5.898f, 6.084f),
                    PathNode.LineTo(5.968f, 5.903f),
                    PathNode.CurveTo(6.631f, 4.283f, 8.024f, 2.997f, 9.797f, 2.385f),
                    PathNode.LineTo(10.041f, 2.305f),
                    PathNode.CurveTo(12.235f, 1.638f, 14.655f, 2.081f, 16.401f, 3.481f),
                    PathNode.CurveTo(17.786f, 4.589f, 18.588f, 6.167f, 18.651f, 7.821f),
                    PathNode.LineTo(18.655f, 8.033f),
                    PathNode.LineTo(18.746f, 8.036001f),
                    PathNode.CurveTo(21.046f, 8.143f, 22.889f, 9.997f, 22.996f, 12.306f),
                    PathNode.LineTo(23.0f, 12.517f),
                    PathNode.CurveTo(23.0f, 14.995f, 21.003f, 17.004f, 18.535f, 17.004f),
                    PathNode.LineTo(17.0f, 17.004f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.552284f, 20.0f, 22.0f, 20.447716f, 22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.CurveTo(15.895431f, 22.0f, 15.0f, 21.10457f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 17.003f),
                    PathNode.LineTo(13.0f, 17.003f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(13.0f, 21.552284f, 12.552285f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(11.447715f, 22.0f, 11.0f, 21.552284f, 11.0f, 21.0f),
                    PathNode.LineTo(11.0f, 17.003f),
                    PathNode.LineTo(9.0f, 17.003f),
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
        return _cloudComputing!!
    }

private var _cloudComputing: ImageVector? = null
