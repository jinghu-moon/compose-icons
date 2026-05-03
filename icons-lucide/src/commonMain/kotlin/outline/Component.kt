package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Component: ImageVector
    get() {
        if (_component != null) return _component!!
        _component = lucideOutlineIcon(
            name = "Component",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.536f, 11.293f),
                    PathNode.CurveTo(15.145618f, 11.6835f, 15.145618f, 12.3165f, 15.536f, 12.707f),
                    PathNode.LineTo(17.912f, 15.084f),
                    PathNode.CurveTo(18.3025f, 15.474382f, 18.935501f, 15.474382f, 19.326f, 15.084f),
                    PathNode.LineTo(21.703f, 12.707f),
                    PathNode.CurveTo(22.093382f, 12.3165f, 22.093382f, 11.6835f, 21.703f, 11.293f),
                    PathNode.LineTo(19.326f, 8.916f),
                    PathNode.CurveTo(18.935501f, 8.525618f, 18.3025f, 8.525618f, 17.912f, 8.916f),
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
                    PathNode.MoveTo(2.297f, 11.293f),
                    PathNode.CurveTo(1.906618f, 11.6835f, 1.906618f, 12.3165f, 2.297f, 12.707f),
                    PathNode.LineTo(4.674f, 15.084f),
                    PathNode.CurveTo(5.0645f, 15.474382f, 5.6975f, 15.474382f, 6.088f, 15.084f),
                    PathNode.LineTo(8.465f, 12.707f),
                    PathNode.CurveTo(8.855382f, 12.3165f, 8.855382f, 11.6835f, 8.465f, 11.293f),
                    PathNode.LineTo(6.088f, 8.916f),
                    PathNode.CurveTo(5.6975f, 8.525618f, 5.0645f, 8.525618f, 4.674f, 8.916f),
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
                    PathNode.MoveTo(8.916f, 17.912f),
                    PathNode.CurveTo(8.728223f, 18.099567f, 8.622713f, 18.354092f, 8.622713f, 18.6195f),
                    PathNode.CurveTo(8.622713f, 18.884909f, 8.728223f, 19.13943f, 8.916f, 19.327f),
                    PathNode.LineTo(11.293f, 21.703f),
                    PathNode.CurveTo(11.6835f, 22.093382f, 12.3165f, 22.093382f, 12.707f, 21.703f),
                    PathNode.LineTo(15.084f, 19.327f),
                    PathNode.CurveTo(15.271777f, 19.13943f, 15.377287f, 18.884909f, 15.377287f, 18.6195f),
                    PathNode.CurveTo(15.377287f, 18.354092f, 15.271777f, 18.099567f, 15.084f, 17.912f),
                    PathNode.LineTo(12.707f, 15.536f),
                    PathNode.CurveTo(12.3165f, 15.145618f, 11.6835f, 15.145618f, 11.293f, 15.536f),
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
                    PathNode.MoveTo(8.916f, 4.674f),
                    PathNode.CurveTo(8.525618f, 5.0645f, 8.525618f, 5.6975f, 8.916f, 6.088f),
                    PathNode.LineTo(11.293f, 8.464f),
                    PathNode.CurveTo(11.6835f, 8.854382f, 12.3165f, 8.854382f, 12.707f, 8.464f),
                    PathNode.LineTo(15.084f, 6.088f),
                    PathNode.CurveTo(15.474382f, 5.6975f, 15.474382f, 5.0645f, 15.084f, 4.674f),
                    PathNode.LineTo(12.707f, 2.297f),
                    PathNode.CurveTo(12.3165f, 1.906618f, 11.6835f, 1.906618f, 11.293f, 2.297f),
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
        return _component!!
    }

private var _component: ImageVector? = null
