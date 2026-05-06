package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorDuotoneIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.5 110.56c-3.32 25.23-13 53-36 75.95-23 22.95-50.72 32.67-75.95 36h0L33.5 145.44h0c3.32-25.23 13-53 36-75.95 23-22.95 50.72-32.67 76-36l77.06 77.06Z"),
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
                pathData = parseSvgPathData("M229.06 53.89C226.719 40.091 215.909 29.281 202.11 26.94c-32.37-5.49-93.39-8-138.27 36.9C18.96 108.74 21.45 169.74 26.94 202.11c2.347 13.814 13.182 24.628 27 26.95 11.341 1.934 22.825 2.918 34.33 2.94 32.09 0 72.05-8 103.89-39.84C237.05 147.28 234.55 86.26 229.06 53.89ZM167.45 39.89c10.726 .038 21.43 .974 32 2.8 7.094 1.212 12.648 6.774 13.85 13.87 2.063 11.958 2.967 24.088 2.7 36.22L163.21 40c1.4-.08 2.79-.1 4.24-.1ZM56.56 213.3C49.465 212.093 43.907 206.535 42.7 199.44 40.637 187.482 39.733 175.352 40 163.22L92.78 216c-12.132 .272-24.262-.632-36.22-2.7ZM180.86 180.86c-11.61 11.6-33.27 27.73-67.37 33.27L41.87 142.51C47.41 108.41 63.54 86.75 75.14 75.14 86.74 63.53 108.4 47.4 142.5 41.86l71.63 71.63c-5.54 34.1-21.67 55.76-33.27 67.37ZM165.64 90.36c3.122 3.124 3.122 8.186 0 11.31L151.3 116l6.34 6.34c2.153 1.992 3.043 5.002 2.32 7.845-.723 2.842-2.944 5.061-5.787 5.782-2.843 .721-5.853-.172-7.843-2.327L140 127.31 127.31 140l6.34 6.34c2.155 1.99 3.047 5 2.327 7.843-.721 2.843-2.939 5.064-5.782 5.787-2.842 .723-5.853-.167-7.845-2.32L116 151.3l-14.34 14.34c-2.002 2.107-4.99 2.963-7.804 2.235-2.814-.728-5.012-2.926-5.74-5.74-.728-2.814 .127-5.802 2.235-7.804L104.7 140l-6.34-6.34c-2.915-3.156-2.817-8.051 .222-11.087 3.039-3.037 7.934-3.13 11.088-.213l6.34 6.34L128.69 116l-6.34-6.34c-2.918-3.153-2.824-8.048 .213-11.088 3.037-3.039 7.931-3.137 11.087-.222l6.35 6.35L154.34 90.36c3.123-3.115 8.177-3.115 11.3 0Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
