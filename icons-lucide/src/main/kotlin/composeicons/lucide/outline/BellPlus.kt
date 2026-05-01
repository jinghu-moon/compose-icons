package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellPlus: ImageVector
    get() {
        if (_bellPlus != null) return _bellPlus!!
        _bellPlus = lucideOutlineIcon(
            name = "BellPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.268f, 21.0f),
                    PathNode.CurveTo(10.625278f, 21.618753f, 11.285505f, 21.999912f, 12.0f, 21.999912f),
                    PathNode.CurveTo(12.714495f, 21.999912f, 13.374722f, 21.618753f, 13.732f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f)
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
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 11.0f)
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
                    PathNode.MoveTo(20.002f, 14.464f),
                    PathNode.CurveTo(20.22959f, 14.766914f, 20.47608f, 15.055155f, 20.74f, 15.327f),
                    PathNode.CurveTo(21.006483f, 15.619871f, 21.075062f, 16.042395f, 20.914888f, 16.404514f),
                    PathNode.CurveTo(20.754717f, 16.766636f, 20.395962f, 17.000141f, 20.0f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(3.604038f, 17.000141f, 3.245284f, 16.766636f, 3.085111f, 16.404514f),
                    PathNode.CurveTo(2.924938f, 16.042395f, 2.993517f, 15.619871f, 3.26f, 15.327f),
                    PathNode.CurveTo(4.59f, 13.956f, 6.0f, 12.499f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.000238f, 5.907336f, 7.090779f, 3.965984f, 8.877792f, 2.87703f),
                    PathNode.CurveTo(10.664806f, 1.788074f, 12.890081f, 1.708862f, 14.75f, 2.668f)
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
        return _bellPlus!!
    }

private var _bellPlus: ImageVector? = null
