package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorDuotoneIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96c-.009 22.643-11.981 43.597-31.485 55.101-19.503 11.504-43.634 11.846-63.455 .899L73 217c-9.389 9.389-24.611 9.389-34 0-9.389-9.389-9.389-24.611 0-34l65-56.06C90.895 103.224 94.145 73.824 112.115 53.544 130.084 33.263 158.878 26.496 184 36.65L144 80l5.66 26.34L176 112 219.35 72c3.083 7.625 4.661 15.775 4.65 24Z"),
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
                pathData = parseSvgPathData("M226.76 69c-.985-2.435-3.102-4.231-5.665-4.806-2.563-.575-5.244 .145-7.175 1.926l-40.3 37.19L156.39 99.61 152.69 82.38 189.88 42.08c1.781-1.931 2.5-4.612 1.926-7.175-.575-2.563-2.371-4.68-4.806-5.665-22.196-8.979-47.404-6.336-67.255 7.051C99.893 49.677 87.995 72.057 88 96c-.013 9.957 2.03 19.809 6 28.94L33.79 177c-.15 .12-.29 .26-.43 .39-12.498 12.498-12.498 32.762 0 45.26 12.498 12.498 32.762 12.498 45.26 0 .13-.13 .27-.28 .39-.42L131.06 162c22.275 9.778 47.982 7.647 68.342-5.666C219.763 143.021 232.024 120.327 232 96c.016-9.254-1.764-18.423-5.24-27ZM160 152c-9.469-.013-18.781-2.421-27.07-7-3.309-1.828-7.447-1.09-9.92 1.77L67.11 211.51c-6.291 5.976-16.198 5.85-22.334-.286-6.136-6.136-6.262-16.043-.286-22.334L109.18 133c2.865-2.474 3.604-6.618 1.77-9.93-10.407-18.822-9.114-41.941 3.326-59.486C126.715 46.039 148.104 37.168 169.31 40.76L138.11 74.57c-1.762 1.911-2.485 4.559-1.94 7.1L141.83 108c.661 3.076 3.064 5.479 6.14 6.14l26.35 5.66c2.541 .545 5.189-.178 7.1-1.94L215.23 86.66c2.728 16.253-1.834 32.883-12.472 45.47C192.119 144.716 176.48 151.983 160 152Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
