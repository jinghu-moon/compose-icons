package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorThinIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.12f, 138.47f),
                    PathNode.CurveTo(158.0489f, 134.01106f, 165.86497f, 120.86472f, 163.60658f, 107.376274f),
                    PathNode.CurveTo(161.34818f, 93.887825f, 149.67621f, 84.00441f, 136.0f, 84.0f),
                    PathNode.LineTo(104.0f, 84.0f),
                    PathNode.CurveTo(101.79086f, 84.0f, 100.0f, 85.79086f, 100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 170.20914f, 101.79086f, 172.0f, 104.0f, 172.0f),
                    PathNode.CurveTo(106.20914f, 172.0f, 108.0f, 170.20914f, 108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.LineTo(136.52f, 140.0f),
                    PathNode.LineTo(156.67f, 170.23f),
                    PathNode.CurveTo(157.89607f, 172.0691f, 160.38089f, 172.56607f, 162.22f, 171.34f),
                    PathNode.CurveTo(164.05911f, 170.11392f, 164.55608f, 167.6291f, 163.33f, 165.79f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(147.0457f, 92.0f, 156.0f, 100.95431f, 156.0f, 112.0f),
                    PathNode.CurveTo(156.0f, 123.04569f, 147.0457f, 132.0f, 136.0f, 132.0f),
                    PathNode.LineTo(108.0f, 132.0f),
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
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
