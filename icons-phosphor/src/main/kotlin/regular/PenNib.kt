package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorRegularIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 92.68f),
                    PathNode.CurveTo(248.01357f, 88.43421f, 246.32419f, 84.36025f, 243.31f, 81.37f),
                    PathNode.LineTo(174.63f, 12.68f),
                    PathNode.CurveTo(171.62932f, 9.678628f, 167.5591f, 7.992417f, 163.315f, 7.992417f),
                    PathNode.CurveTo(159.0709f, 7.992417f, 155.00069f, 9.678628f, 152.0f, 12.68f),
                    PathNode.LineTo(123.57f, 41.11f),
                    PathNode.LineTo(65.57f, 62.88f),
                    PathNode.CurveTo(60.20547f, 64.88063f, 56.311714f, 69.58591f, 55.35f, 75.23f),
                    PathNode.LineTo(32.11f, 214.68f),
                    PathNode.CurveTo(31.721853f, 217.00015f, 32.37455f, 219.37358f, 33.8945f, 221.169f),
                    PathNode.CurveTo(35.414455f, 222.96443f, 37.64759f, 223.9999f, 40.0f, 224.0f),
                    PathNode.CurveTo(40.44221f, 223.99814f, 40.883583f, 223.96135f, 41.32f, 223.89f),
                    PathNode.LineTo(180.76f, 200.65f),
                    PathNode.CurveTo(186.39766f, 199.70921f, 191.10533f, 195.83253f, 193.11f, 190.48f),
                    PathNode.LineTo(214.88f, 132.48f),
                    PathNode.LineTo(243.31f, 104.0f),
                    PathNode.CurveTo(246.32571f, 101.006676f, 248.01512f, 96.92903f, 248.0f, 92.68f),
                    PathNode.Close,
                    PathNode.MoveTo(178.13f, 184.87f),
                    PathNode.LineTo(63.32f, 204.0f),
                    PathNode.LineTo(110.69f, 156.63f),
                    PathNode.CurveTo(122.91985f, 163.23961f, 138.14716f, 159.87543f, 146.45404f, 148.7286f),
                    PathNode.CurveTo(154.76097f, 137.5818f, 153.63168f, 122.02825f, 143.80171f, 112.19828f),
                    PathNode.CurveTo(133.97176f, 102.368324f, 118.418205f, 101.23903f, 107.271385f, 109.545944f),
                    PathNode.CurveTo(96.12457f, 117.852844f, 92.76039f, 133.08015f, 99.37f, 145.31f),
                    PathNode.LineTo(52.0f, 192.7f),
                    PathNode.LineTo(71.13f, 77.86f),
                    PathNode.LineTo(126.0f, 57.29f),
                    PathNode.LineTo(198.7f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 132.0f),
                    PathNode.CurveTo(112.0f, 125.37258f, 117.37258f, 120.0f, 124.0f, 120.0f),
                    PathNode.CurveTo(130.62741f, 120.0f, 136.0f, 125.37258f, 136.0f, 132.0f),
                    PathNode.CurveTo(136.0f, 138.62741f, 130.62741f, 144.0f, 124.0f, 144.0f),
                    PathNode.CurveTo(117.37258f, 144.0f, 112.0f, 138.62741f, 112.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 116.68f),
                    PathNode.LineTo(139.31f, 48.0f),
                    PathNode.LineTo(163.31f, 24.0f),
                    PathNode.LineTo(232.0f, 92.68f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _penNib!!
    }

private var _penNib: ImageVector? = null
