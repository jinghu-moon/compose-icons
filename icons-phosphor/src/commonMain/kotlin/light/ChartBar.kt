package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorLightIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 202.0f),
                    PathNode.LineTo(214.0f, 202.0f),
                    PathNode.LineTo(214.0f, 40.0f),
                    PathNode.CurveTo(214.0f, 36.68629f, 211.3137f, 34.0f, 208.0f, 34.0f),
                    PathNode.LineTo(152.0f, 34.0f),
                    PathNode.CurveTo(148.6863f, 34.0f, 146.0f, 36.68629f, 146.0f, 40.0f),
                    PathNode.LineTo(146.0f, 82.0f),
                    PathNode.LineTo(96.0f, 82.0f),
                    PathNode.CurveTo(92.686295f, 82.0f, 90.0f, 84.686295f, 90.0f, 88.0f),
                    PathNode.LineTo(90.0f, 130.0f),
                    PathNode.LineTo(48.0f, 130.0f),
                    PathNode.CurveTo(44.68629f, 130.0f, 42.0f, 132.6863f, 42.0f, 136.0f),
                    PathNode.LineTo(42.0f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(28.68629f, 202.0f, 26.0f, 204.6863f, 26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 211.3137f, 28.68629f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 204.6863f, 227.3137f, 202.0f, 224.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 46.0f),
                    PathNode.LineTo(202.0f, 46.0f),
                    PathNode.LineTo(202.0f, 202.0f),
                    PathNode.LineTo(158.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 94.0f),
                    PathNode.LineTo(146.0f, 94.0f),
                    PathNode.LineTo(146.0f, 202.0f),
                    PathNode.LineTo(102.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 142.0f),
                    PathNode.LineTo(90.0f, 142.0f),
                    PathNode.LineTo(90.0f, 202.0f),
                    PathNode.LineTo(54.0f, 202.0f),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
