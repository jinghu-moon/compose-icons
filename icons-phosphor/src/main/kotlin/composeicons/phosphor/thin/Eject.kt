package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorThinIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 156h-160c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 192c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM48.23 132h159.54c4.887 .071 9.329-2.828 11.23-7.33 1.892-4.344 .971-9.401-2.33-12.8L143 34.37c-3.912-4.07-9.314-6.371-14.96-6.371-5.646 0-11.048 2.3-14.96 6.371L39.3 111.87c-3.291 3.406-4.199 8.462-2.3 12.8 1.901 4.502 6.343 7.401 11.23 7.33ZM45.1 117.39 118.83 39.88c2.407-2.479 5.715-3.878 9.17-3.878 3.455 0 6.763 1.399 9.17 3.878l73.73 77.51c1.095 1.076 1.403 2.721 .77 4.12-.663 1.554-2.211 2.543-3.9 2.49h-159.54c-1.689 .053-3.237-.936-3.9-2.49-.633-1.399-.325-3.044 .77-4.12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _eject!!
    }

private var _eject: ImageVector? = null
