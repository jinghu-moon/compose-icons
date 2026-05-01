package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorRegularIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.4f, 70.65f),
                    PathNode.LineTo(130.2f, 40.31f),
                    PathNode.CurveTo(129.11852f, 40.00004f, 127.983826f, 39.92167f, 126.87f, 40.08f),
                    PathNode.LineTo(21.74f, 55.1f),
                    PathNode.CurveTo(13.873764f, 56.256954f, 8.034044f, 62.989212f, 8.0f, 70.94f),
                    PathNode.LineTo(8.0f, 185.06f),
                    PathNode.CurveTo(8.034044f, 193.01079f, 13.873764f, 199.74304f, 21.74f, 200.9f),
                    PathNode.LineTo(126.87f, 215.9f),
                    PathNode.CurveTo(127.24401f, 215.95854f, 127.62152f, 215.99196f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.74432f, 216.0015f, 129.48508f, 215.89711f, 130.2f, 215.69f),
                    PathNode.LineTo(236.4f, 185.35f),
                    PathNode.CurveTo(243.24089f, 183.36908f, 247.96194f, 177.12183f, 248.0f, 170.0f),
                    PathNode.LineTo(248.0f, 86.0f),
                    PathNode.CurveTo(247.96194f, 78.878174f, 243.24089f, 72.63092f, 236.4f, 70.65f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(80.0f, 62.94f),
                    PathNode.LineTo(120.0f, 57.22f),
                    PathNode.LineTo(120.0f, 198.78f),
                    PathNode.LineTo(80.0f, 193.06f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(100.41828f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 100.41828f, 120.0f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 70.94f),
                    PathNode.LineTo(64.0f, 65.22f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 123.58172f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 132.41827f, 43.581722f, 136.0f, 48.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.LineTo(64.0f, 190.78f),
                    PathNode.LineTo(24.0f, 185.06f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 197.39f),
                    PathNode.LineTo(136.0f, 58.61f),
                    PathNode.LineTo(232.0f, 86.0f),
                    PathNode.LineTo(232.0f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
