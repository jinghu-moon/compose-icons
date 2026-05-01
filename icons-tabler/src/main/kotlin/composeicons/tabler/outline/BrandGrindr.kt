package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGrindr: ImageVector
    get() {
        if (_brandGrindr != null) return _brandGrindr!!
        _brandGrindr = tablerOutlineIcon(
            name = "BrandGrindr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 13.282f),
                    PathNode.CurveTo(13.0f, 13.774f, 13.784f, 15.0f, 15.102f, 15.0f),
                    PathNode.CurveTo(16.42f, 15.0f, 18.0f, 14.034f, 18.0f, 12.938f),
                    PathNode.CurveTo(18.0f, 12.121f, 17.068f, 12.0f, 16.591f, 12.0f),
                    PathNode.CurveTo(16.363f, 12.0f, 13.0f, 12.111f, 13.0f, 13.282f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.CurveTo(9.016f, 21.0f, 5.529f, 18.279f, 5.37f, 18.018f),
                    PathNode.CurveTo(3.24f, 14.528f, 3.0f, 4.315f, 3.0f, 4.315f),
                    PathNode.LineTo(4.446f, 3.0f),
                    PathNode.CurveTo(6.945f, 3.39f, 9.469f, 3.617f, 12.0f, 3.68f),
                    PathNode.CurveTo(14.530038f, 3.616621f, 17.053316f, 3.389479f, 19.554f, 3.0f),
                    PathNode.LineTo(21.0f, 4.315f),
                    PathNode.CurveTo(21.0f, 4.315f, 20.76f, 14.528f, 18.63f, 18.019f),
                    PathNode.CurveTo(18.47f, 18.279f, 14.984f, 21.0f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(11.0f, 13.282f),
                    PathNode.CurveTo(11.0f, 13.774f, 10.216f, 15.0f, 8.898f, 15.0f),
                    PathNode.CurveTo(7.58f, 15.0f, 6.0f, 14.034f, 6.0f, 12.938f),
                    PathNode.CurveTo(6.0f, 12.121f, 6.932f, 12.0f, 7.409f, 12.0f),
                    PathNode.CurveTo(7.637f, 12.0f, 11.0f, 12.111f, 11.0f, 13.282f)
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
        return _brandGrindr!!
    }

private var _brandGrindr: ImageVector? = null
