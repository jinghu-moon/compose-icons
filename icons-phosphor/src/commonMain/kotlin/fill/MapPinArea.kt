package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorFillIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 175.0f),
                    PathNode.CurveTo(126.459915f, 176.40608f, 129.48009f, 176.40608f, 131.94f, 175.0f),
                    PathNode.CurveTo(134.39f, 173.59f, 191.94f, 140.0f, 191.94f, 80.05f),
                    PathNode.CurveTo(190.89482f, 45.482407f, 162.57764f, 17.997723f, 127.99425f, 17.984207f),
                    PathNode.CurveTo(93.41086f, 17.970692f, 65.0722f, 45.43323f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 140.0f, 121.58f, 173.54f, 124.0f, 175.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(141.25484f, 56.0f, 152.0f, 66.74516f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 93.25484f, 141.25484f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(114.74516f, 104.0f, 104.0f, 93.25484f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 66.74516f, 114.74516f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 215.18f, 182.29f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(73.71f, 232.0f, 16.0f, 215.18f, 16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 169.41f, 29.22f, 156.49f, 53.23f, 147.63f),
                    PathNode.CurveTo(57.322647f, 146.27792f, 61.75074f, 148.41127f, 63.24405f, 152.45453f),
                    PathNode.CurveTo(64.73736f, 156.49779f, 62.758987f, 160.99725f, 58.77f, 162.63f),
                    PathNode.CurveTo(42.26f, 168.74f, 32.0f, 176.92f, 32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 197.36f, 68.52f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(187.48f, 216.0f, 224.0f, 197.36f, 224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 176.92f, 213.74f, 168.74f, 197.23f, 162.64f),
                    PathNode.CurveTo(193.24101f, 161.00726f, 191.26263f, 156.50778f, 192.75595f, 152.46452f),
                    PathNode.CurveTo(194.24925f, 148.42128f, 198.67735f, 146.28793f, 202.77f, 147.64f),
                    PathNode.CurveTo(226.78f, 156.49f, 240.0f, 169.41f, 240.0f, 184.0f),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
