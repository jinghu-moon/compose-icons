package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorThinIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(27.999006f, 209.38705f, 28.716652f, 210.6756f, 29.8964f, 211.40504f),
                    PathNode.CurveTo(31.07615f, 212.1345f, 32.549583f, 212.2007f, 33.79f, 211.58f),
                    PathNode.LineTo(64.0f, 196.47f),
                    PathNode.LineTo(94.21f, 211.58f),
                    PathNode.CurveTo(95.33674f, 212.14381f, 96.66326f, 212.14381f, 97.79f, 211.58f),
                    PathNode.LineTo(128.0f, 196.47f),
                    PathNode.LineTo(158.21f, 211.58f),
                    PathNode.CurveTo(159.33673f, 212.14381f, 160.66327f, 212.14381f, 161.79f, 211.58f),
                    PathNode.LineTo(192.0f, 196.47f),
                    PathNode.LineTo(222.21f, 211.58f),
                    PathNode.CurveTo(222.76657f, 211.85538f, 223.37903f, 211.99908f, 224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 201.53f),
                    PathNode.LineTo(193.79f, 188.42f),
                    PathNode.CurveTo(192.66327f, 187.85619f, 191.33673f, 187.85619f, 190.21f, 188.42f),
                    PathNode.LineTo(160.0f, 203.53f),
                    PathNode.LineTo(129.79f, 188.42f),
                    PathNode.CurveTo(128.66327f, 187.85619f, 127.33674f, 187.85619f, 126.21f, 188.42f),
                    PathNode.LineTo(96.0f, 203.53f),
                    PathNode.LineTo(65.79f, 188.42f),
                    PathNode.CurveTo(64.66326f, 187.85619f, 63.336735f, 187.85619f, 62.21f, 188.42f),
                    PathNode.LineTo(36.0f, 201.53f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.83f, 98.83f),
                    PathNode.LineTo(133.66f, 120.0f),
                    PathNode.LineTo(154.83f, 141.17f),
                    PathNode.CurveTo(156.39296f, 142.73297f, 156.39296f, 145.26703f, 154.83f, 146.83f),
                    PathNode.CurveTo(153.26703f, 148.39296f, 150.73297f, 148.39296f, 149.17f, 146.83f),
                    PathNode.LineTo(128.0f, 125.66f),
                    PathNode.LineTo(106.83f, 146.83f),
                    PathNode.CurveTo(105.26704f, 148.39296f, 102.73296f, 148.39296f, 101.17f, 146.83f),
                    PathNode.CurveTo(99.60703f, 145.26703f, 99.60703f, 142.73297f, 101.17f, 141.17f),
                    PathNode.LineTo(122.34f, 120.0f),
                    PathNode.LineTo(101.17f, 98.83f),
                    PathNode.CurveTo(99.60703f, 97.26704f, 99.60703f, 94.73296f, 101.17f, 93.17f),
                    PathNode.CurveTo(102.73296f, 91.60703f, 105.26704f, 91.60703f, 106.83f, 93.17f),
                    PathNode.LineTo(128.0f, 114.34f),
                    PathNode.LineTo(149.17f, 93.17f),
                    PathNode.CurveTo(150.73297f, 91.60703f, 153.26703f, 91.60703f, 154.83f, 93.17f),
                    PathNode.CurveTo(156.39296f, 94.73296f, 156.39296f, 97.26704f, 154.83f, 98.83f),
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
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
