package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorThinIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.61f, 128.0f),
                    PathNode.LineTo(227.47f, 74.0f),
                    PathNode.CurveTo(228.18506f, 72.76148f, 228.1845f, 71.235435f, 227.46852f, 69.99745f),
                    PathNode.CurveTo(226.75256f, 68.75945f, 225.43011f, 67.99789f, 224.0f, 68.0f),
                    PathNode.LineTo(162.33f, 68.0f),
                    PathNode.LineTo(131.47f, 14.0f),
                    PathNode.CurveTo(130.75703f, 12.756622f, 129.43329f, 11.989749f, 128.0f, 11.989749f),
                    PathNode.CurveTo(126.56671f, 11.989749f, 125.24297f, 12.756622f, 124.53f, 14.0f),
                    PathNode.LineTo(93.66f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(30.569883f, 67.99789f, 29.247444f, 68.75945f, 28.531473f, 69.99745f),
                    PathNode.CurveTo(27.8155f, 71.235435f, 27.81494f, 72.76148f, 28.53f, 74.0f),
                    PathNode.LineTo(59.38f, 128.0f),
                    PathNode.LineTo(28.53f, 182.0f),
                    PathNode.CurveTo(27.81494f, 183.23851f, 27.8155f, 184.76457f, 28.531473f, 186.00256f),
                    PathNode.CurveTo(29.247444f, 187.24055f, 30.569883f, 188.0021f, 32.0f, 188.0f),
                    PathNode.LineTo(93.66f, 188.0f),
                    PathNode.LineTo(124.53f, 242.0f),
                    PathNode.CurveTo(125.24297f, 243.24338f, 126.56671f, 244.01025f, 128.0f, 244.01025f),
                    PathNode.CurveTo(129.43329f, 244.01025f, 130.75703f, 243.24338f, 131.47f, 242.0f),
                    PathNode.LineTo(162.33f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(225.43011f, 188.0021f, 226.75256f, 187.24055f, 227.46852f, 186.00256f),
                    PathNode.CurveTo(228.1845f, 184.76457f, 228.18506f, 183.23851f, 227.47f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.11f, 76.0f),
                    PathNode.LineTo(192.0f, 119.94f),
                    PathNode.LineTo(166.9f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.39f, 128.0f),
                    PathNode.LineTo(157.69f, 180.0f),
                    PathNode.LineTo(98.3f, 180.0f),
                    PathNode.LineTo(68.59f, 128.0f),
                    PathNode.LineTo(98.3f, 76.0f),
                    PathNode.LineTo(157.69f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.06f),
                    PathNode.LineTo(153.12f, 68.06f),
                    PathNode.LineTo(102.87f, 68.06f),
                    PathNode.Close,
                    PathNode.MoveTo(38.89f, 76.0f),
                    PathNode.LineTo(89.08f, 76.0f),
                    PathNode.LineTo(64.0f, 119.94f),
                    PathNode.Close,
                    PathNode.MoveTo(38.89f, 179.92f),
                    PathNode.LineTo(64.0f, 136.06f),
                    PathNode.LineTo(89.08f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 231.92f),
                    PathNode.LineTo(102.87f, 187.92f),
                    PathNode.LineTo(153.12f, 187.92f),
                    PathNode.Close,
                    PathNode.MoveTo(166.9f, 180.0f),
                    PathNode.LineTo(192.0f, 136.06f),
                    PathNode.LineTo(217.11f, 180.0f),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
