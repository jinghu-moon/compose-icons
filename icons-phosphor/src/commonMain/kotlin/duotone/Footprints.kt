package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorDuotoneIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(208.0f, 219.46397f, 195.46397f, 232.0f, 180.0f, 232.0f),
                    PathNode.CurveTo(164.53603f, 232.0f, 152.0f, 219.46397f, 152.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 195.46397f, 60.53603f, 208.0f, 76.0f, 208.0f),
                    PathNode.CurveTo(91.463974f, 208.0f, 104.0f, 195.46397f, 104.0f, 180.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 24.0f),
                    PathNode.CurveTo(51.48f, 24.0f, 24.54f, 104.0f, 50.74f, 136.0f),
                    PathNode.LineTo(101.26f, 136.0f),
                    PathNode.CurveTo(127.46f, 104.0f, 100.52f, 24.0f, 76.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.26f, 160.0f),
                    PathNode.CurveTo(231.46f, 128.0f, 204.52f, 48.0f, 180.0f, 48.0f),
                    PathNode.CurveTo(155.48f, 48.0f, 128.54f, 128.0f, 154.74f, 160.0f),
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
                    PathNode.MoveTo(208.06f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.CurveTo(147.58173f, 184.0f, 144.0f, 187.58173f, 144.0f, 192.0f),
                    PathNode.LineTo(144.0f, 204.0f),
                    PathNode.CurveTo(144.0f, 223.89606f, 160.12894f, 240.025f, 180.025f, 240.025f),
                    PathNode.CurveTo(199.92105f, 240.025f, 216.05f, 223.89606f, 216.05f, 204.0f),
                    PathNode.LineTo(216.05f, 192.0f),
                    PathNode.CurveTo(216.05f, 187.58562f, 212.47437f, 184.00552f, 208.06f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.06f, 204.0f),
                    PathNode.CurveTo(200.06f, 215.0457f, 191.1057f, 224.0f, 180.06f, 224.0f),
                    PathNode.CurveTo(169.0143f, 224.0f, 160.06f, 215.0457f, 160.06f, 204.0f),
                    PathNode.LineTo(160.06f, 200.0f),
                    PathNode.LineTo(200.06f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(43.581722f, 160.0f, 40.0f, 163.58173f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(40.0f, 199.88223f, 56.11775f, 216.0f, 76.0f, 216.0f),
                    PathNode.CurveTo(95.88225f, 216.0f, 112.0f, 199.88223f, 112.0f, 180.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 163.58173f, 108.41828f, 160.0f, 104.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 180.0f),
                    PathNode.CurveTo(96.0f, 191.0457f, 87.04569f, 200.0f, 76.0f, 200.0f),
                    PathNode.CurveTo(64.95431f, 200.0f, 56.0f, 191.0457f, 56.0f, 180.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 16.0f),
                    PathNode.CurveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f),
                    PathNode.CurveTo(30.27f, 74.38f, 25.64f, 118.0f, 44.49f, 141.0f),
                    PathNode.CurveTo(46.01208f, 142.85782f, 48.288296f, 143.9335f, 50.69f, 143.93f),
                    PathNode.LineTo(101.24f, 143.93f),
                    PathNode.CurveTo(103.64171f, 143.9335f, 105.91792f, 142.85782f, 107.44f, 141.0f),
                    PathNode.CurveTo(126.29f, 118.0f, 121.66f, 74.35f, 107.73f, 45.0f),
                    PathNode.CurveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.15f, 128.0f),
                    PathNode.LineTo(54.78f, 128.0f),
                    PathNode.CurveTo(43.38f, 109.9f, 47.57f, 75.3f, 58.67f, 51.89f),
                    PathNode.CurveTo(65.14f, 38.22f, 72.17f, 32.0f, 76.0f, 32.0f),
                    PathNode.CurveTo(79.83f, 32.0f, 86.82f, 38.22f, 93.3f, 51.89f),
                    PathNode.CurveTo(104.36f, 75.3f, 108.55f, 109.9f, 97.15f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.76f, 168.0f),
                    PathNode.LineTo(205.31f, 168.0f),
                    PathNode.CurveTo(207.7117f, 168.00351f, 209.98792f, 166.92781f, 211.51f, 165.07f),
                    PathNode.CurveTo(230.36f, 142.07f, 225.73f, 98.42f, 211.8f, 69.07f),
                    PathNode.CurveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f),
                    PathNode.CurveTo(168.36f, 40.0f, 157.11f, 50.31f, 148.23f, 69.0f),
                    PathNode.CurveTo(134.3f, 98.38f, 129.67f, 142.0f, 148.52f, 165.0f),
                    PathNode.CurveTo(150.03714f, 166.89491f, 152.33258f, 167.99849f, 154.76f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.76f, 75.89f),
                    PathNode.CurveTo(169.22f, 62.22f, 176.25f, 56.0f, 180.0f, 56.0f),
                    PathNode.CurveTo(183.75f, 56.0f, 190.81f, 62.22f, 197.29f, 75.89f),
                    PathNode.CurveTo(208.39f, 99.3f, 212.58f, 133.89f, 201.18f, 152.0f),
                    PathNode.LineTo(158.85f, 152.0f),
                    PathNode.CurveTo(147.45f, 133.9f, 151.64f, 99.3f, 162.74f, 75.89f),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
