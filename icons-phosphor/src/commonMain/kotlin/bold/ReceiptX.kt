package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorBoldIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 208.0f),
                    PathNode.CurveTo(20.000488f, 212.15936f, 22.154814f, 216.02185f, 25.69346f, 218.20778f),
                    PathNode.CurveTo(29.232105f, 220.39372f, 33.65035f, 220.59131f, 37.37f, 218.73f),
                    PathNode.LineTo(64.0f, 205.42f),
                    PathNode.LineTo(90.63f, 218.73f),
                    PathNode.CurveTo(94.01021f, 220.42146f, 97.98979f, 220.42146f, 101.37f, 218.73f),
                    PathNode.LineTo(128.0f, 205.42f),
                    PathNode.LineTo(154.63f, 218.73f),
                    PathNode.CurveTo(158.01021f, 220.42146f, 161.98979f, 220.42146f, 165.37f, 218.73f),
                    PathNode.LineTo(192.0f, 205.42f),
                    PathNode.LineTo(218.63f, 218.73f),
                    PathNode.CurveTo(222.34966f, 220.59131f, 226.7679f, 220.39372f, 230.30653f, 218.20778f),
                    PathNode.CurveTo(233.84518f, 216.02185f, 235.9995f, 212.15936f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 188.58f),
                    PathNode.LineTo(197.37f, 181.27f),
                    PathNode.CurveTo(193.98979f, 179.57854f, 190.01021f, 179.57854f, 186.63f, 181.27f),
                    PathNode.LineTo(160.0f, 194.58f),
                    PathNode.LineTo(133.37f, 181.27f),
                    PathNode.CurveTo(129.98979f, 179.57854f, 126.01021f, 179.57854f, 122.63f, 181.27f),
                    PathNode.LineTo(96.0f, 194.58f),
                    PathNode.LineTo(69.37f, 181.27f),
                    PathNode.CurveTo(65.98979f, 179.57854f, 62.01021f, 179.57854f, 58.63f, 181.27f),
                    PathNode.LineTo(44.0f, 188.58f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.51f, 135.51f),
                    PathNode.LineTo(111.0f, 120.0f),
                    PathNode.LineTo(95.51f, 104.49f),
                    PathNode.CurveTo(90.81558f, 99.79558f, 90.81558f, 92.18442f, 95.51f, 87.49f),
                    PathNode.CurveTo(100.20442f, 82.79558f, 107.81558f, 82.79558f, 112.51f, 87.49f),
                    PathNode.LineTo(128.0f, 103.0f),
                    PathNode.LineTo(143.51f, 87.48f),
                    PathNode.CurveTo(148.20442f, 82.78558f, 155.81558f, 82.78558f, 160.51f, 87.48f),
                    PathNode.CurveTo(165.20442f, 92.17442f, 165.20442f, 99.785576f, 160.51f, 104.48f),
                    PathNode.LineTo(145.0f, 120.0f),
                    PathNode.LineTo(160.52f, 135.51f),
                    PathNode.CurveTo(165.21442f, 140.20442f, 165.21442f, 147.81558f, 160.52f, 152.51f),
                    PathNode.CurveTo(155.82558f, 157.20442f, 148.21442f, 157.20442f, 143.52f, 152.51f),
                    PathNode.LineTo(128.0f, 137.0f),
                    PathNode.LineTo(112.49f, 152.52f),
                    PathNode.CurveTo(107.79558f, 157.21442f, 100.18442f, 157.21442f, 95.49f, 152.52f),
                    PathNode.CurveTo(90.79558f, 147.82558f, 90.79558f, 140.21442f, 95.49f, 135.52f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
