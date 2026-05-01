package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) return _paintbrush!!
        _paintbrush = lucideOutlineIcon(
            name = "Paintbrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.622f, 17.897f),
                    PathNode.LineTo(3.942f, 14.984f)
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
                    PathNode.MoveTo(18.376f, 2.622f),
                    PathNode.CurveTo(19.204979f, 1.793021f, 20.54902f, 1.793021f, 21.378f, 2.622f),
                    PathNode.CurveTo(22.20698f, 3.45098f, 22.20698f, 4.795021f, 21.378f, 5.624f),
                    PathNode.LineTo(17.36f, 9.643f),
                    PathNode.CurveTo(17.164808f, 9.83825f, 17.164808f, 10.15475f, 17.36f, 10.35f),
                    PathNode.LineTo(18.304f, 11.294f),
                    PathNode.CurveTo(19.244993f, 12.235134f, 19.244993f, 13.760865f, 18.304f, 14.702f),
                    PathNode.LineTo(17.36f, 15.646f),
                    PathNode.CurveTo(17.16475f, 15.841191f, 16.84825f, 15.841191f, 16.653f, 15.646f),
                    PathNode.LineTo(8.354f, 7.348f),
                    PathNode.CurveTo(8.158809f, 7.15275f, 8.158809f, 6.83625f, 8.354f, 6.641f),
                    PathNode.LineTo(9.298f, 5.697f),
                    PathNode.CurveTo(10.239135f, 4.756006f, 11.764866f, 4.756006f, 12.706f, 5.697f),
                    PathNode.LineTo(13.65f, 6.641f),
                    PathNode.CurveTo(13.84525f, 6.836191f, 14.16175f, 6.836191f, 14.357f, 6.641f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.CurveTo(7.196f, 10.71f, 5.03f, 11.46f, 2.417f, 11.948f),
                    PathNode.CurveTo(2.240637f, 11.980198f, 2.09439f, 12.103143f, 2.032366f, 12.271349f),
                    PathNode.CurveTo(1.970341f, 12.439556f, 2.00176f, 12.628014f, 2.115f, 12.767f),
                    PathNode.LineTo(9.435f, 21.65f),
                    PathNode.CurveTo(9.74044f, 21.974407f, 10.223663f, 22.057594f, 10.62f, 21.854f),
                    PathNode.CurveTo(12.735f, 20.405f, 16.0f, 16.792f, 16.0f, 15.0f)
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
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
