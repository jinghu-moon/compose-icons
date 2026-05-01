package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Asset: ImageVector
    get() {
        if (_asset != null) return _asset!!
        _asset = tablerOutlineIcon(
            name = "Asset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 18.31371f, 5.686292f, 21.0f, 9.0f, 21.0f),
                    PathNode.CurveTo(12.313708f, 21.0f, 15.0f, 18.31371f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 11.686292f, 12.313708f, 9.0f, 9.0f, 9.0f),
                    PathNode.CurveTo(5.686292f, 9.0f, 3.0f, 11.686292f, 3.0f, 15.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 16.10457f, 7.895431f, 17.0f, 9.0f, 17.0f),
                    PathNode.CurveTo(10.104569f, 17.0f, 11.0f, 16.10457f, 11.0f, 15.0f),
                    PathNode.CurveTo(11.0f, 13.895431f, 10.104569f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(7.895431f, 13.0f, 7.0f, 13.895431f, 7.0f, 15.0f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 6.10457f, 17.89543f, 7.0f, 19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 6.10457f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(17.89543f, 3.0f, 17.0f, 3.895431f, 17.0f, 5.0f)
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
                    PathNode.MoveTo(14.218f, 17.975f),
                    PathNode.LineTo(20.837f, 5.801f)
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
                    PathNode.MoveTo(6.079f, 9.756f),
                    PathNode.LineTo(18.296f, 3.125f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 16.10457f, 7.895431f, 17.0f, 9.0f, 17.0f),
                    PathNode.CurveTo(10.104569f, 17.0f, 11.0f, 16.10457f, 11.0f, 15.0f),
                    PathNode.CurveTo(11.0f, 13.895431f, 10.104569f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(7.895431f, 13.0f, 7.0f, 13.895431f, 7.0f, 15.0f)
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
        return _asset!!
    }

private var _asset: ImageVector? = null
