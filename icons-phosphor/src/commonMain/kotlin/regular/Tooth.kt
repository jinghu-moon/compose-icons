package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorRegularIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.0f, 71.42f),
                    PathNode.LineTo(149.54f, 80.0f),
                    PathNode.LineTo(171.0f, 88.57f),
                    PathNode.CurveTo(175.10071f, 90.22685f, 177.08186f, 94.89429f, 175.425f, 98.995f),
                    PathNode.CurveTo(173.76814f, 103.09571f, 169.10071f, 105.07685f, 165.0f, 103.42f),
                    PathNode.LineTo(128.0f, 88.61f),
                    PathNode.LineTo(91.0f, 103.42f),
                    PathNode.CurveTo(86.899284f, 105.07685f, 82.23186f, 103.09571f, 80.575f, 98.995f),
                    PathNode.CurveTo(78.918144f, 94.89429f, 80.899284f, 90.22685f, 85.0f, 88.57f),
                    PathNode.LineTo(106.46f, 80.0f),
                    PathNode.LineTo(85.0f, 71.42f),
                    PathNode.CurveTo(80.899284f, 69.763145f, 78.918144f, 65.09571f, 80.575f, 60.995f),
                    PathNode.CurveTo(82.23186f, 56.894287f, 86.899284f, 54.913147f, 91.0f, 56.57f),
                    PathNode.LineTo(128.0f, 71.38f),
                    PathNode.LineTo(165.0f, 56.57f),
                    PathNode.CurveTo(169.10071f, 54.913147f, 173.76814f, 56.894287f, 175.425f, 60.995f),
                    PathNode.CurveTo(177.08186f, 65.09571f, 175.10071f, 69.763145f, 171.0f, 71.42f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 79.75f),
                    PathNode.CurveTo(224.0f, 122.47f, 216.0f, 155.15f, 209.31f, 175.03f),
                    PathNode.CurveTo(200.58f, 200.83f, 188.68f, 220.52f, 176.66f, 229.03f),
                    PathNode.CurveTo(172.00134f, 232.38173f, 165.88441f, 232.92247f, 160.71f, 230.44f),
                    PathNode.CurveTo(155.46638f, 227.96593f, 151.95938f, 222.86205f, 151.53f, 217.08f),
                    PathNode.CurveTo(150.68f, 205.58f, 146.48f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(109.52f, 168.0f, 105.32f, 205.59f, 104.47f, 217.11f),
                    PathNode.CurveTo(103.84827f, 225.49393f, 96.87692f, 231.986f, 88.47f, 232.01f),
                    PathNode.CurveTo(85.19308f, 232.0055f, 82.000015f, 230.97379f, 79.34f, 229.06f),
                    PathNode.CurveTo(67.34f, 220.53f, 55.42f, 200.84f, 46.69f, 175.06f),
                    PathNode.CurveTo(40.0f, 155.15f, 32.0f, 122.47f, 32.0f, 79.75f),
                    PathNode.CurveTo(32.137638f, 48.91973f, 57.169422f, 23.999693f, 88.0f, 24.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(198.83058f, 23.999693f, 223.86237f, 48.91973f, 224.0f, 79.75f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 79.75f),
                    PathNode.CurveTo(207.86253f, 57.7563f, 189.99413f, 39.99957f, 168.0f, 40.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(66.002f, 39.999603f, 48.13199f, 57.76239f, 48.0f, 79.76f),
                    PathNode.CurveTo(48.0f, 120.31f, 55.51f, 151.16f, 61.85f, 169.9f),
                    PathNode.CurveTo(72.9f, 202.56f, 84.85f, 213.27f, 88.46f, 215.9f),
                    PathNode.CurveTo(91.57f, 174.67f, 105.59f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(150.41f, 152.0f, 164.45f, 174.71f, 167.49f, 215.94f),
                    PathNode.LineTo(167.49f, 215.94f),
                    PathNode.CurveTo(171.09f, 213.35f, 183.06f, 202.68f, 194.15f, 169.94f),
                    PathNode.CurveTo(200.49f, 151.16f, 208.0f, 120.31f, 208.0f, 79.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tooth!!
    }

private var _tooth: ImageVector? = null
