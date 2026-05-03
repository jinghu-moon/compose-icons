package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorRegularIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.15f, 212.42f),
                    PathNode.LineTo(191.15f, 100.42f),
                    PathNode.CurveTo(189.7947f, 97.71019f, 187.02484f, 95.99854f, 183.995f, 95.99854f),
                    PathNode.CurveTo(180.96516f, 95.99854f, 178.1953f, 97.71019f, 176.84f, 100.42f),
                    PathNode.LineTo(155.13f, 143.85f),
                    PathNode.CurveTo(138.11295f, 142.8931f, 121.73997f, 137.01509f, 108.0f, 126.93f),
                    PathNode.CurveTo(124.12087f, 109.714615f, 133.8885f, 87.51609f, 135.69f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(164.41827f, 64.0f, 168.0f, 60.418278f, 168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 51.581722f, 164.41827f, 48.0f, 160.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(104.0f, 27.581722f, 100.41828f, 24.0f, 96.0f, 24.0f),
                    PathNode.CurveTo(91.58172f, 24.0f, 88.0f, 27.581722f, 88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 60.418278f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(119.63f, 64.0f),
                    PathNode.CurveTo(117.848175f, 83.60651f, 109.525566f, 102.04444f, 96.0f, 116.35f),
                    PathNode.CurveTo(87.571594f, 107.45667f, 81.09931f, 96.89664f, 77.0f, 85.35f),
                    PathNode.CurveTo(76.082565f, 82.607994f, 73.75694f, 80.574425f, 70.91707f, 80.03095f),
                    PathNode.CurveTo(68.07719f, 79.48748f, 65.165054f, 80.51871f, 63.300045f, 82.728226f),
                    PathNode.CurveTo(61.43503f, 84.93775f, 60.907417f, 87.98169f, 61.92f, 90.69f),
                    PathNode.CurveTo(66.69267f, 104.18867f, 74.21072f, 116.55191f, 84.0f, 127.0f),
                    PathNode.CurveTo(68.927635f, 138.07585f, 50.70427f, 144.0335f, 32.0f, 144.0f),
                    PathNode.CurveTo(27.581722f, 144.0f, 24.0f, 147.58173f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 156.41827f, 27.581722f, 160.0f, 32.0f, 160.0f),
                    PathNode.CurveTo(55.205868f, 160.02582f, 77.746635f, 152.24925f, 96.0f, 137.92f),
                    PathNode.CurveTo(110.89576f, 149.55869f, 128.67754f, 156.92513f, 147.44f, 159.23f),
                    PathNode.LineTo(120.84f, 212.42f),
                    PathNode.CurveTo(118.86282f, 216.3716f, 120.4634f, 221.17783f, 124.415f, 223.155f),
                    PathNode.CurveTo(128.3666f, 225.13219f, 133.17282f, 223.5316f, 135.15f, 219.58f),
                    PathNode.LineTo(148.94f, 192.0f),
                    PathNode.LineTo(219.05f, 192.0f),
                    PathNode.LineTo(232.84f, 219.58f),
                    PathNode.CurveTo(234.19652f, 222.29086f, 236.96869f, 224.00217f, 240.0f, 224.0f),
                    PathNode.CurveTo(242.77232f, 223.9985f, 245.34625f, 222.56184f, 246.80273f, 220.20294f),
                    PathNode.CurveTo(248.25922f, 217.84402f, 248.39061f, 214.89923f, 247.15f, 212.42f),
                    PathNode.Close,
                    PathNode.MoveTo(156.94f, 176.0f),
                    PathNode.LineTo(184.0f, 121.89f),
                    PathNode.LineTo(211.05f, 176.0f),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
