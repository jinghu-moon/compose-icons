package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FirstAidKitOff: ImageVector
    get() {
        if (_firstAidKitOff != null) return _firstAidKitOff!!
        _firstAidKitOff = tablerOutlineIcon(
            name = "FirstAidKitOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.595f, 4.577f),
                    PathNode.CurveTo(8.969239f, 4.207397f, 9.474014f, 4.000098f, 10.0f, 4.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.CurveTo(15.104569f, 4.0f, 16.0f, 4.895431f, 16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 8.0f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.10457f, 8.0f, 20.0f, 8.895431f, 20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.424f, 19.405f),
                    PathNode.CurveTo(19.048054f, 19.78586f, 18.535154f, 20.00017f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 8.895431f, 4.895431f, 8.0f, 6.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _firstAidKitOff!!
    }

private var _firstAidKitOff: ImageVector? = null
