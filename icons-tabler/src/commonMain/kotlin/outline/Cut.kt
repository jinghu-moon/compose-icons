package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cut: ImageVector
    get() {
        if (_cut != null) return _cut!!
        _cut = tablerOutlineIcon(
            name = "Cut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 18.656855f, 5.343146f, 20.0f, 7.0f, 20.0f),
                    PathNode.CurveTo(8.656855f, 20.0f, 10.0f, 18.656855f, 10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 15.343145f, 8.656855f, 14.0f, 7.0f, 14.0f),
                    PathNode.CurveTo(5.343146f, 14.0f, 4.0f, 15.343145f, 4.0f, 17.0f)
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
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 18.656855f, 15.343145f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(18.656855f, 20.0f, 20.0f, 18.656855f, 20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 15.343145f, 18.656855f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(15.343145f, 14.0f, 14.0f, 15.343145f, 14.0f, 17.0f)
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
                    PathNode.MoveTo(9.15f, 14.85f),
                    PathNode.LineTo(18.0f, 4.0f)
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
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(14.85f, 14.85f)
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
        return _cut!!
    }

private var _cut: ImageVector? = null
