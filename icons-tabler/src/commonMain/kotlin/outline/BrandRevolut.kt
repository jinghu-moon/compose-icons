package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRevolut: ImageVector
    get() {
        if (_brandRevolut != null) return _brandRevolut!!
        _brandRevolut = tablerOutlineIcon(
            name = "BrandRevolut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 10.0f)
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
                    PathNode.MoveTo(14.5f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.LineTo(14.4f, 7.0f),
                    PathNode.CurveTo(15.228427f, 7.0f, 15.9f, 7.671573f, 15.9f, 8.5f),
                    PathNode.CurveTo(15.9f, 9.328427f, 15.228427f, 10.0f, 14.4f, 10.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(14.5f, 13.0f),
                    PathNode.CurveTo(16.98528f, 13.0f, 19.0f, 10.985281f, 19.0f, 8.5f),
                    PathNode.CurveTo(19.0f, 6.014719f, 16.98528f, 4.0f, 14.5f, 4.0f)
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
        return _brandRevolut!!
    }

private var _brandRevolut: ImageVector? = null
