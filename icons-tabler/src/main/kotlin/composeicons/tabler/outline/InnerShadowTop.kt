package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerOutlineIcon(
            name = "InnerShadowTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.636f, 5.636f),
                    PathNode.CurveTo(2.12126f, 9.15074f, 2.12126f, 14.84926f, 5.636f, 18.364f),
                    PathNode.CurveTo(9.15074f, 21.87874f, 14.84926f, 21.87874f, 18.364f, 18.364f),
                    PathNode.CurveTo(21.87874f, 14.849259f, 21.87874f, 9.150741f, 18.364f, 5.636f),
                    PathNode.CurveTo(14.849259f, 2.12126f, 9.150741f, 2.12126f, 5.636f, 5.636f)
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
                    PathNode.MoveTo(16.243f, 7.757f),
                    PathNode.CurveTo(15.117752f, 6.631562f, 13.591475f, 5.999282f, 12.0f, 5.999282f),
                    PathNode.CurveTo(10.408525f, 5.999282f, 8.882248f, 6.631562f, 7.757f, 7.757f)
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
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null
