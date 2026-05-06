package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorThinIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 116c-6.437-.006-12.795 1.411-18.62 4.15L159 68h33c6.627 0 12 5.373 12 12 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C212 68.954 203.046 60 192 60h-40c-1.428 .001-2.747 .764-3.461 2.002-.714 1.237-.713 2.761 .001 3.998l15.16 26h-66.7L79.46 62C78.746 60.764 77.428 60.001 76 60h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h25.7L89.89 95.76 70.57 122.25C50.365 109.981 24.083 115.777 10.912 135.406c-13.171 19.629-8.57 46.147 10.443 60.192 19.013 14.046 45.712 10.65 60.603-7.709C96.85 169.532 94.666 142.707 77 127L94.29 103.3 128.54 162c.714 1.236 2.032 1.999 3.46 2 .702-.006 1.39-.192 2-.54 .919-.535 1.587-1.413 1.858-2.441 .27-1.028 .12-2.122-.418-3.039L101.61 99.98h66.74l14.11 24.19c-17.655 12.584-23.512 36.153-13.801 55.538 9.711 19.384 32.095 28.806 52.745 22.2 20.65-6.606 33.41-27.27 30.068-48.691C248.13 131.795 229.681 116.001 208 116ZM84 160c.008 16.278-10.908 30.537-26.624 34.776C41.659 199.016 25.053 192.181 16.874 178.107 8.695 164.032 10.978 146.22 22.443 134.664c11.465-11.556 29.258-13.981 43.397-5.914L44.77 157.64c-1.303 1.784-.914 4.287 .87 5.59 1.784 1.303 4.287 .914 5.59-.87L72.3 133.46C79.757 140.269 84.004 149.902 84 160ZM208 196c-15.516-.01-29.28-9.96-34.154-24.69-4.875-14.73 .237-30.927 12.684-40.19l18 30.9c.714 1.236 2.032 1.999 3.46 2 .702-.006 1.39-.192 2-.54 .919-.535 1.587-1.413 1.858-2.441 .27-1.028 .12-2.122-.418-3.039l-18-30.89c13.414-5.97 29.109-3.195 39.664 7.012 10.554 10.207 13.852 25.801 8.334 39.407C235.91 187.135 222.682 196.027 208 196Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
