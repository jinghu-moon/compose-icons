package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorLightIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 32.0f),
                    PathNode.CurveTo(206.0f, 35.31371f, 203.3137f, 38.0f, 200.0f, 38.0f),
                    PathNode.LineTo(56.0f, 38.0f),
                    PathNode.CurveTo(52.68629f, 38.0f, 50.0f, 35.31371f, 50.0f, 32.0f),
                    PathNode.CurveTo(50.0f, 28.68629f, 52.68629f, 26.0f, 56.0f, 26.0f),
                    PathNode.LineTo(200.0f, 26.0f),
                    PathNode.CurveTo(203.3137f, 26.0f, 206.0f, 28.68629f, 206.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 72.0f),
                    PathNode.LineTo(174.0f, 224.0f),
                    PathNode.CurveTo(174.0f, 231.73198f, 167.73198f, 238.0f, 160.0f, 238.0f),
                    PathNode.LineTo(96.0f, 238.0f),
                    PathNode.CurveTo(88.26801f, 238.0f, 82.0f, 231.73198f, 82.0f, 224.0f),
                    PathNode.LineTo(82.0f, 72.0f),
                    PathNode.CurveTo(82.0f, 64.26801f, 88.26801f, 58.0f, 96.0f, 58.0f),
                    PathNode.LineTo(160.0f, 58.0f),
                    PathNode.CurveTo(167.73198f, 58.0f, 174.0f, 64.26801f, 174.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 72.0f),
                    PathNode.CurveTo(162.0f, 70.89543f, 161.10457f, 70.0f, 160.0f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(94.89543f, 70.0f, 94.0f, 70.89543f, 94.0f, 72.0f),
                    PathNode.LineTo(94.0f, 224.0f),
                    PathNode.CurveTo(94.0f, 225.10457f, 94.89543f, 226.0f, 96.0f, 226.0f),
                    PathNode.LineTo(160.0f, 226.0f),
                    PathNode.CurveTo(161.10457f, 226.0f, 162.0f, 225.10457f, 162.0f, 224.0f),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
