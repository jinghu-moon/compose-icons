package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnlyfans: ImageVector
    get() {
        if (_brandOnlyfans != null) return _brandOnlyfans!!
        _brandOnlyfans = tablerOutlineIcon(
            name = "BrandOnlyfans",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 6.0f),
                    PathNode.CurveTo(4.910149f, 6.0f, 2.0f, 8.91015f, 2.0f, 12.5f),
                    PathNode.CurveTo(2.0f, 16.089851f, 4.910149f, 19.0f, 8.5f, 19.0f),
                    PathNode.CurveTo(12.08985f, 19.0f, 15.0f, 16.089851f, 15.0f, 12.5f),
                    PathNode.CurveTo(15.0f, 8.91015f, 12.08985f, 6.0f, 8.5f, 6.0f)
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
                    PathNode.MoveTo(8.5f, 15.0f),
                    PathNode.CurveTo(7.119288f, 15.0f, 6.0f, 13.880712f, 6.0f, 12.5f),
                    PathNode.CurveTo(6.0f, 11.119288f, 7.119288f, 10.0f, 8.5f, 10.0f),
                    PathNode.CurveTo(9.880712f, 10.0f, 11.0f, 11.119288f, 11.0f, 12.5f),
                    PathNode.CurveTo(11.0f, 13.880712f, 9.880712f, 15.0f, 8.5f, 15.0f)
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
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.CurveTo(16.5f, 16.0f, 20.42f, 14.533f, 21.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.0f, 21.44f, 8.467f, 22.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(14.97f, 6.0f, 14.236f, 5.804f, 13.0f, 7.5f)
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
        return _brandOnlyfans!!
    }

private var _brandOnlyfans: ImageVector? = null
