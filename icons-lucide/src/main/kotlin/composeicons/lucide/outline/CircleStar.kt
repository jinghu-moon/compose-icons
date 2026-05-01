package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleStar: ImageVector
    get() {
        if (_circleStar != null) return _circleStar!!
        _circleStar = lucideOutlineIcon(
            name = "CircleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.051f, 7.616f),
                    PathNode.CurveTo(11.186603f, 7.200042f, 11.576857f, 6.920525f, 12.014325f, 6.926025f),
                    PathNode.CurveTo(12.451794f, 6.931525f, 12.834898f, 7.220765f, 12.96f, 7.64f),
                    PathNode.LineTo(13.697f, 9.092f),
                    PathNode.CurveTo(13.842494f, 9.378342f, 14.116672f, 9.577372f, 14.434f, 9.627f),
                    PathNode.LineTo(16.068f, 9.883f),
                    PathNode.CurveTo(16.499563f, 9.884686f, 16.88136f, 10.163041f, 17.014965f, 10.573406f),
                    PathNode.CurveTo(17.148573f, 10.983771f, 17.003847f, 11.433553f, 16.656f, 11.689f),
                    PathNode.LineTo(15.484f, 12.857f),
                    PathNode.CurveTo(15.256373f, 13.083624f, 15.151464f, 13.405796f, 15.202f, 13.723f),
                    PathNode.LineTo(15.461f, 15.336f),
                    PathNode.CurveTo(15.607286f, 15.751067f, 15.465021f, 16.212982f, 15.110561f, 16.473824f),
                    PathNode.CurveTo(14.756102f, 16.734667f, 14.272777f, 16.733114f, 13.92f, 16.47f),
                    PathNode.LineTo(12.455f, 15.72f),
                    PathNode.CurveTo(12.168696f, 15.573306f, 11.829304f, 15.573306f, 11.543f, 15.72f),
                    PathNode.LineTo(10.078f, 16.47f),
                    PathNode.CurveTo(9.725301f, 16.730888f, 9.243745f, 16.731436f, 8.890456f, 16.471346f),
                    PathNode.CurveTo(8.537167f, 16.211258f, 8.39465f, 15.751273f, 8.539f, 15.337f),
                    PathNode.LineTo(8.797f, 13.724f),
                    PathNode.CurveTo(8.847874f, 13.406468f, 8.742937f, 13.083846f, 8.515f, 12.857f),
                    PathNode.LineTo(7.359f, 11.705f),
                    PathNode.CurveTo(6.999103f, 11.455664f, 6.843253f, 11.001198f, 6.974396f, 10.583469f),
                    PathNode.CurveTo(7.105537f, 10.165742f, 7.493172f, 9.881898f, 7.931f, 9.883f),
                    PathNode.LineTo(9.564f, 9.627f),
                    PathNode.CurveTo(9.881329f, 9.577372f, 10.155506f, 9.378342f, 10.301f, 9.092f),
                    PathNode.Close
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
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
