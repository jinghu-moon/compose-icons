package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorLightIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 82c-5.204-.006-10.29 1.559-14.59 4.49C171.296 76.775 163.827 69.116 154.168 66.759 144.508 64.402 134.351 67.76 128 75.41 121.003 66.987 109.48 63.85 99.179 67.565 88.879 71.28 82.01 81.05 82 92v22h-14c-14.359 0-26 11.641-26 26v12c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86v-44C214 93.641 202.359 82 188 82ZM202 152c0 40.869-33.131 74-74 74C87.131 226 54 192.869 54 152v-12c0-7.732 6.268-14 14-14h14v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-60c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v28c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-28c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v28c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-12c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
