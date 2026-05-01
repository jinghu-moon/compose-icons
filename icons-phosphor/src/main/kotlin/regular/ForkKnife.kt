package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorRegularIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(72.0f, 35.581722f, 75.58172f, 32.0f, 80.0f, 32.0f),
                    PathNode.CurveTo(84.41828f, 32.0f, 88.0f, 35.581722f, 88.0f, 40.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 92.41828f, 84.41828f, 96.0f, 80.0f, 96.0f),
                    PathNode.CurveTo(75.58172f, 96.0f, 72.0f, 92.41828f, 72.0f, 88.0f),
                    PathNode.Close,
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
                    PathNode.MoveTo(200.0f, 53.9f),
                    PathNode.CurveTo(167.83f, 78.47f, 161.53f, 138.32f, 160.3f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.89f, 38.69f),
                    PathNode.CurveTo(119.46355f, 35.83093f, 117.527885f, 33.424294f, 114.82674f, 32.39477f),
                    PathNode.CurveTo(112.12557f, 31.36525f, 109.079124f, 31.872992f, 106.85788f, 33.722916f),
                    PathNode.CurveTo(104.636635f, 35.572838f, 103.586136f, 38.477165f, 104.11f, 41.32f),
                    PathNode.LineTo(112.0f, 88.63f),
                    PathNode.CurveTo(112.0f, 106.30311f, 97.67311f, 120.63f, 80.0f, 120.63f),
                    PathNode.CurveTo(62.32689f, 120.63f, 48.0f, 106.30311f, 48.0f, 88.63f),
                    PathNode.LineTo(55.88f, 41.32f),
                    PathNode.CurveTo(56.403866f, 38.477165f, 55.353363f, 35.572838f, 53.13212f, 33.722916f),
                    PathNode.CurveTo(50.910873f, 31.872992f, 47.86442f, 31.36525f, 45.163265f, 32.39477f),
                    PathNode.CurveTo(42.462112f, 33.424294f, 40.52645f, 35.83093f, 40.1f, 38.69f),
                    PathNode.LineTo(32.1f, 86.69f),
                    PathNode.CurveTo(32.031555f, 87.123276f, 31.998112f, 87.561356f, 32.0f, 88.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
