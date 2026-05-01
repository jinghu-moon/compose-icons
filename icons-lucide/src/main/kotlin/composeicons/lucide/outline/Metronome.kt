package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = lucideOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 11.4f),
                    PathNode.LineTo(12.0f, 9.1f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(18.59f, 10.41f)
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
                    PathNode.MoveTo(15.05f, 5.7f),
                    PathNode.LineTo(14.832f, 5.009f),
                    PathNode.CurveTo(14.410795f, 3.805851f, 13.275248f, 3.000266f, 12.0005f, 3.000266f),
                    PathNode.CurveTo(10.725752f, 3.000266f, 9.590204f, 3.805851f, 9.169f, 5.009f),
                    PathNode.LineTo(4.418f, 19.695f),
                    PathNode.CurveTo(4.320614f, 19.999084f, 4.374295f, 20.331394f, 4.562474f, 20.58935f),
                    PathNode.CurveTo(4.750653f, 20.847303f, 5.050701f, 20.999887f, 5.37f, 21.0f),
                    PathNode.LineTo(18.623f, 21.0f),
                    PathNode.CurveTo(18.943335f, 21.000084f, 19.24432f, 20.8467f, 19.432507f, 20.587473f),
                    PathNode.CurveTo(19.620695f, 20.328245f, 19.673304f, 19.994553f, 19.574f, 19.69f),
                    PathNode.LineTo(18.45f, 16.2f)
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
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 10.104569f, 21.10457f, 11.0f, 20.0f, 11.0f),
                    PathNode.CurveTo(18.89543f, 11.0f, 18.0f, 10.104569f, 18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 7.895431f, 18.89543f, 7.0f, 20.0f, 7.0f),
                    PathNode.CurveTo(21.10457f, 7.0f, 22.0f, 7.895431f, 22.0f, 9.0f),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
