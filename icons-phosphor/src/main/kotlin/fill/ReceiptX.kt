package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorFillIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.00148f, 210.77232f, 25.438162f, 213.34625f, 27.797056f, 214.80273f),
                    PathNode.CurveTo(30.155952f, 216.25922f, 33.10076f, 216.39061f, 35.58f, 215.15f),
                    PathNode.LineTo(64.0f, 200.94f),
                    PathNode.LineTo(92.42f, 215.15f),
                    PathNode.CurveTo(94.67347f, 216.27763f, 97.32653f, 216.27763f, 99.58f, 215.15f),
                    PathNode.LineTo(128.0f, 200.94f),
                    PathNode.LineTo(156.42f, 215.15f),
                    PathNode.CurveTo(158.67348f, 216.27763f, 161.32652f, 216.27763f, 163.58f, 215.15f),
                    PathNode.LineTo(192.0f, 200.94f),
                    PathNode.LineTo(220.42f, 215.15f),
                    PathNode.CurveTo(222.89923f, 216.39061f, 225.84402f, 216.25922f, 228.20294f, 214.80273f),
                    PathNode.CurveTo(230.56184f, 213.34625f, 231.9985f, 210.77232f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.66f, 138.34f),
                    PathNode.CurveTo(160.78593f, 141.46593f, 160.78593f, 146.53407f, 157.66f, 149.66f),
                    PathNode.CurveTo(154.53407f, 152.78593f, 149.46593f, 152.78593f, 146.34f, 149.66f),
                    PathNode.LineTo(128.0f, 131.31f),
                    PathNode.LineTo(109.66f, 149.66f),
                    PathNode.CurveTo(106.534065f, 152.78593f, 101.465935f, 152.78593f, 98.34f, 149.66f),
                    PathNode.CurveTo(95.214066f, 146.53407f, 95.214066f, 141.46593f, 98.34f, 138.34f),
                    PathNode.LineTo(116.69f, 120.0f),
                    PathNode.LineTo(98.34f, 101.66f),
                    PathNode.CurveTo(95.214066f, 98.534065f, 95.214066f, 93.465935f, 98.34f, 90.34f),
                    PathNode.CurveTo(101.465935f, 87.214066f, 106.534065f, 87.214066f, 109.66f, 90.34f),
                    PathNode.LineTo(128.0f, 108.69f),
                    PathNode.LineTo(146.34f, 90.34f),
                    PathNode.CurveTo(149.46593f, 87.214066f, 154.53407f, 87.214066f, 157.66f, 90.34f),
                    PathNode.CurveTo(160.78593f, 93.465935f, 160.78593f, 98.534065f, 157.66f, 101.66f),
                    PathNode.LineTo(139.31f, 120.0f),
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
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
