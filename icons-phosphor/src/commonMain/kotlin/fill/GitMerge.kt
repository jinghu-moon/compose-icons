package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorFillIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.CurveTo(193.80551f, 112.02469f, 181.3181f, 121.38313f, 177.31f, 135.0f),
                    PathNode.LineTo(135.1f, 129.0f),
                    PathNode.CurveTo(133.1756f, 128.72794f, 131.41603f, 127.764626f, 130.15f, 126.29f),
                    PathNode.LineTo(94.43f, 84.55f),
                    PathNode.CurveTo(108.22139f, 77.56013f, 115.04254f, 61.709183f, 110.63688f, 46.888557f),
                    PathNode.CurveTo(106.23121f, 32.067936f, 91.85897f, 22.517057f, 76.4888f, 24.195923f),
                    PathNode.CurveTo(61.118626f, 25.874786f, 49.147144f, 38.30315f, 48.044872f, 53.725403f),
                    PathNode.CurveTo(46.942596f, 69.14765f, 57.02483f, 83.15225f, 72.0f, 87.0f),
                    PathNode.LineTo(72.0f, 169.0f),
                    PathNode.CurveTo(56.397545f, 173.02853f, 46.224594f, 188.03029f, 48.25505f, 204.016f),
                    PathNode.CurveTo(50.2855f, 220.00171f, 63.885857f, 231.98387f, 80.0f, 231.98387f),
                    PathNode.CurveTo(96.11414f, 231.98387f, 109.7145f, 220.00171f, 111.74495f, 204.016f),
                    PathNode.CurveTo(113.7754f, 188.03029f, 103.602455f, 173.02853f, 88.0f, 169.0f),
                    PathNode.LineTo(88.0f, 101.63f),
                    PathNode.LineTo(118.0f, 136.63f),
                    PathNode.CurveTo(121.7915f, 141.05338f, 127.06254f, 143.94658f, 132.83f, 144.77f),
                    PathNode.LineTo(176.83f, 151.05f),
                    PathNode.CurveTo(180.52252f, 167.39851f, 196.204f, 178.1281f, 212.77974f, 175.64757f),
                    PathNode.CurveTo(229.3555f, 173.16702f, 241.20898f, 158.31688f, 239.95387f, 141.6036f),
                    PathNode.CurveTo(238.69876f, 124.89034f, 224.76031f, 111.9771f, 208.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 200.0f),
                    PathNode.CurveTo(96.0f, 208.83656f, 88.836555f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(71.163445f, 216.0f, 64.0f, 208.83656f, 64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 191.16344f, 71.163445f, 184.0f, 80.0f, 184.0f),
                    PathNode.CurveTo(88.836555f, 184.0f, 96.0f, 191.16344f, 96.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.CurveTo(199.16344f, 160.0f, 192.0f, 152.83656f, 192.0f, 144.0f),
                    PathNode.CurveTo(192.0f, 135.16344f, 199.16344f, 128.0f, 208.0f, 128.0f),
                    PathNode.CurveTo(216.83656f, 128.0f, 224.0f, 135.16344f, 224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 152.83656f, 216.83656f, 160.0f, 208.0f, 160.0f),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
