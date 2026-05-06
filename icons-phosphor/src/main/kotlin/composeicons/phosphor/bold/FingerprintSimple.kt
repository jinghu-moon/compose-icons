package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FingerprintSimple: ImageVector
    get() {
        if (_fingerprintSimple != null) return _fingerprintSimple!!
        _fingerprintSimple = phosphorBoldIcon(
            name = "FingerprintSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 128c.001 26.431-6.709 52.43-19.5 75.56-3.214 5.799-10.521 7.894-16.32 4.68-5.799-3.214-7.894-10.521-4.68-16.32C62.325 172.355 68.003 150.36 68 128c.002-23.583 13.819-44.977 35.312-54.68 21.494-9.703 46.678-5.916 64.368 9.68 4.971 4.385 5.445 11.969 1.06 16.94-4.385 4.971-11.969 5.445-16.94 1.06C141.186 91.648 126.079 89.378 113.186 95.2 100.293 101.021 92.004 113.854 92 128ZM176.16 120h-.16c-6.55-.001-11.891 5.251-12 11.8-.422 28.435-6.189 56.537-17 82.84-1.737 3.984-1.183 8.596 1.447 12.057 2.63 3.46 6.926 5.228 11.23 4.62 4.304-.607 7.943-3.494 9.513-7.547C181.152 194.698 187.533 163.633 188 132.2c.053-3.191-1.167-6.272-3.39-8.562-2.224-2.289-5.268-3.599-8.46-3.638ZM113.94 201.21c-5.949-2.872-13.101-.396-16 5.54-1.37 2.81-2.85 5.65-4.38 8.42-3.212 5.799-1.114 13.103 4.685 16.315 5.799 3.212 13.103 1.114 16.315-4.685 1.74-3.14 3.41-6.35 5-9.55 1.386-2.873 1.571-6.179 .515-9.189-1.056-3.01-3.268-5.475-6.145-6.851ZM128 116c-6.627 0-12 5.373-12 12 .005 13.89-1.589 27.734-4.75 41.26-1.512 6.45 2.49 12.905 8.94 14.42 .901 .214 1.824 .322 2.75 .32 5.567-.006 10.399-3.84 11.67-9.26C138.198 159.419 140.007 143.735 140 128c0-6.627-5.373-12-12-12ZM128 20c-10.673-.008-21.288 1.565-31.5 4.67-6.351 1.933-9.933 8.649-8 15 1.933 6.351 8.649 9.933 15 8 25.458-7.736 53.075-2.962 74.459 12.87C199.343 76.372 211.969 101.393 212 128c.009 20.637-2.285 41.211-6.84 61.34-.705 3.104-.147 6.362 1.55 9.055 1.697 2.693 4.395 4.602 7.5 5.305 .872 .202 1.765 .303 2.66 .3 5.602-.001 10.458-3.877 11.7-9.34C233.515 172.785 236.007 150.427 236 128 235.934 68.381 187.619 20.066 128 20ZM68.47 51.74C66.218 49.481 63.16 48.211 59.97 48.211c-3.19 0-6.248 1.27-8.5 3.529C31.238 71.952 19.91 99.402 20 128c.033 12.081-2.564 24.024-7.61 35-1.908 3.915-1.546 8.556 .946 12.127 2.493 3.571 6.724 5.511 11.057 5.07 4.333-.442 8.086-3.196 9.807-7.197C40.691 158.888 44.035 143.533 44 128 43.937 105.761 52.757 84.417 68.5 68.71c4.678-4.695 4.664-12.292-.03-16.97Z"),
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
        return _fingerprintSimple!!
    }

private var _fingerprintSimple: ImageVector? = null
