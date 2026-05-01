package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GiftCard: ImageVector
    get() {
        if (_giftCard != null) return _giftCard!!
        _giftCard = tablerOutlineIcon(
            name = "GiftCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.343146f, 4.343146f, 5.0f, 6.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(19.656855f, 5.0f, 21.0f, 6.343146f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 17.656855f, 19.656855f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(4.343146f, 19.0f, 3.0f, 17.656855f, 3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 8.0f)
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
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(13.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.CurveTo(7.211f, 13.0f, 6.0f, 12.328f, 6.0f, 11.5f),
                    PathNode.CurveTo(6.0f, 10.672f, 6.711f, 10.0f, 7.5f, 10.0f),
                    PathNode.CurveTo(8.628f, 9.98f, 9.577f, 11.17f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.423f, 11.17f, 11.372f, 9.98f, 12.5f, 10.0f),
                    PathNode.CurveTo(13.289f, 10.0f, 14.0f, 10.672f, 14.0f, 11.5f),
                    PathNode.CurveTo(14.0f, 12.328f, 12.789f, 13.0f, 12.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f)
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
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
