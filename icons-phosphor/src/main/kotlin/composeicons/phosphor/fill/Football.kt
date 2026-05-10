package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorFillIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.06 53.89C226.719 40.091 215.909 29.281 202.11 26.94c-32.38-5.49-93.39-8-138.27 36.9C18.96 108.74 21.45 169.74 26.94 202.11c2.347 13.814 13.182 24.628 27 26.95 11.341 1.934 22.825 2.918 34.33 2.94 32.09 0 72.05-8 103.89-39.84C237.05 147.28 234.55 86.26 229.06 53.89ZM56.56 213.3C49.465 212.093 43.907 206.535 42.7 199.44 39.955 183.965 39.246 168.198 40.59 152.54l62.87 62.87c-15.658 1.344-31.425 .635-46.9-2.11ZM165.64 101.67 151.3 116l6.34 6.34c2.153 1.992 3.043 5.002 2.32 7.845-.723 2.842-2.944 5.061-5.787 5.782-2.843 .721-5.853-.172-7.843-2.327L140 127.31 127.31 140l6.34 6.34c2.155 1.99 3.047 5 2.327 7.843-.721 2.843-2.939 5.064-5.782 5.787-2.842 .723-5.853-.167-7.845-2.32L116 151.3l-14.34 14.34c-2.002 2.107-4.99 2.963-7.804 2.235-2.814-.728-5.012-2.926-5.74-5.74-.728-2.814 .127-5.802 2.235-7.804L104.7 140l-6.34-6.34c-2.915-3.156-2.817-8.051 .222-11.087 3.039-3.037 7.934-3.13 11.088-.213l6.34 6.34L128.69 116l-6.34-6.34c-2.918-3.153-2.824-8.048 .213-11.088 3.037-3.039 7.931-3.137 11.087-.222l6.35 6.35L154.34 90.36c2.002-2.107 4.99-2.963 7.804-2.235 2.814 .728 5.012 2.926 5.74 5.74 .728 2.814-.127 5.802-2.235 7.804ZM215.41 103.46 152.54 40.59c4.76-.44 9.72-.69 14.91-.69 10.726 .038 21.43 .974 32 2.8 7.091 1.211 12.645 6.768 13.85 13.86 2.745 15.475 3.454 31.242 2.11 46.9Z"),
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
