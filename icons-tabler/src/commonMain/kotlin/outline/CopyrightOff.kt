package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyrightOff: ImageVector
    get() {
        if (_copyrightOff != null) return _copyrightOff!!
        _copyrightOff = tablerOutlineIcon(
            name = "CopyrightOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 9.75f),
                    PathNode.CurveTo(13.78619f, 9.561877f, 13.546813f, 9.404985f, 13.289f, 9.284f),
                    PathNode.MoveTo(9.879f, 9.88f),
                    PathNode.CurveTo(8.722054f, 11.03314f, 8.703362f, 12.900937f, 9.837f, 14.077f),
                    PathNode.CurveTo(10.955432f, 15.237965f, 12.7891f, 15.314166f, 14.0f, 14.25f)
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
                    PathNode.MoveTo(20.042f, 16.045f),
                    PathNode.CurveTo(21.789572f, 12.576373f, 21.11484f, 8.377954f, 18.368443f, 5.631557f),
                    PathNode.CurveTo(15.622046f, 2.885161f, 11.423627f, 2.210428f, 7.955f, 3.958f),
                    PathNode.MoveTo(5.637f, 5.635f),
                    PathNode.CurveTo(3.332051f, 7.90183f, 2.419973f, 11.230749f, 3.247604f, 14.355863f),
                    PathNode.CurveTo(4.075236f, 17.480976f, 6.515411f, 19.92211f, 9.6402f, 20.750969f),
                    PathNode.CurveTo(12.764988f, 21.579828f, 16.094265f, 20.669058f, 18.362f, 18.365f)
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
        return _copyrightOff!!
    }

private var _copyrightOff: ImageVector? = null
