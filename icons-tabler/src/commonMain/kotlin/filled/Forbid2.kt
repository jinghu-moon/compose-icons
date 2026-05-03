package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Forbid2: ImageVector
    get() {
        if (_forbid2 != null) return _forbid2!!
        _forbid2 = tablerFilledIcon(
            name = "Forbid2",
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
                    PathNode.MoveTo(15.707f, 8.293f),
                    PathNode.CurveTo(15.3165f, 7.902618f, 14.6835f, 7.902618f, 14.293f, 8.293f),
                    PathNode.LineTo(8.293f, 14.293f),
                    PathNode.LineTo(8.21f, 14.387f),
                    PathNode.CurveTo(7.887466f, 14.80413f, 7.944231f, 15.400022f, 8.339722f, 15.748752f),
                    PathNode.CurveTo(8.735212f, 16.09748f, 9.333524f, 16.07921f, 9.707f, 15.707f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.LineTo(15.79f, 9.613f),
                    PathNode.CurveTo(16.098803f, 9.214914f, 16.063234f, 8.649268f, 15.707f, 8.293f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _forbid2!!
    }

private var _forbid2: ImageVector? = null
