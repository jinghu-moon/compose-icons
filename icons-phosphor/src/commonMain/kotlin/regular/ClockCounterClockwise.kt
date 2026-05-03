package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorRegularIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 123.47f),
                    PathNode.LineTo(172.12f, 145.14f),
                    PathNode.CurveTo(175.90868f, 147.41542f, 177.1354f, 152.33133f, 174.86f, 156.12f),
                    PathNode.CurveTo(172.58458f, 159.90868f, 167.66867f, 161.1354f, 163.88f, 158.86f),
                    PathNode.LineTo(123.88f, 134.86f),
                    PathNode.CurveTo(121.471886f, 133.41321f, 119.99913f, 130.80931f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(102.5092f, 31.936504f, 78.05227f, 42.07288f, 60.08f, 60.15f),
                    PathNode.CurveTo(52.81f, 67.51f, 46.35f, 74.59f, 40.0f, 82.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 59.581722f, 36.418278f, 56.0f, 32.0f, 56.0f),
                    PathNode.CurveTo(27.581722f, 56.0f, 24.0f, 59.581722f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(24.0f, 108.41828f, 27.581722f, 112.0f, 32.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(76.41828f, 112.0f, 80.0f, 108.41828f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 99.58172f, 76.41828f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(49.0f, 96.0f),
                    PathNode.CurveTo(56.15f, 87.58f, 63.27f, 79.65f, 71.39f, 71.43f),
                    PathNode.CurveTo(102.41916f, 40.40099f, 152.65202f, 40.158855f, 183.97885f, 70.8873f),
                    PathNode.CurveTo(215.3057f, 101.61574f, 216.0323f, 151.84393f, 185.60744f, 183.46568f),
                    PathNode.CurveTo(155.18257f, 215.08743f, 104.96373f, 216.29846f, 73.05f, 186.18f),
                    PathNode.CurveTo(69.8357f, 183.14244f, 64.76756f, 183.2857f, 61.73f, 186.5f),
                    PathNode.CurveTo(58.692432f, 189.7143f, 58.8357f, 194.78246f, 62.05f, 197.82f),
                    PathNode.CurveTo(93.39488f, 227.39943f, 140.61055f, 232.46451f, 177.5163f, 210.2067f),
                    PathNode.CurveTo(214.42204f, 187.94888f, 231.97136f, 143.82411f, 220.43329f, 102.29922f),
                    PathNode.CurveTo(208.89525f, 60.77431f, 171.09807f, 32.028053f, 128.0f, 32.0f),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
