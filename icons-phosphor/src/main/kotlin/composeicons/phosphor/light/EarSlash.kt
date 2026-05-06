package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorLightIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L55.72 57.41C46.731 71.283 41.964 87.469 42 104c0 32.64 12.12 44.33 21.85 53.71C71.76 165.34 78 171.36 78 188c.033 27.601 22.399 49.967 50 50 14.34 0 26.66-6.12 36.63-18.18 2.11-2.557 1.747-6.34-.81-8.45-2.557-2.11-6.34-1.747-8.45 .81C147.69 221.48 138.74 226 128 226 107.013 226 90 208.987 90 188 90 166.26 80.94 157.52 72.18 149.08 62.83 140.06 54 131.55 54 104 53.972 90.869 57.466 77.971 64.12 66.65L84.49 89.06C82.84 93.868 81.999 98.917 82 104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .006-1.401 .093-2.799 .26-4.19l45.15 49.66c-.944 3.43-1.418 6.972-1.41 10.53 .002 7.212 3.538 13.965 9.464 18.074 5.927 4.109 13.491 5.053 20.246 2.526L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM150.08 161.25l7.78 8.55c-4.157-.916-7.279-4.363-7.78-8.59ZM81.83 38.38c-1.695-2.842-.769-6.52 2.07-8.22 26.575-15.873 59.629-16.24 86.55-.961C197.37 44.478 214.003 73.046 214 104c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C202.006 77.365 187.697 52.781 164.534 39.631 141.371 26.481 112.928 26.794 90.06 40.45c-1.366 .817-3 1.058-4.544 .67-1.543-.388-2.869-1.374-3.686-2.74ZM158.66 117.25c2.194-4.072 3.342-8.625 3.34-13.25C162 93.025 156.701 82.725 147.773 76.342 138.845 69.96 127.385 68.279 117 71.83c-3.114 1.006-6.459-.669-7.52-3.764-1.061-3.095 .554-6.47 3.63-7.586 14.05-4.807 29.557-2.535 41.638 6.1C166.829 75.214 173.999 89.15 174 104c-.002 6.542-1.609 12.983-4.68 18.76-.977 1.917-2.906 3.163-5.055 3.267-2.149 .104-4.189-.951-5.347-2.764-1.158-1.813-1.256-4.108-.258-6.013Z"),
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
