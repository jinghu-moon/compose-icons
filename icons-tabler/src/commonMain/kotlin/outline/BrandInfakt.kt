package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandInfakt: ImageVector
    get() {
        if (_brandInfakt != null) return _brandInfakt!!
        _brandInfakt = tablerOutlineIcon(
            name = "BrandInfakt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.936f, 6.063f),
                    PathNode.CurveTo(14.936f, 7.719855f, 16.279146f, 9.063f, 17.936f, 9.063f),
                    PathNode.CurveTo(19.592854f, 9.063f, 20.936f, 7.719855f, 20.936f, 6.063f),
                    PathNode.CurveTo(20.936f, 4.406146f, 19.592854f, 3.063f, 17.936f, 3.063f),
                    PathNode.CurveTo(16.279146f, 3.063f, 14.936f, 4.406146f, 14.936f, 6.063f)
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
                    PathNode.MoveTo(5.52f, 5.0f),
                    PathNode.CurveTo(5.522f, 4.967f, 3.83f, 6.568f, 6.54f, 8.733f),
                    PathNode.CurveTo(5.448f, 10.748f, 7.393f, 11.725f, 7.393f, 11.725f),
                    PathNode.CurveTo(6.421f, 13.604f, 8.783f, 14.53f, 8.783f, 14.53f),
                    PathNode.CurveTo(7.783f, 16.92f, 6.783f, 19.21f, 5.228f, 20.984f),
                    PathNode.CurveTo(6.723f, 21.074f, 7.268f, 20.788f, 8.128001f, 20.14f),
                    PathNode.CurveTo(11.514f, 17.588f, 13.065f, 13.669f, 13.893f, 11.52f),
                    PathNode.CurveTo(14.278f, 10.519f, 13.57f, 9.05f, 12.646f, 8.556f),
                    PathNode.CurveTo(10.126f, 7.206f, 5.468f, 5.03f, 5.519f, 5.001f)
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
        return _brandInfakt!!
    }

private var _brandInfakt: ImageVector? = null
