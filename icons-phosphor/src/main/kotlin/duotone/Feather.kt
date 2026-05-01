package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorDuotoneIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.8f, 119.6f),
                    PathNode.LineTo(146.54f, 189.66f),
                    PathNode.CurveTo(145.04088f, 191.15746f, 143.00891f, 191.99902f, 140.89f, 192.0f),
                    PathNode.LineTo(64.2f, 192.0f),
                    PathNode.LineTo(64.2f, 115.31f),
                    PathNode.CurveTo(64.20098f, 113.19109f, 65.04254f, 111.15913f, 66.54f, 109.66f),
                    PathNode.LineTo(112.2f, 64.52f),
                    PathNode.LineTo(112.2f, 144.0f),
                    PathNode.LineTo(136.2f, 120.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.28f, 34.75f),
                    PathNode.CurveTo(196.28871f, 9.769554f, 155.7813f, 9.769554f, 130.79f, 34.75f),
                    PathNode.LineTo(60.69f, 104.0f),
                    PathNode.CurveTo(57.679596f, 106.99279f, 55.990906f, 111.065094f, 56.0f, 115.31f),
                    PathNode.LineTo(56.0f, 188.69f),
                    PathNode.LineTo(26.34f, 218.34f),
                    PathNode.CurveTo(23.21407f, 221.46593f, 23.21407f, 226.53407f, 26.34f, 229.66f),
                    PathNode.CurveTo(29.46593f, 232.78593f, 34.53407f, 232.78593f, 37.66f, 229.66f),
                    PathNode.LineTo(67.32f, 200.0f),
                    PathNode.LineTo(140.7f, 200.0f),
                    PathNode.CurveTo(144.93954f, 200.00685f, 149.00674f, 198.32239f, 152.0f, 195.32f),
                    PathNode.LineTo(152.0f, 195.32f),
                    PathNode.LineTo(221.23f, 125.32f),
                    PathNode.CurveTo(233.2574f, 113.32186f, 240.02098f, 97.034004f, 240.03035f, 80.045364f),
                    PathNode.CurveTo(240.03973f, 63.05672f, 233.29417f, 46.761402f, 221.28f, 34.75f),
                    PathNode.Close,
                    PathNode.MoveTo(142.07f, 46.06f),
                    PathNode.CurveTo(160.44585f, 27.676119f, 190.11647f, 27.25959f, 209.00113f, 45.12039f),
                    PathNode.CurveTo(227.8858f, 62.981194f, 229.12212f, 92.62897f, 211.79f, 112.0f),
                    PathNode.LineTo(155.33f, 112.0f),
                    PathNode.LineTo(189.68f, 77.66f),
                    PathNode.CurveTo(192.80594f, 74.534065f, 192.80594f, 69.465935f, 189.68f, 66.34f),
                    PathNode.CurveTo(186.55406f, 63.21407f, 181.48593f, 63.21407f, 178.36f, 66.34f),
                    PathNode.LineTo(120.0f, 124.69f),
                    PathNode.LineTo(120.0f, 67.87f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 115.35f),
                    PathNode.LineTo(104.0f, 83.68f),
                    PathNode.LineTo(104.0f, 140.68f),
                    PathNode.LineTo(72.0f, 172.68f),
                    PathNode.Close,
                    PathNode.MoveTo(140.7f, 184.0f),
                    PathNode.LineTo(83.32f, 184.0f),
                    PathNode.LineTo(139.32f, 128.0f),
                    PathNode.LineTo(196.06f, 128.0f),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
