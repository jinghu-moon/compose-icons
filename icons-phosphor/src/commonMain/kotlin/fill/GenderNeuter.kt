package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorFillIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.84f, 108.35f),
                    PathNode.CurveTo(169.37445f, 125.12488f, 160.23521f, 141.06342f, 144.98264f, 148.21252f),
                    PathNode.CurveTo(129.73007f, 155.36165f, 111.63318f, 152.18912f, 99.72203f, 140.27797f),
                    PathNode.CurveTo(87.81088f, 128.36682f, 84.63834f, 110.26993f, 91.78746f, 95.01736f),
                    PathNode.CurveTo(98.93659f, 79.764786f, 114.87512f, 70.62556f, 131.65f, 72.16f),
                    PathNode.CurveTo(150.86226f, 73.9174f, 166.0826f, 89.13774f, 167.84f, 108.35f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 112.0f),
                    PathNode.CurveTo(184.003f, 82.111206f, 160.53313f, 57.488087f, 130.67854f, 56.05847f),
                    PathNode.CurveTo(100.82397f, 54.628853f, 75.10867f, 76.89669f, 72.2557f, 106.64901f),
                    PathNode.CurveTo(69.402725f, 136.40132f, 90.41776f, 163.15018f, 120.0f, 167.42f),
                    PathNode.LineTo(120.0f, 199.73f),
                    PathNode.CurveTo(119.947235f, 204.01115f, 123.20465f, 207.6087f, 127.47f, 207.98f),
                    PathNode.CurveTo(129.68198f, 208.12688f, 131.85571f, 207.34932f, 133.47269f, 205.83281f),
                    PathNode.CurveTo(135.08966f, 204.3163f, 136.00487f, 202.19684f, 136.0f, 199.98f),
                    PathNode.LineTo(136.0f, 167.42f),
                    PathNode.CurveTo(163.53015f, 163.40733f, 183.95857f, 139.82101f, 184.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
