package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorThinIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(53.5f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 224.0f),
                    PathNode.CurveTo(27.97097f, 228.67346f, 30.682478f, 232.93048f, 34.93f, 234.88f),
                    PathNode.CurveTo(36.518944f, 235.61612f, 38.248833f, 235.99826f, 40.0f, 236.0f),
                    PathNode.CurveTo(42.838223f, 235.98877f, 45.580593f, 234.9719f, 47.74f, 233.13f),
                    PathNode.LineTo(81.49f, 204.0f),
                    PathNode.LineTo(191.68f, 204.0f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.76736f, 219.5346f, 206.85892f, 220.01125f, 208.0f, 220.0f),
                    PathNode.CurveTo(209.59029f, 220.01582f, 211.03888f, 219.08803f, 211.68962f, 217.63689f),
                    PathNode.CurveTo(212.34035f, 216.18575f, 212.0696f, 214.48695f, 211.0f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 196.0f),
                    PathNode.CurveTo(79.038055f, 196.00864f, 78.11145f, 196.36366f, 77.39f, 197.0f),
                    PathNode.LineTo(42.57f, 227.0f),
                    PathNode.CurveTo(41.388035f, 227.99138f, 39.741318f, 228.21469f, 38.33801f, 227.57391f),
                    PathNode.CurveTo(36.9347f, 226.93314f, 36.024956f, 225.54248f, 36.0f, 224.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(60.78f, 60.0f),
                    PathNode.LineTo(184.41f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 186.0f),
                    PathNode.CurveTo(228.0f, 188.20914f, 226.20914f, 190.0f, 224.0f, 190.0f),
                    PathNode.CurveTo(221.79086f, 190.0f, 220.0f, 188.20914f, 220.0f, 186.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 61.79086f, 218.20914f, 60.0f, 216.0f, 60.0f),
                    PathNode.LineTo(105.79f, 60.0f),
                    PathNode.CurveTo(103.580864f, 60.0f, 101.79f, 58.20914f, 101.79f, 56.0f),
                    PathNode.CurveTo(101.79f, 53.79086f, 103.580864f, 52.0f, 105.79f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
