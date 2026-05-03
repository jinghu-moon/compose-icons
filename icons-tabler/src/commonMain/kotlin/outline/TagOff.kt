package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagOff: ImageVector
    get() {
        if (_tagOff != null) return _tagOff!!
        _tagOff = tablerOutlineIcon(
            name = "TagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.149f, 7.144f),
                    PathNode.CurveTo(7.002459f, 7.285683f, 6.957054f, 7.502365f, 7.034387f, 7.69096f),
                    PathNode.CurveTo(7.11172f, 7.879555f, 7.296176f, 8.001984f, 7.5f, 8.0f),
                    PathNode.CurveTo(7.626702f, 8.000017f, 7.748646f, 7.951741f, 7.841f, 7.865f)
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
                    PathNode.MoveTo(3.883f, 3.875f),
                    PathNode.CurveTo(3.316965f, 4.437172f, 2.99906f, 5.202234f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 11.172f),
                    PathNode.CurveTo(3.000113f, 11.70239f, 3.210901f, 12.211015f, 3.586f, 12.586f),
                    PathNode.LineTo(11.296f, 20.296f),
                    PathNode.CurveTo(12.237134f, 21.236994f, 13.762866f, 21.236994f, 14.704f, 20.296f),
                    PathNode.LineTo(17.5f, 17.5f),
                    PathNode.MoveTo(19.505f, 15.495f),
                    PathNode.LineTo(20.295f, 14.705f),
                    PathNode.CurveTo(20.747498f, 14.252967f, 21.001745f, 13.6396f, 21.001745f, 13.0f),
                    PathNode.CurveTo(21.001745f, 12.3604f, 20.747498f, 11.747033f, 20.295f, 11.295f),
                    PathNode.LineTo(12.585f, 3.585f),
                    PathNode.CurveTo(12.210341f, 3.210758f, 11.702553f, 3.000378f, 11.173f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
