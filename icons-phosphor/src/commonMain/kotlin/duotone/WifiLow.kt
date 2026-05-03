package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorDuotoneIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.68f, 167.88f),
                    PathNode.LineTo(134.15f, 213.12f),
                    PathNode.CurveTo(132.63008f, 214.94698f, 130.37656f, 216.0036f, 128.0f, 216.0036f),
                    PathNode.CurveTo(125.62345f, 216.0036f, 123.36992f, 214.94698f, 121.85f, 213.12f),
                    PathNode.LineTo(84.32f, 167.88f),
                    PathNode.CurveTo(109.58915f, 146.7011f, 146.41084f, 146.7011f, 171.68f, 167.88f),
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
                    PathNode.LineTo(140.31f, 218.23f),
                    PathNode.LineTo(244.31f, 92.8f),
                    PathNode.CurveTo(247.09187f, 89.49991f, 248.38731f, 85.19743f, 247.89f, 80.91f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.LineTo(95.9f, 169.3f),
                    PathNode.CurveTo(115.500305f, 156.88818f, 140.4997f, 156.88818f, 160.1f, 169.3f),
                    PathNode.Close,
                    PathNode.MoveTo(170.37f, 156.92f),
                    PathNode.CurveTo(144.75352f, 139.6812f, 111.24648f, 139.6812f, 85.63f, 156.92f),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
