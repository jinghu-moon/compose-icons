package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVisa: ImageVector
    get() {
        if (_brandVisa != null) return _brandVisa!!
        _brandVisa = tablerOutlineIcon(
            name = "BrandVisa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.LineTo(17.5f, 15.0f)
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
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(10.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.5f, 15.0f),
                    PathNode.LineTo(7.0f, 9.0f)
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
                    PathNode.MoveTo(16.0f, 9.5f),
                    PathNode.CurveTo(16.0f, 9.223858f, 15.776142f, 9.0f, 15.5f, 9.0f),
                    PathNode.LineTo(14.75f, 9.0f),
                    PathNode.CurveTo(14.029f, 9.0f, 13.413f, 9.521f, 13.295f, 10.233f),
                    PathNode.LineTo(13.205f, 10.767f),
                    PathNode.CurveTo(13.153844f, 11.074116f, 13.240427f, 11.388182f, 13.441729f, 11.625699f),
                    PathNode.CurveTo(13.64303f, 11.863215f, 13.938653f, 12.000115f, 14.25f, 12.0f),
                    PathNode.CurveTo(14.561347f, 11.999885f, 14.85697f, 12.136785f, 15.058271f, 12.374301f),
                    PathNode.CurveTo(15.259573f, 12.611818f, 15.346156f, 12.925884f, 15.295f, 13.233f),
                    PathNode.LineTo(15.205f, 13.767f),
                    PathNode.CurveTo(15.086287f, 14.47823f, 14.471068f, 14.99958f, 13.75f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(12.723858f, 15.0f, 12.5f, 14.776142f, 12.5f, 14.5f)
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
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(20.7f, 14.0f)
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
        return _brandVisa!!
    }

private var _brandVisa: ImageVector? = null
