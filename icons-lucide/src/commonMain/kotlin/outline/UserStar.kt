package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserStar: ImageVector
    get() {
        if (_userStar != null) return _userStar!!
        _userStar = lucideOutlineIcon(
            name = "UserStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.051f, 12.616f),
                    PathNode.CurveTo(16.186602f, 12.200042f, 16.576857f, 11.920525f, 17.014326f, 11.926024f),
                    PathNode.CurveTo(17.451794f, 11.931524f, 17.834898f, 12.220764f, 17.96f, 12.64f),
                    PathNode.LineTo(18.697f, 14.092f),
                    PathNode.CurveTo(18.842493f, 14.378342f, 19.116673f, 14.577372f, 19.434f, 14.627f),
                    PathNode.LineTo(21.068f, 14.883f),
                    PathNode.CurveTo(21.499563f, 14.884686f, 21.88136f, 15.163041f, 22.014965f, 15.573406f),
                    PathNode.CurveTo(22.148573f, 15.983771f, 22.003847f, 16.433554f, 21.656f, 16.689f),
                    PathNode.LineTo(20.484f, 17.857f),
                    PathNode.CurveTo(20.256374f, 18.083624f, 20.151463f, 18.405796f, 20.202f, 18.723f),
                    PathNode.LineTo(20.461f, 20.336f),
                    PathNode.CurveTo(20.607286f, 20.751066f, 20.465021f, 21.212982f, 20.110561f, 21.473824f),
                    PathNode.CurveTo(19.756102f, 21.734667f, 19.272778f, 21.733114f, 18.92f, 21.47f),
                    PathNode.LineTo(17.455f, 20.72f),
                    PathNode.CurveTo(17.168697f, 20.573309f, 16.829304f, 20.573309f, 16.543f, 20.72f),
                    PathNode.LineTo(15.078f, 21.47f),
                    PathNode.CurveTo(14.725301f, 21.730888f, 14.243745f, 21.731436f, 13.890456f, 21.471346f),
                    PathNode.CurveTo(13.537167f, 21.211258f, 13.39465f, 20.751274f, 13.539f, 20.337f),
                    PathNode.LineTo(13.797f, 18.724f),
                    PathNode.CurveTo(13.847537f, 18.406796f, 13.742626f, 18.084623f, 13.515f, 17.858f),
                    PathNode.LineTo(12.359f, 16.705f),
                    PathNode.CurveTo(11.999103f, 16.455664f, 11.843253f, 16.001198f, 11.974395f, 15.583469f),
                    PathNode.CurveTo(12.105537f, 15.165742f, 12.493172f, 14.881898f, 12.931f, 14.883f),
                    PathNode.LineTo(14.564f, 14.627f),
                    PathNode.CurveTo(14.881329f, 14.577372f, 15.155506f, 14.378342f, 15.301f, 14.092f),
                    PathNode.Close
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
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(4.790861f, 15.0f, 3.0f, 16.790861f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 9.209139f, 12.209139f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(7.790861f, 11.0f, 6.0f, 9.209139f, 6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 4.790861f, 7.790861f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.209139f, 3.0f, 14.0f, 4.790861f, 14.0f, 7.0f),
                    PathNode.Close
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
        return _userStar!!
    }

private var _userStar: ImageVector? = null
