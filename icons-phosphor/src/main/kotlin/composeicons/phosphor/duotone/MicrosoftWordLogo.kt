package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorDuotoneIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 80v96c0 4.418-3.582 8-8 8h-104c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h104c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 24h-128C63.163 24 56 31.163 56 40v24h-16C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h16v24c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM160 104h40v48h-40ZM72 40h128v48h-40v-8c0-8.837-7.163-16-16-16h-72ZM40 80h104v79.83c0 .06 0 .11 0 .17 0 .06 0 .11 0 .17v15.83h-104ZM72 216v-24h72c8.837 0 16-7.163 16-16v-8h40v48ZM68.24 153.94l-12-48c-.749-2.792 .066-5.771 2.133-7.792 2.067-2.021 5.063-2.77 7.838-1.959 2.775 .811 4.896 3.056 5.549 5.872l6.76 27 6.32-12.66c1.353-2.715 4.126-4.431 7.16-4.431 3.034 0 5.807 1.716 7.16 4.431l6.32 12.66 6.76-27c1.131-4.216 5.433-6.747 9.667-5.688 4.235 1.059 6.839 5.316 5.853 9.568l-12 48c-.816 3.244-3.565 5.637-6.89 6-.289 .032-.579 .048-.87 .05-3.031 .002-5.803-1.709-7.16-4.42L92 137.89l-8.84 17.69c-1.496 2.997-4.702 4.744-8.031 4.378-3.33-.366-6.079-2.768-6.889-6.018Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
