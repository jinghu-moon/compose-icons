package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorLightIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 200.0f),
                    PathNode.CurveTo(38.0f, 203.3137f, 35.31371f, 206.0f, 32.0f, 206.0f),
                    PathNode.CurveTo(28.68629f, 206.0f, 26.0f, 203.3137f, 26.0f, 200.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 52.68629f, 28.68629f, 50.0f, 32.0f, 50.0f),
                    PathNode.CurveTo(35.31371f, 50.0f, 38.0f, 52.68629f, 38.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 96.0f),
                    PathNode.LineTo(238.0f, 160.0f),
                    PathNode.CurveTo(238.0f, 167.73198f, 231.73198f, 174.0f, 224.0f, 174.0f),
                    PathNode.LineTo(72.0f, 174.0f),
                    PathNode.CurveTo(64.26801f, 174.0f, 58.0f, 167.73198f, 58.0f, 160.0f),
                    PathNode.LineTo(58.0f, 96.0f),
                    PathNode.CurveTo(58.0f, 88.26801f, 64.26801f, 82.0f, 72.0f, 82.0f),
                    PathNode.LineTo(224.0f, 82.0f),
                    PathNode.CurveTo(231.73198f, 82.0f, 238.0f, 88.26801f, 238.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 96.0f),
                    PathNode.CurveTo(226.0f, 94.89543f, 225.10457f, 94.0f, 224.0f, 94.0f),
                    PathNode.LineTo(72.0f, 94.0f),
                    PathNode.CurveTo(70.89543f, 94.0f, 70.0f, 94.89543f, 70.0f, 96.0f),
                    PathNode.LineTo(70.0f, 160.0f),
                    PathNode.CurveTo(70.0f, 161.10457f, 70.89543f, 162.0f, 72.0f, 162.0f),
                    PathNode.LineTo(224.0f, 162.0f),
                    PathNode.CurveTo(225.10457f, 162.0f, 226.0f, 161.10457f, 226.0f, 160.0f),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
