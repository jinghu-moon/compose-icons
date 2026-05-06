package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorLightIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 26h-144C51.013 26 34 43.013 34 64v72c0 12.15 9.85 22 22 22h48c.573-.004 1.12 .238 1.502 .665 .382 .426 .564 .996 .498 1.565L98.08 207c-.051 .331-.078 .665-.08 1 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30-.002-.335-.029-.669-.08-1L150 160.23c-.066-.569 .115-1.139 .498-1.565 .382-.426 .929-.668 1.502-.665h48c12.15 0 22-9.85 22-22v-104c0-3.314-2.686-6-6-6ZM72 38h106v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h20v68h-164v-42C46 49.641 57.641 38 72 38ZM200 146h-48c-4.063-.001-7.925 1.763-10.585 4.833-2.66 3.071-3.855 7.146-3.275 11.167v.15L146 208.47c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18l7.82-46.34v-.15c.573-4.011-.62-8.073-3.27-11.138C111.9 147.777 108.052 146.011 104 146h-48c-5.523 0-10-4.477-10-10v-18h164v18c0 5.523-4.477 10-10 10Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
