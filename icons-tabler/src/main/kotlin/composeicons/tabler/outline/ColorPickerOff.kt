package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorPickerOff: ImageVector
    get() {
        if (_colorPickerOff != null) return _colorPickerOff!!
        _colorPickerOff = tablerOutlineIcon(
            name = "ColorPickerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(17.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(15.699f, 4.301f),
                    PathNode.CurveTo(16.087843f, 3.919857f, 16.710157f, 3.919857f, 17.099f, 4.301f),
                    PathNode.LineTo(19.699f, 6.901f),
                    PathNode.CurveTo(20.080141f, 7.289844f, 20.080141f, 7.912157f, 19.699f, 8.301f),
                    PathNode.LineTo(15.997f, 12.003f),
                    PathNode.MoveTo(13.997f, 14.003f),
                    PathNode.LineTo(7.997f, 20.003f),
                    PathNode.LineTo(3.997f, 20.003f),
                    PathNode.LineTo(3.997f, 16.003f),
                    PathNode.LineTo(9.997f, 10.003f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _colorPickerOff!!
    }

private var _colorPickerOff: ImageVector? = null
