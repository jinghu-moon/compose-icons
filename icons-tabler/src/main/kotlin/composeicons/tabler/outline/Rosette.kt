package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rosette: ImageVector
    get() {
        if (_rosette != null) return _rosette!!
        _rosette = tablerOutlineIcon(
            name = "Rosette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 7.2C5 5.985 5.985 5 7.2 5h1c.581-0 1.138-.23 1.55-.64l.7-.7c.413-.415 .974-.649 1.56-.649 .586 0 1.147 .233 1.56 .649l.7 .7c.412 .41 .97 .64 1.55 .64h1c1.215 0 2.2 .985 2.2 2.2v1c0 .58 .23 1.138 .64 1.55l.7 .7c.415 .413 .649 .974 .649 1.56 0 .586-.233 1.147-.649 1.56l-.7 .7c-.41 .412-.64 .969-.64 1.55v1c0 1.215-.985 2.2-2.2 2.2h-1c-.581 0-1.138 .23-1.55 .64l-.7 .7c-.413 .415-.974 .649-1.56 .649-.586 0-1.147-.233-1.56-.649l-.7-.7c-.412-.41-.969-.64-1.55-.64h-1C5.985 19.02 5 18.035 5 16.82v-1c-0-.581-.23-1.138-.64-1.55l-.7-.7c-.415-.413-.649-.974-.649-1.56 0-.586 .233-1.147 .649-1.56l.7-.7C4.77 9.338 5 8.781 5 8.2v-1"),
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
        return _rosette!!
    }

private var _rosette: ImageVector? = null
