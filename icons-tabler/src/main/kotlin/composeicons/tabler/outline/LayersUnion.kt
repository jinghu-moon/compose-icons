package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersUnion: ImageVector
    get() {
        if (_layersUnion != null) return _layersUnion!!
        _layersUnion = tablerOutlineIcon(
            name = "LayersUnion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 16v2c0 1.105-.895 2-2 2h-8C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8h2v-2C8 4.895 8.895 4 10 4h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _layersUnion!!
    }

private var _layersUnion: ImageVector? = null
