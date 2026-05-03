package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVscode: ImageVector
    get() {
        if (_brandVscode != null) return _brandVscode!!
        _brandVscode = tablerOutlineIcon(
            name = "BrandVscode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.LineTo(20.0f, 18.5f),
                    PathNode.LineTo(20.0f, 5.5f),
                    PathNode.LineTo(16.0f, 3.0f)
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
                    PathNode.MoveTo(9.165f, 13.903f),
                    PathNode.LineTo(5.0f, 17.5f),
                    PathNode.LineTo(3.0f, 16.5f),
                    PathNode.LineTo(7.333f, 12.0f),
                    PathNode.MoveTo(9.068f, 10.198f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.LineTo(11.205f, 12.141f)
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
                    PathNode.MoveTo(16.0f, 16.5f),
                    PathNode.LineTo(5.0f, 6.5f),
                    PathNode.LineTo(3.0f, 7.5f),
                    PathNode.LineTo(16.0f, 21.0f)
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
        return _brandVscode!!
    }

private var _brandVscode: ImageVector? = null
