package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTailwind: ImageVector
    get() {
        if (_brandTailwind != null) return _brandTailwind!!
        _brandTailwind = tablerOutlineIcon(
            name = "BrandTailwind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.667 6C9.177 6 7.623 7.222 7 9.667 7.933 8.444 9.023 7.987 10.267 8.292c.71 .174 1.217 .68 1.778 1.24 .916 .912 2 1.968 4.288 1.968 2.49 0 4.044-1.222 4.667-3.667-.933 1.223-2.023 1.68-3.267 1.375C17.023 9.034 16.516 8.528 15.955 7.968 15.039 7.056 13.98 6 11.667 6M7.667 12.5C5.177 12.5 3.623 13.722 3 16.167c.933-1.223 2.023-1.68 3.267-1.375 .71 .174 1.217 .68 1.778 1.24 .916 .912 1.975 1.968 4.288 1.968 2.49 0 4.044-1.222 4.667-3.667-.933 1.223-2.023 1.68-3.267 1.375-.71-.174-1.217-.68-1.778-1.24C11.039 13.556 9.98 12.5 7.667 12.5"),
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
        return _brandTailwind!!
    }

private var _brandTailwind: ImageVector? = null
