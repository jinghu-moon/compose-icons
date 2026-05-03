package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorLightIcon(
            name = "Copyleft",
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
                    PathNode.MoveTo(174.0f, 128.0f),
                    PathNode.CurveTo(174.0043f, 147.80164f, 161.33603f, 165.38399f, 142.55121f, 171.64786f),
                    PathNode.CurveTo(123.76642f, 177.91173f, 103.080986f, 171.45131f, 91.2f, 155.61f),
                    PathNode.CurveTo(89.209015f, 152.95903f, 89.74403f, 149.19598f, 92.395f, 147.205f),
                    PathNode.CurveTo(95.04597f, 145.21402f, 98.80901f, 145.74904f, 100.8f, 148.4f),
                    PathNode.CurveTo(109.58079f, 160.10771f, 124.86811f, 164.8831f, 138.75174f, 160.25523f),
                    PathNode.CurveTo(152.63538f, 155.62735f, 162.0f, 142.63463f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 113.36537f, 152.63538f, 100.37264f, 138.75174f, 95.74477f),
                    PathNode.CurveTo(124.86811f, 91.11689f, 109.58079f, 95.892296f, 100.8f, 107.6f),
                    PathNode.CurveTo(98.80901f, 110.25097f, 95.04597f, 110.78598f, 92.395f, 108.795f),
                    PathNode.CurveTo(89.74403f, 106.804016f, 89.209015f, 103.04097f, 91.2f, 100.39f),
                    PathNode.CurveTo(103.080986f, 84.54869f, 123.76642f, 78.08828f, 142.55121f, 84.35215f),
                    PathNode.CurveTo(161.33603f, 90.61602f, 174.0043f, 108.198364f, 174.0f, 128.0f),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
