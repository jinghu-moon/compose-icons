package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorLightIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.6 148.8c-2.651 1.988-6.412 1.451-8.4-1.2C225.046 133.95 209.013 125.933 192 126c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 13.511-.003 24.768-10.353 25.903-23.816C219.037 76.721 209.671 64.632 196.352 62.368c-13.32-2.264-26.154 6.051-29.532 19.132-.828 3.209-4.101 5.138-7.31 4.31-3.209-.828-5.138-4.101-4.31-7.31 4.143-16.112 18.284-27.656 34.9-28.49 16.615-.833 31.841 9.238 37.575 24.855 5.734 15.617 .642 33.148-12.565 43.264 11.832 4.415 22.14 12.147 29.69 22.27 1.988 2.651 1.451 6.412-1.2 8.4ZM189.19 213c.797 1.378 1.015 3.016 .604 4.554-.411 1.538-1.416 2.85-2.794 3.646-.91 .533-1.946 .813-3 .81-2.145 .001-4.128-1.142-5.2-3C168.189 201.031 148.866 189.999 127.99 189.999c-20.876 0-40.199 11.032-50.81 29.011-1.022 1.953-3.032 3.188-5.235 3.218-2.204 .03-4.246-1.151-5.32-3.075-1.074-1.924-1.007-4.283 .176-6.143C74.972 198.969 87.768 188.202 103 182.55 85.912 171.455 78.158 150.441 83.944 130.906c5.786-19.535 23.732-32.937 44.106-32.937 20.374 0 38.321 13.402 44.106 32.937 5.786 19.535-1.968 40.549-19.056 51.644 15.189 5.671 27.943 16.432 36.09 30.45ZM128 178c18.778 0 34-15.222 34-34 0-18.778-15.222-34-34-34-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34ZM70 120c0-3.314-2.686-6-6-6C50.491 113.996 39.236 103.647 38.1 90.185 36.965 76.724 46.327 64.636 59.645 62.369c13.318-2.267 26.153 6.042 29.535 19.121 .828 3.209 4.101 5.138 7.31 4.31 3.209-.828 5.138-4.101 4.31-7.31C96.657 62.378 82.516 50.834 65.9 50 49.285 49.167 34.059 59.239 28.325 74.856c-5.734 15.617-.642 33.148 12.565 43.264-11.833 4.418-22.141 12.153-29.69 22.28-1.988 2.651-1.451 6.412 1.2 8.4 2.651 1.988 6.412 1.451 8.4-1.2C30.954 133.95 46.987 125.933 64 126c3.314 0 6-2.686 6-6Z"),
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
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
