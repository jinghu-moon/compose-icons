package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorLightIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.54 94.77C213.119 87.796 206.065 82.264 198 78.66 197.273 49.361 173.308 25.991 144 26h-60c-6.422 0-12.02 4.37-13.58 10.6l-36 144c-1.047 4.183-.109 8.615 2.544 12.014 2.653 3.399 6.724 5.386 11.036 5.386h30.07l-3.65 14.6c-1.047 4.183-.109 8.615 2.544 12.014 2.653 3.399 6.724 5.386 11.036 5.386h31.5c6.422-0 12.02-4.37 13.58-10.6l9-35.88c.219-.885 1.008-1.51 1.92-1.52h32c20.641-.002 39.476-11.77 48.527-30.321 9.051-18.551 6.735-40.639-5.967-56.909ZM79.51 186h-31.51c-.617 0-1.199-.284-1.579-.771-.379-.487-.513-1.121-.361-1.719L82.06 39.51C82.284 38.622 83.084 38 84 38h60c21.214-.002 39.099 15.815 41.69 36.87C182.492 74.292 179.249 74.001 176 74h-56c-6.426-.004-12.029 4.367-13.59 10.6l-25 99.89c-.221 .874-.999 1.492-1.9 1.51ZM185.37 87.05c-.18 1-.39 2.09-.65 3.14C180.066 108.889 163.269 122.01 144 122h-34.56l8.62-34.48c.221-.892 1.021-1.519 1.94-1.52h56c3.153 .001 6.295 .353 9.37 1.05ZM216.72 138.19C212.066 156.889 195.269 170.01 176 170h-32c-6.422 0-12.02 4.37-13.58 10.6l-9 35.89c-.224 .888-1.024 1.51-1.94 1.51h-31.48c-.617 0-1.199-.284-1.579-.771-.379-.487-.513-1.121-.361-1.719l20-80c.226-.914 1.059-1.547 2-1.52h36c24.785 .026 46.395-16.848 52.38-40.9 .14-.55 .25-1.1 .36-1.64 16.389 9.331 24.564 28.431 20 46.73Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
