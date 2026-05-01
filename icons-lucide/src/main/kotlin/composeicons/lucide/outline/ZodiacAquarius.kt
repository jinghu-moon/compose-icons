package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacAquarius: ImageVector
    get() {
        if (_zodiacAquarius != null) return _zodiacAquarius!!
        _zodiacAquarius = lucideOutlineIcon(
            name = "ZodiacAquarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 10.0f),
                    PathNode.LineTo(4.456f, 6.316f),
                    PathNode.CurveTo(4.586579f, 6.143569f, 4.789537f, 6.041187f, 5.005817f, 6.038645f),
                    PathNode.CurveTo(5.222096f, 6.036103f, 5.427404f, 6.133686f, 5.562f, 6.303f),
                    PathNode.LineTo(7.952f, 9.716f),
                    PathNode.CurveTo(8.08495f, 9.882965f, 8.28681f, 9.980154f, 8.500241f, 9.979959f),
                    PathNode.CurveTo(8.713673f, 9.979764f, 8.915355f, 9.882208f, 9.048f, 9.715f),
                    PathNode.LineTo(11.45f, 6.283f),
                    PathNode.CurveTo(11.582763f, 6.115166f, 11.785004f, 6.01728f, 11.999f, 6.01728f),
                    PathNode.CurveTo(12.212996f, 6.01728f, 12.415236f, 6.115166f, 12.548f, 6.283f),
                    PathNode.LineTo(14.95f, 9.715f),
                    PathNode.CurveTo(15.082763f, 9.882834f, 15.285004f, 9.980721f, 15.499f, 9.980721f),
                    PathNode.CurveTo(15.712996f, 9.980721f, 15.915236f, 9.882834f, 16.048f, 9.715f),
                    PathNode.LineTo(18.437f, 6.302f),
                    PathNode.CurveTo(18.571596f, 6.132686f, 18.776903f, 6.035102f, 18.993183f, 6.037645f),
                    PathNode.CurveTo(19.209463f, 6.040187f, 19.41242f, 6.142569f, 19.543f, 6.315f),
                    PathNode.LineTo(22.0f, 10.0f)
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
                    PathNode.MoveTo(2.0f, 18.002f),
                    PathNode.LineTo(4.456f, 14.318f),
                    PathNode.CurveTo(4.586579f, 14.145569f, 4.789537f, 14.043186f, 5.005817f, 14.040645f),
                    PathNode.CurveTo(5.222096f, 14.038102f, 5.427404f, 14.135686f, 5.562f, 14.305f),
                    PathNode.LineTo(7.952f, 17.718f),
                    PathNode.CurveTo(8.084781f, 17.88546f, 8.286786f, 17.98309f, 8.5005f, 17.98309f),
                    PathNode.CurveTo(8.714213f, 17.98309f, 8.91622f, 17.88546f, 9.049f, 17.718f),
                    PathNode.LineTo(11.451f, 14.286f),
                    PathNode.CurveTo(11.583763f, 14.118166f, 11.786004f, 14.02028f, 12.0f, 14.02028f),
                    PathNode.CurveTo(12.213996f, 14.02028f, 12.416237f, 14.118166f, 12.549f, 14.286f),
                    PathNode.LineTo(14.951f, 17.718f),
                    PathNode.CurveTo(15.083763f, 17.885834f, 15.286004f, 17.98372f, 15.5f, 17.98372f),
                    PathNode.CurveTo(15.713996f, 17.98372f, 15.916237f, 17.885834f, 16.049f, 17.718f),
                    PathNode.LineTo(18.438f, 14.305f),
                    PathNode.CurveTo(18.572596f, 14.135686f, 18.777905f, 14.038102f, 18.994184f, 14.040645f),
                    PathNode.CurveTo(19.210463f, 14.043186f, 19.413422f, 14.145569f, 19.544f, 14.318f),
                    PathNode.LineTo(22.0f, 18.002f)
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
        return _zodiacAquarius!!
    }

private var _zodiacAquarius: ImageVector? = null
