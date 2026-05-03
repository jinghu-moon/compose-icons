package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorDuotoneIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(44.86f, 176.0f),
                    PathNode.LineTo(44.86f, 176.0f),
                    PathNode.CurveTo(27.711111f, 146.29726f, 27.711262f, 109.70193f, 44.86039f, 79.99932f),
                    PathNode.CurveTo(62.00952f, 50.29672f, 93.702225f, 31.999443f, 128.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.87f, 77.27f),
                    PathNode.LineTo(136.0f, 114.14f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(161.66647f, 42.72312f, 185.01108f, 56.210144f, 199.87f, 77.27f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 123.37f),
                    PathNode.LineTo(48.11f, 164.87f),
                    PathNode.CurveTo(36.134155f, 138.91269f, 37.513172f, 108.755646f, 51.808025f, 83.99964f),
                    PathNode.CurveTo(66.10288f, 59.243633f, 91.53208f, 42.973877f, 120.0f, 40.37f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(99.41163f, 215.9883f, 72.61055f, 202.08994f, 56.13f, 178.73f),
                    PathNode.LineTo(207.89f, 91.12f),
                    PathNode.CurveTo(220.46655f, 118.366615f, 218.2915f, 150.14386f, 202.11972f, 175.42274f),
                    PathNode.CurveTo(185.94797f, 200.70163f, 158.00912f, 215.9969f, 128.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
