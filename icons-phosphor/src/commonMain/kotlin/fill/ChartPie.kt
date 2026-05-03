package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorFillIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(156.58838f, 40.011684f, 183.38945f, 53.91006f, 199.87f, 77.27f),
                    PathNode.LineTo(128.0f, 118.76f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
