package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BleachChlorine: ImageVector
    get() {
        if (_bleachChlorine != null) return _bleachChlorine!!
        _bleachChlorine = tablerOutlineIcon(
            name = "BleachChlorine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.662535f, 18.995352f, 20.279768f, 18.662897f, 20.648209f, 18.112238f),
                    PathNode.CurveTo(21.01665f, 17.561579f, 21.088472f, 16.864195f, 20.84f, 16.25f),
                    PathNode.LineTo(13.74f, 4.0f),
                    PathNode.CurveTo(13.387762f, 3.363368f, 12.717579f, 2.968246f, 11.99f, 2.968246f),
                    PathNode.CurveTo(11.262421f, 2.968246f, 10.592237f, 3.363368f, 10.24f, 4.0f),
                    PathNode.LineTo(3.14f, 16.25f),
                    PathNode.CurveTo(2.896396f, 16.849735f, 2.958121f, 17.530281f, 3.305652f, 18.076405f),
                    PathNode.CurveTo(3.653182f, 18.622524f, 4.243538f, 18.96667f, 4.89f, 19.0f)
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
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(8.895431f, 12.0f, 8.0f, 12.895431f, 8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 15.104569f, 8.895431f, 16.0f, 10.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
        return _bleachChlorine!!
    }

private var _bleachChlorine: ImageVector? = null
