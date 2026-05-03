package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorRegularIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 44.653774f, 92.65378f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(163.34622f, 16.0f, 192.0f, 44.653774f, 192.0f, 80.0f),
                    PathNode.CurveTo(192.0f, 139.95f, 134.42f, 173.54f, 132.0f, 174.95f),
                    PathNode.CurveTo(129.54008f, 176.35608f, 126.51991f, 176.35608f, 124.06f, 174.95f),
                    PathNode.CurveTo(121.58f, 173.54f, 64.0f, 140.0f, 64.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 122.2f, 115.84f, 150.21f, 128.0f, 158.5f),
                    PathNode.CurveTo(140.15f, 150.22f, 176.0f, 122.2f, 176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 53.490334f, 154.50967f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(101.49033f, 32.0f, 80.0f, 53.490334f, 80.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.77f, 147.63f),
                    PathNode.CurveTo(198.67735f, 146.27792f, 194.24925f, 148.41127f, 192.75595f, 152.45453f),
                    PathNode.CurveTo(191.26263f, 156.49779f, 193.24101f, 160.99725f, 197.23f, 162.63f),
                    PathNode.CurveTo(213.74f, 168.74f, 224.0f, 176.92f, 224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 197.36f, 187.48f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(68.52f, 216.0f, 32.0f, 197.36f, 32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 176.92f, 42.26f, 168.74f, 58.77f, 162.64f),
                    PathNode.CurveTo(62.758987f, 161.00726f, 64.73736f, 156.50778f, 63.24405f, 152.46452f),
                    PathNode.CurveTo(61.75074f, 148.42128f, 57.322647f, 146.28793f, 53.23f, 147.64f),
                    PathNode.CurveTo(29.22f, 156.49f, 16.0f, 169.41f, 16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 215.18f, 73.71f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(182.29f, 232.0f, 240.0f, 215.18f, 240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 169.41f, 226.78f, 156.49f, 202.77f, 147.63f),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
