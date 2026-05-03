package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorDuotoneIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
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
                    PathNode.MoveTo(94.0f, 24.0f),
                    PathNode.CurveTo(71.63f, 24.0f, 56.0f, 43.74f, 56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 100.26f, 71.63f, 120.0f, 94.0f, 120.0f),
                    PathNode.CurveTo(116.37f, 120.0f, 132.0f, 100.26f, 132.0f, 72.0f),
                    PathNode.CurveTo(132.0f, 43.74f, 116.37f, 24.0f, 94.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 104.0f),
                    PathNode.CurveTo(76.63f, 104.0f, 72.0f, 83.89f, 72.0f, 72.0f),
                    PathNode.CurveTo(72.0f, 60.11f, 76.63f, 40.0f, 94.0f, 40.0f),
                    PathNode.CurveTo(111.37f, 40.0f, 116.0f, 60.11f, 116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 83.89f, 111.37f, 104.0f, 94.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 136.0f),
                    PathNode.CurveTo(143.63f, 136.0f, 128.0f, 155.74f, 128.0f, 184.0f),
                    PathNode.CurveTo(128.0f, 212.26f, 143.63f, 232.0f, 166.0f, 232.0f),
                    PathNode.CurveTo(188.37f, 232.0f, 204.0f, 212.26f, 204.0f, 184.0f),
                    PathNode.CurveTo(204.0f, 155.74f, 188.37f, 136.0f, 166.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 216.0f),
                    PathNode.CurveTo(148.63f, 216.0f, 144.0f, 195.89f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 172.11f, 148.63f, 152.0f, 166.0f, 152.0f),
                    PathNode.CurveTo(183.37f, 152.0f, 188.0f, 172.11f, 188.0f, 184.0f),
                    PathNode.CurveTo(188.0f, 195.89f, 183.37f, 216.0f, 166.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.0f, 49.22f),
                    PathNode.CurveTo(143.96924f, 47.364895f, 143.71783f, 45.176243f, 144.3011f, 43.13573f),
                    PathNode.CurveTo(144.88437f, 41.095222f, 146.25452f, 39.370087f, 148.11f, 38.34f),
                    PathNode.LineTo(172.11f, 25.01f),
                    PathNode.CurveTo(174.58768f, 23.631262f, 177.61005f, 23.66704f, 180.05438f, 25.10404f),
                    PathNode.CurveTo(182.49873f, 26.541042f, 183.9998f, 29.16455f, 184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.CurveTo(171.58173f, 120.0f, 168.0f, 116.41828f, 168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 45.6f),
                    PathNode.LineTo(155.88f, 52.33f),
                    PathNode.CurveTo(154.02489f, 53.36076f, 151.83624f, 53.61217f, 149.79573f, 53.0289f),
                    PathNode.CurveTo(147.75522f, 52.44563f, 146.03009f, 51.07548f, 145.0f, 49.22f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 228.41827f, 100.41828f, 232.0f, 96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.LineTo(88.0f, 157.6f),
                    PathNode.LineTo(75.88f, 164.33f),
                    PathNode.CurveTo(72.01401f, 166.47287f, 67.142876f, 165.07599f, 65.0f, 161.21f),
                    PathNode.CurveTo(62.857136f, 157.34401f, 64.254005f, 152.47287f, 68.12f, 150.33f),
                    PathNode.LineTo(92.12f, 137.0f),
                    PathNode.CurveTo(94.59855f, 135.62541f, 97.61939f, 135.66483f, 100.06123f, 137.10362f),
                    PathNode.CurveTo(102.50307f, 138.54242f, 104.00138f, 141.1658f, 104.0f, 144.0f),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
