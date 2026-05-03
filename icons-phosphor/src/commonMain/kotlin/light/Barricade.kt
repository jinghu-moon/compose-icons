package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorLightIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 66.0f),
                    PathNode.LineTo(32.0f, 66.0f),
                    PathNode.CurveTo(24.268015f, 66.0f, 18.0f, 72.26801f, 18.0f, 80.0f),
                    PathNode.LineTo(18.0f, 152.0f),
                    PathNode.CurveTo(18.0f, 159.73198f, 24.268015f, 166.0f, 32.0f, 166.0f),
                    PathNode.LineTo(58.0f, 166.0f),
                    PathNode.LineTo(58.0f, 200.0f),
                    PathNode.CurveTo(58.0f, 203.3137f, 60.68629f, 206.0f, 64.0f, 206.0f),
                    PathNode.CurveTo(67.313705f, 206.0f, 70.0f, 203.3137f, 70.0f, 200.0f),
                    PathNode.LineTo(70.0f, 166.0f),
                    PathNode.LineTo(186.0f, 166.0f),
                    PathNode.LineTo(186.0f, 200.0f),
                    PathNode.CurveTo(186.0f, 203.3137f, 188.6863f, 206.0f, 192.0f, 206.0f),
                    PathNode.CurveTo(195.3137f, 206.0f, 198.0f, 203.3137f, 198.0f, 200.0f),
                    PathNode.LineTo(198.0f, 166.0f),
                    PathNode.LineTo(224.0f, 166.0f),
                    PathNode.CurveTo(231.73198f, 166.0f, 238.0f, 159.73198f, 238.0f, 152.0f),
                    PathNode.LineTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 72.26801f, 231.73198f, 66.0f, 224.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 80.0f),
                    PathNode.LineTo(226.0f, 133.52f),
                    PathNode.LineTo(170.48f, 78.0f),
                    PathNode.LineTo(224.0f, 78.0f),
                    PathNode.CurveTo(225.10457f, 78.0f, 226.0f, 78.89543f, 226.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 78.0f),
                    PathNode.LineTo(81.52f, 78.0f),
                    PathNode.LineTo(157.52f, 154.0f),
                    PathNode.LineTo(102.52f, 154.0f),
                    PathNode.LineTo(30.0f, 81.52f),
                    PathNode.LineTo(30.0f, 80.0f),
                    PathNode.CurveTo(30.0f, 78.89543f, 30.89543f, 78.0f, 32.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 152.0f),
                    PathNode.LineTo(30.0f, 98.48f),
                    PathNode.LineTo(85.52f, 154.0f),
                    PathNode.LineTo(32.0f, 154.0f),
                    PathNode.CurveTo(30.89543f, 154.0f, 30.0f, 153.10457f, 30.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 154.0f),
                    PathNode.LineTo(174.48f, 154.0f),
                    PathNode.LineTo(98.48f, 78.0f),
                    PathNode.LineTo(153.48f, 78.0f),
                    PathNode.LineTo(226.0f, 150.48f),
                    PathNode.LineTo(226.0f, 152.0f),
                    PathNode.CurveTo(226.0f, 153.10457f, 225.10457f, 154.0f, 224.0f, 154.0f),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
