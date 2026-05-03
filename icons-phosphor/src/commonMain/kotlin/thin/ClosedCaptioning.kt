package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorThinIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.46f, 153.71f),
                    PathNode.CurveTo(115.992645f, 154.62877f, 116.13806f, 155.72165f, 115.86419f, 156.74773f),
                    PathNode.CurveTo(115.59032f, 157.7738f, 114.91964f, 158.64886f, 114.0f, 159.18f),
                    PathNode.CurveTo(98.86989f, 167.91191f, 79.654526f, 164.52147f, 68.42642f, 151.13878f),
                    PathNode.CurveTo(57.19832f, 137.7561f, 57.19832f, 118.24391f, 68.42642f, 104.86122f),
                    PathNode.CurveTo(79.654526f, 91.47854f, 98.86989f, 88.08808f, 114.0f, 96.82f),
                    PathNode.CurveTo(115.80901f, 97.969986f, 116.38992f, 100.34159f, 115.31717f, 102.19744f),
                    PathNode.CurveTo(114.24442f, 104.05329f, 111.8994f, 104.733604f, 110.0f, 103.74f),
                    PathNode.CurveTo(98.231705f, 96.95823f, 83.29337f, 99.60055f, 74.56548f, 110.00771f),
                    PathNode.CurveTo(65.8376f, 120.414894f, 65.8376f, 135.58511f, 74.56548f, 145.99228f),
                    PathNode.CurveTo(83.29337f, 156.39946f, 98.231705f, 159.04178f, 110.0f, 152.26f),
                    PathNode.CurveTo(111.90857f, 151.15584f, 114.35072f, 151.8044f, 115.46f, 153.71f),
                    PathNode.Close,
                    PathNode.MoveTo(195.46f, 153.71f),
                    PathNode.CurveTo(195.99265f, 154.62877f, 196.13806f, 155.72165f, 195.86418f, 156.74773f),
                    PathNode.CurveTo(195.59032f, 157.7738f, 194.91965f, 158.64886f, 194.0f, 159.18f),
                    PathNode.CurveTo(178.86989f, 167.91191f, 159.65453f, 164.52147f, 148.42642f, 151.13878f),
                    PathNode.CurveTo(137.19832f, 137.7561f, 137.19832f, 118.24391f, 148.42642f, 104.86122f),
                    PathNode.CurveTo(159.65453f, 91.47854f, 178.86989f, 88.08808f, 194.0f, 96.82f),
                    PathNode.CurveTo(195.809f, 97.969986f, 196.38992f, 100.34159f, 195.31717f, 102.19744f),
                    PathNode.CurveTo(194.24443f, 104.05329f, 191.8994f, 104.733604f, 190.0f, 103.74f),
                    PathNode.CurveTo(178.2317f, 96.95823f, 163.29338f, 99.60055f, 154.56549f, 110.00771f),
                    PathNode.CurveTo(145.8376f, 120.414894f, 145.8376f, 135.58511f, 154.56549f, 145.99228f),
                    PathNode.CurveTo(163.29338f, 156.39946f, 178.2317f, 159.04178f, 190.0f, 152.26f),
                    PathNode.CurveTo(191.90857f, 151.15584f, 194.35072f, 151.8044f, 195.46f, 153.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
