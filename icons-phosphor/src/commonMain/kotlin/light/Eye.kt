package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorLightIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.48f, 125.57f),
                    PathNode.CurveTo(245.14f, 124.79f, 236.82f, 106.34f, 218.24f, 87.76f),
                    PathNode.CurveTo(201.0f, 70.54f, 171.38f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(84.62f, 50.0f, 55.0f, 70.54f, 37.76f, 87.76f),
                    PathNode.CurveTo(19.18f, 106.34f, 10.86f, 124.76f, 10.52f, 125.57f),
                    PathNode.CurveTo(9.828613f, 127.1232f, 9.828613f, 128.8968f, 10.52f, 130.45f),
                    PathNode.CurveTo(10.86f, 131.22f, 19.18f, 149.67f, 37.76f, 168.25f),
                    PathNode.CurveTo(55.0f, 185.47f, 84.62f, 206.0f, 128.0f, 206.0f),
                    PathNode.CurveTo(171.38f, 206.0f, 201.0f, 185.47f, 218.24f, 168.25f),
                    PathNode.CurveTo(236.82f, 149.67f, 245.14f, 131.25f, 245.48f, 130.45f),
                    PathNode.CurveTo(246.17139f, 128.8968f, 246.17139f, 127.1232f, 245.48f, 125.57f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 194.0f),
                    PathNode.CurveTo(96.62f, 194.0f, 69.22f, 182.58f, 46.55f, 160.07f),
                    PathNode.CurveTo(37.04676f, 150.62546f, 29.004997f, 139.81659f, 22.69f, 128.0f),
                    PathNode.CurveTo(29.003181f, 116.18526f, 37.04519f, 105.37944f, 46.55f, 95.94f),
                    PathNode.CurveTo(69.22f, 73.42f, 96.62f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(159.38f, 62.0f, 186.78f, 73.42f, 209.45f, 95.94f),
                    PathNode.CurveTo(218.9548f, 105.37944f, 226.99683f, 116.18526f, 233.31f, 128.0f),
                    PathNode.CurveTo(226.94f, 140.21f, 195.0f, 194.0f, 128.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 82.0f),
                    PathNode.CurveTo(102.5949f, 82.0f, 82.0f, 102.5949f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 153.4051f, 102.5949f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(153.4051f, 174.0f, 174.0f, 153.4051f, 174.0f, 128.0f),
                    PathNode.CurveTo(173.96695f, 102.608604f, 153.39139f, 82.03306f, 128.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
