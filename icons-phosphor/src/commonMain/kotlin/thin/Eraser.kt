package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorThinIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.15f, 83.22f),
                    PathNode.LineTo(180.77f, 41.85f),
                    PathNode.CurveTo(172.96f, 34.042362f, 160.3f, 34.042362f, 152.49f, 41.85f),
                    PathNode.LineTo(33.85f, 160.48f),
                    PathNode.CurveTo(30.097519f, 164.23096f, 27.989271f, 169.31926f, 27.989271f, 174.62498f),
                    PathNode.CurveTo(27.989271f, 179.93074f, 30.097519f, 185.01904f, 33.85f, 188.77f),
                    PathNode.LineTo(63.91f, 218.83f),
                    PathNode.CurveTo(64.66079f, 219.57996f, 65.67882f, 220.00084f, 66.74f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 213.79086f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(121.66f, 212.0f),
                    PathNode.LineTo(222.15f, 111.51f),
                    PathNode.CurveTo(225.90248f, 107.75904f, 228.01073f, 102.67073f, 228.01073f, 97.365f),
                    PathNode.CurveTo(228.01073f, 92.059265f, 225.90248f, 86.97096f, 222.15f, 83.22f),
                    PathNode.Close,
                    PathNode.MoveTo(110.34f, 212.0f),
                    PathNode.LineTo(68.4f, 212.0f),
                    PathNode.LineTo(39.51f, 183.11f),
                    PathNode.CurveTo(37.250546f, 180.85838f, 35.980537f, 177.79982f, 35.980537f, 174.61f),
                    PathNode.CurveTo(35.980537f, 171.42018f, 37.250546f, 168.36162f, 39.51f, 166.11f),
                    PathNode.LineTo(96.0f, 109.65f),
                    PathNode.LineTo(154.35f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.49f, 105.85f),
                    PathNode.LineTo(160.0f, 162.34f),
                    PathNode.LineTo(101.65f, 104.0f),
                    PathNode.LineTo(158.14f, 47.52f),
                    PathNode.CurveTo(160.39162f, 45.260548f, 163.45018f, 43.990536f, 166.64f, 43.990536f),
                    PathNode.CurveTo(169.82982f, 43.990536f, 172.88838f, 45.260548f, 175.14f, 47.52f),
                    PathNode.LineTo(216.51f, 88.89f),
                    PathNode.CurveTo(221.18373f, 93.5806f, 221.17479f, 101.17044f, 216.49f, 105.85f),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
