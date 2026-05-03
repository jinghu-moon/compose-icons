package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorLightIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 232.0f),
                    PathNode.CurveTo(206.0f, 235.3137f, 203.3137f, 238.0f, 200.0f, 238.0f),
                    PathNode.LineTo(56.0f, 238.0f),
                    PathNode.CurveTo(52.68629f, 238.0f, 50.0f, 235.3137f, 50.0f, 232.0f),
                    PathNode.CurveTo(50.0f, 228.6863f, 52.68629f, 226.0f, 56.0f, 226.0f),
                    PathNode.LineTo(200.0f, 226.0f),
                    PathNode.CurveTo(203.3137f, 226.0f, 206.0f, 228.6863f, 206.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 192.0f),
                    PathNode.LineTo(82.0f, 40.0f),
                    PathNode.CurveTo(82.0f, 32.268013f, 88.26801f, 26.0f, 96.0f, 26.0f),
                    PathNode.LineTo(160.0f, 26.0f),
                    PathNode.CurveTo(167.73198f, 26.0f, 174.0f, 32.268013f, 174.0f, 40.0f),
                    PathNode.LineTo(174.0f, 192.0f),
                    PathNode.CurveTo(174.0f, 199.73198f, 167.73198f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(96.0f, 206.0f),
                    PathNode.CurveTo(88.26801f, 206.0f, 82.0f, 199.73198f, 82.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 192.0f),
                    PathNode.CurveTo(94.0f, 193.10457f, 94.89543f, 194.0f, 96.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(161.10457f, 194.0f, 162.0f, 193.10457f, 162.0f, 192.0f),
                    PathNode.LineTo(162.0f, 40.0f),
                    PathNode.CurveTo(162.0f, 38.89543f, 161.10457f, 38.0f, 160.0f, 38.0f),
                    PathNode.LineTo(96.0f, 38.0f),
                    PathNode.CurveTo(94.89543f, 38.0f, 94.0f, 38.89543f, 94.0f, 40.0f),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
