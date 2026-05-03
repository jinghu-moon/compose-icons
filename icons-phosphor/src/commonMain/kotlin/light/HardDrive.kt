package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorLightIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 66.0f),
                    PathNode.LineTo(32.0f, 66.0f),
                    PathNode.CurveTo(24.268015f, 66.0f, 18.0f, 72.26801f, 18.0f, 80.0f),
                    PathNode.LineTo(18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 183.73198f, 24.268015f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(231.73198f, 190.0f, 238.0f, 183.73198f, 238.0f, 176.0f),
                    PathNode.LineTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 72.26801f, 231.73198f, 66.0f, 224.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 176.0f),
                    PathNode.CurveTo(226.0f, 177.10457f, 225.10457f, 178.0f, 224.0f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(30.89543f, 178.0f, 30.0f, 177.10457f, 30.0f, 176.0f),
                    PathNode.LineTo(30.0f, 80.0f),
                    PathNode.CurveTo(30.0f, 78.89543f, 30.89543f, 78.0f, 32.0f, 78.0f),
                    PathNode.LineTo(224.0f, 78.0f),
                    PathNode.CurveTo(225.10457f, 78.0f, 226.0f, 78.89543f, 226.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 128.0f),
                    PathNode.CurveTo(198.0f, 133.52284f, 193.52284f, 138.0f, 188.0f, 138.0f),
                    PathNode.CurveTo(182.47716f, 138.0f, 178.0f, 133.52284f, 178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 122.47715f, 182.47716f, 118.0f, 188.0f, 118.0f),
                    PathNode.CurveTo(193.52284f, 118.0f, 198.0f, 122.47715f, 198.0f, 128.0f),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
