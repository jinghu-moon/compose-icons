package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FingerprintSimple: ImageVector
    get() {
        if (_fingerprintSimple != null) return _fingerprintSimple!!
        _fingerprintSimple = phosphorDuotoneIcon(
            name = "FingerprintSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M184 128c.055 32.325-6.244 64.345-18.54 94.24-1.22 3.017-4.146 4.993-7.4 5-1.029-.01-2.047-.213-3-.6-1.965-.806-3.529-2.361-4.347-4.321-.818-1.96-.823-4.165-.013-6.129C162.193 188.212 168.071 158.247 168 128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM128 88c11.379 .008 22.217 4.855 29.81 13.33 1.892 2.183 4.814 3.176 7.644 2.598 2.83-.577 5.129-2.635 6.015-5.385 .886-2.749 .221-5.763-1.739-7.884C154.249 73.361 129.699 67.407 108.013 75.693 86.327 83.978 72.002 104.785 72 128c-.001 23.035-5.85 45.693-17 65.85-2.143 3.866-.746 8.737 3.12 10.88 3.866 2.143 8.737 .746 10.88-3.12C81.46 179.077 87.998 153.749 88 128c0-22.091 17.909-40 40-40ZM128 24c-11.809-.014-23.534 1.988-34.67 5.92-4.087 1.528-6.196 6.05-4.74 10.164 1.457 4.114 5.941 6.301 10.08 4.916 26.939-9.499 56.811-5.339 80.13 11.157C202.119 72.653 215.987 99.436 216 128c.01 20.937-2.318 41.81-6.94 62.23-.978 4.298 1.705 8.578 6 9.57 .584 .135 1.181 .202 1.78 .2 3.736-.001 6.973-2.587 7.8-6.23C229.527 172.188 231.995 150.129 232 128 231.939 70.588 185.412 24.061 128 24ZM69.31 62.42c3.294-2.946 3.576-8.006 .63-11.3C66.994 47.826 61.934 47.544 58.64 50.49 36.61 70.235 24.016 98.416 24 128c.022 12.655-2.707 25.164-8 36.66-1.845 4.015-.085 8.765 3.93 10.61 4.015 1.845 8.765 .085 10.61-3.93C36.799 157.75 40.027 142.962 40 128 40.014 102.97 50.67 79.126 69.31 62.42ZM113.89 200.74c-4.012-1.838-8.756-.08-10.6 3.93-1.93 4.2-4.05 8.39-6.3 12.44-1.033 1.857-1.285 4.049-.699 6.092 .585 2.043 1.96 3.769 3.819 4.798 1.183 .66 2.515 1.005 3.87 1 2.909 .001 5.589-1.576 7-4.12 2.44-4.41 4.74-9 6.84-13.52 .889-1.929 .974-4.133 .237-6.125-.737-1.992-2.236-3.609-4.167-4.495ZM128 120c-4.418 0-8 3.582-8 8 .006 15.515-1.939 30.97-5.79 46-1.101 4.277 1.473 8.637 5.75 9.74 .654 .166 1.326 .25 2 .25 3.646-.003 6.829-2.47 7.74-6 4.193-16.336 6.309-33.135 6.3-50-.006-4.414-3.586-7.99-8-7.99Z"),
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
