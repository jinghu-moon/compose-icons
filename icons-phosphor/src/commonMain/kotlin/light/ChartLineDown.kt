package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorLightIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.LineTo(26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 44.68629f, 28.68629f, 42.0f, 32.0f, 42.0f),
                    PathNode.CurveTo(35.31371f, 42.0f, 38.0f, 44.68629f, 38.0f, 48.0f),
                    PathNode.LineTo(38.0f, 61.52f),
                    PathNode.LineTo(96.0f, 119.52f),
                    PathNode.LineTo(123.76f, 91.77f),
                    PathNode.CurveTo(126.10254f, 89.430374f, 129.89746f, 89.430374f, 132.24f, 91.77f),
                    PathNode.LineTo(194.0f, 153.52f),
                    PathNode.LineTo(194.0f, 128.0f),
                    PathNode.CurveTo(194.0f, 124.686295f, 196.6863f, 122.0f, 200.0f, 122.0f),
                    PathNode.CurveTo(203.3137f, 122.0f, 206.0f, 124.686295f, 206.0f, 128.0f),
                    PathNode.LineTo(206.0f, 168.0f),
                    PathNode.CurveTo(205.99957f, 168.36938f, 205.96272f, 168.73784f, 205.89f, 169.1f),
                    PathNode.LineTo(205.89f, 169.16f),
                    PathNode.CurveTo(205.81253f, 169.51712f, 205.70891f, 169.86807f, 205.58f, 170.21f),
                    PathNode.LineTo(205.58f, 170.28f),
                    PathNode.CurveTo(205.43774f, 170.6286f, 205.26366f, 170.96335f, 205.06f, 171.28f),
                    PathNode.LineTo(205.06f, 171.34f),
                    PathNode.CurveTo(204.61256f, 172.00227f, 204.04227f, 172.57257f, 203.38f, 173.02f),
                    PathNode.LineTo(203.32f, 173.02f),
                    PathNode.CurveTo(203.00334f, 173.22368f, 202.6686f, 173.39775f, 202.32f, 173.54f),
                    PathNode.LineTo(202.25f, 173.54f),
                    PathNode.CurveTo(201.90807f, 173.66891f, 201.55711f, 173.77252f, 201.2f, 173.85f),
                    PathNode.LineTo(201.14f, 173.85f),
                    PathNode.CurveTo(200.77785f, 173.92273f, 200.4094f, 173.95958f, 200.04f, 173.96f),
                    PathNode.LineTo(160.0f, 173.96f),
                    PathNode.CurveTo(156.6863f, 173.96f, 154.0f, 171.27371f, 154.0f, 167.96f),
                    PathNode.CurveTo(154.0f, 164.64629f, 156.6863f, 161.96f, 160.0f, 161.96f),
                    PathNode.LineTo(185.52f, 161.96f),
                    PathNode.LineTo(128.0f, 104.49f),
                    PathNode.LineTo(100.24f, 132.24f),
                    PathNode.CurveTo(97.89746f, 134.57962f, 94.10254f, 134.57962f, 91.76f, 132.24f),
                    PathNode.LineTo(38.0f, 78.48f),
                    PathNode.LineTo(38.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
