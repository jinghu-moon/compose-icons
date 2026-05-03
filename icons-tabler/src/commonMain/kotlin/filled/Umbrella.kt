package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = tablerFilledIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f),
                    PathNode.CurveTo(20.999933f, 12.506975f, 20.620493f, 12.933684f, 20.117f, 12.993f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.000587f, 18.529093f, 13.413211f, 18.966166f, 13.941395f, 18.997171f),
                    PathNode.CurveTo(14.469579f, 19.02818f, 14.93051f, 18.642391f, 14.993f, 18.117f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 17.447716f, 15.447715f, 17.0f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.552284f, 17.0f, 17.0f, 17.447716f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.001564f, 19.623695f, 15.711033f, 20.95395f, 14.088037f, 21.001598f),
                    PathNode.CurveTo(12.465041f, 21.049248f, 11.098692f, 19.79699f, 11.005f, 18.176f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.493025f, 12.999933f, 3.066316f, 12.620493f, 3.007f, 12.117f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
