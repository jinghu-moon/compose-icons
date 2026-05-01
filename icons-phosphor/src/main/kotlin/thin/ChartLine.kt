package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorThinIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 29.790861f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(34.20914f, 44.0f, 36.0f, 45.79086f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 151.19f),
                    PathNode.LineTo(93.37f, 101.0f),
                    PathNode.CurveTo(94.78645f, 99.7734f, 96.86455f, 99.694435f, 98.37f, 100.81f),
                    PathNode.LineTo(159.78f, 146.86f),
                    PathNode.LineTo(221.37f, 93.0f),
                    PathNode.CurveTo(223.0426f, 91.73469f, 225.4085f, 91.97611f, 226.79106f, 93.55318f),
                    PathNode.CurveTo(228.17361f, 95.13024f, 228.10333f, 97.50738f, 226.63f, 99.0f),
                    PathNode.LineTo(162.63f, 155.0f),
                    PathNode.CurveTo(161.21355f, 156.2266f, 159.13545f, 156.30557f, 157.63f, 155.19f),
                    PathNode.LineTo(96.22f, 109.19f),
                    PathNode.LineTo(36.0f, 161.81f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
