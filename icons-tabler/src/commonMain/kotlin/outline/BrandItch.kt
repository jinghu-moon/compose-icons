package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandItch: ImageVector
    get() {
        if (_brandItch != null) return _brandItch!!
        _brandItch = tablerOutlineIcon(
            name = "BrandItch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 9.087f, 3.078f, 10.0f, 4.0f, 10.0f),
                    PathNode.CurveTo(5.107f, 10.0f, 6.0f, 9.09f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 9.09f, 6.893f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(9.107f, 10.0f, 10.0f, 9.09f, 10.0f, 8.0f),
                    PathNode.CurveTo(10.0f, 9.09f, 10.893f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.107f, 10.0f, 14.0f, 9.09f, 14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 9.09f, 14.893f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(17.107f, 10.0f, 18.0f, 9.09f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 9.09f, 18.893f, 10.0f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.922f, 10.0f, 22.0f, 9.087f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(21.991f, 6.725f, 21.462f, 6.036f, 20.412f, 4.932f),
                    PathNode.CurveTo(19.845556f, 4.336706f, 19.059725f, 3.999817f, 18.238f, 4.0f),
                    PathNode.LineTo(5.762f, 4.0f),
                    PathNode.CurveTo(4.940274f, 3.999817f, 4.154443f, 4.336706f, 3.588f, 4.932f),
                    PathNode.CurveTo(2.538f, 6.036f, 2.008f, 6.725f, 2.0f, 7.0f)
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
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.CurveTo(3.883f, 16.28f, 4.154f, 19.765f, 4.814f, 20.456f),
                    PathNode.CurveTo(6.348f, 20.823f, 9.169f, 20.991f, 12.0f, 20.992f),
                    PathNode.CurveTo(14.83f, 20.991f, 17.652f, 20.823f, 19.186f, 20.456f),
                    PathNode.CurveTo(20.176f, 19.419f, 20.084f, 10.897f, 20.0f, 10.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.LineTo(12.0f, 18.0f)
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
        return _brandItch!!
    }

private var _brandItch: ImageVector? = null
