package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bean: ImageVector
    get() {
        if (_bean != null) return _bean!!
        _bean = lucideOutlineIcon(
            name = "Bean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.165f, 6.598f),
                    PathNode.CurveTo(9.954f, 7.478f, 9.64f, 8.36f, 9.0f, 9.0f),
                    PathNode.CurveTo(8.36f, 9.64f, 7.479f, 9.954f, 6.598f, 10.165f),
                    PathNode.CurveTo(3.639238f, 10.873587f, 1.679162f, 13.684537f, 2.037072f, 16.70584f),
                    PathNode.CurveTo(2.394982f, 19.727142f, 4.957573f, 22.002325f, 8.0f, 22.0f),
                    PathNode.CurveTo(15.732f, 22.0f, 22.0f, 15.732f, 22.0f, 8.0f),
                    PathNode.CurveTo(22.002325f, 4.957573f, 19.727142f, 2.394982f, 16.70584f, 2.037072f),
                    PathNode.CurveTo(13.684537f, 1.679162f, 10.873587f, 3.639238f, 10.165f, 6.598f),
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
                    PathNode.MoveTo(5.341f, 10.62f),
                    PathNode.CurveTo(6.065994f, 12.251468f, 7.784371f, 13.204968f, 9.552341f, 12.956808f),
                    PathNode.CurveTo(11.320311f, 12.708648f, 12.709781f, 11.318914f, 12.957606f, 9.550898f),
                    PathNode.CurveTo(13.205432f, 7.782881f, 12.251605f, 6.064684f, 10.62f, 5.34f)
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
        return _bean!!
    }

private var _bean: ImageVector? = null
