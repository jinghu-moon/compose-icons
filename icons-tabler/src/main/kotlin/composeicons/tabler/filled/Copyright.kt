package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = tablerFilledIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(14.66f, 8.999f),
                    PathNode.CurveTo(13.047747f, 7.582095f, 10.606328f, 7.683398f, 9.117f, 9.229f),
                    PathNode.CurveTo(7.62633f, 10.775617f, 7.62633f, 13.224383f, 9.117f, 14.771f),
                    PathNode.CurveTo(10.606328f, 16.316603f, 13.047747f, 16.417906f, 14.66f, 15.001f),
                    PathNode.CurveTo(15.061739f, 14.63346f, 15.095587f, 14.012055f, 14.736146f, 13.603054f),
                    PathNode.CurveTo(14.376704f, 13.194054f, 13.756099f, 13.1478f, 13.34f, 13.499f),
                    PathNode.CurveTo(12.53f, 14.21f, 11.305f, 14.159f, 10.557f, 13.383f),
                    PathNode.CurveTo(9.813063f, 12.611066f, 9.813063f, 11.388934f, 10.557f, 10.617f),
                    PathNode.CurveTo(11.304536f, 9.840672f, 12.530453f, 9.789574f, 13.34f, 10.501f),
                    PathNode.CurveTo(13.756656f, 10.84307f, 14.369468f, 10.793304f, 14.72547f, 10.388488f),
                    PathNode.CurveTo(15.08147f, 9.98367f, 15.052513f, 9.369523f, 14.66f, 9.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _copyright!!
    }

private var _copyright: ImageVector? = null
