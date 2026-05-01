package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpRightCircle: ImageVector
    get() {
        if (_arrowUpRightCircle != null) return _arrowUpRightCircle!!
        _arrowUpRightCircle = tablerOutlineIcon(
            name = "ArrowUpRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.464f, 15.536f),
                    PathNode.LineTo(18.0f, 6.0f)
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
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f)
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
                    PathNode.MoveTo(8.414f, 15.586f),
                    PathNode.CurveTo(7.911851f, 15.066087f, 7.168245f, 14.857574f, 6.468986f, 15.040606f),
                    PathNode.CurveTo(5.769727f, 15.223637f, 5.223637f, 15.769727f, 5.040606f, 16.468985f),
                    PathNode.CurveTo(4.857575f, 17.168243f, 5.066087f, 17.911852f, 5.586f, 18.414f),
                    PathNode.CurveTo(6.370758f, 19.171944f, 7.61817f, 19.161104f, 8.389637f, 18.389635f),
                    PathNode.CurveTo(9.161105f, 17.61817f, 9.171945f, 16.370758f, 8.414f, 15.586f)
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
        return _arrowUpRightCircle!!
    }

private var _arrowUpRightCircle: ImageVector? = null
