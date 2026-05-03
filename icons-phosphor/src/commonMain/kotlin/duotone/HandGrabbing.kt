package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorDuotoneIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 108.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 196.18279f, 172.18279f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(83.81722f, 232.0f, 48.0f, 196.18279f, 48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(48.0f, 128.9543f, 56.954304f, 120.0f, 68.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 92.0f),
                    PathNode.CurveTo(88.0f, 80.95431f, 96.95431f, 72.0f, 108.0f, 72.0f),
                    PathNode.CurveTo(119.04569f, 72.0f, 128.0f, 80.95431f, 128.0f, 92.0f),
                    PathNode.CurveTo(128.0f, 80.95431f, 136.9543f, 72.0f, 148.0f, 72.0f),
                    PathNode.CurveTo(159.0457f, 72.0f, 168.0f, 80.95431f, 168.0f, 92.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(168.0f, 96.95431f, 176.9543f, 88.0f, 188.0f, 88.0f),
                    PathNode.CurveTo(199.0457f, 88.0f, 208.0f, 96.95431f, 208.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.CurveTo(183.33179f, 79.993225f, 178.73708f, 81.16254f, 174.64f, 83.4f),
                    PathNode.CurveTo(171.62906f, 74.073135f, 163.9606f, 66.999466f, 154.4215f, 64.74967f),
                    PathNode.CurveTo(144.88239f, 62.49988f, 134.86127f, 65.40149f, 128.0f, 72.4f),
                    PathNode.CurveTo(120.03726f, 64.27306f, 107.9485f, 61.772587f, 97.41511f, 66.07372f),
                    PathNode.CurveTo(86.88171f, 70.37486f, 79.998344f, 80.62229f, 80.0f, 92.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(68.0f, 112.0f),
                    PathNode.CurveTo(52.53603f, 112.0f, 40.0f, 124.536026f, 40.0f, 140.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 200.60106f, 79.39894f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.60106f, 240.0f, 216.0f, 200.60106f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 108.0f),
                    PathNode.CurveTo(216.0f, 92.536026f, 203.46397f, 80.0f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 191.7645f, 167.7645f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(88.2355f, 224.0f, 56.0f, 191.7645f, 56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(56.0f, 133.37259f, 61.37258f, 128.0f, 68.0f, 128.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(80.0f, 156.41827f, 83.58172f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(92.41828f, 160.0f, 96.0f, 156.41827f, 96.0f, 152.0f),
                    PathNode.LineTo(96.0f, 92.0f),
                    PathNode.CurveTo(96.0f, 85.37258f, 101.37258f, 80.0f, 108.0f, 80.0f),
                    PathNode.CurveTo(114.62742f, 80.0f, 120.0f, 85.37258f, 120.0f, 92.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 124.41828f, 123.58172f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(132.41827f, 128.0f, 136.0f, 124.41828f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 85.37258f, 141.37259f, 80.0f, 148.0f, 80.0f),
                    PathNode.CurveTo(154.62741f, 80.0f, 160.0f, 85.37258f, 160.0f, 92.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 124.41828f, 163.58173f, 128.0f, 168.0f, 128.0f),
                    PathNode.CurveTo(172.41827f, 128.0f, 176.0f, 124.41828f, 176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 101.37258f, 181.37259f, 96.0f, 188.0f, 96.0f),
                    PathNode.CurveTo(194.62741f, 96.0f, 200.0f, 101.37258f, 200.0f, 108.0f),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
