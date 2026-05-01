package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sofa: ImageVector
    get() {
        if (_sofa != null) return _sofa!!
        _sofa = tablerOutlineIcon(
            name = "Sofa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.CurveTo(5.10457f, 11.0f, 6.0f, 11.895431f, 6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.0f, 11.895431f, 18.89543f, 11.0f, 20.0f, 11.0f),
                    PathNode.CurveTo(21.10457f, 11.0f, 22.0f, 11.895431f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 18.552284f, 21.552284f, 19.0f, 21.0f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.447715f, 19.0f, 2.0f, 18.552284f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 11.895431f, 2.895431f, 11.0f, 4.0f, 11.0f)
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
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 6.343146f, 5.343146f, 5.0f, 7.0f, 5.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(18.656855f, 5.0f, 20.0f, 6.343146f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 14.0f)
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
        return _sofa!!
    }

private var _sofa: ImageVector? = null
