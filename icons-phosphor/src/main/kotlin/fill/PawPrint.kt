package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorFillIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 108.0f),
                    PathNode.CurveTo(240.0f, 123.463974f, 227.46397f, 136.0f, 212.0f, 136.0f),
                    PathNode.CurveTo(196.53603f, 136.0f, 184.0f, 123.463974f, 184.0f, 108.0f),
                    PathNode.CurveTo(184.0f, 92.536026f, 196.53603f, 80.0f, 212.0f, 80.0f),
                    PathNode.CurveTo(227.46397f, 80.0f, 240.0f, 92.536026f, 240.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 108.0f),
                    PathNode.CurveTo(72.0f, 92.536026f, 59.46397f, 80.0f, 44.0f, 80.0f),
                    PathNode.CurveTo(28.536028f, 80.0f, 16.0f, 92.536026f, 16.0f, 108.0f),
                    PathNode.CurveTo(16.0f, 123.463974f, 28.536028f, 136.0f, 44.0f, 136.0f),
                    PathNode.CurveTo(59.46397f, 136.0f, 72.0f, 123.463974f, 72.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 88.0f),
                    PathNode.CurveTo(107.463974f, 88.0f, 120.0f, 75.463974f, 120.0f, 60.0f),
                    PathNode.CurveTo(120.0f, 44.53603f, 107.463974f, 32.0f, 92.0f, 32.0f),
                    PathNode.CurveTo(76.536026f, 32.0f, 64.0f, 44.53603f, 64.0f, 60.0f),
                    PathNode.CurveTo(64.0f, 75.463974f, 76.536026f, 88.0f, 92.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 88.0f),
                    PathNode.CurveTo(179.46397f, 88.0f, 192.0f, 75.463974f, 192.0f, 60.0f),
                    PathNode.CurveTo(192.0f, 44.53603f, 179.46397f, 32.0f, 164.0f, 32.0f),
                    PathNode.CurveTo(148.53603f, 32.0f, 136.0f, 44.53603f, 136.0f, 60.0f),
                    PathNode.CurveTo(136.0f, 75.463974f, 148.53603f, 88.0f, 164.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.12f, 148.86f),
                    PathNode.CurveTo(178.9131f, 144.33246f, 172.84377f, 136.7269f, 170.25f, 127.72f),
                    PathNode.CurveTo(164.78601f, 108.929504f, 147.5688f, 96.00566f, 128.0f, 96.00566f),
                    PathNode.CurveTo(108.4312f, 96.00566f, 91.214f, 108.929504f, 85.75f, 127.72f),
                    PathNode.CurveTo(83.18054f, 136.69363f, 77.15677f, 144.2818f, 69.0f, 148.82f),
                    PathNode.CurveTo(52.90243f, 157.5304f, 44.77056f, 176.05579f, 49.255234f, 193.80093f),
                    PathNode.CurveTo(53.73991f, 211.54608f, 69.69693f, 223.98357f, 88.0f, 224.0f),
                    PathNode.CurveTo(93.33161f, 224.01534f, 98.61108f, 222.95059f, 103.52f, 220.87f),
                    PathNode.CurveTo(119.17064f, 214.4155f, 136.73936f, 214.4155f, 152.39f, 220.87f),
                    PathNode.CurveTo(172.08913f, 229.43752f, 195.03806f, 220.91565f, 204.37091f, 201.56737f),
                    PathNode.CurveTo(213.70378f, 182.21909f, 206.0877f, 158.95386f, 187.12f, 148.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
