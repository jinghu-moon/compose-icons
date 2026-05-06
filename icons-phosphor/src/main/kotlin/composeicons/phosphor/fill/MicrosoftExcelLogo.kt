package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorFillIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-128C63.163 24 56 31.163 56 40v24h-16C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h16v24c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM72 160c-3.104 .001-5.929-1.794-7.247-4.605-1.318-2.811-.89-6.13 1.097-8.515L81.59 128 65.85 109.12c-2.828-3.397-2.367-8.442 1.03-11.27 3.397-2.828 8.442-2.367 11.27 1.03L92 115.5 105.85 98.88c2.828-3.397 7.873-3.858 11.27-1.03 3.397 2.828 3.858 7.873 1.03 11.27L102.41 128l15.74 18.88c2.828 3.397 2.367 8.442-1.03 11.27-3.397 2.828-8.442 2.367-11.27-1.03L92 140.5 78.15 157.12C76.629 158.946 74.376 160.001 72 160ZM128 216h-56v-24h56ZM128 64h-56v-24h56ZM200 216h-56v-24c8.837 0 16-7.163 16-16v-8h40ZM200 152h-40v-48h40ZM200 88h-40v-8c0-8.837-7.163-16-16-16v-24h56Z"),
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
