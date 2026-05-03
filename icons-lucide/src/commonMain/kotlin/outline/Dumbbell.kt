package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) return _dumbbell!!
        _dumbbell = lucideOutlineIcon(
            name = "Dumbbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.596f, 12.768f),
                    PathNode.CurveTo(18.377207f, 13.549207f, 19.643793f, 13.549207f, 20.425f, 12.768f),
                    PathNode.CurveTo(21.206207f, 11.986794f, 21.206207f, 10.720207f, 20.425f, 9.939f),
                    PathNode.LineTo(18.657f, 8.172f),
                    PathNode.CurveTo(19.438208f, 8.95293f, 20.704569f, 8.952706f, 21.4855f, 8.1715f),
                    PathNode.CurveTo(22.26643f, 7.390293f, 22.266207f, 6.123931f, 21.485f, 5.343f),
                    PathNode.LineTo(18.657f, 2.515f),
                    PathNode.CurveTo(17.87607f, 1.733793f, 16.609707f, 1.733569f, 15.8285f, 2.5145f),
                    PathNode.CurveTo(15.047294f, 3.295431f, 15.04707f, 4.561794f, 15.828f, 5.343f),
                    PathNode.LineTo(14.061f, 3.575f),
                    PathNode.CurveTo(13.279793f, 2.793793f, 12.013206f, 2.793793f, 11.232f, 3.575f),
                    PathNode.CurveTo(10.450793f, 4.356207f, 10.450793f, 5.622793f, 11.232f, 6.404f),
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
                    PathNode.MoveTo(2.5f, 21.5f),
                    PathNode.LineTo(3.9f, 20.1f)
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
                    PathNode.MoveTo(20.1f, 3.9f),
                    PathNode.LineTo(21.5f, 2.5f)
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
                    PathNode.MoveTo(5.343f, 21.485f),
                    PathNode.CurveTo(6.123931f, 22.266207f, 7.390293f, 22.26643f, 8.1715f, 21.4855f),
                    PathNode.CurveTo(8.952706f, 20.704569f, 8.95293f, 19.438208f, 8.172f, 18.657f),
                    PathNode.LineTo(9.939f, 20.425f),
                    PathNode.CurveTo(10.720207f, 21.206207f, 11.986794f, 21.206207f, 12.768f, 20.425f),
                    PathNode.CurveTo(13.549207f, 19.643793f, 13.549207f, 18.377207f, 12.768f, 17.596f),
                    PathNode.LineTo(6.404f, 11.232f),
                    PathNode.CurveTo(5.622793f, 10.450793f, 4.356207f, 10.450793f, 3.575f, 11.232f),
                    PathNode.CurveTo(2.793793f, 12.013206f, 2.793793f, 13.279793f, 3.575f, 14.061f),
                    PathNode.LineTo(5.343f, 15.828f),
                    PathNode.CurveTo(4.561794f, 15.04707f, 3.295431f, 15.047294f, 2.5145f, 15.8285f),
                    PathNode.CurveTo(1.733569f, 16.609707f, 1.733793f, 17.87607f, 2.515f, 18.657f),
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
                    PathNode.MoveTo(9.6f, 14.4f),
                    PathNode.LineTo(14.4f, 9.6f)
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
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
