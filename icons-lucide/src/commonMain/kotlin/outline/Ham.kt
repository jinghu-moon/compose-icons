package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ham: ImageVector
    get() {
        if (_ham != null) return _ham!!
        _ham = lucideOutlineIcon(
            name = "Ham",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.144f, 21.144f),
                    PathNode.CurveTo(17.223427f, 17.064573f, 18.22741f, 11.454496f, 15.386456f, 8.613544f),
                    PathNode.CurveTo(12.545504f, 5.772591f, 6.935427f, 6.776573f, 2.856f, 10.856f)
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
                    PathNode.MoveTo(13.144f, 21.144f),
                    PathNode.CurveTo(14.848806f, 19.439194f, 13.927777f, 15.754128f, 11.086824f, 12.913176f),
                    PathNode.CurveTo(8.245872f, 10.072223f, 4.560806f, 9.151194f, 2.856f, 10.856f),
                    PathNode.CurveTo(1.151194f, 12.560806f, 2.072223f, 16.24587f, 4.913176f, 19.086824f),
                    PathNode.CurveTo(7.754129f, 21.927776f, 11.439194f, 22.848806f, 13.144f, 21.144f)
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
                    PathNode.MoveTo(16.565f, 10.435f),
                    PathNode.LineTo(18.6f, 8.4f),
                    PathNode.CurveTo(19.468193f, 8.881059f, 20.53871f, 8.803181f, 21.32814f, 8.201533f),
                    PathNode.CurveTo(22.11757f, 7.599885f, 22.476507f, 6.588337f, 22.242867f, 5.623664f),
                    PathNode.CurveTo(22.009228f, 4.658991f, 21.227234f, 3.923771f, 20.25f, 3.75f),
                    PathNode.CurveTo(20.058775f, 2.788165f, 19.322863f, 2.026956f, 18.368036f, 1.803348f),
                    PathNode.CurveTo(17.413212f, 1.579739f, 16.415827f, 1.93503f, 15.81741f, 2.71194f),
                    PathNode.CurveTo(15.218991f, 3.48885f, 15.130067f, 4.543886f, 15.59f, 5.41f),
                    PathNode.LineTo(13.566f, 7.435f)
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
                    PathNode.MoveTo(8.5f, 16.5f),
                    PathNode.LineTo(7.5f, 15.5f)
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
        return _ham!!
    }

private var _ham: ImageVector? = null
