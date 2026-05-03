package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorThinIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 100.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.LineTo(32.0f, 172.0f),
                    PathNode.CurveTo(29.790861f, 172.0f, 28.0f, 173.79086f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 178.20914f, 29.790861f, 180.0f, 32.0f, 180.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(226.20914f, 180.0f, 228.0f, 178.20914f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 173.79086f, 226.20914f, 172.0f, 224.0f, 172.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(232.0f, 100.0f),
                    PathNode.CurveTo(233.79247f, 100.00408f, 235.3688f, 98.815216f, 235.85753f, 97.09067f),
                    PathNode.CurveTo(236.34628f, 95.366104f, 235.62808f, 93.52697f, 234.1f, 92.59f),
                    PathNode.LineTo(130.1f, 28.59f),
                    PathNode.CurveTo(128.8126f, 27.79588f, 127.187386f, 27.79588f, 125.9f, 28.59f),
                    PathNode.LineTo(21.9f, 92.59f),
                    PathNode.CurveTo(20.371912f, 93.52697f, 19.653713f, 95.366104f, 20.142452f, 97.09067f),
                    PathNode.CurveTo(20.631193f, 98.815216f, 22.20753f, 100.00408f, 24.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 100.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.LineTo(60.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 100.0f),
                    PathNode.LineTo(148.0f, 172.0f),
                    PathNode.LineTo(108.0f, 172.0f),
                    PathNode.LineTo(108.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.LineTo(196.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.7f),
                    PathNode.LineTo(217.87f, 92.0f),
                    PathNode.LineTo(38.13f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 210.20914f, 242.20914f, 212.0f, 240.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(13.790861f, 212.0f, 12.0f, 210.20914f, 12.0f, 208.0f),
                    PathNode.CurveTo(12.0f, 205.79086f, 13.790861f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 205.79086f, 244.0f, 208.0f),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
