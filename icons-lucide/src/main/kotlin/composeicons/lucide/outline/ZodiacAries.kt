package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacAries: ImageVector
    get() {
        if (_zodiacAries != null) return _zodiacAries!!
        _zodiacAries = lucideOutlineIcon(
            name = "ZodiacAries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.5f),
                    PathNode.CurveTo(12.01497f, 5.083351f, 13.936102f, 3.110036f, 16.351482f, 3.030322f),
                    PathNode.CurveTo(18.766863f, 2.950609f, 20.813923f, 4.792962f, 20.988197f, 7.203366f),
                    PathNode.CurveTo(21.162472f, 9.61377f, 19.401726f, 11.731432f, 17.0f, 12.0f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(4.598274f, 11.731432f, 2.837528f, 9.61377f, 3.011802f, 7.203366f),
                    PathNode.CurveTo(3.186077f, 4.792962f, 5.233137f, 2.950609f, 7.648517f, 3.030322f),
                    PathNode.CurveTo(10.063898f, 3.110036f, 11.98503f, 5.083351f, 12.0f, 7.5f),
                    PathNode.LineTo(12.0f, 21.0f)
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
        return _zodiacAries!!
    }

private var _zodiacAries: ImageVector? = null
