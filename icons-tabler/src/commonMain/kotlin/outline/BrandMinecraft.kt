package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMinecraft: ImageVector
    get() {
        if (_brandMinecraft != null) return _brandMinecraft!!
        _brandMinecraft = tablerOutlineIcon(
            name = "BrandMinecraft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 16.008f),
                    PathNode.LineTo(21.0f, 7.99f),
                    PathNode.CurveTo(20.998756f, 7.279733f, 20.617168f, 6.624546f, 20.0f, 6.273f),
                    PathNode.LineTo(13.0f, 2.265f),
                    PathNode.CurveTo(12.380326f, 1.911002f, 11.619674f, 1.911002f, 11.0f, 2.265f),
                    PathNode.LineTo(4.0f, 6.273f),
                    PathNode.CurveTo(3.381f, 6.628f, 3.0f, 7.283f, 3.0f, 7.991f),
                    PathNode.LineTo(3.0f, 16.009f),
                    PathNode.CurveTo(3.0f, 16.718f, 3.381f, 17.372f, 4.0f, 17.726f),
                    PathNode.LineTo(11.0f, 21.734f),
                    PathNode.CurveTo(11.62f, 22.088f, 12.38f, 22.088f, 13.0f, 21.734f),
                    PathNode.LineTo(20.0f, 17.726f),
                    PathNode.CurveTo(20.619f, 17.371f, 21.0f, 16.716f, 21.0f, 16.008f)
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.LineTo(20.73f, 6.96f)
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
                    PathNode.MoveTo(3.27f, 6.96f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(15.003f, 15.332f),
                    PathNode.MoveTo(18.003f, 13.665f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(3.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 17.0f),
                    PathNode.LineTo(18.0f, 15.33f),
                    PathNode.LineTo(18.0f, 12.33f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 17.0f)
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
        return _brandMinecraft!!
    }

private var _brandMinecraft: ImageVector? = null
