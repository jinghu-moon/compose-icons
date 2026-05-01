package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = tablerOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(12.132f, 3.0f, 12.263f, 3.0f, 12.393f, 3.0f),
                    PathNode.CurveTo(9.742154f, 5.463165f, 9.228035f, 9.467849f, 11.170733f, 12.520731f),
                    PathNode.CurveTo(13.113432f, 15.573612f, 16.958923f, 16.804062f, 20.313f, 15.446f),
                    PathNode.CurveTo(18.5803f, 19.61513f, 14.026814f, 21.8553f, 9.666632f, 20.683678f),
                    PathNode.CurveTo(5.30645f, 19.512054f, 2.489088f, 15.291264f, 3.079442f, 10.815175f),
                    PathNode.CurveTo(3.669797f, 6.339086f, 7.485148f, 2.993089f, 12.0f, 2.992f),
                    PathNode.LineTo(12.0f, 3.0f)
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
        return _moon!!
    }

private var _moon: ImageVector? = null
