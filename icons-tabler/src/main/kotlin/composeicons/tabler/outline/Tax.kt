package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tax: ImageVector
    get() {
        if (_tax != null) return _tax!!
        _tax = tablerOutlineIcon(
            name = "Tax",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.487f, 21.0f),
                    PathNode.LineTo(15.513f, 21.0f),
                    PathNode.CurveTo(16.791162f, 20.99996f, 17.99234f, 20.389091f, 18.745247f, 19.356216f),
                    PathNode.CurveTo(19.498156f, 18.323343f, 19.712118f, 16.992851f, 19.321f, 15.776f),
                    PathNode.LineTo(17.615f, 10.47f),
                    PathNode.CurveTo(16.950394f, 8.402267f, 15.026917f, 7.000069f, 12.855f, 7.0f),
                    PathNode.LineTo(11.145f, 7.0f),
                    PathNode.CurveTo(8.973083f, 7.000069f, 7.049607f, 8.402267f, 6.385f, 10.47f),
                    PathNode.LineTo(4.679f, 15.776f),
                    PathNode.CurveTo(4.287883f, 16.992851f, 4.501846f, 18.323343f, 5.254752f, 19.356216f),
                    PathNode.CurveTo(6.00766f, 20.389091f, 7.208838f, 20.99996f, 8.487f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.QuadTo(14.0f, 7.0f, 12.0f, 7.0f),
                    PathNode.QuadTo(10.0f, 7.0f, 9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.LineTo(11.5f, 11.0f),
                    PathNode.CurveTo(10.671573f, 11.0f, 10.0f, 11.671573f, 10.0f, 12.5f),
                    PathNode.CurveTo(10.0f, 13.328427f, 10.671573f, 14.0f, 11.5f, 14.0f),
                    PathNode.LineTo(12.5f, 14.0f),
                    PathNode.CurveTo(13.328427f, 14.0f, 14.0f, 14.671573f, 14.0f, 15.5f),
                    PathNode.CurveTo(14.0f, 16.328426f, 13.328427f, 17.0f, 12.5f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f)
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
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
        return _tax!!
    }

private var _tax: ImageVector? = null
