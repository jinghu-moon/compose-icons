package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMysql: ImageVector
    get() {
        if (_brandMysql != null) return _brandMysql!!
        _brandMysql = tablerOutlineIcon(
            name = "BrandMysql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 21.0f),
                    PathNode.CurveTo(11.573f, 19.974f, 9.41f, 17.146f, 9.0f, 15.0f),
                    PathNode.CurveTo(8.514f, 15.77f, 7.499f, 17.0f, 7.0f, 17.0f),
                    PathNode.CurveTo(5.501f, 16.112f, 6.426f, 13.027f, 7.0f, 11.0f),
                    PathNode.CurveTo(5.404f, 9.567f, 4.532f, 8.542f, 4.5f, 7.0f),
                    PathNode.CurveTo(1.15f, 3.56f, 4.056f, 1.73f, 7.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(16.482f, 4.5f, 14.421f, 12.07f, 17.0f, 15.5f),
                    PathNode.CurveTo(19.295f, 16.022f, 20.665f, 17.754f, 22.0f, 19.0f),
                    PathNode.CurveTo(19.914f, 18.8f, 19.216f, 18.656f, 18.5f, 19.0f),
                    PathNode.CurveTo(18.978f, 20.64f, 20.623f, 21.2f, 22.0f, 22.0f)
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
                    PathNode.MoveTo(9.0f, 7.0f),
                    PathNode.LineTo(9.01f, 7.0f)
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
        return _brandMysql!!
    }

private var _brandMysql: ImageVector? = null
