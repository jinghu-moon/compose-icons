package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReceiptTax: ImageVector
    get() {
        if (_receiptTax != null) return _receiptTax!!
        _receiptTax = tablerOutlineIcon(
            name = "ReceiptTax",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
                    PathNode.MoveTo(9.0f, 8.5f),
                    PathNode.CurveTo(9.0f, 8.776142f, 9.223858f, 9.0f, 9.5f, 9.0f),
                    PathNode.CurveTo(9.776142f, 9.0f, 10.0f, 8.776142f, 10.0f, 8.5f),
                    PathNode.CurveTo(10.0f, 8.223858f, 9.776142f, 8.0f, 9.5f, 8.0f),
                    PathNode.CurveTo(9.223858f, 8.0f, 9.0f, 8.223858f, 9.0f, 8.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(14.0f, 13.5f),
                    PathNode.CurveTo(14.0f, 13.776142f, 14.223858f, 14.0f, 14.5f, 14.0f),
                    PathNode.CurveTo(14.776142f, 14.0f, 15.0f, 13.776142f, 15.0f, 13.5f),
                    PathNode.CurveTo(15.0f, 13.223858f, 14.776142f, 13.0f, 14.5f, 13.0f),
                    PathNode.CurveTo(14.223858f, 13.0f, 14.0f, 13.223858f, 14.0f, 13.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(18.10457f, 3.0f, 19.0f, 3.895431f, 19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.LineTo(5.0f, 21.0f)
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
        return _receiptTax!!
    }

private var _receiptTax: ImageVector? = null
