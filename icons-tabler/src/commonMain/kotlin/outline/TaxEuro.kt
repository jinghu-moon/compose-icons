package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TaxEuro: ImageVector
    get() {
        if (_taxEuro != null) return _taxEuro!!
        _taxEuro = tablerOutlineIcon(
            name = "TaxEuro",
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
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.QuadTo(14.0f, 7.0f, 12.0f, 7.0f),
                    PathNode.QuadTo(10.0f, 7.0f, 9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 11.172f),
                    PathNode.CurveTo(12.756673f, 10.73182f, 11.37169f, 11.155329f, 10.587177f, 12.215592f),
                    PathNode.CurveTo(9.802665f, 13.275856f, 9.802665f, 14.724144f, 10.587177f, 15.784408f),
                    PathNode.CurveTo(11.37169f, 16.844671f, 12.756673f, 17.268179f, 14.0f, 16.828f)
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
        return _taxEuro!!
    }

private var _taxEuro: ImageVector? = null
