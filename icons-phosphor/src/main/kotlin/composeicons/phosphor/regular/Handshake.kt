package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorRegularIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254.3 107.91 228.78 56.85c-1.899-3.795-5.228-6.681-9.254-8.022-4.027-1.341-8.421-1.027-12.216 .872L182.44 62.13 130.05 48.27c-1.344-.35-2.756-.35-4.1 0L73.56 62.13 48.69 49.7C44.895 47.801 40.501 47.487 36.474 48.828c-4.027 1.341-7.355 4.227-9.254 8.022L1.7 107.9c-1.899 3.795-2.213 8.189-.872 12.216 1.341 4.027 4.227 7.355 8.022 9.254l27 13.51 55.49 39.63c.818 .582 1.737 1.006 2.71 1.25l64 16c2.726 .684 5.611-.113 7.6-2.1l55.07-55.08 26.42-13.21c7.898-3.954 11.098-13.559 7.15-21.46ZM199.41 141.28 165 113.72c-3.193-2.557-7.799-2.294-10.68 .61C136.51 132.27 116.66 130 104 122L147.24 80h31.81l27.21 54.41ZM41.53 64 62 74.22 36.43 125.27 16 115.06ZM157.53 183.13 99.42 168.61 50.22 133.47l28-56L128 64.28l9.8 2.59-45 43.68-.08 .09c-3.431 3.431-5.12 8.234-4.591 13.057 .529 4.823 3.218 9.146 7.311 11.753 20.56 13.13 45.37 11 64.91-5L188 152.66ZM219.53 125.26l-25.52-51L214.47 64 240 115.06ZM131.78 217.93c-.889 3.557-4.083 6.055-7.75 6.06-.657-.001-1.312-.081-1.95-.24L80.41 213.33c-.975-.24-1.894-.665-2.71-1.25L51.35 193.26c-3.366-2.643-4.056-7.466-1.566-10.947 2.49-3.48 7.278-4.385 10.866-2.053l25.11 17.94L126 208.24c4.285 1.072 6.891 5.414 5.82 9.7Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null
