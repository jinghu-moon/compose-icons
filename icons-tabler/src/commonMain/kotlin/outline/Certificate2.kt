package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Certificate2: ImageVector
    get() {
        if (_certificate2 != null) return _certificate2!!
        _certificate2 = tablerOutlineIcon(
            name = "Certificate2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 16.656855f, 10.343145f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.656855f, 18.0f, 15.0f, 16.656855f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 13.343145f, 13.656855f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(10.343145f, 12.0f, 9.0f, 13.343145f, 9.0f, 15.0f)
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
                    PathNode.MoveTo(10.0f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f)
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
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.LineTo(14.0f, 18.0f)
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
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(6.895431f, 19.0f, 6.0f, 18.10457f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.895431f, 6.895431f, 3.0f, 8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.10457f, 3.0f, 18.0f, 3.895431f, 18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 18.10457f, 17.10457f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(14.0f, 19.0f)
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
        return _certificate2!!
    }

private var _certificate2: ImageVector? = null
