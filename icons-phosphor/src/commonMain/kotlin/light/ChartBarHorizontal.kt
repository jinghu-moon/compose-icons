package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorLightIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 98.0f),
                    PathNode.LineTo(182.0f, 98.0f),
                    PathNode.LineTo(182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 52.68629f, 179.3137f, 50.0f, 176.0f, 50.0f),
                    PathNode.LineTo(54.0f, 50.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 36.68629f, 51.31371f, 34.0f, 48.0f, 34.0f),
                    PathNode.CurveTo(44.68629f, 34.0f, 42.0f, 36.68629f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 219.3137f, 44.68629f, 222.0f, 48.0f, 222.0f),
                    PathNode.CurveTo(51.31371f, 222.0f, 54.0f, 219.3137f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 206.0f),
                    PathNode.LineTo(144.0f, 206.0f),
                    PathNode.CurveTo(147.3137f, 206.0f, 150.0f, 203.3137f, 150.0f, 200.0f),
                    PathNode.LineTo(150.0f, 158.0f),
                    PathNode.LineTo(224.0f, 158.0f),
                    PathNode.CurveTo(227.3137f, 158.0f, 230.0f, 155.3137f, 230.0f, 152.0f),
                    PathNode.LineTo(230.0f, 104.0f),
                    PathNode.CurveTo(230.0f, 100.686295f, 227.3137f, 98.0f, 224.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 62.0f),
                    PathNode.LineTo(170.0f, 98.0f),
                    PathNode.LineTo(54.0f, 98.0f),
                    PathNode.LineTo(54.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 194.0f),
                    PathNode.LineTo(54.0f, 194.0f),
                    PathNode.LineTo(54.0f, 158.0f),
                    PathNode.LineTo(138.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 146.0f),
                    PathNode.LineTo(54.0f, 146.0f),
                    PathNode.LineTo(54.0f, 110.0f),
                    PathNode.LineTo(218.0f, 110.0f),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
