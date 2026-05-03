package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpLeftCircle: ImageVector
    get() {
        if (_arrowUpLeftCircle != null) return _arrowUpLeftCircle!!
        _arrowUpLeftCircle = tablerOutlineIcon(
            name = "ArrowUpLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.536f, 15.536f),
                    PathNode.LineTo(6.0f, 6.0f)
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
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 10.0f)
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
                    PathNode.MoveTo(15.586f, 15.586f),
                    PathNode.CurveTo(15.066087f, 16.088148f, 14.857574f, 16.831757f, 15.040606f, 17.531015f),
                    PathNode.CurveTo(15.223637f, 18.230274f, 15.769727f, 18.776363f, 16.468985f, 18.959394f),
                    PathNode.CurveTo(17.168243f, 19.142426f, 17.911852f, 18.933912f, 18.414f, 18.414f),
                    PathNode.CurveTo(19.171944f, 17.629242f, 19.161104f, 16.38183f, 18.389635f, 15.610363f),
                    PathNode.CurveTo(17.61817f, 14.838895f, 16.370758f, 14.828055f, 15.586f, 15.586f)
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
        return _arrowUpLeftCircle!!
    }

private var _arrowUpLeftCircle: ImageVector? = null
