package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorLightIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(151.62f, 119.45f),
                    PathNode.CurveTo(169.37094f, 108.82805f, 177.84819f, 87.663574f, 172.33817f, 67.72463f),
                    PathNode.CurveTo(166.82812f, 47.785686f, 148.68628f, 33.97728f, 128.0f, 33.97728f),
                    PathNode.CurveTo(107.31373f, 33.97728f, 89.171875f, 47.785686f, 83.66184f, 67.72463f),
                    PathNode.CurveTo(78.1518f, 87.663574f, 86.62906f, 108.82805f, 104.38f, 119.45f),
                    PathNode.CurveTo(81.75961f, 130.4527f, 69.732155f, 155.6167f, 75.37751f, 180.12938f),
                    PathNode.CurveTo(81.02287f, 204.64206f, 102.84565f, 222.01022f, 128.0f, 222.01022f),
                    PathNode.CurveTo(153.15436f, 222.01022f, 174.97713f, 204.64206f, 180.62248f, 180.12938f),
                    PathNode.CurveTo(186.26785f, 155.6167f, 174.24039f, 130.4527f, 151.62f, 119.45f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 80.0f),
                    PathNode.CurveTo(94.0f, 61.222317f, 109.22232f, 46.0f, 128.0f, 46.0f),
                    PathNode.CurveTo(146.77768f, 46.0f, 162.0f, 61.222317f, 162.0f, 80.0f),
                    PathNode.CurveTo(162.0f, 98.77768f, 146.77768f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(109.22232f, 114.0f, 94.0f, 98.77768f, 94.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.0f),
                    PathNode.CurveTo(104.80404f, 210.0f, 86.0f, 191.19595f, 86.0f, 168.0f),
                    PathNode.CurveTo(86.0f, 144.80405f, 104.80404f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(151.19595f, 126.0f, 170.0f, 144.80405f, 170.0f, 168.0f),
                    PathNode.CurveTo(170.0f, 191.19595f, 151.19595f, 210.0f, 128.0f, 210.0f),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
