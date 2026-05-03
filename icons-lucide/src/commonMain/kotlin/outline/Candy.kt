package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) return _candy!!
        _candy = lucideOutlineIcon(
            name = "Candy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 7.0f),
                    PathNode.LineTo(10.0f, 17.9f)
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
                    PathNode.MoveTo(14.0f, 6.1f),
                    PathNode.LineTo(14.0f, 17.0f)
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
                    PathNode.MoveTo(16.0f, 7.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(16.000086f, 2.595604f, 16.243727f, 2.231066f, 16.617346f, 2.076322f),
                    PathNode.CurveTo(16.990961f, 1.921578f, 17.421005f, 2.007092f, 17.707f, 2.293f),
                    PathNode.CurveTo(18.26839f, 2.862399f, 19.068281f, 3.128905f, 19.859f, 3.01f),
                    PathNode.CurveTo(20.170462f, 2.965644f, 20.484638f, 3.070446f, 20.707096f, 3.292905f),
                    PathNode.CurveTo(20.929554f, 3.515363f, 21.034355f, 3.829539f, 20.99f, 4.141f),
                    PathNode.CurveTo(20.871096f, 4.93172f, 21.137602f, 5.731609f, 21.707f, 6.293f),
                    PathNode.CurveTo(21.992908f, 6.578995f, 22.078423f, 7.009037f, 21.923677f, 7.382655f),
                    PathNode.CurveTo(21.768934f, 7.756273f, 21.404396f, 7.999914f, 21.0f, 8.0f),
                    PathNode.LineTo(17.0f, 8.0f)
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
                    PathNode.MoveTo(16.536f, 7.465f),
                    PathNode.CurveTo(15.59828f, 6.527033f, 14.326311f, 6.000068f, 13.0f, 6.000068f),
                    PathNode.CurveTo(11.673689f, 6.000068f, 10.40172f, 6.527033f, 9.464f, 7.465f),
                    PathNode.LineTo(7.464f, 9.465f),
                    PathNode.CurveTo(5.51209f, 11.4175f, 5.51209f, 14.5825f, 7.464f, 16.535f),
                    PathNode.CurveTo(8.40172f, 17.472967f, 9.673689f, 17.999931f, 11.0f, 17.999931f),
                    PathNode.CurveTo(12.326311f, 17.999931f, 13.59828f, 17.472967f, 14.536f, 16.535f),
                    PathNode.LineTo(16.536f, 14.535f),
                    PathNode.CurveTo(18.48791f, 12.5825f, 18.48791f, 9.4175f, 16.536f, 7.465f)
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(7.999914f, 21.404396f, 7.756273f, 21.768934f, 7.382655f, 21.923677f),
                    PathNode.CurveTo(7.009037f, 22.078423f, 6.578995f, 21.992908f, 6.293f, 21.707f),
                    PathNode.CurveTo(5.731609f, 21.137602f, 4.93172f, 20.871096f, 4.141f, 20.99f),
                    PathNode.CurveTo(3.829539f, 21.034355f, 3.515363f, 20.929554f, 3.292905f, 20.707096f),
                    PathNode.CurveTo(3.070446f, 20.484638f, 2.965644f, 20.170462f, 3.01f, 19.859f),
                    PathNode.CurveTo(3.128905f, 19.068281f, 2.862399f, 18.26839f, 2.293f, 17.707f),
                    PathNode.CurveTo(2.007092f, 17.421005f, 1.921578f, 16.990961f, 2.076322f, 16.617346f),
                    PathNode.CurveTo(2.231066f, 16.243727f, 2.595604f, 16.000086f, 3.0f, 16.0f),
                    PathNode.LineTo(7.0f, 16.0f)
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
        return _candy!!
    }

private var _candy: ImageVector? = null
