package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTesla: ImageVector
    get() {
        if (_brandTesla != null) return _brandTesla!!
        _brandTesla = tablerOutlineIcon(
            name = "BrandTesla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(17.359f, 10.0f, 18.0f, 10.0f, 18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 11.0f, 19.18f, 9.255f, 20.0f, 8.0f),
                    PathNode.CurveTo(16.923f, 6.536f, 14.0f, 7.0f, 14.0f, 7.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(10.0f, 7.0f, 7.077f, 6.536f, 4.0f, 8.0f),
                    PathNode.CurveTo(4.82f, 9.255f, 6.0f, 11.0f, 6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 10.0f, 6.744f, 10.0f, 9.0f, 10.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(14.886f, 3.0f, 9.114f, 3.0f, 4.0f, 5.0f)
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
        return _brandTesla!!
    }

private var _brandTesla: ImageVector? = null
