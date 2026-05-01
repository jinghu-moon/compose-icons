package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransactionDollar: ImageVector
    get() {
        if (_transactionDollar != null) return _transactionDollar!!
        _transactionDollar = tablerOutlineIcon(
            name = "TransactionDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.8f, 13.0f),
                    PathNode.CurveTo(20.430868f, 12.359677f, 19.738684f, 11.975131f, 19.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.CurveTo(15.895431f, 12.0f, 15.0f, 12.895431f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 15.104569f, 15.895431f, 16.0f, 17.0f, 16.0f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(20.10457f, 16.0f, 21.0f, 16.89543f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.10457f, 20.10457f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(16.261316f, 20.02487f, 15.569133f, 19.640324f, 15.2f, 19.0f)
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
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 6.10457f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.CurveTo(6.10457f, 7.0f, 7.0f, 6.10457f, 7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 6.10457f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f)
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 6.10457f, 15.895431f, 7.0f, 17.0f, 7.0f),
                    PathNode.CurveTo(18.10457f, 7.0f, 19.0f, 6.10457f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 3.895431f, 18.10457f, 3.0f, 17.0f, 3.0f),
                    PathNode.CurveTo(15.895431f, 3.0f, 15.0f, 3.895431f, 15.0f, 5.0f)
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
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f)
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
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 14.656855f, 8.343146f, 16.0f, 10.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f)
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
        return _transactionDollar!!
    }

private var _transactionDollar: ImageVector? = null
