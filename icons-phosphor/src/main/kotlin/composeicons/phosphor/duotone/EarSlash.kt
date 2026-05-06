package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorDuotoneIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104c0 40-14.44 72-48 112-8.07 9.77-18.34 16-32 16C103.699 232 84 212.301 84 188 84 146.51 48 160 48 104 48 59.817 83.817 24 128 24c44.183 0 80 35.817 80 80Z"),
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
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515l-35-38.45c-7.281 2.248-15.197 .905-21.328-3.619C139.62 174.787 136.001 167.62 136 160c-.011-3.37 .395-6.729 1.21-10L96 104.66c-.182 4.418-3.912 7.852-8.33 7.67C83.252 112.148 79.818 108.418 80 104c-.006-4.905 .743-9.782 2.22-14.46L64.5 70C58.889 80.452 55.968 92.137 56 104c0 26.7 8.53 34.92 17.57 43.64C82.21 156 92 165.41 92 188c0 19.882 16.118 36 36 36 10.24 0 18.45-4.16 25.83-13.09 1.799-2.267 4.683-3.386 7.54-2.925 2.857 .461 5.243 2.429 6.239 5.147 .995 2.718 .445 5.761-1.438 7.958C155.81 233.64 143 240 128 240 99.295 239.967 76.033 216.705 76 188 76 172.21 70.32 166.73 62.46 159.16 52.46 149.5 40 137.5 40 104 39.959 87.606 44.537 71.532 53.21 57.62L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM91.09 42.17c22.25-13.284 49.921-13.588 72.457-.794C186.082 54.17 200.004 78.086 200 104c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C216.005 72.324 198.985 43.09 171.437 27.454 143.889 11.819 110.063 12.195 82.87 28.44c-3.791 2.27-5.025 7.184-2.755 10.975 2.27 3.791 7.184 5.025 10.975 2.755ZM160.32 127.17c1.886 .974 4.081 1.158 6.103 .513 2.022-.645 3.704-2.067 4.677-3.953 3.227-6.075 4.91-12.851 4.9-19.73 .005-15.505-7.48-30.057-20.095-39.071C143.289 55.915 127.096 53.551 112.43 58.58c-4.181 1.433-6.408 5.984-4.975 10.165 1.433 4.181 5.984 6.408 10.165 4.975 9.778-3.353 20.573-1.776 28.983 4.233C155.014 83.962 160.003 93.663 160 104c-.002 4.308-1.074 8.549-3.12 12.34-.974 1.886-1.158 4.081-.513 6.103 .645 2.022 2.067 3.704 3.953 4.677Z"),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
