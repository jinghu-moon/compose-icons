package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorFillIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.35f, 92.8f),
                    PathNode.LineTo(140.35f, 218.23f),
                    PathNode.CurveTo(137.30571f, 221.90648f, 132.77322f, 224.0241f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(123.24076f, 224.0121f, 118.72539f, 221.89565f, 115.69f, 218.23f),
                    PathNode.LineTo(11.65f, 92.8f),
                    PathNode.CurveTo(8.882438f, 89.49356f, 7.601669f, 85.191765f, 8.11f, 80.91f),
                    PathNode.CurveTo(8.615581f, 76.61903f, 10.842456f, 72.71749f, 14.28f, 70.1f),
                    PathNode.CurveTo(46.963894f, 45.237f, 86.934425f, 31.845535f, 128.0f, 32.0f),
                    PathNode.CurveTo(169.06558f, 31.845535f, 209.0361f, 45.237f, 241.72f, 70.1f),
                    PathNode.CurveTo(245.15755f, 72.71749f, 247.38441f, 76.61903f, 247.89f, 80.91f),
                    PathNode.CurveTo(248.39833f, 85.191765f, 247.11757f, 89.49356f, 244.35f, 92.8f),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
