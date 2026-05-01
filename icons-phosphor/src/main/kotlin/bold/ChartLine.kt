package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorBoldIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(25.372583f, 220.0f, 20.0f, 214.62741f, 20.0f, 208.0f),
                    PathNode.LineTo(20.0f, 48.0f),
                    PathNode.CurveTo(20.0f, 41.37258f, 25.372583f, 36.0f, 32.0f, 36.0f),
                    PathNode.CurveTo(38.62742f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 133.55f),
                    PathNode.LineTo(88.1f, 95.0f),
                    PathNode.CurveTo(92.366745f, 91.266914f, 98.66396f, 91.029205f, 103.2f, 94.43f),
                    PathNode.LineTo(159.42f, 136.59f),
                    PathNode.LineTo(216.1f, 87.0f),
                    PathNode.CurveTo(219.26431f, 83.84166f, 223.92203f, 82.70428f, 228.18588f, 84.04873f),
                    PathNode.CurveTo(232.44974f, 85.39317f, 235.61266f, 88.9965f, 236.39305f, 93.39866f),
                    PathNode.CurveTo(237.17343f, 97.80081f, 235.44188f, 102.2718f, 231.9f, 105.0f),
                    PathNode.LineTo(167.9f, 161.0f),
                    PathNode.CurveTo(163.63326f, 164.73308f, 157.33604f, 164.9708f, 152.8f, 161.57f),
                    PathNode.LineTo(96.58f, 119.44f),
                    PathNode.LineTo(44.0f, 165.45f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 201.37259f, 236.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
