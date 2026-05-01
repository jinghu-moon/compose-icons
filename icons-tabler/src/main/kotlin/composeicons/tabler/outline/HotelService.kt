package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HotelService: ImageVector
    get() {
        if (_hotelService != null) return _hotelService!!
        _hotelService = tablerOutlineIcon(
            name = "HotelService",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 10.0f),
                    PathNode.CurveTo(7.671573f, 10.0f, 7.0f, 9.328427f, 7.0f, 8.5f),
                    PathNode.CurveTo(7.0f, 5.462434f, 9.462434f, 3.0f, 12.5f, 3.0f),
                    PathNode.CurveTo(15.537566f, 3.0f, 18.0f, 5.462434f, 18.0f, 8.5f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.10457f, 17.10457f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(7.895431f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(7.0f, 15.62f, 7.71f, 14.556f, 8.88f, 13.825f),
                    PathNode.LineTo(13.304f, 11.06f),
                    PathNode.CurveTo(14.359f, 10.4f, 15.0f, 9.744f, 15.0f, 8.5f),
                    PathNode.CurveTo(15.0f, 7.119288f, 13.880712f, 6.0f, 12.5f, 6.0f),
                    PathNode.CurveTo(11.119288f, 6.0f, 10.0f, 7.119288f, 10.0f, 8.5f),
                    PathNode.CurveTo(10.0f, 9.328427f, 9.328427f, 10.0f, 8.5f, 10.0f)
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
        return _hotelService!!
    }

private var _hotelService: ImageVector? = null
