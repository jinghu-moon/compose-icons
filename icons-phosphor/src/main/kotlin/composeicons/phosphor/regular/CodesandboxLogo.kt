package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorRegularIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.68 66.15 135.68 18c-4.782-2.63-10.578-2.63-15.36 0l-88 48.18c-5.119 2.801-8.307 8.165-8.32 14v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17c5.119-2.801 8.307-8.165 8.32-14v-95.64c-.002-5.845-3.192-11.224-8.32-14.03ZM168 152v50.09l-32 17.52v-86.87L216 88.94v32l-43.84 24c-2.578 1.411-4.175 4.121-4.16 7.06ZM83.84 145 40 121v-32l80 43.8v86.87L88 202.09v-50.09c-.007-2.917-1.601-5.6-4.16-7ZM83.14 56.59l41 22.45c2.393 1.309 5.287 1.309 7.68 0l41-22.45 34.48 18.87L128 118.88 48.66 75.44ZM128 32h0l28.2 15.44L128 62.89 99.8 47.45ZM40 139.22l32 17.52v36.59L40 175.82ZM184 193.33v-36.59l32-17.52v36.6Z"),
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
