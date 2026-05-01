package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSolidjs: ImageVector
    get() {
        if (_brandSolidjs != null) return _brandSolidjs!!
        _brandSolidjs = tablerOutlineIcon(
            name = "BrandSolidjs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 17.5f),
                    PathNode.CurveTo(6.667f, 20.5f, 10.0f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(14.5f, 22.0f, 16.0f, 20.5f, 16.0f, 18.5f),
                    PathNode.CurveTo(16.0f, 16.5f, 14.5f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 15.0f, 6.667f, 15.833f, 2.0f, 17.5f)
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
                    PathNode.MoveTo(5.0f, 13.5f),
                    PathNode.CurveTo(9.667f, 11.833f, 13.0f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(17.5f, 11.0f, 19.0f, 12.5f, 19.0f, 14.5f),
                    PathNode.CurveTo(19.0f, 15.238f, 18.796f, 15.908f, 18.412f, 16.46f),
                    PathNode.LineTo(15.529f, 20.285f)
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
                    PathNode.MoveTo(22.0f, 6.5f),
                    PathNode.CurveTo(18.0f, 3.5f, 14.0f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(9.96f, 2.0f, 9.382f, 2.463f, 8.581f, 3.545f)
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
                    PathNode.MoveTo(2.0f, 17.5f),
                    PathNode.LineTo(5.0f, 13.5f)
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
                    PathNode.MoveTo(22.0f, 6.5f),
                    PathNode.LineTo(19.0f, 10.5f)
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
                    PathNode.MoveTo(8.581f, 3.545f),
                    PathNode.LineTo(5.628f, 7.256f)
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
                    PathNode.MoveTo(7.416f, 12.662f),
                    PathNode.CurveTo(5.906f, 12.186f, 5.0f, 11.183f, 5.0f, 9.5f),
                    PathNode.CurveTo(5.0f, 7.0f, 6.5f, 6.0f, 9.0f, 6.0f),
                    PathNode.CurveTo(10.688f, 6.0f, 14.087f, 7.068f, 17.198f, 9.204f),
                    PathNode.CurveTo(17.80283f, 9.63018f, 18.403524f, 10.062201f, 19.0f, 10.5f),
                    PathNode.LineTo(16.698f, 11.285f)
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
        return _brandSolidjs!!
    }

private var _brandSolidjs: ImageVector? = null
