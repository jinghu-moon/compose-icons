package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Eyeglass2: ImageVector
    get() {
        if (_eyeglass2 != null) return _eyeglass2!!
        _eyeglass2 = tablerFilledIcon(
            name = "Eyeglass2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.552285f, 3.0f, 9.0f, 3.447715f, 9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 4.552285f, 8.552285f, 5.0f, 8.0f, 5.0f),
                    PathNode.LineTo(6.743f, 5.0f),
                    PathNode.LineTo(4.503f, 12.467f),
                    PathNode.CurveTo(5.656684f, 11.895615f, 6.999849f, 11.845727f, 8.19274f, 12.329956f),
                    PathNode.CurveTo(9.385631f, 12.814186f, 10.313994f, 13.786155f, 10.743f, 15.0f),
                    PathNode.LineTo(13.256f, 15.0f),
                    PathNode.CurveTo(13.685292f, 13.78612f, 14.613781f, 12.814137f, 15.806751f, 12.329762f),
                    PathNode.CurveTo(16.999722f, 11.845387f, 18.342993f, 11.894979f, 19.497f, 12.466f),
                    PathNode.LineTo(17.256f, 5.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(15.493025f, 4.999933f, 15.066316f, 4.620493f, 15.007f, 4.117f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 3.447715f, 15.447715f, 3.0f, 16.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.441769f, 2.999969f, 18.831211f, 3.289817f, 18.958f, 3.713f),
                    PathNode.LineTo(21.958f, 13.713f),
                    PathNode.CurveTo(21.985874f, 13.806117f, 22.000023f, 13.902801f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 16.5f),
                    PathNode.CurveTo(21.999357f, 18.887533f, 20.134226f, 20.858967f, 17.750393f, 20.991816f),
                    PathNode.CurveTo(15.366558f, 21.124664f, 13.293925f, 19.372677f, 13.028f, 17.0f),
                    PathNode.LineTo(10.972f, 17.0f),
                    PathNode.CurveTo(10.706075f, 19.372677f, 8.633442f, 21.124664f, 6.249608f, 20.991816f),
                    PathNode.CurveTo(3.865774f, 20.858967f, 2.000644f, 18.887533f, 2.0f, 16.5f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.CurveTo(1.999978f, 13.902801f, 2.014126f, 13.806117f, 2.042f, 13.713f),
                    PathNode.LineTo(5.042f, 3.713f),
                    PathNode.CurveTo(5.168788f, 3.289817f, 5.558232f, 2.999969f, 6.0f, 3.0f),
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
        return _eyeglass2!!
    }

private var _eyeglass2: ImageVector? = null
