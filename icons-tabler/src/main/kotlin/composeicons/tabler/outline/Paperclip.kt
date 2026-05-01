package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = tablerOutlineIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.LineTo(8.5f, 13.5f),
                    PathNode.CurveTo(7.671573f, 14.328427f, 7.671573f, 15.671573f, 8.5f, 16.5f),
                    PathNode.CurveTo(9.328427f, 17.328426f, 10.671573f, 17.328426f, 11.5f, 16.5f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(19.656855f, 8.343146f, 19.656855f, 5.656854f, 18.0f, 4.0f),
                    PathNode.CurveTo(16.343145f, 2.343146f, 13.656855f, 2.343146f, 12.0f, 4.0f),
                    PathNode.LineTo(5.5f, 10.5f),
                    PathNode.CurveTo(3.014719f, 12.985281f, 3.014719f, 17.01472f, 5.5f, 19.5f),
                    PathNode.CurveTo(7.985282f, 21.98528f, 12.014719f, 21.98528f, 14.5f, 19.5f),
                    PathNode.LineTo(21.0f, 13.0f)
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
