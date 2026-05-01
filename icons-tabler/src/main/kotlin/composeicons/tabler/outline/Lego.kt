package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = tablerOutlineIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 11.0f),
                    PathNode.LineTo(9.51f, 11.0f)
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
                    PathNode.MoveTo(14.5f, 11.0f),
                    PathNode.LineTo(14.51f, 11.0f)
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
                    PathNode.MoveTo(9.5f, 15.0f),
                    PathNode.CurveTo(10.158311f, 15.671886f, 11.05936f, 16.05051f, 12.0f, 16.05051f),
                    PathNode.CurveTo(12.94064f, 16.05051f, 13.841689f, 15.671886f, 14.5f, 15.0f)
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
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(18.656855f, 5.0f, 20.0f, 6.343146f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 18.656855f, 18.656855f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(5.343146f, 20.0f, 4.0f, 18.656855f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 6.343146f, 5.343146f, 5.0f, 7.0f, 5.0f)
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
        return _lego!!
    }

private var _lego: ImageVector? = null
