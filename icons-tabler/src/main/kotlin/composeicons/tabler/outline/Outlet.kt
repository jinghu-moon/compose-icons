package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Outlet: ImageVector
    get() {
        if (_outlet != null) return _outlet!!
        _outlet = tablerOutlineIcon(
            name = "Outlet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 4.895431f, 4.895431f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 6.0f)
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
                    PathNode.MoveTo(8.5f, 12.0f),
                    PathNode.CurveTo(8.5f, 12.276142f, 8.723858f, 12.5f, 9.0f, 12.5f),
                    PathNode.CurveTo(9.276142f, 12.5f, 9.5f, 12.276142f, 9.5f, 12.0f),
                    PathNode.CurveTo(9.5f, 11.723858f, 9.276142f, 11.5f, 9.0f, 11.5f),
                    PathNode.CurveTo(8.723858f, 11.5f, 8.5f, 11.723858f, 8.5f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(14.5f, 12.0f),
                    PathNode.CurveTo(14.5f, 12.276142f, 14.723858f, 12.5f, 15.0f, 12.5f),
                    PathNode.CurveTo(15.276142f, 12.5f, 15.5f, 12.276142f, 15.5f, 12.0f),
                    PathNode.CurveTo(15.5f, 11.723858f, 15.276142f, 11.5f, 15.0f, 11.5f),
                    PathNode.CurveTo(14.723858f, 11.5f, 14.5f, 11.723858f, 14.5f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _outlet!!
    }

private var _outlet: ImageVector? = null
