package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorFillIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(216.0f, 228.41827f, 212.41827f, 232.0f, 208.0f, 232.0f),
                    PathNode.CurveTo(203.58173f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(147.58173f, 176.0f, 144.0f, 172.41827f, 144.0f, 168.0f),
                    PathNode.CurveTo(144.37149f, 148.83678f, 146.79193f, 129.7683f, 151.22f, 111.12f),
                    PathNode.CurveTo(161.0f, 70.63f, 179.54f, 43.49f, 204.85f, 32.65f),
                    PathNode.CurveTo(207.32106f, 31.591513f, 210.15854f, 31.844864f, 212.40298f, 33.324387f),
                    PathNode.CurveTo(214.64743f, 34.80391f, 215.99875f, 37.31178f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.89f, 38.69f),
                    PathNode.CurveTo(119.46355f, 35.83093f, 117.527885f, 33.424294f, 114.82674f, 32.39477f),
                    PathNode.CurveTo(112.12557f, 31.36525f, 109.079124f, 31.872992f, 106.85788f, 33.722916f),
                    PathNode.CurveTo(104.636635f, 35.572838f, 103.586136f, 38.477165f, 104.11f, 41.32f),
                    PathNode.LineTo(111.89f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 35.581722f, 84.41828f, 32.0f, 80.0f, 32.0f),
                    PathNode.CurveTo(75.58172f, 32.0f, 72.0f, 35.581722f, 72.0f, 40.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.LineTo(48.11f, 88.0f),
                    PathNode.LineTo(55.89f, 41.32f),
                    PathNode.CurveTo(56.413864f, 38.477165f, 55.363365f, 35.572838f, 53.14212f, 33.722916f),
                    PathNode.CurveTo(50.92087f, 31.872992f, 47.87442f, 31.36525f, 45.173267f, 32.39477f),
                    PathNode.CurveTo(42.472115f, 33.424294f, 40.536453f, 35.83093f, 40.11f, 38.69f),
                    PathNode.LineTo(32.11f, 86.69f),
                    PathNode.CurveTo(32.038204f, 87.123f, 32.00142f, 87.56109f, 32.0f, 88.0f),
                    PathNode.CurveTo(32.033f, 111.40874f, 48.923466f, 131.39015f, 72.0f, 135.32f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 228.41827f, 75.58172f, 232.0f, 80.0f, 232.0f),
                    PathNode.CurveTo(84.41828f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.LineTo(88.0f, 135.32f),
                    PathNode.CurveTo(111.07653f, 131.39015f, 127.966995f, 111.40874f, 128.0f, 88.0f),
                    PathNode.CurveTo(127.99858f, 87.56109f, 127.96179f, 87.123f, 127.89f, 86.69f),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
