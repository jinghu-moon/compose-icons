package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeCircle: ImageVector
    get() {
        if (_dotsThreeCircle != null) return _dotsThreeCircle!!
        _dotsThreeCircle = phosphorFillIcon(
            name = "DotsThreeCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.92838f, 70.59208f, 185.40791f, 24.071625f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 140.0f),
                    PathNode.CurveTo(77.37258f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 77.37258f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(90.62742f, 116.0f, 96.0f, 121.37258f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 134.62741f, 90.62742f, 140.0f, 84.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 140.0f),
                    PathNode.CurveTo(165.37259f, 140.0f, 160.0f, 134.62741f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 121.37258f, 165.37259f, 116.0f, 172.0f, 116.0f),
                    PathNode.CurveTo(178.62741f, 116.0f, 184.0f, 121.37258f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 134.62741f, 178.62741f, 140.0f, 172.0f, 140.0f),
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
        return _dotsThreeCircle!!
    }

private var _dotsThreeCircle: ImageVector? = null
