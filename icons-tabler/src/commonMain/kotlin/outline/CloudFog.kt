package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = tablerOutlineIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.CurveTo(4.401752f, 16.0f, 2.295455f, 13.985281f, 2.295455f, 11.5f),
                    PathNode.CurveTo(2.295455f, 9.014719f, 4.401752f, 7.0f, 7.0f, 7.0f),
                    PathNode.CurveTo(7.61365f, 4.266191f, 10.573545f, 2.497715f, 13.611111f, 3.05f),
                    PathNode.CurveTo(16.648678f, 3.602285f, 18.61365f, 6.266191f, 18.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(20.932997f, 9.0f, 22.5f, 10.567003f, 22.5f, 12.5f),
                    PathNode.CurveTo(22.5f, 14.432997f, 20.932997f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(7.0f, 16.0f)
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
                    PathNode.MoveTo(5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f)
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
