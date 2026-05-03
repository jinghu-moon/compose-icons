package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinOff: ImageVector
    get() {
        if (_mapPinOff != null) return _mapPinOff!!
        _mapPinOff = tablerOutlineIcon(
            name = "MapPinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.442f, 9.432f),
                    PathNode.CurveTo(8.717626f, 10.612393f, 8.895412f, 12.135238f, 9.872213f, 13.117025f),
                    PathNode.CurveTo(10.849013f, 14.098814f, 12.370933f, 14.284353f, 13.555f, 13.566f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f)
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
                    PathNode.MoveTo(17.152f, 17.162f),
                    PathNode.LineTo(13.414f, 20.9f),
                    PathNode.CurveTo(12.633115f, 21.680098f, 11.367885f, 21.680098f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.411666f, 13.725765f, 3.205069f, 9.04089f, 5.867f, 5.863f),
                    PathNode.MoveTo(8.047f, 4.043f),
                    PathNode.CurveTo(11.178445f, 2.265277f, 15.111555f, 2.79781f, 17.65752f, 5.344242f),
                    PathNode.CurveTo(20.203485f, 7.890673f, 20.735298f, 11.823881f, 18.957f, 14.955f)
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
        return _mapPinOff!!
    }

private var _mapPinOff: ImageVector? = null
