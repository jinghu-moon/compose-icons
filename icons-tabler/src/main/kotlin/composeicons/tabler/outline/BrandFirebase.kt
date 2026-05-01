package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirebase: ImageVector
    get() {
        if (_brandFirebase != null) return _brandFirebase!!
        _brandFirebase = tablerOutlineIcon(
            name = "BrandFirebase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.53f, 17.05f),
                    PathNode.LineTo(10.68f, 5.33f),
                    PathNode.LineTo(10.66f, 5.33f),
                    PathNode.CurveTo(11.04f, 4.59f, 11.94f, 4.31f, 12.67f, 4.7f),
                    PathNode.CurveTo(12.93f, 4.84f, 13.15f, 5.06f, 13.29f, 5.32f),
                    PathNode.LineTo(14.35f, 7.33f)
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
                    PathNode.MoveTo(15.47f, 6.45f),
                    PathNode.CurveTo(16.05f, 5.86f, 17.0f, 5.86f, 17.58f, 6.44f),
                    PathNode.CurveTo(17.8f, 6.66f, 17.94f, 6.94f, 17.99f, 7.25f),
                    PathNode.LineTo(19.49f, 16.36f),
                    PathNode.CurveTo(19.59f, 16.98f, 19.29f, 17.6f, 18.73f, 17.9f),
                    PathNode.LineTo(12.66f, 20.8f),
                    PathNode.CurveTo(12.2f, 21.05f, 11.65f, 21.06f, 11.2f, 20.8f),
                    PathNode.LineTo(5.18f, 17.88f),
                    PathNode.CurveTo(4.63f, 17.57f, 4.33f, 16.96f, 4.43f, 16.34f),
                    PathNode.LineTo(6.39f, 4.3f),
                    PathNode.CurveTo(6.51f, 3.48f, 7.28f, 2.92f, 8.09f, 3.05f),
                    PathNode.CurveTo(8.55f, 3.12f, 8.96f, 3.41f, 9.18f, 3.82f),
                    PathNode.LineTo(10.42f, 5.58f)
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
                    PathNode.MoveTo(4.57f, 17.18f),
                    PathNode.LineTo(15.5f, 6.5f)
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
        return _brandFirebase!!
    }

private var _brandFirebase: ImageVector? = null
