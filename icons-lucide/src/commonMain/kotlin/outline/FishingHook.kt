package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishingHook: ImageVector
    get() {
        if (_fishingHook != null) return _fishingHook!!
        _fishingHook = lucideOutlineIcon(
            name = "FishingHook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.586f, 11.414f),
                    PathNode.LineTo(11.656f, 17.344f),
                    PathNode.CurveTo(9.446861f, 19.553139f, 5.865139f, 19.553139f, 3.656f, 17.344f),
                    PathNode.CurveTo(1.446861f, 15.134861f, 1.446861f, 11.553139f, 3.656f, 9.344f),
                    PathNode.LineTo(6.793f, 6.207f),
                    PathNode.CurveTo(6.995203f, 6.004736f, 7.29935f, 5.944218f, 7.563578f, 6.053675f),
                    PathNode.CurveTo(7.827806f, 6.163131f, 8.000061f, 6.420998f, 8.0f, 6.707f),
                    PathNode.LineTo(8.0f, 10.0f)
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
                    PathNode.MoveTo(20.414f, 8.586f),
                    PathNode.LineTo(22.0f, 7.0f)
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
                    PathNode.MoveTo(21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 11.104569f, 20.10457f, 12.0f, 19.0f, 12.0f),
                    PathNode.CurveTo(17.89543f, 12.0f, 17.0f, 11.104569f, 17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 8.895431f, 17.89543f, 8.0f, 19.0f, 8.0f),
                    PathNode.CurveTo(20.10457f, 8.0f, 21.0f, 8.895431f, 21.0f, 10.0f),
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
        return _fishingHook!!
    }

private var _fishingHook: ImageVector? = null
