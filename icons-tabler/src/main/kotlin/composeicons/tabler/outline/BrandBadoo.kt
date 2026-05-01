package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBadoo: ImageVector
    get() {
        if (_brandBadoo != null) return _brandBadoo!!
        _brandBadoo = tablerOutlineIcon(
            name = "BrandBadoo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 9.43f),
                    PathNode.CurveTo(22.0f, 15.268f, 17.523f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(6.477f, 20.0f, 2.0f, 15.338f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 6.833f, 3.83f, 4.49f, 6.322f, 4.071f),
                    PathNode.CurveTo(8.814f, 3.653f, 11.222f, 5.463f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.768f, 5.46f, 15.177f, 3.646f, 17.668f, 4.069f),
                    PathNode.CurveTo(20.163f, 4.486f, 22.0f, 6.759f, 22.0f, 9.429f)
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
                    PathNode.MoveTo(7.5f, 10.0f),
                    PathNode.CurveTo(7.5f, 12.761f, 9.515f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(14.485f, 15.0f, 16.5f, 12.761f, 16.5f, 10.0f)
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
        return _brandBadoo!!
    }

private var _brandBadoo: ImageVector? = null
