package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorFillIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.89 72.25h0 0c-1.461-2.552-3.6-4.649-6.18-6.06L135.68 18c-4.782-2.63-10.578-2.63-15.36 0l-88 48.18c-2.58 1.411-4.719 3.508-6.18 6.06h0 0C24.747 74.655 24.009 77.392 24 80.18v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17c5.119-2.801 8.307-8.165 8.32-14v-95.64c-.002-2.782-.729-5.515-2.11-7.93ZM120 219.61 88 202.09v-50.09c-.007-2.917-1.601-5.6-4.16-7L40 121v-32l80 43.8ZM128 118.88 48.66 75.44 83.14 56.57l41 22.45c2.393 1.309 5.287 1.309 7.68 0l41-22.45 34.48 18.87ZM216 120.98l-43.84 24c-2.559 1.4-4.153 4.083-4.16 7v50.09l-32 17.52v-86.85L216 88.94Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
