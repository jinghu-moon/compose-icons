package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SectionSign: ImageVector
    get() {
        if (_sectionSign != null) return _sectionSign!!
        _sectionSign = tablerOutlineIcon(
            name = "SectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.172f, 19.0f),
                    PathNode.CurveTo(9.680566f, 20.438442f, 11.187747f, 21.266085f, 12.67444f, 20.923304f),
                    PathNode.CurveTo(14.161134f, 20.580524f, 15.153771f, 19.17651f, 14.981167f, 17.660606f),
                    PathNode.CurveTo(14.808563f, 16.144703f, 13.525698f, 14.999783f, 12.0f, 15.0f)
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
                    PathNode.MoveTo(14.83f, 5.0f),
                    PathNode.CurveTo(14.321519f, 3.561798f, 12.814731f, 2.734154f, 11.32821f, 3.076547f),
                    PathNode.CurveTo(9.841688f, 3.418939f, 8.848781f, 4.822343f, 9.020682f, 6.338069f),
                    PathNode.CurveTo(9.192584f, 7.853796f, 10.474557f, 8.9992f, 12.0f, 9.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
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
        return _sectionSign!!
    }

private var _sectionSign: ImageVector? = null
