package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownRightCircle: ImageVector
    get() {
        if (_arrowDownRightCircle != null) return _arrowDownRightCircle!!
        _arrowDownRightCircle = tablerOutlineIcon(
            name = "ArrowDownRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.464f, 8.464f),
                    PathNode.LineTo(18.0f, 18.0f)
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
                    PathNode.MoveTo(14.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 14.0f)
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
                    PathNode.MoveTo(8.414f, 8.414f),
                    PathNode.CurveTo(8.933913f, 7.911851f, 9.142426f, 7.168245f, 8.959394f, 6.468986f),
                    PathNode.CurveTo(8.776363f, 5.769727f, 8.230273f, 5.223637f, 7.531015f, 5.040606f),
                    PathNode.CurveTo(6.831756f, 4.857575f, 6.088149f, 5.066087f, 5.586f, 5.586f),
                    PathNode.CurveTo(4.828056f, 6.370758f, 4.838896f, 7.61817f, 5.610363f, 8.389637f),
                    PathNode.CurveTo(6.38183f, 9.161105f, 7.629243f, 9.171945f, 8.414f, 8.414f)
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
        return _arrowDownRightCircle!!
    }

private var _arrowDownRightCircle: ImageVector? = null
