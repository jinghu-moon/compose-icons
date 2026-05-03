package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampCeiling: ImageVector
    get() {
        if (_lampCeiling != null) return _lampCeiling!!
        _lampCeiling = lucideOutlineIcon(
            name = "LampCeiling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 7.0f)
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
                    PathNode.MoveTo(14.829f, 15.998f),
                    PathNode.CurveTo(15.26769f, 17.24107f, 14.843534f, 18.624868f, 13.783604f, 19.408588f),
                    PathNode.CurveTo(12.723673f, 20.192308f, 11.276327f, 20.192308f, 10.216396f, 19.408588f),
                    PathNode.CurveTo(9.156466f, 18.624868f, 8.73231f, 17.24107f, 9.171f, 15.998f)
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
                    PathNode.MoveTo(20.92f, 14.606f),
                    PathNode.CurveTo(21.05251f, 14.915112f, 21.020761f, 15.270129f, 20.83551f, 15.550826f),
                    PathNode.CurveTo(20.65026f, 15.831523f, 20.336317f, 16.0003f, 20.0f, 16.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(3.663684f, 16.0003f, 3.349742f, 15.831523f, 3.16449f, 15.550826f),
                    PathNode.CurveTo(2.979238f, 15.270129f, 2.947491f, 14.915112f, 3.08f, 14.606f),
                    PathNode.LineTo(6.08f, 7.606f),
                    PathNode.CurveTo(6.237726f, 7.238062f, 6.599681f, 6.999644f, 7.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.40032f, 6.999644f, 17.762274f, 7.238062f, 17.92f, 7.606f),
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
        return _lampCeiling!!
    }

private var _lampCeiling: ImageVector? = null
