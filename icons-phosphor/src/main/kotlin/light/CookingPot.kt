package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorLightIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.0f, 48.0f),
                    PathNode.LineTo(90.0f, 16.0f),
                    PathNode.CurveTo(90.0f, 12.686292f, 92.686295f, 10.0f, 96.0f, 10.0f),
                    PathNode.CurveTo(99.313705f, 10.0f, 102.0f, 12.686292f, 102.0f, 16.0f),
                    PathNode.LineTo(102.0f, 48.0f),
                    PathNode.CurveTo(102.0f, 51.31371f, 99.313705f, 54.0f, 96.0f, 54.0f),
                    PathNode.CurveTo(92.686295f, 54.0f, 90.0f, 51.31371f, 90.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 54.0f),
                    PathNode.CurveTo(131.3137f, 54.0f, 134.0f, 51.31371f, 134.0f, 48.0f),
                    PathNode.LineTo(134.0f, 16.0f),
                    PathNode.CurveTo(134.0f, 12.686292f, 131.3137f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.LineTo(122.0f, 48.0f),
                    PathNode.CurveTo(122.0f, 51.31371f, 124.686295f, 54.0f, 128.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 54.0f),
                    PathNode.CurveTo(163.3137f, 54.0f, 166.0f, 51.31371f, 166.0f, 48.0f),
                    PathNode.LineTo(166.0f, 16.0f),
                    PathNode.CurveTo(166.0f, 12.686292f, 163.3137f, 10.0f, 160.0f, 10.0f),
                    PathNode.CurveTo(156.6863f, 10.0f, 154.0f, 12.686292f, 154.0f, 16.0f),
                    PathNode.LineTo(154.0f, 48.0f),
                    PathNode.CurveTo(154.0f, 51.31371f, 156.6863f, 54.0f, 160.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.6f, 100.8f),
                    PathNode.LineTo(222.0f, 123.0f),
                    PathNode.LineTo(222.0f, 184.0f),
                    PathNode.CurveTo(222.0f, 200.56854f, 208.56854f, 214.0f, 192.0f, 214.0f),
                    PathNode.LineTo(64.0f, 214.0f),
                    PathNode.CurveTo(47.431458f, 214.0f, 34.0f, 200.56854f, 34.0f, 184.0f),
                    PathNode.LineTo(34.0f, 123.0f),
                    PathNode.LineTo(4.4f, 100.8f),
                    PathNode.CurveTo(1.749033f, 98.811775f, 1.211775f, 95.050964f, 3.2f, 92.4f),
                    PathNode.CurveTo(5.188226f, 89.74903f, 8.949033f, 89.21178f, 11.6f, 91.2f),
                    PathNode.LineTo(34.0f, 108.0f),
                    PathNode.LineTo(34.0f, 80.0f),
                    PathNode.CurveTo(34.0f, 76.686295f, 36.68629f, 74.0f, 40.0f, 74.0f),
                    PathNode.LineTo(216.0f, 74.0f),
                    PathNode.CurveTo(219.3137f, 74.0f, 222.0f, 76.686295f, 222.0f, 80.0f),
                    PathNode.LineTo(222.0f, 108.0f),
                    PathNode.LineTo(244.4f, 91.2f),
                    PathNode.CurveTo(247.05096f, 89.21178f, 250.81177f, 89.74903f, 252.8f, 92.4f),
                    PathNode.CurveTo(254.78822f, 95.050964f, 254.25096f, 98.811775f, 251.6f, 100.8f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 86.0f),
                    PathNode.LineTo(46.0f, 86.0f),
                    PathNode.LineTo(46.0f, 184.0f),
                    PathNode.CurveTo(46.0f, 193.94113f, 54.058876f, 202.0f, 64.0f, 202.0f),
                    PathNode.LineTo(192.0f, 202.0f),
                    PathNode.CurveTo(201.94113f, 202.0f, 210.0f, 193.94113f, 210.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
