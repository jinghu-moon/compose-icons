package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorFillIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(201.12f, 119.85f),
                    PathNode.CurveTo(157.56075f, 88.046295f, 98.439255f, 88.046295f, 54.88f, 119.85f),
                    PathNode.LineTo(24.09f, 82.74f),
                    PathNode.CurveTo(53.97058f, 60.060875f, 90.487724f, 47.852177f, 128.0f, 48.0f),
                    PathNode.CurveTo(165.51227f, 47.852177f, 202.02942f, 60.060875f, 231.91f, 82.74f),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
