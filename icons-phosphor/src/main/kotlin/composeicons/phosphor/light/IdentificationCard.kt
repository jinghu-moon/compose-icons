package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorLightIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 112c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM192 138h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 56v144c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-144C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM218 56c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v144c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2ZM133.81 166.51c.828 3.209-1.101 6.482-4.31 7.31-3.209 .828-6.482-1.101-7.31-4.31C119.34 158.38 108.08 150 96 150c-12.08 0-23.33 8.38-26.19 19.5-.828 3.209-4.101 5.138-7.31 4.31-3.209-.828-5.138-4.101-4.31-7.31C60.906 156.451 67.626 147.956 76.78 143 67.087 134.909 63.498 121.615 67.801 109.745 72.104 97.875 83.379 89.97 96.005 89.97c12.626 0 23.901 7.905 28.204 19.775 4.303 11.87 .714 25.164-8.979 33.255 9.152 4.961 15.868 13.459 18.58 23.51ZM96 138c9.941 0 18-8.059 18-18 0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18Z"),
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
