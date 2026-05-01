package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = tablerFilledIcon(
            name = "Copyleft",
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
                    PathNode.MoveTo(14.883f, 9.229f),
                    PathNode.CurveTo(13.393672f, 7.683398f, 10.952253f, 7.582095f, 9.34f, 8.999f),
                    PathNode.CurveTo(8.938261f, 9.36654f, 8.904413f, 9.987945f, 9.263854f, 10.396946f),
                    PathNode.CurveTo(9.623296f, 10.805946f, 10.243901f, 10.8522f, 10.66f, 10.501f),
                    PathNode.CurveTo(11.469547f, 9.789574f, 12.695464f, 9.840672f, 13.443f, 10.617f),
                    PathNode.CurveTo(14.186937f, 11.388934f, 14.186937f, 12.611066f, 13.443f, 13.383f),
                    PathNode.CurveTo(12.695464f, 14.159328f, 11.469547f, 14.210426f, 10.66f, 13.499f),
                    PathNode.CurveTo(10.243344f, 13.15693f, 9.630532f, 13.206696f, 9.27453f, 13.611512f),
                    PathNode.CurveTo(8.91853f, 14.01633f, 8.947487f, 14.630477f, 9.34f, 15.0f),
                    PathNode.CurveTo(10.952253f, 16.416906f, 13.393672f, 16.315601f, 14.883f, 14.77f),
                    PathNode.CurveTo(16.37367f, 13.223384f, 16.37367f, 10.774616f, 14.883f, 9.228f),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
