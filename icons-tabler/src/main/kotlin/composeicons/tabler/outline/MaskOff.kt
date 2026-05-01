package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MaskOff: ImageVector
    get() {
        if (_maskOff != null) return _maskOff!!
        _maskOff = tablerOutlineIcon(
            name = "MaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.42f, 19.41f),
                    PathNode.CurveTo(19.044203f, 19.78804f, 18.533045f, 20.000422f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 5.446f, 4.225f, 4.945f, 4.588f, 4.583f),
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 16.0f)
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
                    PathNode.MoveTo(9.885f, 9.872f),
                    PathNode.CurveTo(9.117301f, 10.628219f, 8.814166f, 11.738085f, 9.090864f, 12.779557f),
                    PathNode.CurveTo(9.367563f, 13.821031f, 10.181582f, 14.63409f, 11.22338f, 14.909562f),
                    PathNode.CurveTo(12.265179f, 15.185033f, 13.374687f, 14.880589f, 14.13f, 14.112f),
                    PathNode.MoveTo(14.712f, 10.716f),
                    PathNode.CurveTo(14.412934f, 10.086321f, 13.904716f, 9.579871f, 13.274f, 9.283f)
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
        return _maskOff!!
    }

private var _maskOff: ImageVector? = null
