package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorBoldIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 108c0-6.627 5.373-12 12-12h28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28c-6.627 0-12-5.373-12-12ZM188 136h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM236 56v144c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v136h168ZM58.28 159.37C61.159 152.554 65.718 146.579 71.53 142 60.082 127.208 61.869 106.114 75.642 93.458c13.773-12.655 34.943-12.655 48.715 0 13.773 12.655 15.56 33.75 4.112 48.542 5.815 4.578 10.377 10.554 13.26 17.37 2.557 6.117-.328 13.148-6.445 15.705-6.117 2.557-13.148-.328-15.705-6.445C116.48 161.19 108.42 156 100 156c-8.42 0-16.47 5.2-19.59 12.63-1.567 4.083-5.23 6.99-9.561 7.588-4.332 .598-8.646-1.207-11.261-4.712-2.615-3.505-3.116-8.155-1.308-12.136ZM88 120c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
