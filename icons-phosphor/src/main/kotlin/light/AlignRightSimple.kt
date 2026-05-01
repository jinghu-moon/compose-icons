package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorLightIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 203.3137f, 227.3137f, 206.0f, 224.0f, 206.0f),
                    PathNode.CurveTo(220.6863f, 206.0f, 218.0f, 203.3137f, 218.0f, 200.0f),
                    PathNode.LineTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 52.68629f, 220.6863f, 50.0f, 224.0f, 50.0f),
                    PathNode.CurveTo(227.3137f, 50.0f, 230.0f, 52.68629f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 96.0f),
                    PathNode.LineTo(198.0f, 160.0f),
                    PathNode.CurveTo(198.0f, 167.73198f, 191.73198f, 174.0f, 184.0f, 174.0f),
                    PathNode.LineTo(32.0f, 174.0f),
                    PathNode.CurveTo(24.268015f, 174.0f, 18.0f, 167.73198f, 18.0f, 160.0f),
                    PathNode.LineTo(18.0f, 96.0f),
                    PathNode.CurveTo(18.0f, 88.26801f, 24.268015f, 82.0f, 32.0f, 82.0f),
                    PathNode.LineTo(184.0f, 82.0f),
                    PathNode.CurveTo(191.73198f, 82.0f, 198.0f, 88.26801f, 198.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 96.0f),
                    PathNode.CurveTo(186.0f, 94.89543f, 185.10457f, 94.0f, 184.0f, 94.0f),
                    PathNode.LineTo(32.0f, 94.0f),
                    PathNode.CurveTo(30.89543f, 94.0f, 30.0f, 94.89543f, 30.0f, 96.0f),
                    PathNode.LineTo(30.0f, 160.0f),
                    PathNode.CurveTo(30.0f, 161.10457f, 30.89543f, 162.0f, 32.0f, 162.0f),
                    PathNode.LineTo(184.0f, 162.0f),
                    PathNode.CurveTo(185.10457f, 162.0f, 186.0f, 161.10457f, 186.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
