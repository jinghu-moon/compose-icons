package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorThinIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v136c0 6.627 5.373 12 12 12h20v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h120v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h20c6.627 0 12-5.373 12-12v-136c0-6.627-5.373-12-12-12ZM216 196h-176c-2.209 0-4-1.791-4-4v-136c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4v68h-24.19C193.672 100.575 173.488 82.975 149.99 84.046 126.492 85.116 107.992 104.478 107.992 128c0 23.522 18.5 42.884 41.998 43.954 23.498 1.07 43.682-16.53 45.82-39.954h24.19v60c0 2.209-1.791 4-4 4ZM163.3 124c-1.948-5.51-7.583-8.815-13.343-7.827-5.76 .988-9.971 5.983-9.971 11.827 0 5.844 4.211 10.839 9.971 11.827 5.76 .988 11.395-2.317 13.343-7.827h24.47c-2.123 18.986-18.706 33.007-37.78 31.944C130.915 162.881 115.993 147.104 115.993 128c0-19.104 14.922-34.881 33.997-35.944 19.074-1.063 35.658 12.958 37.78 31.944Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
