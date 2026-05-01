package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleHome: ImageVector
    get() {
        if (_brandGoogleHome != null) return _brandGoogleHome!!
        _brandGoogleHome = tablerOutlineIcon(
            name = "BrandGoogleHome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.072f, 21.0f),
                    PathNode.LineTo(4.928f, 21.0f),
                    PathNode.CurveTo(3.863195f, 21.0f, 3.0f, 20.136805f, 3.0f, 19.072f),
                    PathNode.LineTo(3.0f, 12.215f),
                    PathNode.CurveTo(3.0f, 11.703f, 3.203f, 11.215f, 3.566f, 10.85f),
                    PathNode.LineTo(10.636f, 3.787f),
                    PathNode.CurveTo(10.997586f, 3.425309f, 11.488066f, 3.222104f, 11.9995f, 3.222104f),
                    PathNode.CurveTo(12.510935f, 3.222104f, 13.001413f, 3.425309f, 13.363f, 3.787f),
                    PathNode.LineTo(20.434f, 10.85f),
                    PathNode.CurveTo(20.797f, 11.212f, 21.0f, 11.703f, 21.0f, 12.215f),
                    PathNode.LineTo(21.0f, 19.072f),
                    PathNode.CurveTo(21.0f, 20.136805f, 20.136805f, 21.0f, 19.072f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(14.8f, 5.2f),
                    PathNode.LineTo(3.0f, 17.0f)
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
                    PathNode.MoveTo(7.0f, 17.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _brandGoogleHome!!
    }

private var _brandGoogleHome: ImageVector? = null
