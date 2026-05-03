package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorLightIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(245.96693f, 157.80966f, 221.80966f, 181.96693f, 192.0f, 182.0f),
                    PathNode.LineTo(48.0f, 182.0f),
                    PathNode.CurveTo(27.01318f, 182.0f, 10.0f, 164.98682f, 10.0f, 144.0f),
                    PathNode.CurveTo(10.0f, 123.013176f, 27.01318f, 106.0f, 48.0f, 106.0f),
                    PathNode.LineTo(192.0f, 106.0f),
                    PathNode.CurveTo(204.15027f, 106.0f, 214.0f, 115.84974f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 140.15027f, 204.15027f, 150.0f, 192.0f, 150.0f),
                    PathNode.LineTo(80.0f, 150.0f),
                    PathNode.CurveTo(76.686295f, 150.0f, 74.0f, 147.3137f, 74.0f, 144.0f),
                    PathNode.CurveTo(74.0f, 140.6863f, 76.686295f, 138.0f, 80.0f, 138.0f),
                    PathNode.LineTo(192.0f, 138.0f),
                    PathNode.CurveTo(197.52284f, 138.0f, 202.0f, 133.52284f, 202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 122.47715f, 197.52284f, 118.0f, 192.0f, 118.0f),
                    PathNode.LineTo(48.0f, 118.0f),
                    PathNode.CurveTo(33.6406f, 118.0f, 22.0f, 129.6406f, 22.0f, 144.0f),
                    PathNode.CurveTo(22.0f, 158.3594f, 33.6406f, 170.0f, 48.0f, 170.0f),
                    PathNode.LineTo(192.0f, 170.0f),
                    PathNode.CurveTo(215.19595f, 170.0f, 234.0f, 151.19595f, 234.0f, 128.0f),
                    PathNode.CurveTo(234.0f, 104.80404f, 215.19595f, 86.0f, 192.0f, 86.0f),
                    PathNode.LineTo(80.0f, 86.0f),
                    PathNode.CurveTo(76.686295f, 86.0f, 74.0f, 83.313705f, 74.0f, 80.0f),
                    PathNode.CurveTo(74.0f, 76.686295f, 76.686295f, 74.0f, 80.0f, 74.0f),
                    PathNode.LineTo(192.0f, 74.0f),
                    PathNode.CurveTo(221.80966f, 74.033066f, 245.96693f, 98.19033f, 246.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
