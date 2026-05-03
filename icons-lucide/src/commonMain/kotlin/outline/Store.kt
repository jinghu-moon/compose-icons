package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Store: ImageVector
    get() {
        if (_store != null) return _store!!
        _store = lucideOutlineIcon(
            name = "Store",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 15.447715f, 14.552285f, 15.0f, 14.0f, 15.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.CurveTo(9.447715f, 15.0f, 9.0f, 15.447715f, 9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 21.0f)
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
                    PathNode.MoveTo(17.774f, 10.31f),
                    PathNode.CurveTo(17.340899f, 9.89539f, 16.658102f, 9.89539f, 16.225f, 10.31f),
                    PathNode.CurveTo(15.259122f, 11.231271f, 13.739878f, 11.231271f, 12.774f, 10.31f),
                    PathNode.CurveTo(12.341029f, 9.896028f, 11.658971f, 9.896028f, 11.226f, 10.31f),
                    PathNode.CurveTo(10.25999f, 11.231907f, 8.74001f, 11.231907f, 7.774f, 10.31f),
                    PathNode.CurveTo(7.340899f, 9.89539f, 6.658102f, 9.89539f, 6.225f, 10.31f),
                    PathNode.CurveTo(5.294404f, 11.198034f, 3.841831f, 11.234969f, 2.867305f, 10.395378f),
                    PathNode.CurveTo(1.89278f, 9.555787f, 1.714412f, 8.113734f, 2.455f, 7.062f),
                    PathNode.LineTo(5.344f, 2.878f),
                    PathNode.CurveTo(5.716202f, 2.328777f, 6.33654f, 1.999878f, 7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
                    PathNode.CurveTo(17.661463f, 1.999746f, 18.280266f, 2.326555f, 18.653f, 2.873f),
                    PathNode.LineTo(21.548f, 7.065f),
                    PathNode.CurveTo(22.288792f, 8.11761f, 22.10928f, 9.56066f, 21.13317f, 10.399691f),
                    PathNode.CurveTo(20.15706f, 11.23872f, 18.703417f, 11.199475f, 17.774f, 10.309f)
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
                    PathNode.MoveTo(4.0f, 10.95f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 20.10457f, 4.895431f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(19.10457f, 21.0f, 20.0f, 20.10457f, 20.0f, 19.0f),
                    PathNode.LineTo(20.0f, 10.95f)
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
        return _store!!
    }

private var _store: ImageVector? = null
