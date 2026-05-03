package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SmartphoneNfc: ImageVector
    get() {
        if (_smartphoneNfc != null) return _smartphoneNfc!!
        _smartphoneNfc = lucideOutlineIcon(
            name = "SmartphoneNfc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.CurveTo(8.552285f, 6.0f, 9.0f, 6.447716f, 9.0f, 7.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 17.552284f, 8.552285f, 18.0f, 8.0f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(2.447715f, 18.0f, 2.0f, 17.552284f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 6.447716f, 2.447715f, 6.0f, 3.0f, 6.0f),
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
                    PathNode.MoveTo(13.0f, 8.32f),
                    PathNode.CurveTo(14.300467f, 10.600995f, 14.300467f, 13.399005f, 13.0f, 15.68f)
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
                    PathNode.MoveTo(16.46f, 6.21f),
                    PathNode.CurveTo(18.492144f, 9.802539f, 18.492144f, 14.197461f, 16.46f, 17.79f)
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
                    PathNode.MoveTo(19.91f, 4.1f),
                    PathNode.CurveTo(22.713001f, 8.992768f, 22.716806f, 15.003688f, 19.92f, 19.9f)
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
        return _smartphoneNfc!!
    }

private var _smartphoneNfc: ImageVector? = null
