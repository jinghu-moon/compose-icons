package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptText: ImageVector
    get() {
        if (_receiptText != null) return _receiptText!!
        _receiptText = lucideOutlineIcon(
            name = "ReceiptText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 3.0f),
                    PathNode.CurveTo(4.0f, 2.447715f, 4.447716f, 2.0f, 5.0f, 2.0f),
                    PathNode.CurveTo(5.247619f, 1.998638f, 5.490477f, 2.068026f, 5.7f, 2.2f),
                    PathNode.LineTo(6.633f, 2.8f),
                    PathNode.CurveTo(7.059817f, 3.07274f, 7.606184f, 3.07274f, 8.033f, 2.8f),
                    PathNode.LineTo(8.967f, 2.2f),
                    PathNode.CurveTo(9.393817f, 1.92726f, 9.940184f, 1.92726f, 10.367f, 2.2f),
                    PathNode.LineTo(11.3f, 2.8f),
                    PathNode.CurveTo(11.726816f, 3.07274f, 12.273184f, 3.07274f, 12.7f, 2.8f),
                    PathNode.LineTo(13.633f, 2.2f),
                    PathNode.CurveTo(14.059816f, 1.92726f, 14.606183f, 1.92726f, 15.033f, 2.2f),
                    PathNode.LineTo(15.967f, 2.8f),
                    PathNode.CurveTo(16.393816f, 3.07274f, 16.940184f, 3.07274f, 17.367f, 2.8f),
                    PathNode.LineTo(18.3f, 2.2f),
                    PathNode.CurveTo(18.509523f, 2.068026f, 18.75238f, 1.998638f, 19.0f, 2.0f),
                    PathNode.CurveTo(19.552284f, 2.0f, 20.0f, 2.447715f, 20.0f, 3.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.CurveTo(18.75238f, 22.001362f, 18.509523f, 21.931974f, 18.3f, 21.8f),
                    PathNode.LineTo(17.367f, 21.2f),
                    PathNode.CurveTo(16.940184f, 20.92726f, 16.393816f, 20.92726f, 15.967f, 21.2f),
                    PathNode.LineTo(15.033f, 21.8f),
                    PathNode.CurveTo(14.606183f, 22.07274f, 14.059816f, 22.07274f, 13.633f, 21.8f),
                    PathNode.LineTo(12.7f, 21.2f),
                    PathNode.CurveTo(12.273184f, 20.92726f, 11.726816f, 20.92726f, 11.3f, 21.2f),
                    PathNode.LineTo(10.367f, 21.8f),
                    PathNode.CurveTo(9.940184f, 22.07274f, 9.393817f, 22.07274f, 8.967f, 21.8f),
                    PathNode.LineTo(8.033f, 21.2f),
                    PathNode.CurveTo(7.606184f, 20.92726f, 7.059817f, 20.92726f, 6.633f, 21.2f),
                    PathNode.LineTo(5.7f, 21.8f),
                    PathNode.CurveTo(5.490477f, 21.931974f, 5.247619f, 22.001362f, 5.0f, 22.0f),
                    PathNode.CurveTo(4.447716f, 22.0f, 4.0f, 21.552284f, 4.0f, 21.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _receiptText!!
    }

private var _receiptText: ImageVector? = null
