package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) return _hexagonNumber7!!
        _hexagonNumber7 = tablerOutlineIcon(
            name = "HexagonNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.02f, 6.858f),
                    PathNode.CurveTo(19.645018f, 7.218807f, 20.027178f, 7.888352f, 20.02f, 8.61f),
                    PathNode.LineTo(20.02f, 15.165f),
                    PathNode.CurveTo(20.02f, 15.893f, 19.625f, 16.565f, 18.988f, 16.918f),
                    PathNode.LineTo(12.971f, 20.762f),
                    PathNode.CurveTo(12.365546f, 21.099594f, 11.628453f, 21.099594f, 11.023f, 20.762f),
                    PathNode.LineTo(5.007f, 16.918f),
                    PathNode.CurveTo(4.369646f, 16.56548f, 3.974321f, 15.894347f, 3.975f, 15.166f),
                    PathNode.LineTo(3.975f, 8.61f),
                    PathNode.CurveTo(3.975f, 7.882f, 4.37f, 7.21f, 5.007f, 6.857f),
                    PathNode.LineTo(11.024f, 3.275f),
                    PathNode.CurveTo(11.646045f, 2.93005f, 12.401955f, 2.93005f, 13.024f, 3.275f),
                    PathNode.LineTo(19.041f, 6.858f),
                    PathNode.LineTo(19.012f, 6.858f),
                    PathNode.LineTo(19.02f, 6.858f)
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
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
