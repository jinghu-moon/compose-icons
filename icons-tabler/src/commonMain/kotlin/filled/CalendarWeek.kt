package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CalendarWeek: ImageVector
    get() {
        if (_calendarWeek != null) return _calendarWeek!!
        _calendarWeek = tablerFilledIcon(
            name = "CalendarWeek",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.183f, 2.0f, 16.355f, 2.05f, 16.502f, 2.135f),
                    PathNode.LineTo(16.535f, 2.155f),
                    PathNode.CurveTo(16.815f, 2.332f, 17.0f, 2.645f, 17.0f, 3.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.588558f, 3.999912f, 20.901804f, 5.238179f, 20.995f, 6.824f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.000088f, 20.588558f, 19.761822f, 21.901804f, 18.176f, 21.995f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.411443f, 22.000088f, 3.098195f, 20.761822f, 3.005f, 19.176f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.CurveTo(2.999912f, 5.411443f, 4.238179f, 4.098196f, 5.824f, 4.005f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(6.999985f, 2.636964f, 7.196722f, 2.302436f, 7.514f, 2.126f),
                    PathNode.LineTo(7.607f, 2.08f),
                    PathNode.LineTo(7.673f, 2.055f),
                    PathNode.LineTo(7.773f, 2.026f),
                    PathNode.LineTo(7.88f, 2.007f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.QuadTo(8.083f, 2.0f, 8.161001f, 2.013f),
                    PathNode.LineTo(8.283f, 2.042f),
                    PathNode.LineTo(8.323f, 2.054f),
                    PathNode.LineTo(8.383001f, 2.077f),
                    PathNode.CurveTo(8.711f, 2.212f, 8.951f, 2.517f, 8.993f, 2.883f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(15.0f, 2.447715f, 15.447715f, 2.0f, 16.0f, 2.0f),
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 18.625f),
                    PathNode.CurveTo(5.0f, 19.33f, 5.386f, 19.911f, 5.883f, 19.991f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.513f, 20.0f, 18.936f, 19.47f, 18.993f, 18.785f),
                    PathNode.LineTo(19.0f, 18.625f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.015f, 13.0f),
                    PathNode.CurveTo(9.015f, 13.552285f, 8.567285f, 14.0f, 8.015001f, 14.0f),
                    PathNode.CurveTo(7.647124f, 14.017352f, 7.299432f, 13.831296f, 7.109774f, 13.5156f),
                    PathNode.CurveTo(6.920117f, 13.199903f, 6.919131f, 12.805561f, 7.107208f, 12.48892f),
                    PathNode.CurveTo(7.295284f, 12.172279f, 7.642041f, 11.984488f, 8.01f, 12.0f),
                    PathNode.CurveTo(8.567f, 12.0f, 9.015f, 12.448f, 9.015f, 13.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.015f, 13.0f),
                    PathNode.CurveTo(13.015f, 13.552285f, 12.567285f, 14.0f, 12.015f, 14.0f),
                    PathNode.CurveTo(11.647123f, 14.017352f, 11.299431f, 13.831296f, 11.109774f, 13.5156f),
                    PathNode.CurveTo(10.920116f, 13.199903f, 10.919131f, 12.805561f, 11.107207f, 12.48892f),
                    PathNode.CurveTo(11.295283f, 12.172279f, 11.642041f, 11.984488f, 12.01f, 12.0f),
                    PathNode.CurveTo(12.567f, 12.0f, 13.015f, 12.448f, 13.015f, 13.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.02f, 13.0f),
                    PathNode.CurveTo(17.02f, 13.552285f, 16.572285f, 14.0f, 16.02f, 14.0f),
                    PathNode.CurveTo(15.652123f, 14.017352f, 15.304431f, 13.831296f, 15.114774f, 13.5156f),
                    PathNode.CurveTo(14.925117f, 13.199903f, 14.924131f, 12.805561f, 15.112207f, 12.48892f),
                    PathNode.CurveTo(15.300283f, 12.172279f, 15.647041f, 11.984488f, 16.015f, 12.0f),
                    PathNode.CurveTo(16.572f, 12.0f, 17.02f, 12.448f, 17.02f, 13.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.02f, 15.0f),
                    PathNode.CurveTo(12.572285f, 15.0f, 13.02f, 15.447715f, 13.02f, 16.0f),
                    PathNode.CurveTo(13.02f, 16.552284f, 12.572285f, 17.0f, 12.02f, 17.0f),
                    PathNode.CurveTo(11.652123f, 17.017351f, 11.304431f, 16.831297f, 11.114774f, 16.5156f),
                    PathNode.CurveTo(10.925117f, 16.199903f, 10.924131f, 15.805561f, 11.112207f, 15.48892f),
                    PathNode.CurveTo(11.300283f, 15.172279f, 11.647041f, 14.984488f, 12.015f, 15.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.015f, 16.0f),
                    PathNode.CurveTo(9.015f, 16.552284f, 8.567285f, 17.0f, 8.015001f, 17.0f),
                    PathNode.CurveTo(7.647124f, 17.017351f, 7.299432f, 16.831297f, 7.109774f, 16.5156f),
                    PathNode.CurveTo(6.920117f, 16.199903f, 6.919131f, 15.805561f, 7.107208f, 15.48892f),
                    PathNode.CurveTo(7.295284f, 15.172279f, 7.642041f, 14.984488f, 8.01f, 15.0f),
                    PathNode.CurveTo(8.567f, 15.0f, 9.015f, 15.448f, 9.015f, 16.0f)
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
        return _calendarWeek!!
    }

private var _calendarWeek: ImageVector? = null
