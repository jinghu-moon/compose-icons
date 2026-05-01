package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorLightIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 142.63463f, 103.364624f, 155.62735f, 117.24825f, 160.25523f),
                    PathNode.CurveTo(131.13188f, 164.8831f, 146.41922f, 160.10771f, 155.2f, 148.4f),
                    PathNode.CurveTo(157.19098f, 145.74904f, 160.95404f, 145.21402f, 163.605f, 147.205f),
                    PathNode.CurveTo(166.25597f, 149.19598f, 166.79099f, 152.95903f, 164.8f, 155.61f),
                    PathNode.CurveTo(152.91719f, 171.44476f, 132.2358f, 177.90053f, 113.45509f, 171.63745f),
                    PathNode.CurveTo(94.67439f, 165.37439f, 82.0075f, 147.7975f, 82.0075f, 128.0f),
                    PathNode.CurveTo(82.0075f, 108.2025f, 94.67439f, 90.62562f, 113.45509f, 84.36255f),
                    PathNode.CurveTo(132.2358f, 78.09947f, 152.91719f, 84.55523f, 164.8f, 100.39f),
                    PathNode.CurveTo(166.79099f, 103.04097f, 166.25597f, 106.804016f, 163.605f, 108.795f),
                    PathNode.CurveTo(160.95404f, 110.78598f, 157.19098f, 110.25097f, 155.2f, 107.6f),
                    PathNode.CurveTo(146.41922f, 95.892296f, 131.13188f, 91.11689f, 117.24825f, 95.74477f),
                    PathNode.CurveTo(103.364624f, 100.37264f, 94.0f, 113.36537f, 94.0f, 128.0f),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
