package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Library: ImageVector
    get() {
        if (_library != null) return _library!!
        _library = tablerFilledIcon(
            name = "Library",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.358229f, 2.0f, 22.0f, 3.641772f, 22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 14.333f),
                    PathNode.CurveTo(22.0f, 16.358229f, 20.358229f, 18.0f, 18.333f, 18.0f),
                    PathNode.LineTo(9.667f, 18.0f),
                    PathNode.CurveTo(7.641772f, 18.0f, 6.0f, 16.358229f, 6.0f, 14.333f),
                    PathNode.LineTo(6.0f, 5.667f),
                    PathNode.CurveTo(6.0f, 3.641772f, 7.641772f, 2.0f, 9.667f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(10.447715f, 12.0f, 10.0f, 12.447715f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 13.552285f, 10.447715f, 14.0f, 11.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.552285f, 14.0f, 15.0f, 13.552285f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 12.447715f, 14.552285f, 12.0f, 14.0f, 12.0f),
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(10.447715f, 9.0f, 10.0f, 9.447715f, 10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 10.552285f, 10.447715f, 11.0f, 11.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.552284f, 11.0f, 18.0f, 10.552285f, 18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 9.447715f, 17.552284f, 9.0f, 17.0f, 9.0f),
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(10.447715f, 6.0f, 10.0f, 6.447716f, 10.0f, 7.0f),
                    PathNode.CurveTo(10.0f, 7.552285f, 10.447715f, 8.0f, 11.0f, 8.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.552284f, 8.0f, 17.0f, 7.552285f, 17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 6.447716f, 16.552284f, 6.0f, 16.0f, 6.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.517f, 6.391f),
                    PathNode.CurveTo(3.996935f, 6.117619f, 4.607619f, 6.285065f, 4.881f, 6.765f),
                    PathNode.CurveTo(5.154381f, 7.244936f, 4.986936f, 7.855619f, 4.507f, 8.129f),
                    PathNode.CurveTo(4.194f, 8.307f, 4.001f, 8.639f, 4.0f, 8.997f),
                    PathNode.LineTo(4.0f, 18.997f),
                    PathNode.CurveTo(4.0f, 19.545f, 4.452f, 19.997f, 5.0f, 19.997f),
                    PathNode.LineTo(15.0f, 19.997f),
                    PathNode.CurveTo(15.284f, 19.997f, 15.405f, 19.909f, 15.626f, 19.511f),
                    PathNode.CurveTo(15.89441f, 19.028303f, 16.503304f, 18.85459f, 16.986f, 19.123f),
                    PathNode.CurveTo(17.468697f, 19.39141f, 17.64241f, 20.000303f, 17.374f, 20.483f),
                    PathNode.CurveTo(16.828f, 21.463f, 16.094f, 21.997f, 15.0f, 21.997f),
                    PathNode.LineTo(5.0f, 21.997f),
                    PathNode.CurveTo(3.348f, 21.997f, 2.0f, 20.649f, 2.0f, 18.997f),
                    PathNode.LineTo(2.0f, 8.995f),
                    PathNode.CurveTo(2.001012f, 7.917208f, 2.580104f, 6.922789f, 3.517f, 6.39f)
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
        return _library!!
    }

private var _library: ImageVector? = null
