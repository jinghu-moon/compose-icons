package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorLightIcon(
            name = "NumberCircleFive",
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
                    PathNode.MoveTo(117.08f, 86.0f),
                    PathNode.LineTo(112.08f, 116.0f),
                    PathNode.CurveTo(115.912224f, 114.66633f, 119.942345f, 113.990135f, 124.0f, 114.0f),
                    PathNode.CurveTo(142.77768f, 114.0f, 158.0f, 129.22232f, 158.0f, 148.0f),
                    PathNode.CurveTo(158.0f, 166.77768f, 142.77768f, 182.0f, 124.0f, 182.0f),
                    PathNode.CurveTo(114.91102f, 182.15358f, 106.14765f, 178.61794f, 99.71f, 172.2f),
                    PathNode.CurveTo(97.3904f, 169.8307f, 97.430695f, 166.0296f, 99.8f, 163.71f),
                    PathNode.CurveTo(102.169304f, 161.39041f, 105.970406f, 161.4307f, 108.29f, 163.8f),
                    PathNode.CurveTo(112.47138f, 167.90823f, 118.13993f, 170.14534f, 124.0f, 170.0f),
                    PathNode.CurveTo(136.15027f, 170.0f, 146.0f, 160.15027f, 146.0f, 148.0f),
                    PathNode.CurveTo(146.0f, 135.84973f, 136.15027f, 126.0f, 124.0f, 126.0f),
                    PathNode.CurveTo(118.13993f, 125.85465f, 112.47138f, 128.09177f, 108.29f, 132.2f),
                    PathNode.CurveTo(106.456085f, 134.08078f, 103.61195f, 134.54991f, 101.27116f, 133.35774f),
                    PathNode.CurveTo(98.930374f, 132.16556f, 97.637276f, 129.58932f, 98.08f, 127.0f),
                    PathNode.LineTo(106.08f, 79.0f),
                    PathNode.CurveTo(106.568214f, 76.11167f, 109.0707f, 73.998085f, 112.0f, 74.0f),
                    PathNode.LineTo(152.0f, 74.0f),
                    PathNode.CurveTo(155.3137f, 74.0f, 158.0f, 76.686295f, 158.0f, 80.0f),
                    PathNode.CurveTo(158.0f, 83.313705f, 155.3137f, 86.0f, 152.0f, 86.0f),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
