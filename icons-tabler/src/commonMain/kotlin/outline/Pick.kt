package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pick: ImageVector
    get() {
        if (_pick != null) return _pick!!
        _pick = tablerOutlineIcon(
            name = "Pick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 8.0f),
                    PathNode.LineTo(3.617f, 17.418f),
                    PathNode.CurveTo(3.221831f, 17.810534f, 2.999604f, 18.344507f, 2.999604f, 18.9015f),
                    PathNode.CurveTo(2.999604f, 19.458492f, 3.221831f, 19.992466f, 3.617f, 20.385f),
                    PathNode.CurveTo(4.440084f, 21.203693f, 5.769916f, 21.203693f, 6.593f, 20.385f),
                    PathNode.LineTo(16.0f, 11.0f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(13.586f, 3.0f),
                    PathNode.CurveTo(13.851194f, 3.000057f, 14.105507f, 3.105451f, 14.293f, 3.293f),
                    PathNode.LineTo(20.707f, 9.707f),
                    PathNode.CurveTo(20.89455f, 9.894493f, 20.999943f, 10.148806f, 21.0f, 10.414f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.0f, 16.10457f, 20.10457f, 17.0f, 19.0f, 17.0f),
                    PathNode.CurveTo(17.89543f, 17.0f, 17.0f, 16.10457f, 17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(7.895431f, 7.0f, 7.0f, 6.10457f, 7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 7.895431f, 3.0f, 9.0f, 3.0f)
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
        return _pick!!
    }

private var _pick: ImageVector? = null
