package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileChartPie: ImageVector
    get() {
        if (_fileChartPie != null) return _fileChartPie!!
        _fileChartPie = lucideOutlineIcon(
            name = "FileChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.941f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.001036f, 7.360635f, 19.746914f, 6.747285f, 19.294f, 6.296f),
                    PathNode.LineTo(15.706f, 2.708f),
                    PathNode.CurveTo(15.254556f, 2.25386f, 14.640347f, 1.99896f, 14.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(4.895431f, 2.0f, 4.0f, 2.895431f, 4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 7.512f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(4.017f, 11.512f),
                    PathNode.CurveTo(2.350444f, 12.990977f, 1.640724f, 15.271688f, 2.173811f, 17.435158f),
                    PathNode.CurveTo(2.706898f, 19.598627f, 4.394986f, 21.28851f, 6.557888f, 21.823895f),
                    PathNode.CurveTo(8.72079f, 22.35928f, 11.002253f, 21.651983f, 12.483f, 19.987f)
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
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.447715f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 10.448f, 8.45f, 9.992f, 8.995f, 10.083f),
                    PathNode.CurveTo(11.516952f, 10.507067f, 13.492933f, 12.483048f, 13.917f, 15.005f),
                    PathNode.CurveTo(14.008f, 15.549f, 13.552f, 16.0f, 13.0f, 16.0f),
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
        return _fileChartPie!!
    }

private var _fileChartPie: ImageVector? = null
