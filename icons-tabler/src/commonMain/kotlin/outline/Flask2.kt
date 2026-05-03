package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flask2: ImageVector
    get() {
        if (_flask2 != null) return _flask2!!
        _flask2 = tablerOutlineIcon(
            name = "Flask2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.1f, 15.0f),
                    PathNode.LineTo(17.9f, 15.0f)
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
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 10.342f),
                    PathNode.CurveTo(16.145233f, 11.099591f, 17.67745f, 13.005324f, 17.956667f, 15.263201f),
                    PathNode.CurveTo(18.235882f, 17.521078f, 17.21406f, 19.74265f, 15.318f, 21.0f),
                    PathNode.LineTo(8.683f, 21.0f),
                    PathNode.CurveTo(6.785732f, 19.743114f, 5.762885f, 17.521008f, 6.041933f, 15.262352f),
                    PathNode.CurveTo(6.32098f, 13.003696f, 7.853882f, 11.097342f, 10.0f, 10.34f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
        return _flask2!!
    }

private var _flask2: ImageVector? = null
