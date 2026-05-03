package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinOff: ImageVector
    get() {
        if (_mapPinOff != null) return _mapPinOff!!
        _mapPinOff = lucideOutlineIcon(
            name = "MapPinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.75f, 7.09f),
                    PathNode.CurveTo(13.810104f, 7.362089f, 14.637911f, 8.189896f, 14.91f, 9.25f)
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
                    PathNode.MoveTo(17.072f, 17.072f),
                    PathNode.CurveTo(15.438f, 19.242f, 13.545f, 20.984f, 12.601f, 21.799f),
                    PathNode.CurveTo(12.245038f, 22.066668f, 11.754962f, 22.066668f, 11.399f, 21.799f),
                    PathNode.CurveTo(9.539f, 20.193f, 4.0f, 14.993f, 4.0f, 10.0f),
                    PathNode.CurveTo(3.999883f, 8.366862f, 4.499595f, 6.772807f, 5.432f, 5.432f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(8.475f, 2.818f),
                    PathNode.CurveTo(10.954639f, 1.600888f, 13.886734f, 1.749063f, 16.23104f, 3.209957f),
                    PathNode.CurveTo(18.575344f, 4.67085f, 20.000162f, 7.237759f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 11.183f, 19.69f, 12.377f, 19.19f, 13.533f)
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
                    PathNode.MoveTo(9.13f, 9.13f),
                    PathNode.CurveTo(8.809817f, 10.18869f, 9.098134f, 11.337677f, 9.880228f, 12.119772f),
                    PathNode.CurveTo(10.662323f, 12.901866f, 11.81131f, 13.190183f, 12.87f, 12.87f)
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
        return _mapPinOff!!
    }

private var _mapPinOff: ImageVector? = null
