package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorBoldIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(87.5f, 151.52f),
                    PathNode.LineTo(151.5f, 87.52f),
                    PathNode.CurveTo(156.19443f, 82.82558f, 163.80557f, 82.82558f, 168.5f, 87.52f),
                    PathNode.CurveTo(173.19443f, 92.214424f, 173.19443f, 99.82558f, 168.5f, 104.52f),
                    PathNode.LineTo(104.5f, 168.52f),
                    PathNode.CurveTo(99.80559f, 173.21442f, 92.19441f, 173.21442f, 87.5f, 168.52f),
                    PathNode.CurveTo(82.80559f, 163.82558f, 82.80559f, 156.21442f, 87.5f, 151.52f),
                    PathNode.Close,
                    PathNode.MoveTo(218.5f, 37.52f),
                    PathNode.CurveTo(195.04832f, 14.121196f, 157.08168f, 14.121196f, 133.63f, 37.52f),
                    PathNode.LineTo(103.51f, 67.61f),
                    PathNode.CurveTo(98.81558f, 72.30442f, 98.81558f, 79.91558f, 103.51f, 84.61f),
                    PathNode.CurveTo(108.20442f, 89.30442f, 115.81558f, 89.30442f, 120.51f, 84.61f),
                    PathNode.LineTo(150.58f, 54.55f),
                    PathNode.CurveTo(164.64117f, 40.48607f, 187.44107f, 40.48383f, 201.505f, 54.545f),
                    PathNode.CurveTo(215.56892f, 68.60617f, 215.57117f, 91.40607f, 201.51f, 105.47f),
                    PathNode.LineTo(171.4f, 135.52f),
                    PathNode.CurveTo(166.70558f, 140.21442f, 166.70558f, 147.82558f, 171.4f, 152.52f),
                    PathNode.CurveTo(176.09442f, 157.21442f, 183.70558f, 157.21442f, 188.4f, 152.52f),
                    PathNode.LineTo(218.48f, 122.46f),
                    PathNode.CurveTo(241.89163f, 98.99317f, 241.8782f, 61.000286f, 218.45f, 37.55f),
                    PathNode.Close,
                    PathNode.MoveTo(135.52f, 171.4f),
                    PathNode.LineTo(105.45f, 201.48f),
                    PathNode.CurveTo(91.38607f, 215.54117f, 68.58617f, 215.53893f, 54.525f, 201.475f),
                    PathNode.CurveTo(40.463833f, 187.41107f, 40.46607f, 164.61118f, 54.53f, 150.55f),
                    PathNode.LineTo(84.59f, 120.48f),
                    PathNode.CurveTo(89.284424f, 115.785576f, 89.284424f, 108.17442f, 84.59f, 103.48f),
                    PathNode.CurveTo(79.89558f, 98.78558f, 72.284424f, 98.78558f, 67.59f, 103.48f),
                    PathNode.LineTo(37.55f, 133.58f),
                    PathNode.CurveTo(14.113797f, 157.01897f, 14.116035f, 195.0188f, 37.555f, 218.455f),
                    PathNode.CurveTo(60.993965f, 241.8912f, 98.9938f, 241.88896f, 122.43f, 218.45f),
                    PathNode.LineTo(152.49f, 188.38f),
                    PathNode.CurveTo(157.18442f, 183.68558f, 157.18442f, 176.07442f, 152.49f, 171.38f),
                    PathNode.CurveTo(147.79558f, 166.68558f, 140.18442f, 166.68558f, 135.49f, 171.38f),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
