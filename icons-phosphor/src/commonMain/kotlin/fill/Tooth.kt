package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorFillIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 24.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(57.169422f, 23.999693f, 32.137638f, 48.91973f, 32.0f, 79.75f),
                    PathNode.CurveTo(32.0f, 122.47f, 40.0f, 155.15f, 46.7f, 175.03f),
                    PathNode.CurveTo(55.42f, 200.83f, 67.32f, 220.52f, 79.34f, 229.03f),
                    PathNode.CurveTo(81.997604f, 230.9509f, 85.19088f, 231.98967f, 88.47f, 232.0f),
                    PathNode.CurveTo(96.87692f, 231.976f, 103.84827f, 225.48393f, 104.47f, 217.1f),
                    PathNode.CurveTo(105.32f, 205.58f, 109.47f, 167.99f, 128.0f, 167.99f),
                    PathNode.CurveTo(146.53f, 167.99f, 150.68f, 205.58f, 151.53f, 217.1f),
                    PathNode.CurveTo(151.95938f, 222.88205f, 155.46638f, 227.98593f, 160.71f, 230.46f),
                    PathNode.CurveTo(165.88441f, 232.94247f, 172.00134f, 232.40172f, 176.66f, 229.05f),
                    PathNode.CurveTo(188.66f, 220.52f, 200.58f, 200.83f, 209.3f, 175.05f),
                    PathNode.CurveTo(216.0f, 155.15f, 224.0f, 122.47f, 224.0f, 79.75f),
                    PathNode.CurveTo(223.86237f, 48.91973f, 198.83058f, 23.999693f, 168.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.0f, 80.57f),
                    PathNode.CurveTo(175.10071f, 82.22685f, 177.08186f, 86.89429f, 175.425f, 90.995f),
                    PathNode.CurveTo(173.76814f, 95.09571f, 169.10071f, 97.07685f, 165.0f, 95.42f),
                    PathNode.LineTo(128.0f, 80.61f),
                    PathNode.LineTo(91.0f, 95.42f),
                    PathNode.CurveTo(86.899284f, 97.07685f, 82.23186f, 95.09571f, 80.575f, 90.995f),
                    PathNode.CurveTo(78.918144f, 86.89429f, 80.899284f, 82.22685f, 85.0f, 80.57f),
                    PathNode.LineTo(106.46f, 72.0f),
                    PathNode.LineTo(85.0f, 63.42f),
                    PathNode.CurveTo(80.899284f, 61.763145f, 78.918144f, 57.095715f, 80.575f, 52.995f),
                    PathNode.CurveTo(82.23186f, 48.894287f, 86.899284f, 46.913147f, 91.0f, 48.57f),
                    PathNode.LineTo(128.0f, 63.38f),
                    PathNode.LineTo(165.0f, 48.57f),
                    PathNode.CurveTo(169.10071f, 46.913147f, 173.76814f, 48.894287f, 175.425f, 52.995f),
                    PathNode.CurveTo(177.08186f, 57.095715f, 175.10071f, 61.763145f, 171.0f, 63.42f),
                    PathNode.LineTo(149.54f, 72.0f),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
