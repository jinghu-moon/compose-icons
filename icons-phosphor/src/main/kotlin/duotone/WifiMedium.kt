package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorDuotoneIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.33f, 130.94f),
                    PathNode.LineTo(134.15f, 213.12f),
                    PathNode.CurveTo(132.63008f, 214.94698f, 130.37656f, 216.0036f, 128.0f, 216.0036f),
                    PathNode.CurveTo(125.62345f, 216.0036f, 123.36992f, 214.94698f, 121.85f, 213.12f),
                    PathNode.LineTo(53.67f, 130.94f),
                    PathNode.CurveTo(96.712234f, 95.01527f, 159.28777f, 95.01527f, 202.33f, 130.94f),
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
                    PathNode.LineTo(65.13f, 132.2f),
                    PathNode.CurveTo(102.71183f, 105.25205f, 153.28818f, 105.25205f, 190.87f, 132.2f),
                    PathNode.Close,
                    PathNode.MoveTo(201.12f, 119.84f),
                    PathNode.CurveTo(157.56075f, 88.03629f, 98.439255f, 88.03629f, 54.88f, 119.84f),
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
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
