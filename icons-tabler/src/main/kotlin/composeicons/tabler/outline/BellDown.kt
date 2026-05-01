package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellDown: ImageVector
    get() {
        if (_bellDown != null) return _bellDown!!
        _bellDown = tablerOutlineIcon(
            name = "BellDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(5.105114f, 16.374203f, 5.847386f, 15.260797f, 6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.121369f, 8.414246f, 7.659831f, 6.106554f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 10.895431f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.104569f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f),
                    PathNode.CurveTo(16.34017f, 6.106554f, 17.878632f, 8.414246f, 18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(8.999983f, 18.886267f, 9.39184f, 19.727186f, 10.07047f, 20.297213f),
                    PathNode.CurveTo(10.7491f, 20.867237f, 11.645045f, 21.108028f, 12.518f, 20.955f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
                    PathNode.MoveTo(22.0f, 19.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.LineTo(16.0f, 19.0f)
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
        return _bellDown!!
    }

private var _bellDown: ImageVector? = null
