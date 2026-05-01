package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = tablerFilledIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.757f, 16.172f),
                    PathNode.LineTo(18.328f, 19.743f),
                    PathNode.CurveTo(14.645374f, 22.750576f, 9.354626f, 22.750576f, 5.672f, 19.743f),
                    PathNode.LineTo(9.242f, 16.172f),
                    PathNode.CurveTo(10.060245f, 16.712488f, 11.019361f, 17.000431f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.02f, 17.0f, 13.967f, 16.695f, 14.757f, 16.172f),
                    PathNode.MoveTo(4.257f, 5.672f),
                    PathNode.LineTo(7.828f, 9.242f),
                    PathNode.CurveTo(7.287512f, 10.060245f, 6.999568f, 11.019361f, 7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 13.02f, 7.305f, 13.967f, 7.828f, 14.757f),
                    PathNode.LineTo(4.258f, 18.329f),
                    PathNode.CurveTo(2.797826f, 16.542946f, 2.000095f, 14.306967f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.076027f, 9.481376f, 2.867411f, 7.371136f, 4.257f, 5.671f),
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 14.343f, 21.18f, 16.57f, 19.743f, 18.328f),
                    PathNode.LineTo(16.172f, 14.758f),
                    PathNode.CurveTo(16.712488f, 13.939755f, 17.000431f, 12.980639f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 10.98f, 16.695f, 10.033f, 16.172f, 9.243f),
                    PathNode.LineTo(19.743f, 5.673f),
                    PathNode.CurveTo(21.20238f, 7.458658f, 21.999725f, 9.693843f, 22.0f, 12.0f),
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.QuadTo(17.707f, 3.75f, 18.33f, 4.258f),
                    PathNode.LineTo(14.757f, 7.828f),
                    PathNode.CurveTo(13.939039f, 7.2877f, 12.980298f, 6.999764f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.98f, 7.0f, 10.033f, 7.305f, 9.243f, 7.828f),
                    PathNode.LineTo(5.67f, 4.258f),
                    PathNode.CurveTo(8.888659f, 1.626568f, 13.399689f, 1.261067f, 17.0f, 3.34f)
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
