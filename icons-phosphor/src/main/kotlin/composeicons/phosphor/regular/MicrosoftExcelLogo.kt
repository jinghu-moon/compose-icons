package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorRegularIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-128C63.163 24 56 31.163 56 40v24h-16C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h16v24c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM160 104h40v48h-40ZM200 88h-40v-8c0-8.837-7.163-16-16-16v-24h56ZM72 40h56v24h-56ZM40 80h104v79.83c0 .06 0 .11 0 .17 0 .06 0 .11 0 .17v15.83h-104ZM72 192h56v24h-56ZM144 216v-24c8.837 0 16-7.163 16-16v-8h40v48ZM65.85 146.88 81.59 128 65.85 109.12c-2.828-3.397-2.367-8.442 1.03-11.27 3.397-2.828 8.442-2.367 11.27 1.03L92 115.5 105.85 98.88c2.828-3.397 7.873-3.858 11.27-1.03 3.397 2.828 3.858 7.873 1.03 11.27L102.41 128l15.74 18.88c2.828 3.397 2.367 8.442-1.03 11.27-3.397 2.828-8.442 2.367-11.27-1.03L92 140.5 78.15 157.12c-2.828 3.397-7.873 3.858-11.27 1.03-3.397-2.828-3.858-7.873-1.03-11.27Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
