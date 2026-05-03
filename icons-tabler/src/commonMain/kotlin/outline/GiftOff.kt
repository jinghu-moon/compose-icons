package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GiftOff: ImageVector
    get() {
        if (_giftOff != null) return _giftOff!!
        _giftOff = tablerOutlineIcon(
            name = "GiftOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.552284f, 8.0f, 21.0f, 8.447715f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 11.552285f, 20.552284f, 12.0f, 20.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(3.447715f, 12.0f, 3.0f, 11.552285f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 8.447715f, 3.447715f, 8.0f, 4.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 8.0f),
                    PathNode.CurveTo(6.75584f, 8.000074f, 6.050329f, 7.668628f, 5.575319f, 7.095793f),
                    PathNode.CurveTo(5.100308f, 6.522958f, 4.905182f, 5.768287f, 5.043f, 5.037f),
                    PathNode.MoveTo(7.066f, 3.037f),
                    PathNode.CurveTo(7.206f, 3.014f, 7.352f, 3.0f, 7.5f, 3.0f),
                    PathNode.CurveTo(9.474f, 2.966f, 11.26f, 4.95f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.74f, 4.95f, 14.526f, 2.966f, 16.5f, 3.0f),
                    PathNode.CurveTo(17.880713f, 3.0f, 19.0f, 4.119288f, 19.0f, 5.5f),
                    PathNode.CurveTo(19.0f, 6.880712f, 17.880713f, 8.0f, 16.5f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _giftOff!!
    }

private var _giftOff: ImageVector? = null
