package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorRegularIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515l-52-57.15c-19.113-7.584-40.778-4.851-57.41 7.24-2.307 1.743-5.375 2.106-8.025 .949-2.65-1.157-4.469-3.654-4.758-6.531-.289-2.877 .997-5.686 3.363-7.348C96.235 149.046 111.915 143.951 128 144c1.28 0 2.55 0 3.82 .1L104.9 114.49C88.875 118.006 73.862 125.126 61 135.31c-1.666 1.327-3.792 1.934-5.907 1.689-2.115-.246-4.045-1.325-5.363-2.999C46.985 130.547 47.553 125.523 51 122.77c12.399-9.807 26.556-17.159 41.71-21.66L69.37 75.4c-14.567 5.916-28.151 14.008-40.29 24-3.424 2.806-8.474 2.304-11.28-1.12C14.994 94.856 15.496 89.806 18.92 87 30.808 77.241 43.952 69.122 58 62.86L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM128 192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM237.08 87C200.417 56.974 153.005 43.374 106 49.4c-2.888 .295-5.39 2.131-6.537 4.798-1.147 2.667-.759 5.746 1.014 8.045 1.773 2.299 4.652 3.457 7.523 3.026 6.633-.845 13.313-1.269 20-1.27 36.067 .02 71.017 12.516 98.92 35.37 3.416 2.806 8.459 2.311 11.265-1.105 2.806-3.416 2.311-8.459-1.105-11.265ZM195 135.31c1.663 1.318 3.781 1.922 5.889 1.678 2.108-.244 4.033-1.315 5.351-2.978 1.318-1.663 1.922-3.781 1.678-5.889-.244-2.108-1.315-4.033-2.978-5.351C189.81 110.796 172.098 102.511 153.21 98.57c-2.83-.651-5.79 .283-7.735 2.44-1.944 2.157-2.567 5.198-1.628 7.945 .94 2.748 3.294 4.77 6.152 5.285 16.432 3.435 31.839 10.648 45 21.07Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
