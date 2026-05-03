package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorRegularIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.44f, 121.34f),
                    PathNode.LineTo(204.44f, 89.34f),
                    PathNode.CurveTo(201.98453f, 87.701744f, 198.82645f, 87.54874f, 196.22412f, 88.94194f),
                    PathNode.CurveTo(193.62178f, 90.33517f, 191.99808f, 93.04819f, 192.0f, 96.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(105.0f, 72.0f),
                    PathNode.CurveTo(109.028534f, 87.602455f, 124.0303f, 97.7754f, 140.016f, 95.74495f),
                    PathNode.CurveTo(156.00171f, 93.7145f, 167.98387f, 80.11414f, 167.98387f, 64.0f),
                    PathNode.CurveTo(167.98387f, 47.885857f, 156.00171f, 34.2855f, 140.016f, 32.25505f),
                    PathNode.CurveTo(124.0303f, 30.224598f, 109.028534f, 40.397545f, 105.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(63.163445f, 56.0f, 56.0f, 63.163445f, 56.0f, 72.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(3.581722f, 120.0f, 0f, 123.58172f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 132.41827f, 3.581722f, 136.0f, 8.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.CurveTo(56.0f, 192.83656f, 63.163445f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 216.83656f, 111.163445f, 224.0f, 120.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.CurveTo(160.83656f, 224.0f, 168.0f, 216.83656f, 168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 167.16344f, 160.83656f, 160.0f, 152.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(111.163445f, 160.0f, 104.0f, 167.16344f, 104.0f, 176.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(191.99808f, 162.95181f, 193.62178f, 165.66484f, 196.22412f, 167.05804f),
                    PathNode.CurveTo(198.82645f, 168.45126f, 201.98453f, 168.29826f, 204.44f, 166.66f),
                    PathNode.LineTo(252.44f, 134.66f),
                    PathNode.CurveTo(254.6687f, 133.1768f, 256.0078f, 130.67712f, 256.0078f, 128.0f),
                    PathNode.CurveTo(256.0078f, 125.32287f, 254.6687f, 122.8232f, 252.44f, 121.34f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 48.0f),
                    PathNode.CurveTo(144.83656f, 48.0f, 152.0f, 55.163445f, 152.0f, 64.0f),
                    PathNode.CurveTo(152.0f, 72.836555f, 144.83656f, 80.0f, 136.0f, 80.0f),
                    PathNode.CurveTo(127.163445f, 80.0f, 120.0f, 72.836555f, 120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 55.163445f, 127.163445f, 48.0f, 136.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 145.05f),
                    PathNode.LineTo(208.0f, 111.0f),
                    PathNode.LineTo(233.58f, 128.0f),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
