package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = lucideOutlineIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(8.7f, 2.7f),
                    PathNode.CurveTo(7.759789f, 1.764326f, 6.240212f, 1.764326f, 5.3f, 2.7f),
                    PathNode.LineTo(2.7f, 5.3f),
                    PathNode.CurveTo(1.764326f, 6.240212f, 1.764326f, 7.759789f, 2.7f, 8.7f),
                    PathNode.LineTo(7.0f, 13.0f)
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(10.0f, 4.0f)
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
                    PathNode.MoveTo(18.0f, 16.0f),
                    PathNode.LineTo(20.0f, 14.0f)
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
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.LineTo(21.3f, 15.3f),
                    PathNode.CurveTo(22.24f, 16.24f, 22.24f, 17.76f, 21.3f, 18.7f),
                    PathNode.LineTo(18.7f, 21.3f),
                    PathNode.CurveTo(17.76f, 22.24f, 16.24f, 22.24f, 15.3f, 21.3f),
                    PathNode.LineTo(11.0f, 17.0f)
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
                    PathNode.MoveTo(21.174f, 6.812f),
                    PathNode.CurveTo(22.27498f, 5.711297f, 22.275204f, 3.92648f, 21.1745f, 2.8255f),
                    PathNode.CurveTo(20.073797f, 1.72452f, 18.28898f, 1.724297f, 17.188f, 2.825f),
                    PathNode.LineTo(3.842f, 16.174f),
                    PathNode.CurveTo(3.60982f, 16.4055f, 3.438114f, 16.690533f, 3.342f, 17.004f),
                    PathNode.LineTo(2.021f, 21.356f),
                    PathNode.CurveTo(1.968345f, 21.532196f, 2.016659f, 21.723074f, 2.146796f, 21.853003f),
                    PathNode.CurveTo(2.276934f, 21.982931f, 2.46789f, 22.030937f, 2.644f, 21.978f),
                    PathNode.LineTo(6.997f, 20.658f),
                    PathNode.CurveTo(7.310169f, 20.562752f, 7.595174f, 20.392092f, 7.827f, 20.161f),
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.LineTo(19.0f, 9.0f)
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
