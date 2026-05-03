package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorLightIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.69f, 51.27f),
                    PathNode.CurveTo(226.23286f, 50.132805f, 224.33292f, 49.730682f, 222.54f, 50.18f),
                    PathNode.LineTo(160.7f, 65.64f),
                    PathNode.LineTo(98.7f, 34.64f),
                    PathNode.CurveTo(97.417984f, 34.00055f, 95.94947f, 33.840927f, 94.56f, 34.19f),
                    PathNode.LineTo(30.56f, 50.19f),
                    PathNode.CurveTo(27.886877f, 50.850857f, 26.00672f, 53.24641f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(25.999893f, 201.84854f, 26.851873f, 203.59393f, 28.309336f, 204.73099f),
                    PathNode.CurveTo(29.7668f, 205.86804f, 31.667023f, 206.2698f, 33.46f, 205.82f),
                    PathNode.LineTo(95.3f, 190.36f),
                    PathNode.LineTo(157.3f, 221.36f),
                    PathNode.CurveTo(158.58202f, 221.99945f, 160.05054f, 222.15907f, 161.44f, 221.81f),
                    PathNode.LineTo(225.44f, 205.81f),
                    PathNode.CurveTo(228.11311f, 205.14914f, 229.99329f, 202.75359f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(229.99965f, 54.151695f, 229.14745f, 52.406708f, 227.69f, 51.27f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 49.71f),
                    PathNode.LineTo(154.0f, 75.71f),
                    PathNode.LineTo(154.0f, 206.29f),
                    PathNode.LineTo(102.0f, 180.29f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 60.71f),
                    PathNode.LineTo(90.0f, 47.71f),
                    PathNode.LineTo(90.0f, 179.32f),
                    PathNode.LineTo(38.0f, 192.32f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 195.32f),
                    PathNode.LineTo(166.0f, 208.32f),
                    PathNode.LineTo(166.0f, 76.68f),
                    PathNode.LineTo(218.0f, 63.68f),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
