package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorBoldIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.07f, 31.12f),
                    PathNode.CurveTo(211.16554f, 26.663548f, 203.57716f, 27.026178f, 199.12f, 31.93f),
                    PathNode.LineTo(195.42f, 36.0f),
                    PathNode.LineTo(128.0f, 36.0f),
                    PathNode.CurveTo(92.177765f, 35.98237f, 59.60628f, 56.770473f, 44.53671f, 89.2688f),
                    PathNode.CurveTo(29.467138f, 121.76712f, 34.643127f, 160.05884f, 57.8f, 187.39f),
                    PathNode.LineTo(39.12f, 207.93f),
                    PathNode.CurveTo(36.175465f, 211.09306f, 35.15908f, 215.59502f, 36.459072f, 219.71634f),
                    PathNode.CurveTo(37.759064f, 223.83765f, 41.174625f, 226.94165f, 45.401115f, 227.84271f),
                    PathNode.CurveTo(49.6276f, 228.74379f, 54.012154f, 227.30273f, 56.88f, 224.07f),
                    PathNode.LineTo(75.55f, 203.54f),
                    PathNode.CurveTo(90.93236f, 214.27419f, 109.24262f, 220.02036f, 128.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(206.62741f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 201.37259f, 206.62741f, 196.0f, 200.0f, 196.0f),
                    PathNode.LineTo(128.0f, 196.0f),
                    PathNode.CurveTo(115.215294f, 196.01358f, 102.68953f, 192.39665f, 91.88f, 185.57f),
                    PathNode.LineTo(216.88f, 48.07f),
                    PathNode.CurveTo(221.33647f, 43.16554f, 220.9738f, 35.577156f, 216.07f, 31.12f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 128.0f),
                    PathNode.CurveTo(60.038586f, 90.46063f, 90.46063f, 60.038586f, 128.0f, 60.0f),
                    PathNode.LineTo(173.6f, 60.0f),
                    PathNode.LineTo(74.13f, 169.42f),
                    PathNode.CurveTo(64.95884f, 157.56134f, 59.988403f, 142.99126f, 60.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
