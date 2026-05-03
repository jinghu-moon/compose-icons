package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Worm: ImageVector
    get() {
        if (_worm != null) return _worm!!
        _worm = lucideOutlineIcon(
            name = "Worm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.LineTo(17.5f, 15.0f)
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
                    PathNode.MoveTo(19.63f, 18.81f),
                    PathNode.LineTo(22.0f, 20.0f)
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
                    PathNode.MoveTo(6.47f, 8.23f),
                    PathNode.CurveTo(7.064462f, 7.8942f, 7.803025f, 7.951562f, 8.338511f, 8.375122f),
                    PathNode.CurveTo(8.873996f, 8.798681f, 9.099887f, 9.504188f, 8.91f, 10.16f),
                    PathNode.LineTo(8.270001f, 12.24f),
                    PathNode.CurveTo(7.417608f, 14.965436f, 8.369743f, 17.93252f, 10.648845f, 19.653063f),
                    PathNode.CurveTo(12.927947f, 21.373606f, 16.04236f, 21.476444f, 18.43f, 19.91f),
                    PathNode.LineTo(18.85f, 19.64f),
                    PathNode.CurveTo(20.01256f, 18.886131f, 20.343868f, 17.33256f, 19.59f, 16.17f),
                    PathNode.CurveTo(18.836132f, 15.007441f, 17.28256f, 14.676131f, 16.12f, 15.43f),
                    PathNode.LineTo(15.7f, 15.7f),
                    PathNode.CurveTo(15.079824f, 16.094042f, 14.280118f, 16.061348f, 13.69418f, 15.617994f),
                    PathNode.CurveTo(13.10824f, 15.174642f, 12.859385f, 14.413938f, 13.07f, 13.71f),
                    PathNode.LineTo(13.71f, 11.63f),
                    PathNode.CurveTo(14.548532f, 8.990962f, 13.666643f, 6.108398f, 11.495083f, 4.390265f),
                    PathNode.CurveTo(9.323522f, 2.672131f, 6.3154f, 2.476928f, 3.94f, 3.9f),
                    PathNode.LineTo(3.24f, 4.3f),
                    PathNode.CurveTo(2.041542f, 5.004164f, 1.640837f, 6.546542f, 2.345f, 7.745f),
                    PathNode.CurveTo(3.049163f, 8.943458f, 4.591542f, 9.344163f, 5.79f, 8.64f),
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
        return _worm!!
    }

private var _worm: ImageVector? = null
