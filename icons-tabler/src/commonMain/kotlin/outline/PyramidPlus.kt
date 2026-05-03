package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PyramidPlus: ImageVector
    get() {
        if (_pyramidPlus != null) return _pyramidPlus!!
        _pyramidPlus = tablerOutlineIcon(
            name = "PyramidPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.719f, 11.985f),
                    PathNode.LineTo(12.83f, 2.446f),
                    PathNode.CurveTo(12.644835f, 2.167402f, 12.332519f, 1.999971f, 11.998f, 1.999971f),
                    PathNode.CurveTo(11.663482f, 1.999971f, 11.351165f, 2.167402f, 11.166f, 2.446f),
                    PathNode.LineTo(2.626f, 16.282f),
                    PathNode.CurveTo(2.4676f, 16.521452f, 2.419171f, 16.817217f, 2.492933f, 17.094683f),
                    PathNode.CurveTo(2.566694f, 17.372147f, 2.755602f, 17.604818f, 3.012f, 17.734f),
                    PathNode.LineTo(11.104f, 21.788f),
                    PathNode.CurveTo(11.666871f, 22.070524f, 12.33013f, 22.070524f, 12.893f, 21.788f),
                    PathNode.LineTo(13.042f, 21.714f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _pyramidPlus!!
    }

private var _pyramidPlus: ImageVector? = null
