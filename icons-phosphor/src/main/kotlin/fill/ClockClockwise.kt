package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorFillIcon(
            name = "ClockClockwise",
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
                    PathNode.MoveTo(227.06f, 56.61f),
                    PathNode.CurveTo(224.07097f, 55.369938f, 220.62924f, 56.052757f, 218.34f, 58.34f),
                    PathNode.LineTo(206.0f, 70.71f),
                    PathNode.CurveTo(202.77f, 67.2f, 199.44f, 63.71f, 195.9f, 60.12f),
                    PathNode.CurveTo(158.66718f, 22.883072f, 98.38777f, 22.589046f, 60.79345f, 59.460987f),
                    PathNode.CurveTo(23.199125f, 96.33293f, 22.323689f, 156.60667f, 58.8313f, 194.5549f),
                    PathNode.CurveTo(95.33891f, 232.50311f, 155.60141f, 233.95988f, 193.9f, 197.82f),
                    PathNode.CurveTo(197.1143f, 194.78246f, 197.25757f, 189.7143f, 194.22f, 186.5f),
                    PathNode.CurveTo(191.18243f, 183.2857f, 186.1143f, 183.14244f, 182.9f, 186.18f),
                    PathNode.CurveTo(150.98764f, 216.29184f, 100.7765f, 215.08101f, 70.35265f, 183.46596f),
                    PathNode.CurveTo(39.92881f, 151.8509f, 40.646366f, 101.6303f, 71.96106f, 70.897385f),
                    PathNode.CurveTo(103.27574f, 40.164467f, 153.50098f, 40.388702f, 184.54f, 71.4f),
                    PathNode.CurveTo(188.08f, 74.98f, 191.41f, 78.5f, 194.65f, 82.03f),
                    PathNode.LineTo(178.34f, 98.34f),
                    PathNode.CurveTo(176.04936f, 100.62809f, 175.36368f, 104.07126f, 176.60303f, 107.062325f),
                    PathNode.CurveTo(177.84236f, 110.05338f, 180.76236f, 112.00255f, 184.0f, 112.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(231.99933f, 60.764324f, 230.04962f, 57.847645f, 227.06f, 56.61f),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
