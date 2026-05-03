package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStar: ImageVector
    get() {
        if (_squareStar != null) return _squareStar!!
        _squareStar = lucideOutlineIcon(
            name = "SquareStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.035f, 7.69f),
                    PathNode.CurveTo(11.170602f, 7.274042f, 11.560857f, 6.994525f, 11.998325f, 7.000025f),
                    PathNode.CurveTo(12.435794f, 7.005525f, 12.818898f, 7.294765f, 12.944f, 7.714f),
                    PathNode.LineTo(13.681f, 9.166f),
                    PathNode.CurveTo(13.826494f, 9.452342f, 14.100672f, 9.651372f, 14.418f, 9.701f),
                    PathNode.LineTo(16.052f, 9.957f),
                    PathNode.CurveTo(16.483564f, 9.958685f, 16.865358f, 10.237041f, 16.998966f, 10.647407f),
                    PathNode.CurveTo(17.132574f, 11.057772f, 16.987846f, 11.507553f, 16.64f, 11.763f),
                    PathNode.LineTo(15.468f, 12.931f),
                    PathNode.CurveTo(15.240374f, 13.157624f, 15.135464f, 13.479796f, 15.186f, 13.797f),
                    PathNode.LineTo(15.445f, 15.41f),
                    PathNode.CurveTo(15.591287f, 15.825068f, 15.449021f, 16.286982f, 15.094562f, 16.547825f),
                    PathNode.CurveTo(14.740102f, 16.808666f, 14.256777f, 16.807114f, 13.904f, 16.544f),
                    PathNode.LineTo(12.439f, 15.794f),
                    PathNode.CurveTo(12.152697f, 15.647306f, 11.813303f, 15.647306f, 11.527f, 15.794f),
                    PathNode.LineTo(10.062f, 16.544f),
                    PathNode.CurveTo(9.709301f, 16.80489f, 9.227745f, 16.805435f, 8.874455f, 16.545347f),
                    PathNode.CurveTo(8.521167f, 16.285257f, 8.378649f, 15.825274f, 8.523f, 15.411f),
                    PathNode.LineTo(8.781f, 13.798f),
                    PathNode.CurveTo(8.831536f, 13.480796f, 8.726626f, 13.158625f, 8.499f, 12.932f),
                    PathNode.LineTo(7.343f, 11.779f),
                    PathNode.CurveTo(6.983103f, 11.529663f, 6.827254f, 11.075198f, 6.958395f, 10.65747f),
                    PathNode.CurveTo(7.089537f, 10.239741f, 7.477172f, 9.955898f, 7.915f, 9.957f),
                    PathNode.LineTo(9.548f, 9.701f),
                    PathNode.CurveTo(9.865329f, 9.651372f, 10.139506f, 9.452342f, 10.285f, 9.166f),
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
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
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
        return _squareStar!!
    }

private var _squareStar: ImageVector? = null
