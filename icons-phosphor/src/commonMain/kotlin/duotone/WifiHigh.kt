package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorDuotoneIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.2f, 87.69f),
                    PathNode.LineTo(134.2f, 213.12f),
                    PathNode.CurveTo(132.68008f, 214.94698f, 130.42654f, 216.0036f, 128.05f, 216.0036f),
                    PathNode.CurveTo(125.67345f, 216.0036f, 123.41992f, 214.94698f, 121.9f, 213.12f),
                    PathNode.LineTo(17.8f, 87.69f),
                    PathNode.CurveTo(16.43595f, 86.050156f, 15.803977f, 83.92272f, 16.051556f, 81.80413f),
                    PathNode.CurveTo(16.299133f, 79.68555f, 17.404604f, 77.76115f, 19.11f, 76.48f),
                    PathNode.CurveTo(83.55526f, 27.838602f, 172.44475f, 27.838602f, 236.89f, 76.48f),
                    PathNode.CurveTo(238.5954f, 77.76115f, 239.70087f, 79.68555f, 239.94844f, 81.80413f),
                    PathNode.CurveTo(240.19603f, 83.92272f, 239.56406f, 86.050156f, 238.2f, 87.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.89f, 80.91f),
                    PathNode.CurveTo(247.38441f, 76.61903f, 245.15755f, 72.71749f, 241.72f, 70.1f),
                    PathNode.CurveTo(209.0361f, 45.237f, 169.06558f, 31.845535f, 128.0f, 32.0f),
                    PathNode.CurveTo(86.934425f, 31.845535f, 46.963894f, 45.237f, 14.28f, 70.1f),
                    PathNode.CurveTo(10.842456f, 72.71749f, 8.615581f, 76.61903f, 8.11f, 80.91f),
                    PathNode.CurveTo(7.601669f, 85.191765f, 8.882438f, 89.49356f, 11.65f, 92.8f),
                    PathNode.LineTo(115.65f, 218.23f),
                    PathNode.CurveTo(118.69429f, 221.90648f, 123.226776f, 224.0241f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(132.75923f, 224.0121f, 137.27461f, 221.89565f, 140.31f, 218.23f),
                    PathNode.LineTo(244.31f, 92.8f),
                    PathNode.CurveTo(247.09187f, 89.49991f, 248.38731f, 85.19743f, 247.89f, 80.91f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.LineTo(24.09f, 82.74f),
                    PathNode.CurveTo(53.97058f, 60.060875f, 90.487724f, 47.852177f, 128.0f, 48.0f),
                    PathNode.CurveTo(165.51227f, 47.852177f, 202.02942f, 60.060875f, 231.91f, 82.74f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
