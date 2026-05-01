package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLeetcode: ImageVector
    get() {
        if (_brandLeetcode != null) return _brandLeetcode!!
        _brandLeetcode = tablerOutlineIcon(
            name = "BrandLeetcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(19.5f, 13.0f)
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
                    PathNode.MoveTo(9.424f, 7.268f),
                    PathNode.LineTo(14.423f, 2.269f)
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
                    PathNode.MoveTo(16.633f, 16.644f),
                    PathNode.LineTo(14.231f, 19.059f),
                    PathNode.CurveTo(13.632383f, 19.66137f, 12.81823f, 20.000095f, 11.969f, 20.000095f),
                    PathNode.CurveTo(11.11977f, 20.000095f, 10.305616f, 19.66137f, 9.707f, 19.059f),
                    PathNode.LineTo(5.937f, 15.272f),
                    PathNode.CurveTo(4.687652f, 14.014959f, 4.687652f, 11.985041f, 5.937f, 10.728f),
                    PathNode.LineTo(9.707f, 6.941f),
                    PathNode.CurveTo(10.305616f, 6.33863f, 11.11977f, 5.999905f, 11.969f, 5.999905f),
                    PathNode.CurveTo(12.81823f, 5.999905f, 13.632383f, 6.33863f, 14.231f, 6.941f),
                    PathNode.LineTo(16.533f, 9.254f)
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
        return _brandLeetcode!!
    }

private var _brandLeetcode: ImageVector? = null
