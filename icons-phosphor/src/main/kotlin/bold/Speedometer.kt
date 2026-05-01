package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorBoldIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(119.51f, 143.51f),
                    PathNode.LineTo(207.51f, 55.51f),
                    PathNode.CurveTo(212.20442f, 50.81558f, 219.81558f, 50.81558f, 224.51f, 55.51f),
                    PathNode.CurveTo(229.20442f, 60.20442f, 229.20442f, 67.81558f, 224.51f, 72.51f),
                    PathNode.LineTo(136.51f, 160.51f),
                    PathNode.CurveTo(131.81558f, 165.20442f, 124.20442f, 165.20442f, 119.51f, 160.51f),
                    PathNode.CurveTo(114.81558f, 155.81558f, 114.81558f, 148.20442f, 119.51f, 143.51f),
                    PathNode.Close,
                    PathNode.MoveTo(133.74f, 100.31f),
                    PathNode.CurveTo(138.0556f, 100.8862f, 142.34474f, 99.07966f, 144.94762f, 95.589455f),
                    PathNode.CurveTo(147.55049f, 92.09925f, 148.0587f, 87.473015f, 146.27557f, 83.501f),
                    PathNode.CurveTo(144.49245f, 79.528984f, 140.69777f, 76.8344f, 136.36f, 76.46f),
                    PathNode.CurveTo(133.58405f, 76.15143f, 130.79305f, 75.997856f, 128.0f, 76.0f),
                    PathNode.CurveTo(86.04464f, 76.04409f, 52.044098f, 110.04464f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 158.62741f, 57.37258f, 164.0f, 64.0f, 164.0f),
                    PathNode.CurveTo(70.62742f, 164.0f, 76.0f, 158.62741f, 76.0f, 152.0f),
                    PathNode.CurveTo(76.033066f, 123.2949f, 99.2949f, 100.033066f, 128.0f, 100.0f),
                    PathNode.CurveTo(129.91743f, 100.00275f, 131.83342f, 100.106224f, 133.74f, 100.31f),
                    PathNode.Close,
                    PathNode.MoveTo(235.28f, 107.81f),
                    PathNode.CurveTo(232.74225f, 101.6824f, 225.7176f, 98.772255f, 219.59f, 101.31f),
                    PathNode.CurveTo(213.4624f, 103.84775f, 210.55225f, 110.8724f, 213.09f, 117.0f),
                    PathNode.CurveTo(221.30421f, 137.04922f, 222.21733f, 159.34627f, 215.67f, 180.0f),
                    PathNode.LineTo(40.34f, 180.0f),
                    PathNode.CurveTo(31.506598f, 152.02435f, 36.509388f, 121.51494f, 53.81461f, 97.825386f),
                    PathNode.CurveTo(71.11983f, 74.13583f, 98.66304f, 60.092194f, 128.0f, 60.0f),
                    PathNode.LineTo(128.84f, 60.0f),
                    PathNode.CurveTo(140.57788f, 60.086605f, 152.18927f, 62.432648f, 163.04f, 66.91f),
                    PathNode.CurveTo(169.14835f, 69.350845f, 176.08315f, 66.419174f, 178.5884f, 60.336967f),
                    PathNode.CurveTo(181.09363f, 54.25476f, 178.2354f, 47.289368f, 172.18f, 44.72f),
                    PathNode.CurveTo(129.877f, 27.339363f, 81.311104f, 36.42021f, 48.14624f, 67.91183f),
                    PathNode.CurveTo(14.981377f, 99.40344f, 3.400685f, 147.43465f, 18.57f, 190.58f),
                    PathNode.CurveTo(21.392685f, 198.59978f, 28.958017f, 203.97441f, 37.46f, 204.0f),
                    PathNode.LineTo(218.53f, 204.0f),
                    PathNode.CurveTo(227.0208f, 203.98514f, 234.58257f, 198.6262f, 237.41f, 190.62f),
                    PathNode.CurveTo(246.87938f, 163.6895f, 246.12132f, 134.21808f, 235.28f, 107.81f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
