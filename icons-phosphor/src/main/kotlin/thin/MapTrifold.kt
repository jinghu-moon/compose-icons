package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorThinIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.46f, 52.85f),
                    PathNode.CurveTo(225.48994f, 52.09174f, 224.22475f, 51.82247f, 223.03f, 52.12f),
                    PathNode.LineTo(160.47f, 67.76f),
                    PathNode.LineTo(97.79f, 36.42f),
                    PathNode.CurveTo(96.93532f, 35.9937f, 95.956314f, 35.887283f, 95.03f, 36.12f),
                    PathNode.LineTo(31.03f, 52.12f),
                    PathNode.CurveTo(29.249481f, 52.56506f, 28.000278f, 54.1647f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(27.997828f, 201.23839f, 28.56937f, 202.40793f, 29.547733f, 203.16714f),
                    PathNode.CurveTo(30.526096f, 203.92636f, 31.80094f, 204.18959f, 33.0f, 203.88f),
                    PathNode.LineTo(95.56f, 188.24f),
                    PathNode.LineTo(158.24f, 219.58f),
                    PathNode.CurveTo(159.09468f, 220.0063f, 160.07368f, 220.11272f, 161.0f, 219.88f),
                    PathNode.LineTo(225.0f, 203.88f),
                    PathNode.CurveTo(226.7686f, 203.42336f, 228.0032f, 201.8266f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(227.99873f, 54.768967f, 227.43071f, 53.607086f, 226.46f, 52.85f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 46.47f),
                    PathNode.LineTo(156.0f, 74.47f),
                    PathNode.LineTo(156.0f, 209.53f),
                    PathNode.LineTo(100.0f, 181.53f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 59.12f),
                    PathNode.LineTo(92.0f, 45.12f),
                    PathNode.LineTo(92.0f, 180.88f),
                    PathNode.LineTo(36.0f, 194.88f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 196.88f),
                    PathNode.LineTo(164.0f, 210.88f),
                    PathNode.LineTo(164.0f, 75.12f),
                    PathNode.LineTo(220.0f, 61.12f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
