package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorBoldIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 68c-1.88 0-3.76 .08-5.62 .22-5.681-9.137-12.862-17.251-21.24-24C110 12.6 56.56 19.8 54.3 20.12c-4.929 .692-8.92 4.355-10.029 9.208-1.11 4.852 .891 9.886 5.029 12.652C64.52 52.1 72.13 68.45 75.71 85 43.022 90.309 17.535 116.174 12.707 148.936c-4.828 32.762 12.114 64.88 41.88 79.393 29.767 14.513 65.504 8.082 88.343-15.899 28.154 13.604 61.768 8.576 84.709-12.672 22.941-21.248 30.527-54.378 19.117-83.49C235.345 87.155 207.269 68.002 176 68ZM153.24 121.06C149.842 115.398 145.728 110.199 141 105.59c4.722-4.294 10.193-7.683 16.14-10 2.282 6.13 3.996 12.456 5.12 18.9-3.904 .574-7.276 3.03-9.02 6.57ZM134.19 63c4.166 3.382 7.933 7.227 11.23 11.46C136.236 78.496 127.938 84.304 121 91.55 114.418 88.369 107.408 86.163 100.19 85 97.72 71.05 93 56.65 84.58 44c15.2 1.68 34.17 6.48 49.61 19ZM88 212C61.154 211.974 38.741 191.517 36.27 164.786 33.799 138.054 52.084 113.835 78.47 108.89c.199 7.205-.051 14.416-.75 21.59-6.208-.854-12.028 3.212-13.361 9.335-1.333 6.123 2.27 12.241 8.271 14.045 10.048 2.853 20.692 2.853 30.74 0 5.378-1.585 8.941-6.684 8.582-12.279-.359-5.595-4.545-10.196-10.082-11.081 .589-6.786 .82-13.599 .69-20.41 24.825 7.259 40.541 31.66 36.883 57.265C135.785 192.959 113.865 211.983 88 212ZM176 196c-6.589 .005-13.118-1.244-19.24-3.68 8.043-17.018 9.468-36.419 4-54.43 10.024 2.833 20.636 2.833 30.66 0 5.953-1.782 9.561-7.813 8.316-13.901-1.245-6.088-6.931-10.218-13.106-9.519-1.087-7.513-2.8-14.922-5.12-22.15 27.383 3.049 47.634 26.927 46.172 54.44C226.22 174.273 203.552 195.87 176 196Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
